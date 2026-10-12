package tags;
import java.io.IOException;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class StudentTagHandler extends SimpleTagSupport {
 private String name,rollNo,course;
 public void setName(String name){this.name=name;} public void setRollNo(String rollNo){this.rollNo=rollNo;} public void setCourse(String course){this.course=course;}
 public void doTag()throws JspException,IOException{JspWriter out=getJspContext().getOut();out.println("<table border='1'><tr><th>Field</th><th>Value</th></tr><tr><td>Name</td><td>"+name+"</td></tr><tr><td>Roll No</td><td>"+rollNo+"</td></tr><tr><td>Course</td><td>"+course+"</td></tr></table>");}
}