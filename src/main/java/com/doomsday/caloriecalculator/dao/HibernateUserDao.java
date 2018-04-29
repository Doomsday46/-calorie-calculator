package com.doomsday.caloriecalculator.dao;

import com.doomsday.caloriecalculator.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;
@Transactional
@Repository
public class HibernateUserDao implements UserDao{

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void updateUser(Long id,User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> listUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("from User").list();
    }

    @Override
    public User getUserById(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        return (User) session.load(User.class, id);
    }

    @Override
    public void setDataSource(DataSource dataSource) {

    }

    @Override
    public void removeUser(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        User p = (User) session.load(User.class, (long) id);
        if (null != p) {
            session.delete(p);
        }
    }

}
