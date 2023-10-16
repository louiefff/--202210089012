package xiangmu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Cipher {
	String plaintext;
	String ciphertext;
	
	Scanner input=new Scanner(System.in);
	
	ArrayList List1=new ArrayList();
	ArrayList List2=new ArrayList();
	
	Cipher(){
		plaintext="";
		ciphertext="";}
	
	public void encryption() {
		String str;
		int ascnum;
		char firstnum;
		char lastnum;
		int size;
		System.out.println("请输入要加密的字符：");
		str=input.next();
		for(int i=0;i<str.length();i++) {
			 char plainChar=str.charAt(i);
			List1.add(plainChar);
		}
		for(int i=0;i<List1.size();i++) {
			char plainChar=(char) List1.get(i);
			ascnum=(int)plainChar+i+4;
			List1.set(i,(char)ascnum);
		}
		firstnum=(char) List1.get(0);
		size=List1.size()-1;
		lastnum=(char) List1.get(size);
		List1.set(0, lastnum);
		List1.set(size, firstnum);
		Collections.reverse(List1);
		System.out.println("加密的结果是");
		System.out.println(List1);
	}
	public void decryption() {
		String str;
		int ascnum;
		char firstnum;
		char lastnum;
		int size;
		System.out.println("请输入要解密的字符：");
		str=input.next();
		for(int i=0;i<str.length();i++) {
			 char cipherChar=str.charAt(i);
			List2.add(cipherChar);
		}
		Collections.reverse(List2);
		size=List2.size()-1;
		lastnum=(char) List2.get(size);
		firstnum=(char) List2.get(0);
		List2.set(0, lastnum);
		List2.set(size, firstnum);
		for(int i=0;i<List2.size();i++) {
			char plainChar=(char) List2.get(i);
			ascnum=(int)plainChar-i-4;
			List2.set(i,(char)ascnum);
		}
		System.out.println("解密的结果是");
		System.out.println(List2);
		
	}

}
