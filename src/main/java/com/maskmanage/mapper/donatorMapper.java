package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.maskmanage.entity.donator;
import com.maskmanage.entity.donatorExample;

public interface donatorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int countByExample(donatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int deleteByExample(donatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int deleteByPrimaryKey(Integer donatorid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int insert(donator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int insertSelective(donator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    List<donator> selectByExample(donatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    donator selectByPrimaryKey(Integer donatorid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByExampleSelective(@Param("record") donator record, @Param("example") donatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByExample(@Param("record") donator record, @Param("example") donatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByPrimaryKeySelective(donator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByPrimaryKey(donator record);
}