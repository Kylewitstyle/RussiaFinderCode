import java.io.*;
public class RussiaTester {
public static void main(String[] args) {

RussiaFinder Tester=new RussiaFinder();
Tester.read("RedditPosts.text");
System.out.println("Russia was said" + Tester.count + "times");
}
}