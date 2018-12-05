package transaction.wallet.core.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import transaction.wallet.common.HibernateUtil;
import transaction.wallet.core.dao.UserCurrencyDao;
import transaction.wallet.core.data.daoimpl.AbstractDao;
import transaction.wallet.persistence.data.UserCurrencyEntity;
import transaction.wallet.persistence.data.UserEntity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class UserCurrencyDaoImpl extends AbstractDao<Integer, UserCurrencyEntity> implements UserCurrencyDao {
    public void insertUserCurrency(Integer userId, String typeCurrency, String address, Double balance, String privatekey) {
        UserCurrencyEntity entity = new UserCurrencyEntity();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            entity.setUserId(userId);
            entity.setTypeCurrency(typeCurrency);
            entity.setAddress(address);
            entity.setBalance(balance);
            entity.setPrivatekey(privatekey);
            session.save(entity);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public UserCurrencyEntity findUserCurrencyByUserId(Integer userId) {
        UserCurrencyEntity entity = new UserCurrencyEntity();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            StringBuilder sql = new StringBuilder("FROM UserCurrencyEntity WHERE userId= :userId");
            Query query = session.createQuery(sql.toString());
            query.setParameter("userId",userId);
            entity = (UserCurrencyEntity) query.uniqueResult();
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
