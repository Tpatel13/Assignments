package advance1.day4.assignment33;

class StringMock {
    String capacity;

    public StringMock() {
    }

    public StringMock(String capacity) {
        this.capacity = capacity;
    }


   @Deprecated
    public static int search(String string, char searchItem) {
//declare loop variable
        int index;
//convert the string to char array
        char[] charArray = string.toCharArray();

        for (index = 0; index < charArray.length; index++) {
            if (charArray[index] == searchItem)
                return index;
        }
        return 0;
    }
}