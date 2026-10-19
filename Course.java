class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    void displayInfo() {
        System.out.println("Course Name: " + courseName);
    }
}

class OnlineCourse extends Course {
    String platformName;

    OnlineCourse(String courseName, String platformName) {
        super(courseName);
        this.platformName = platformName;
    }

    void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Platform Name: " + platformName);
    }

    public static void main(String[] args) {
        OnlineCourse c = new OnlineCourse("Java Programming", "Coursera");
        c.displayInfo();
    }
}
