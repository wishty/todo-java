package tk.tlab.todo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tk.tlab.todo.model.TodoEntity;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String>{
	List<TodoEntity> findByUserId(String userId);
}
