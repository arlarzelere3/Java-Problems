package toDoList;

import java.util.Date;

public class Task {
	private String title = "Untitled";
	private Date dueDate = new Date();
	private boolean completed = false;
	private String notes = "";
	private Task subTask = null;
	
	/**
	 * 
	 */
	public Task() {
		super();
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}
	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	/**
	 * @return the completed
	 */
	public boolean isCompleted() {
		return completed;
	}
	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	/**
	 * @return the subTask
	 */
	public Task getSubTask() {
		return subTask;
	}
	/**
	 * @param subTask the subTask to set
	 */
	public void setSubTask(Task subTask) {
		this.subTask = subTask;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		if(completed){
			output.append("X ");
		}else{
			output.append("O ");
		}
		output.append(title + " " + dueDate.toString() + " " + notes);
		
		return output.toString();
	}
}
