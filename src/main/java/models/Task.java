package models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task {
  private int id;
  private String description;
  private boolean completed;
  private LocalDateTime createdAt;

  public Task (String description) {
    this.description = description;
    this.completed = false;
    this.createdAt = LocalDateTime.now();
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean getCompleted() {
    return this.completed;
  }

  public void setCompleted() {
    this.completed = true;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Task task = (Task) o;
    return completed == task.completed && id == task.id && description.equals(task.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, completed, id);
  }
}
