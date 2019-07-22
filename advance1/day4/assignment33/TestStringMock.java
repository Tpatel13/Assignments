package advance1.day4.assignment33;


import static advance1.day4.assignment33.StringMock.search;

public class TestStringMock {

    public static void main(String[] args) {
        String message = "What's in the name";
//To-Do : create an object of StringMock class
//To-Do : Use search method to search for a character present in the array
//To-Do : Use search method to search for a character not present in the array

        StringMock s=new StringMock(message);
        search("as",'s');
    }
}
