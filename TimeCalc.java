public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutestoAdd = Integer.parseInt(args[1]);
        int totalMinutes = hours * 60 + minutes;
        int sum = totalMinutes + minutestoAdd;
        int newHours = (sum / 60) % 24; 
         int newMinutes = sum % 60;
         if (newHours<10&&newMinutes<10)
         {
            System.out.println("0" + newHours + ":" + "0"+newMinutes);
         }
          if (newHours<10&&newMinutes>=10)
          {
            System.out.println("0" + newHours + ":" + newMinutes);
          }
          if (newHours>=10&&newMinutes>=10)
          {
            System.out.println(newHours + ":" + newMinutes);
          }
          if (newHours>=10&&newMinutes<10)
          {
            System.out.println(newHours + ":" + "0"+newMinutes);
          }

        
    }
}
