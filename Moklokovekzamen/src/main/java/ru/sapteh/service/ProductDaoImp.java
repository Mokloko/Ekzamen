package ru.sapteh.service;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.dao.DAO;
import ru.sapteh.model.Manufacture;
import ru.sapteh.model.Product;

import javax.transaction.Transactional;

@Transactional
public class ProductDaoImp implements DAO<Manufacture,Integer> {
    private final SessionFactory factory;

    public ProductDaoImp(SessionFactory factory) {
        this.factory = factory;

}
@Override
public Product (Integer id ){
   try(Session session = factory.openSession()){
        Product result = session.get(Product.class, id);
        if (result !=null){
            Hibernate.initialize();
        }
    }

    }

}