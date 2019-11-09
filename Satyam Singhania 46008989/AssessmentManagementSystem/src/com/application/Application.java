package com.application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trainee_Details")
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "details_id", length = 20)
	private int id;
	@Column(length = 20)
	private String trainee_name;
	@Column(length = 20)
	private String module_name;
	@Column(length = 5)
	private int Mpt_marks;
	@Column(length = 5)
	private int Mtt_marks;
	@Column(length = 5)
	private int assignments_marks;
	@Column(length = 5)
	private int total;

	public Application() {
	}

	public Application(int id, String trainee_name, String module_name, int mpt_marks, int mtt_marks,
			int assignments_marks, int total) {
		super();
		this.id = id;
		this.trainee_name = trainee_name;
		this.module_name = module_name;
		Mpt_marks = mpt_marks;
		Mtt_marks = mtt_marks;
		this.assignments_marks = assignments_marks;
		this.total = total;
	}

	public int getTrainee_details() {
		return id;
	}

	public void setTrainee_details(int id) {
		this.id = id;
	}

	public String getTrainee_name() {
		return trainee_name;
	}

	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}

	public String getModule_name() {
		return module_name;
	}

	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	public int getMpt_marks() {
		return Mpt_marks;
	}

	public void setMpt_marks(int mpt_marks) {
		Mpt_marks = mpt_marks;
	}

	public int getMtt_marks() {
		return Mtt_marks;
	}

	public void setMtt_marks(int mtt_marks) {
		Mtt_marks = mtt_marks;
	}

	public int getAssignments_marks() {
		return assignments_marks;
	}

	public void setAssignments_marks(int assignments_marks) {
		this.assignments_marks = assignments_marks;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Application [trainee_details=" + id + ", trainee_name=" + trainee_name + ", module_name=" + module_name
				+ ", Mpt_marks=" + Mpt_marks + ", Mtt_marks=" + Mtt_marks + ", assignments_marks=" + assignments_marks
				+ ", total=" + total + "]";
	}
}
