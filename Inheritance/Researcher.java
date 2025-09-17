interface Researcher {
    void research();
}

interface Athlete {
    void play();
}

class Student implements Researcher, Athlete {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public void research() {
        System.out.println(name + " is doing research in AI.");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing football.");
    }

    public static void main(String[] args) {
        Student s = new Student("Neha");
        s.research();
        s.play();
    }
}
