public class Student
{
    public String names, surnames, classroom;
    public int id, scores;

    public Student()
    {

    }

    public Student(int id, String names, String surnames, String classroom, int score)
    {
        this.id = id ;
        this.names = names;
        this.surnames = surnames;
        this.classroom = classroom;
        this.scores = score;
    }
}
