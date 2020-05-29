package com.maskmanage.mapper;

import com.maskmanage.entity.news;
import com.maskmanage.entity.newsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface newsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    int countByExample(newsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    int deleteByExample(newsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    int deleteByPrimaryKey(Integer newsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    int insert(news record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    int insertSelective(news record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    List<news> selectByExample(newsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    news selectByPrimaryKey(Integer newsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    int updateByExampleSelective(@Param("record") news record, @Param("example") newsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    int updateByExample(@Param("record") news record, @Param("example") newsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    int updateByPrimaryKeySelective(news record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    int updateByPrimaryKey(news record);
}