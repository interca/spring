package com.it.service.impl;

import com.it.dao.logDao;
import com.it.domain.Log;
import com.it.service.logService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.Date;

@Service
public class logServiceImpl implements logService {
    @Autowired
    private logDao logDao;
    @Override
    public void log(String name1, String name2, int money) {
        String s=name2+"转入"+name1+money+"元";
          Log log=new Log();
          log.setInfo(s);
        Date date=new Date();
        Timestamp timestamp=new Timestamp(date.getTime());
        log.setTime(timestamp);
          logDao.insert(log);
    }
}
