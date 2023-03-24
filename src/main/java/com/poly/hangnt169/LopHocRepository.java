package com.poly.hangnt169;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hangnt169
 */
public class LopHocRepository {
    // CRUD <=> CREATE <INSERT INTO >, READ <SELECT>, UPDATE, DELETE
    // Hien thi danh sach tat ca lop hoc => GetAll <=> SELECT * FROM lop_hoc
    public List<LopHoc> getAll() {
        List<LopHoc> lists = new ArrayList<>();
        // Code
        // try..with..resource : Java 7
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            // truy van HQL
            Query query = session.createQuery("FROM LopHoc ", LopHoc.class);
            lists = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }

    // Get one <=> Detail cua 1 doi tuong <=> SELECT * FROM lop_hoc WHERE id =...
    public LopHoc getOne(Long id2) {
        LopHoc lopHoc = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            // truy van HQL
            Query query = session.createQuery("FROM LopHoc WHERE id =:id1 ",
                    LopHoc.class);
            query.setParameter("id1", id2);
            lopHoc = (LopHoc) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lopHoc;
    }

    // Add
    public Boolean add(LopHoc lopHoc) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            // Add
            session.persist(lopHoc);
            // Commit
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Update
    public Boolean update(LopHoc lopHoc) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            // Update
            session.merge(lopHoc);
            // Commit
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Delete
    public Boolean delete(LopHoc lopHoc) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            // Delete
            session.delete(lopHoc);
            // Commit
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
//        new LopHocRepository().getAll().forEach(s -> System.out.println(s));
//        System.out.println(new LopHocRepository().getOne(1L));
//        LopHoc lopHoc = new LopHoc("M10", "IT17317", 39, "P");
//        System.out.println(new LopHocRepository().add(lopHoc));
        LopHoc lopHoc = new LopHoc(1L, "M10_Update", "IT17317_Update", 39, "P");
        System.out.println(new LopHocRepository().delete(lopHoc));
        new LopHocRepository().getAll().forEach(s -> System.out.println(s));

    }
}
