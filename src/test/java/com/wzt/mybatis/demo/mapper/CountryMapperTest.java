package com.wzt.mybatis.demo.mapper;

import com.wzt.mybatis.demo.model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

public class CountryMapperTest {

  private static SqlSessionFactory sqlSessionFactory;

  @BeforeClass
  public static void init() {
    try {
      Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
      reader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testSelectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            List<Country> countryList = sqlSession.selectList("selectAll");
            printCountList(countryList);
        }catch (Exception e){
            e.printStackTrace();
        }
  }

    private void printCountList(List<Country> countryList) {
        for(Country country : countryList){
      System.out.println(String.format("%-4d,%4s,%4s\n" , country.getId(),country.getCountryname(),country.getCountrycode()));
        }
  }
}
