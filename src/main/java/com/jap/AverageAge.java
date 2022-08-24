package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;
        double sum = 0;
        //
        try {
            //Write the logic
            for(int i = 0;i< ageRawData.length;i++){
             // int sum = Double.parseDouble(sum + ageRawData[i]);
                 sum = sum + Integer.parseInt( ageRawData[i]);


          }
            avg = sum/ ageRawData.length;

            return String.valueOf(avg);
            //Handle specific exception
        }catch (Exception exception)
        {
            return exception.toString();
        }
        //return String.valueOf(avg);
    }

    public static void main(String[] args) {
        String[] age = {"35","26","32","44"};
        AverageAge obj = new AverageAge();
        System.out.println(obj.averageAgeCalculator(age));
        String[] age1 = {"35","26","thirty two","44"};

        System.out.println(obj.averageAgeCalculator(age1));

    }



}
