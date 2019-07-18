package basic.day3;

class Assignment6 {

    public static void main(String[] args) {
        int number,iterations;

        number = Integer.parseInt(args[0]);
        iterations = Integer.parseInt(args[1]);
        System.out.println(number+" "+iterations);

            for(int j=0;j<iterations;j++)
            {
                System.out.println(number +" *  "+j+" = "+(number*j));
            }

    }
}
