package com.epam.Java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Java {
	 public String reverse(String x){
	        String reverse="";
	        for(int i=x.length()-1;i>=0;i--){
	            
	            reverse=reverse+x.charAt(i);
	        }
	       
	        return reverse;
	    }
	   public static List<String> filterEmptyStrings(List<String> list, Predicate<String> predicate) {
	     List<String> finalList = new ArrayList<>();
	     
		 for (String str : list) {
	       if(predicate.test(str)) {
	         finalList.add(str);
	       }
	    }
	  return finalList;
	  }
	    public static void main(String[] args) {
	        Java java8=new Java();
	       final List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
	       primes.stream() //
	    .mapToInt(i -> i) //
	    .average() //
	    .ifPresent(avg -> System.out.println("Average found is " + avg));
	       
	        

	       List<String> strList = Arrays.asList("abc", "abcba","aaa","bcd", "", "defg", "jk").stream().filter(x->(x.startsWith("a") && x.length()==3)).collect(Collectors.toList());
	       System.out.println(strList);
	        
	       
	          List<String> strList1 = Arrays.asList("abc", "abcba","aaa","bcd", "", "defg", "jk");
	     
	     List<String> listWithoutEmptyStr = filterEmptyStrings(strList1, (String str) -> !str.isEmpty());
	       List<String> strList2 =  listWithoutEmptyStr.stream().filter(x->x.equals(java8.reverse(x))).collect(Collectors.toList());
	     System.out.println(strList2); 
	    }
	    
}
