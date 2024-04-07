package com.devstack.pos.db;


import com.devstack.pos.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private HibernateUtil(){}

    private static SessionFactory buildSessionFactory(){
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure( "hibernate.cfg.xml" )
                .build();

        Metadata metadata = new MetadataSources( standardRegistry )
                .addAnnotatedClass( Batch.class )
                .addAnnotatedClass( Customer.class )
                .addAnnotatedClass( Inventory.class )
                .addAnnotatedClass( LoyaltyCard.class )
                .addAnnotatedClass( OrderDetails.class )
                .addAnnotatedClass( Orders.class )
                .addAnnotatedClass( Payment.class )
                .addAnnotatedClass( Product.class )
                .addAnnotatedClass( User.class )
                .getMetadataBuilder()
                .applyImplicitNamingStrategy( ImplicitNamingStrategyJpaCompliantImpl.INSTANCE )
                .build();

        return metadata.getSessionFactoryBuilder()
                .build();
    }

    public static Session openSession(){
        return sessionFactory.openSession();
    }

}
