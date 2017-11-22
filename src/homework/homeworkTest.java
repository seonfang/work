package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 * 定义一个Student类，至少包含编号、姓名、成绩三个属性
创建50个学生实例，成绩采用赋分制，每个学生的成绩只有100、95、90、85、80、
75,70.60这几种。
用Steam和lombda表达式实现按学生成绩分组统计，统计的结果包括:
每种分数总共有多少学生，并输出学生的姓名和编号。
 * @author seon
 *
 */
public class homeworkTest {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		int[] scopeArray= {60,70,75,80,85,90,95,100};
		for (int i = 0; i <100; i++) {
			Student s = new Student();
			s.setId(i);
			s.setName("seon"+i);
			s.setScore(scopeArray[(int)(Math.random()*8)]);
			studentList.add(s);
		}
	/**
	 * 试图使用for循环简练代码  以失败告终	
	 */
	/*	for(int i= 0;i <= 8;i++) {
			if(i !=1) {
				 chooseStudent(studentList, pre -> pre. getScore()== (60+ i *5)).size();
			}

		}*/
		
		 List stu1 = chooseStudent(studentList, e -> e. getScore()== 60);
		 List stu2 = chooseStudent(studentList, e -> e. getScore()== 70);
		 List stu3 = chooseStudent(studentList, e -> e. getScore()== 75);
		 List stu4 = chooseStudent(studentList, e -> e. getScore()== 80);
		 List stu5 = chooseStudent(studentList, e -> e. getScore()== 85);
		 List stu6 = chooseStudent(studentList, e -> e. getScore()== 90);
		 List stu7 = chooseStudent(studentList, e -> e. getScore()==95);
		 List stu8 = chooseStudent(studentList, e -> e. getScore()== 100);
		 
		 /**
		  * 想循环打印 由于60，70等参数只能是常量，不能使用变量；以失败告终
		  */
		/* for(int i = 0;i<=8;i++) {
			 List<Student> s = chooseStudent(studentList, e -> e. getScore()== i);
			 System.out.println();
		 }*/
		 
		System.out.println("homeworkTest.main(60分学生数:)"+stu1.size());
		System.out.println(stu1);
		System.out.println("homeworkTest.main(70分学生数:)"+stu2.size());
		System.out.println(stu2);
		System.out.println("homeworkTest.main(75分学生数:)"+stu3.size());
		System.out.println(stu3);
		System.out.println("homeworkTest.main(80分学生数:)"+stu4.size());
		System.out.println(stu4);
		System.out.println("homeworkTest.main(85分学生数:)"+stu5.size());
		System.out.println(stu5);
		System.out.println("homeworkTest.main(90分学生数:)"+stu6.size());
		System.out.println(stu6);
		System.out.println("homeworkTest.main(95分学生数:)"+stu7.size());
		System.out.println(stu7);
		System.out.println("homeworkTest.main(100分学生数:)"+stu8.size());
		System.out.println(stu8);
		
	}
	
	
	public static List<Student> chooseStudent(List<Student> stulist,Predicate<Student> pre) {
		
		return stulist.stream().filter(pre).collect(Collectors.toList());
	}
}
