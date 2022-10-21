import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sentance=s.nextLine();
		StringBuffer sb=new StringBuffer();
		if(sentance!=null && !sentance.isEmpty()){
		String words[]=sentance.split(" ");
		for(int i=0;i<words.length;i++){
			sb.append(getSortedString(words[i].toLowerCase()+" "));
			
		}
		System.out.println(sb.toString());
		}else{
			System.out.println("Please enter valid String!!!");
		}
		

	}
	
	public static String getSortedString(String word){
		return Stream.of(word.split("")).sorted().collect(Collectors.joining());
	}

}