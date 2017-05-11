public class BowlingGame {
    public int getBowlingScore(String bowlingCode) {
        //Calculating values
        //start
        if(allfrme[0][0] + allfrme[0][1] == 10)
          frme[0] = 10 + allfrme[0][1];
        else
          frme[0] = allfrme[0][0] + allfrme[1][0];
        //middle
        if(allfrme[0][0] == 10) {
          if(allfrme[0][1] == 10)
          frme[0] = 20 + allfrme[0][2];
          else
          frme[0] = 10 + allfrme[0][1] + allfrme[1][1];
        }

        //end
        for(int j = 1; j < 10; j++) {

        if(allfrme[0][j] == 10){
          if(allfrme[0][j + 1] == 10)
          frme[j] = frme[j - 1] + 20 + allfrme[0][j + 2];
          else
          frme[j] = frme[j - 1] + 10 + allfrme[0][j + 1] + allfrme[1][j + 1];
            continue;
        }

        if(allfrme[0][j] + allfrme[1][j] == 10)
          frme[j] = frme[j - 1] + 10 + allfrme[0][j + 1];
        else
          frme[j] = frme[j - 1] + allfrme[0][j] + allfrme[1][j];

        }

        //Printing Values
        System.out.print("\n\n\t  FRAME"); // Frame Heading
        //Init object loops to get and add values to the right address
        for(int k = 1; k < 11; k++)
          System.out.printf("%4d", new Object[] {
            Integer.valueOf(k) });

          if(allfrme[0][9] == 10) {
          if(allfrme[0][10] == 10)
            System.out.print("  XTR1 XTR2");
          else
            System.out.print("  EXTRA");

          }else if(allfrme[0][9] + allfrme[1][9] == 10)
          System.out.print("  XTRA");
          System.out.print("\n\n\tBall 1 ");

          for(int l = 0; l < 10; l++)
              System.out.printf("%4d", new Object[] {
          Integer.valueOf(allfrme[0][l])
            });
        //Displaying the array addresses in each frame.
        if(allfrme[0][9] == 10)	{
          if(allfrme[0][10] == 10)
            System.out.printf("%4d%4d", new Object[] {
            Integer.valueOf(allfrme[0][10]), Integer.valueOf(allfrme[0][11]) });
          else
              System.out.printf("%4d", new Object[] {
              Integer.valueOf(allfrme[0][10]) });

        } else
          if(allfrme[0][9] + allfrme[1][9] == 10)
          System.out.printf("%4d", new Object[] {
            Integer.valueOf(allfrme[0][10])
          });
            System.out.print("\n\tBall 2 ");
          for(int i1 = 0; i1 < 10; i1++)
          System.out.printf("%4d", new Object[] {
            Integer.valueOf(allfrme[1][i1])
          });

          if(allfrme[0][9] == 10 && allfrme[0][10] != 10)
          System.out.printf("%4d", new Object[] {
            Integer.valueOf(allfrme[1][10])
          });

            System.out.print("\n\n\t  SCORE");
          for(int j1 = 0; j1 < 10; j1++)
          System.out.printf("%4d", new Object[] {
            Integer.valueOf(frme[j1])
          });
          //Prompt to the user 
          System.out.print("\n\n\t\t\tPlay more (Y/N)? ");
          s = keyIn.next();
          String s1 = keyIn.nextLine();
          while(s.toUpperCase().charAt(0) == 'Y');
        return 0;
    }
}
