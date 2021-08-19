package collectionDemo;

public class stringBuilderDemo {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("HelloWorld");
    sb.append("s");
        System.out.println(sb);
    sb.reverse();
        System.out.println(sb);
    sb.reverse();
    sb.insert(4,"this is test");
        System.out.println(sb);
    System.out.println(sb.substring(5));
    System.out.println(sb.substring(5,8));
        sb.setCharAt(3,'3');
        sb.setCharAt(4,'3');
        sb.setCharAt(5,'3');
    System.out.println(sb);
    sb.setLength(50);
        System.out.println(sb.length());
        System.out.println(sb);
    sb.replace(0,15,"abcdefghi");
        System.out.println(sb);
    }

}

