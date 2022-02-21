package assignment16;
import java.util.*;
public class playermain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of player you want to create: ");
	int n = sc.nextInt();
	Player[] p1 = new Player[n];
	Skill[] s1 = new Skill[n];
	PlayerBo pB = new PlayerBo();
	String name, country, skill;
	for(int i=0;i<n;i++) {
	System.out.println("Enter the player " +(i+1)+ " details");
	System.out.println("Enter the player name: ");
	name = sc.next();
	System.out.println("Enter Country name: ");
	country = sc.next();
	System.out.println("Enter skill name: ");
	skill = sc.next();
	s1[i] = new Skill();
	s1[i].setSkillName(skill);
	p1[i] = new Player(name, country, s1[i]);
	}
	int ch;
	do {
	System.out.println("Menu: ");
	System.out.println("1. View Details\n 2. Filter players with skill\n 3.Exit");
	System.out.print("Enter your choice: ");
	ch = sc.nextInt();
	switch(ch) {
	case 1:
	pB.viewDetails(p1);
	break;
	case 2:
	System.out.println("Enter the skill: ");
	String sk = sc.next();
	pB.printPlayerDetailsWithSkill(p1, sk);
	break;
}
}
while(ch != 3);
}
}