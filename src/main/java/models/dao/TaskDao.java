package models.dao;

import models.Task;
import java.util.List;

public interface TaskDao {

    void add (Task task);
    List<Task> getAll();
    Task findById(int id);
    void update(int id, String content);
    void deleteById(int id);
    void clearAllTasks();
}
