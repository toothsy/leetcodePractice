public class optumQuestion {


    static String[][] parseString(String s){
        String[] dateAndTime = s.split(" ");
        String[] date,time;
        date = dateAndTime[0].split("/");
        time = dateAndTime[1].split(":");
        return new String[][]{date,time};
    }

    static int[] handleTime(String[] date,String[] time){

        int  month = Integer.parseInt(date[1]);
        int  year = Integer.parseInt(date[0]);
        int  d = Integer.parseInt(date[2]);
        int  hour = Integer.parseInt(date[1]);
        int  min = Integer.parseInt(date[1]);
        int  sec = Integer.parseInt(date[1]);
        int  t = sec/60;

        if(sec>60) sec = sec%60;

        if(min>60){
            min+=t;
            t = min/60;
            min = min%60;
        }

        if(hour>24){
            hour += t;
            t = hour/24;
            hour = hour%24;

        }

        t += d/30;
        if(d>30)
            d = d%30;
        if(month>12){
            t = month/12;
            month = t+month%12;
        }
        year+=t;

        return new int[]{year,month,d,hour,min,sec};


    }
    public static void main(String[] args) {
        String currentTime = "2021/10/1 16:34:15.1";
        String[][] parsed= parseString(currentTime);
        String[] date = parsed[0],time = parsed[1];
        String[] inp = {"212/32/2212 1222:444:222"};
        String[][] sum;
        int year = 0;
        int day = 0;
        int month = 0;
        int hour=0,min=0,sec=0;
        int[] parsedInput ;
        for (String s : inp) {
            sum = parseString(s);
            parsedInput = handleTime(sum[0], sum[1]);
            year += parsedInput[0];
            month += parsedInput[1];
            day += parsedInput[2];
            hour += parsedInput[3];
            min += parsedInput[4];
            sec += parsedInput[5];
        }

    }
}
