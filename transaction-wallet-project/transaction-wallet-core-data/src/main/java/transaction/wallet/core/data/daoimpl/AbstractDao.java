package transaction.wallet.core.data.daoimpl;

import javassist.tools.rmi.ObjectNotFoundException;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import transaction.wallet.common.HibernateUtil;
import transaction.wallet.core.data.dao.GenericDao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AbstractDao<ID extends Serializable, T> implements GenericDao<ID, T> {

    private Class<T> persistenceClass;

    public AbstractDao(){
        this.persistenceClass=(Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];

    }

    public String getPersistenceClassName(){
        return persistenceClass.getSimpleName();
    }

    public List<T> findAll() {
        List<T> list=new ArrayList<T>();
        Transaction transaction=null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction=session.beginTransaction();
            //Use HQL
            StringBuilder sql=new StringBuilder("from ");
            sql.append(this.getPersistenceClassName());
            Query query=session.createQuery(sql.toString());
            list=query.list();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        }
        finally {
            session.close();
        }
        return list;
    }

    public T update(T entity) {
        T result=null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        try {
            Object object=session.merge(entity);
            result = (T) object;
            transaction.commit();
        }
        catch(HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }

        return result;
    }

    public void save(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(entity);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    public T findById(ID id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        T result=null;
        try {
            result = (T) session.get(persistenceClass, id);
            if(result == null){
                try {
                    throw new ObjectNotFoundException("NOT FOUND " + id, null);
                } catch (ObjectNotFoundException e) {
                    e.printStackTrace();
                }
            }

        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        }
        finally {
            session.close();
        }
        return result;
    }



    public Integer delete(List<ID> ids) {
        Integer count=0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            for (ID item : ids) {
                T t =(T) session.get(this.persistenceClass,item);
                session.delete(t);
                count++;
            }
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return count;
    }
}

