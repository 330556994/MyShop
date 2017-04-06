package com.gt.myshop.util;

//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by Administrator on 2017/2/10/010.
 */
public class MyBatisUtil{
//        private MyBatisUtil(){
//          }
//        private static final String RESOURCE = "mybatis-config.xml";
//        private static SqlSessionFactory sqlSessionFactory = null;
//        private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
//        static {
//          Reader reader = null;
//          try {
//              reader = Resources.getResourceAsReader(RESOURCE);
//              SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//              sqlSessionFactory = builder.build(reader);
//          } catch (Exception ex) {
//              throw new ExceptionInInitializerError("鍒濆鍖�MyBatis 閿欒");
//          }
//        }
//        public static SqlSessionFactory getSqlSessionFctory(){
//              return sqlSessionFactory;
//          }
//        public static SqlSession getSession(){
//              //threadLocal 鐨�get() 鏂规硶鏍规嵁褰撳墠绾跨▼杩斿洖鍏跺搴旂殑绾跨▼鍐呴儴鍙橀噺锛屼篃灏辨槸鎴戜滑闇�鐨�SqlSession銆�
//              //澶氱嚎绋嬫儏鍐典笅鍏变韩鏁版嵁搴撹繛鎺ユ槸涓嶅畨鍏ㄧ殑
//              // ThreadLocal 淇濊瘉浜嗘瘡涓嚎绋嬮兘鏈夎嚜宸辩殑 SqlSession
//              SqlSession session = threadLocal.get();
//              //濡傛灉 session 涓�null 锛屽垯鎵撳紑涓�釜鏂扮殑 session
//              if(session == null){
//                      session = (sqlSessionFactory != null) ? sqlSessionFactory.openSession() : null;
//                      threadLocal.set(session);
//                  }
//              return session;
//          }
  }