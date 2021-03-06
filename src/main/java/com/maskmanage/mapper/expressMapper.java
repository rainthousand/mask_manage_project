package com.maskmanage.mapper;

import com.maskmanage.entity.express;
import com.maskmanage.entity.expressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface expressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int countByExample(expressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int deleteByExample(expressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int deleteByPrimaryKey(Integer expressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int insert(express record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int insertSelective(express record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    List<express> selectByExample(expressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    express selectByPrimaryKey(Integer expressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int updateByExampleSelective(@Param("record") express record, @Param("example") expressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int updateByExample(@Param("record") express record, @Param("example") expressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int updateByPrimaryKeySelective(express record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int updateByPrimaryKey(express record);
}