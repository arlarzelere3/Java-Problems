/**
 * 
 */
package toDoList;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Test;

/**
 * @author alarzele
 *
 */
public class TaskTester {

	@Test
	public void testTaskCreation() {
		Task newTask = new Task();
		
		assertEquals(newTask.getTitle(), "Untitled");
		assertNotNull(newTask.getDueDate());
		assertFalse(newTask.isCompleted());
		assertEquals(newTask.getNotes(), "");
		assertNull(newTask.getSubTasks());
	}

	@Test
	public void testSubTask() {
		Task newTask = new Task();
		
		assertNull(newTask.getSubTasks());
		
		newTask.setSubTasks(new List());
		
		assertNotNull(newTask.getSubTasks());
	}
	
	@Test
	public void testToString() {
		Task newTask = new Task();
		newTask.setTitle("Do Something");
		newTask.setNotes("Make sure it works");
		newTask.setCompleted(true);
		
		System.out.println(newTask.toString());
		
		assertNotNull(newTask);
	}
}
