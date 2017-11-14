/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.wsdl.LoginService_Service;
import java.util.logging.Logger;

/**
 *
 * @author shrikantjesu
 */
public class LoginService {

    LoginService_Service loginService;
    com.wsdl.LoginService loginProxy;

    public LoginService() {
        loginService = new LoginService_Service();
        loginProxy = loginService.getLoginServicePort();
    }

    public boolean userLogin(String userName, String passoword) {
//        EntityManager em = Utility.createEntityManager();
//        EntityTransaction trans = em.getTransaction();

//        trans.begin();
//        User user1 = new User();
//        user1.setUserName("admin");
//        user1.setPassword("admin");
//        user1.setUserType("admin");
//        em.persist(user1);
//        trans.commit();
//        trans.begin();
//        User user = em.createNamedQuery("User.findUserByUsername", User.class).setParameter("username", userName).getSingleResult();
//        if (user.getUserName().equals(userName) && user.getPassword().equals(passoword)) {
        //            if (user.getUserName().equals("admin")) {
        //                return "admin";
        //            } else {
        //                return "emp";
        //            }
//            return true;
//        }
        LOG.info("loginTest");
        boolean loginStatus = loginProxy.userLogin(userName, passoword);
        LOG.info("loginTestB"+loginStatus);
        return loginStatus;
    }
    private static final Logger LOG = Logger.getLogger(LoginService.class.getName());

    public Boolean createUser(com.wsdl.User user) {
        return loginProxy.createUser(user);
    }
}
