package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 安保分配
 *
 * @author 
 * @email
 */
@TableName("anbao_fenpei")
public class AnbaoFenpeiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public AnbaoFenpeiEntity() {

	}

	public AnbaoFenpeiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 安排名称
     */
    @ColumnInfo(comment="安排名称",type="varchar(200)")
    @TableField(value = "anbao_fenpei_name")

    private String anbaoFenpeiName;


    /**
     * 安保
     */
    @ColumnInfo(comment="安保",type="int(11)")
    @TableField(value = "anbao_id")

    private Integer anbaoId;


    /**
     * 安排内容
     */
    @ColumnInfo(comment="安排内容",type="text")
    @TableField(value = "anbao_fenpei")

    private String anbaoFenpei;


    /**
     * 安排类型
     */
    @ColumnInfo(comment="安排类型",type="int(11)")
    @TableField(value = "anbao_fenpei_types")

    private Integer anbaoFenpeiTypes;


    /**
     * 安排时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="安排时间",type="timestamp")
    @TableField(value = "anpai_time")

    private Date anpaiTime;


    /**
     * 执行时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="执行时间",type="timestamp")
    @TableField(value = "zhxing_time")

    private Date zhxingTime;


    /**
     * 安排详情
     */
    @ColumnInfo(comment="安排详情",type="text")
    @TableField(value = "anbao_fenpei_xiangqing")

    private String anbaoFenpeiXiangqing;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：安排名称
	 */
    public String getAnbaoFenpeiName() {
        return anbaoFenpeiName;
    }
    /**
	 * 设置：安排名称
	 */

    public void setAnbaoFenpeiName(String anbaoFenpeiName) {
        this.anbaoFenpeiName = anbaoFenpeiName;
    }
    /**
	 * 获取：安保
	 */
    public Integer getAnbaoId() {
        return anbaoId;
    }
    /**
	 * 设置：安保
	 */

    public void setAnbaoId(Integer anbaoId) {
        this.anbaoId = anbaoId;
    }
    /**
	 * 获取：安排内容
	 */
    public String getAnbaoFenpei() {
        return anbaoFenpei;
    }
    /**
	 * 设置：安排内容
	 */

    public void setAnbaoFenpei(String anbaoFenpei) {
        this.anbaoFenpei = anbaoFenpei;
    }
    /**
	 * 获取：安排类型
	 */
    public Integer getAnbaoFenpeiTypes() {
        return anbaoFenpeiTypes;
    }
    /**
	 * 设置：安排类型
	 */

    public void setAnbaoFenpeiTypes(Integer anbaoFenpeiTypes) {
        this.anbaoFenpeiTypes = anbaoFenpeiTypes;
    }
    /**
	 * 获取：安排时间
	 */
    public Date getAnpaiTime() {
        return anpaiTime;
    }
    /**
	 * 设置：安排时间
	 */

    public void setAnpaiTime(Date anpaiTime) {
        this.anpaiTime = anpaiTime;
    }
    /**
	 * 获取：执行时间
	 */
    public Date getZhxingTime() {
        return zhxingTime;
    }
    /**
	 * 设置：执行时间
	 */

    public void setZhxingTime(Date zhxingTime) {
        this.zhxingTime = zhxingTime;
    }
    /**
	 * 获取：安排详情
	 */
    public String getAnbaoFenpeiXiangqing() {
        return anbaoFenpeiXiangqing;
    }
    /**
	 * 设置：安排详情
	 */

    public void setAnbaoFenpeiXiangqing(String anbaoFenpeiXiangqing) {
        this.anbaoFenpeiXiangqing = anbaoFenpeiXiangqing;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "AnbaoFenpei{" +
            ", id=" + id +
            ", anbaoFenpeiName=" + anbaoFenpeiName +
            ", anbaoId=" + anbaoId +
            ", anbaoFenpei=" + anbaoFenpei +
            ", anbaoFenpeiTypes=" + anbaoFenpeiTypes +
            ", anpaiTime=" + DateUtil.convertString(anpaiTime,"yyyy-MM-dd") +
            ", zhxingTime=" + DateUtil.convertString(zhxingTime,"yyyy-MM-dd") +
            ", anbaoFenpeiXiangqing=" + anbaoFenpeiXiangqing +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
