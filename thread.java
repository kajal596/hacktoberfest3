import java.util.*;
class evenThread extends Thread
{
              public void run()
              {
                  for(int i=0;i<10;i++)
                  {
                        if(i%2==0)
                          {
                              System.out.println("even:" +i);
                          }
                      }
                }
}

class oddThread extends Thread
{
              public void run()
              {
                  for(int i=0;i<10;i++)
                  {
                        if(i%2!=0)
                          {
                              System.out.println("odd:" +i);
                          }
                      }
                }
}
class Thread
{
        public static void main(String []args)
        {
              evenThread e=new evenThread();
              oddthread o=new oddThread();
                e.start();
                o.start();
        }
}
