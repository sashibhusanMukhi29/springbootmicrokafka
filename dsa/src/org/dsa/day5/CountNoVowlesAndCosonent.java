package org.dsa.day5;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.print.DocFlavor.INPUT_STREAM;

public class CountNoVowlesAndCosonent {
public static void main(String[] args) {
	String ques="fgn0ok                       **************ouQapQ"
			+ "750987awiiiiiii2@#";
	for(Entry<String,Integer> data:getCountNoVowlesAndCosonent(ques).entrySet())
	{
		System.out.println(data.getKey() + " : "+ data.getValue());
	}
}
static HashMap<String,Integer>getCountNoVowlesAndCosonent(String data)
{
	char[] vowels= {'a','e','i','o','u'};
	char[] consonant= {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
	char [] dataCharArray=data.toCharArray();
	int vowelCount=0;
	int consonantCount=0;
	HashMap<String,Integer>getData= new HashMap<>();
	for(int i =0;i<dataCharArray.length;i++)
	{
		for(int j=0;j<vowels.length;j++)
		{
			if(dataCharArray[i]==vowels[j])
			{
				vowelCount++;
			}
			
		}
		for(int k=0;k<consonant.length;k++)
		{
			if(dataCharArray[i]==consonant[k])
			{
				consonantCount++;
			}
			
		}
	}
	getData.put("vowels : ",vowelCount);
	getData.put("consonat : ", consonantCount);
	return getData;
}

}
