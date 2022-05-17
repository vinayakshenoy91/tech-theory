package Interview;

public class Replace0with5 {

  public static void main(String[] args) {

    System.out.println(convert5(121));

  }


  public static int convert5(int num){
    int multiple = 1;
    int sum=0;

    while(num!=0){
      int rem = num%10;

      if(rem==0){
        sum=sum+multiple*5;

      }else{

        sum=sum+multiple*rem;
      }
      multiple=multiple*10;

      num=num/10;
    }
    return sum;
  }

}
