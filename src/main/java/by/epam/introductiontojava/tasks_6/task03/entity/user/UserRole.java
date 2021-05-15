package by.epam.introductiontojava.tasks_6.task03.entity.user;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum
public enum UserRole {
    USER(1),
    ADMIN(2);

    private int priority;

    UserRole(int priority) {
        this.priority = priority;
    }

    public int getPriority() { return priority; }
}
