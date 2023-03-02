/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.hangnt169;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hangnt
 */
public class LopHocRepository {

    public List<LopHoc> getAll() {
        List<LopHoc> lops = new ArrayList<>();
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM LopHoc ", LopHoc.class);
            lops = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return lops;
    }

    public LopHoc getOne(Long id) {
        LopHoc lop = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM LopHoc WHERE id=:id");
            query.setParameter("id", id);
            lop = (LopHoc) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return lop;
    }

    public Boolean add(LopHoc lop) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.persist(lop);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    public Boolean update(LopHoc lop) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.merge(lop);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    public Boolean delete(LopHoc lop) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(lop);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }
}
