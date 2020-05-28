package com.maskmanage.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.maskmanage.entity.donsupervision;
import com.maskmanage.entity.donsupervisionExample;

public interface donsupervisionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donsupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int countByExample(donsupervisionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donsupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int deleteByExample(donsupervisionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donsupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int deleteByPrimaryKey(Integer supervisionid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donsupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int insert(donsupervision record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donsupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int insertSelective(donsupervision record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donsupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    List<donsupervision> selectByExample(donsupervisionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donsupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    donsupervision selectByPrimaryKey(Integer supervisionid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donsupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByExampleSelective(@Param("record") donsupervision record, @Param("example") donsupervisionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donsupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByExample(@Param("record") donsupervision record, @Param("example") donsupervisionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donsupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByPrimaryKeySelective(donsupervision record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donsupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByPrimaryKey(donsupervision record);
}