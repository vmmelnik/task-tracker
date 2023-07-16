package com.b0ringmi11er.task_tracker.model;

import java.time.LocalDateTime;

public class Task {

	private Long id;
	private String title;
	private String description;
	private LocalDateTime time;
	private String status;
	private Worker performer;

	public Task() {
	}

	public Task(Long id, String title, String description, LocalDateTime time, String status, Worker performer) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.time = time;
		this.status = status;
		this.performer = performer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Worker getPerformer() {
		return performer;
	}

	public void setPerformer(Worker performer) {
		this.performer = performer;
	}

}
