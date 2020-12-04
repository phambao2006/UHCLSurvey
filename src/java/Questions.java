
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pham Bao
 */
@ManagedBean(name= "q")
@SessionScoped
public class Questions
{
    private int index = 0 ;
    public static String name;
    public static String course;
    public static String year;
    private  String[] questiones = 
    {"1. The instructor stimulated my interest in the subject.",
     "2. The instructor managed classroom time and pace well.",
     "3. The instructor was organized and prepared for every class",
     "4. The instructor encouraged discussions and responded to questions.",
     "5. The instructor demonstrated in-depth knowledge of the subject.",
     "6. The instructor appeared enthusiastic and interested.",
     "7. The instructor used a variety of instructional methods to reach the course objectives (e.g.group discussions, student presentations, etc.)",
     "8. The instructor challenged students to do their best work.",
     "9. The instructor was accessible outside of class.",
     "10. Did the instructor actively attempt to prevent cheating in this course? ",
     "Comments (Teaching Approaches) ",
     "11. Information about the assessment was communicated clearly.",
     "12. Feedback was provided within the stated timeframe.",
     "13. Feedback showed how to improve my work(e .g. corrections including comments).",
     "Comments (Feedback and Assessment)",
     "14. The course was supported by adequate library resources",
     "15. Blackboard resources for the course were useful.",
     "16. Instructor gave guidance on where to find resources",
     "Comments (Resources and Administration) ",
     "17. The syllabus was explained at the beginning of the course.",
     "18. The course was delivered as outlined in the syllabus.",
     "19. Instructor explained the grading criteria of the course.",
     "20. Exams related to the course learning outcomes",
     "21. Projects/ assignments related to the course learning outcomes.",
     "Comments (Additional Questions)",
     "22. This was a worthwhile class",
     "23. Would you recommend this course to a fellow student?",
     "24. Overall, how do you rate your experience in this course?",
     "25. How many hours did you spend per week on preparation/homework for this course?",
     "Comments (Overall Experience) ",
     "26. I contributed constructively during in-class",
     "27. I feel I am achieving the learning outcomes",
     "Comments (Student Self Evaluation) ",
     "What changes would you recommend to improve this course?",
     "What did you like best about your instructors teaching?",
     "What did you like least about your instructor’s teaching?",
     "Any further, constructive comment:"
     
    };
    

    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        Questions.name = name ;
    }
    public String getcourse()
    {
        return course;
    }
    public void setcourse(String course)
    {
        Questions.course = course ;
    }
    public String getyear()
    {
        return year;
    }
    public void setyear(String year)
    {
        Questions.year = year ;
    }
    public String[] getquestiones()
    {
        return questiones;
    }
    public int getindex()
    {
      return this.index++;
    }
}