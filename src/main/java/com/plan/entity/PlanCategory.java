package com.plan.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="PLAN_CATEGORY")
public class PlanCategory {
	
	@Id
	@Column(name="PLAN_CATEGORY_ID")
	private Integer planCategoryId;
	@Column(name="PLAN_NAME")
	private String planName;
	@Column(name="CREATED_BY")
	private String  createdBy;
	@Column(name="UPDATED_BY")
	private String updatedBy;
	@Column(name="CREATED_DATE", updatable = false )
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(name="UPDATED_DATE", insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;
	@Column(name="ACTIVE_SW")
	private String activeSw;
	

}
