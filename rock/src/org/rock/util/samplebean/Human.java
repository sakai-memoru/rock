package org.rock.util.samplebean;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Human Class (sample)
 * @author sakai-memoru
 *
 */
public class Human {
	/** id */
	private BigDecimal id ; // Identifier

	/** first name */
	private String firstName ; // first name

	/** second name */
	private String secondName ; // second name

	/** sex */
	private Integer sex ; // sex

	/** age */
	private Integer age ; // age

	/** blood type */
	private String bloodType ; // blood type

	/** create date */
	private Date createDate ; // create date

	/** update date */
	private Date updateDate ; // update date
	
	/* setter/getter */
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	/**----------------------------------------------------------------
	 * toString
	 */
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,ToStringStyle.MULTI_LINE_STYLE);
	}


}
