package duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Represents an Event.
 */
public class Event extends Task {
    protected LocalDate date;

    /**
     * Creates an Event.
     * @param name A string representing the name of the event.
     * @param isCompleted A boolean value representing whether the event has been completed.
     * @param date A LocalDate representing the date of the event.
     */
    protected Event(String name, boolean isCompleted, LocalDate date) {
        super(name, isCompleted);
        this.date = date;
    }

    /**
     * Creates a new Event.
     * The completion status is false by default.
     * @param name A string representing the name of the new event.
     * @param date A LocalDate representing the date of the new event.
     * @return The new event created.
     */
    public static Event newEvent(String name, LocalDate date) {
        return new Event(name, false, date);
    }

    /**
     * Creates an event using information in storage.
     * The event created is an already previously existing event with its details recorded in storage.
     * Usually called when starting up the application, to populate the TaskList.
     * @param name A string representing the name of the existing event.
     * @param isCompleted A boolean value representing whether the event has been completed.
     * @param date A LocalDate representing the date of the existing event.
     * @return The existing event created.
     */
    public static Event existingEvent(String name, boolean isCompleted, LocalDate date) {
        return new Event(name, isCompleted, date);
    }

    /**
     * Gets whether the event date is set as today.
     * @return The boolean value representing whether the event is today.
     */
    public boolean isToday() {
        return this.date.isEqual(LocalDate.now());
    }

    /**
     * Gets the string representation of the event object for printing.
     * This contains the completion status and the event name, date, as well as the type (Event).
     * @return A string representation of the event for printing.
     */
    public String toString() {
        return "[E]" + super.toString() + " (at: " + date.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ", "
                + date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()) + ")";
    }

    /**
     * Gets the string representation of the event object to be saved in storage.
     * This contains the completion status and the event name, date, as well as the type (Event).
     * The different fields are separated by a "|" character.
     * Completion status is represented by a 1 or 0.
     * @return A string representation of the event object to be saved in storage.
     */
    public String toSaveString() {
        return "E" + " | " + super.toSaveString() + " | " + this.date + "\n";
    }
}
