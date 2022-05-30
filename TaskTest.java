package task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	void taskIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var task = new Task("1234567890123", "Test", "This is a test.");
		});
	}


	@Test
	void taskIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var task = new Task(null, "Test", "This is a test.");
		});
	}
	
	@Test
	void taskNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var task = new Task("123", "TestTestTestTestTestTest", "This is a test.");
		});
	}
	
	@Test
	void taskNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var task = new Task("123", null, "This is a test.");
		});
	}
	
	@Test
	void taskDescTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var task = new Task("123", "Test", "This is a test.This is a test.This is a test.This is a test.This is a test.This is a test.This is a test.This is a test.This is a test.This is a test.");
		});
	}
	
	@Test
	void taskDescIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var task = new Task("123", "Test", null);
		});
	}	
	
	@Test
	void getIDTest() {
		var task = new Task("1", "Test", "This is a Test.");
			assertTrue(task.getTaskID() == "1");
		}
	
	@Test
	void getNameTest() {
		var task = new Task("1", "Test", "This is a Test.");
			assertTrue(task.getName() == "Test");
		}
	
	@Test
	void getDescTest() {
		var task = new Task("1", "Test", "This is a Test.");
			assertTrue(task.getDescription() == "This is a Test.");
		}
	
	@Test
	void setNameTestTooLong() {
		var task = new Task("1", "Test", "This is a Test.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.setName("TestTestTestTestTestTest");
		});
	}
	
	@Test
	void setNameTestIsNull() {
		var task = new Task("1", "Test", "This is a Test.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.setName(null);
		});
	}	
	
	@Test
	void setNameTest() {
		var task = new Task("1", "Test", "This is a Test.");
		task.setName("Franklin");
		assertTrue("Franklin" == task.getName());
	}
	
	@Test
	void setDescTooLong() {
		var task = new Task("1", "Test", "This is a Test.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.setDescription("TestTestTestTestTestTestTestTestTestTestTestTestTestTest");
		});
	}
	
	@Test
	void setDescIsNull() {
		var task = new Task("1", "Test", "This is a Test.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.setDescription(null);
		});
	}
	
	@Test
	void setDescTest() {
		var task = new Task("1", "Test", "This is a Test.");
		task.setDescription("Franklin");
		assertTrue("Franklin" == task.getDescription());
	}
	
	@Test
	void deleteTaskTest() {
		var task = new Task("1", "Test", "This is a test.");
		task.deleteTask(task);
		assertTrue(task.getName() == null && task.getTaskID() == null && task.getDescription() == null);
	}
}

	
