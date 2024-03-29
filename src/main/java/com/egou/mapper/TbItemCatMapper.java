package com.egou.mapper;

import com.egou.pojo.TbItemCat;
import com.egou.pojo.TbItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemCatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbg.generated Sat Apr 20 16:23:38 CST 2019
     */
    long countByExample(TbItemCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbg.generated Sat Apr 20 16:23:38 CST 2019
     */
    int deleteByExample(TbItemCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbg.generated Sat Apr 20 16:23:38 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbg.generated Sat Apr 20 16:23:38 CST 2019
     */
    int insert(TbItemCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbg.generated Sat Apr 20 16:23:38 CST 2019
     */
    int insertSelective(TbItemCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbg.generated Sat Apr 20 16:23:38 CST 2019
     */
    List<TbItemCat> selectByExample(TbItemCatExample example);
    List<TbItemCat> selectByParentId(long id);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbg.generated Sat Apr 20 16:23:38 CST 2019
     */
    TbItemCat selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbg.generated Sat Apr 20 16:23:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbg.generated Sat Apr 20 16:23:38 CST 2019
     */
    int updateByExample(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbg.generated Sat Apr 20 16:23:38 CST 2019
     */
    int updateByPrimaryKeySelective(TbItemCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbg.generated Sat Apr 20 16:23:38 CST 2019
     */
    int updateByPrimaryKey(TbItemCat record);
}