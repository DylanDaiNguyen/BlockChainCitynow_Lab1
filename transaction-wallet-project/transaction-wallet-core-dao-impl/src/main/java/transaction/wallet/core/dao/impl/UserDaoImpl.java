package transaction.wallet.core.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import transaction.wallet.common.HibernateUtil;
import transaction.wallet.core.dao.UserDao;
import transaction.wallet.core.data.daoimpl.AbstractDao;
import transaction.wallet.persistence.data.UserEntity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

public class UserDaoImpl extends AbstractDao<Integer, UserEntity> implements UserDao {
    public UserEntity isUserExist(String username, String password) {
        UserEntity entity = new UserEntity();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            StringBuffer sql = new StringBuffer("FROM UserEntity WHERE username= :username AND password= :password");
            Query query = session.createQuery(sql.toString());
            query.setParameter("username", username);
            query.setParameter("password",password);
            entity = (UserEntity) query.uniqueResult();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return entity;
    }


    public UserEntity findUserByUsernameAndPassword(String username, String password) {
        UserEntity entity = new UserEntity();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            StringBuffer sql = new StringBuffer("FROM UserEntity WHERE username= :username AND password= :password");
            Query query = session.createQuery(sql.toString());
            query.setParameter("username", username);
            query.setParameter("password",password);
            entity = (UserEntity) query.uniqueResult();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return entity;
    }

    public void insertUser(String username, String password, String name, String email, String phone) {
        UserEntity entity = new UserEntity();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        try {
            entity.setUsername(username);
            entity.setPassword(password);
            entity.setPhone(phone);
            entity.setName(name);
            entity.setEmail(email);
            entity.setCreatedDate(timestamp);
            session.save(entity);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public UserEntity findIdByUser(String username) {
        UserEntity entity = new UserEntity();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            StringBuilder sql = new StringBuilder("FROM UserEntity WHERE username= :username");
            Query query = session.createQuery(sql.toString());
            query.setParameter("username",username);
            entity = (UserEntity) query.uniqueResult();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return entity;
    }
}
