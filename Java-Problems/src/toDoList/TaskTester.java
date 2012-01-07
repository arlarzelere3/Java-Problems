/**
 * 
 */
package toDoList;

import static org.junit.Assert.*;
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
		assertNull(newTask.getSubTask());
	}

	@Test
	public void testSubTask() {
		Task newTask = new Task();
		
		assertNull(newTask.getSubTask());
		
		newTask.setSubTask(new Task());
		
		assertNotNull(newTask.getSubTask());
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
