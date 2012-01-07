/**
 * 
 */
package toDoList;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.Date;

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
		assertEquals(newTask.getSubTasks().getItemCount(), 0);
	}

	@Test
	public void testSubTask() {
		Task newTask = new Task();
		
		assertEquals(newTask.getSubTasks().getItemCount(), 0);
		
		newTask.addSubTask(new Task());
		
		assertEquals(newTask.getSubTasks().getItemCount(), 1);
	}
	
	@Test
	public void testToString() {
		Task newTask = new Task();
		newTask.setTitle("Do Something");
		newTask.setNotes("Make sure it works");
		newTask.setCompleted(true);
		
		Date setByDate = new Date();
		
		newTask.setDueDate(setByDate);
		
		assertEquals(newTask.toString(), "X Do Something "+ setByDate.toString() +" Make sure it works");
	}
}
