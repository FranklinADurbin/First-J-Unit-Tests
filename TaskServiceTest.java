package task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskServiceTest {

	@Test
	void addTaskNotUniqueTest() {
		var service = new TaskService();
		service.addTask("123", "Test", "This is a test.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.addTask("123","test","testest");
		});
	}
	
	@Test
	void addTask() {
		var service = new TaskService();
		service.addTask("123", "Test", "This is a test.");
		assertTrue(service.tasks.size() == 1);
	}
	
	@Test
	void deleteTask() {
		var service = new TaskService();
		service.addTask("123", "Test", "This is a test.");
		service.addTask("127", "Test", "This is a test.");
		service.deleteTaskbyID("123");
		assertTrue(service.tasks.size() == 1);
	}

	@Test
	void deleteTaskInvalidID() {
		var service = new TaskService();
		service.addTask("123", "Test", "This is a test.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.deleteTaskbyID("1234");
		});
	}
	
	@Test
	void updateTaskNameInvalidID() {
		var service = new TaskService();
		service.addTask("123", "Test", "This is a test.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateTaskName("1234", "Test");
		});
	}
	
	@Test
	void updateTaskName() {
		var service = new TaskService();
		service.addTask("123", "Test", "This is a test.");
		service.updateTaskName("123", "Franklin");
		assertTrue(service.tasks.get(0).getName() == "Franklin");
	}
	
	@Test
	void updateTaskDesc() {
		var service = new TaskService();
		service.addTask("123", "Test", "This is a test.");
		service.updateTaskDesc("123", "Franklin");
		assertTrue(service.tasks.get(0).getDescription() == "Franklin");
	}
	
	@Test
	void updateTaskDescInvalidID() {
		var service = new TaskService();
		service.addTask("123", "Test", "This is a test.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateTaskDesc("1234", "Test");
		});
	}
}
