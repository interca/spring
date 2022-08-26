package j.com.it.dao.impl;


import j.com.it.dao.bookDao;

import java.util.HashMap;
import java.util.HashSet;

public class BookDaoImpl implements bookDao {
    public  HashMap<Integer,Integer>map;
    public  HashSet<Integer>set;
    @Override
    public void save() {
        System.out.println("dao层");
    }

    public void setMap(HashMap<Integer, Integer> map) {
        this.map = map;
    }

    public void setSet(HashSet<Integer> set) {
        this.set = set;
    }
}
