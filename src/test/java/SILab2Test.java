import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private final SILab2 si = new SILab2();
    User u1es = null;
    User u2es = new User("Petko","petko123","petko@gmailcom");
    User u3es = new User("Petko","petko123","petkogmail.com");
    User u4es = new User("Petko","petko123","petko@gmail.com");
    List<String> listes= Arrays.asList("Trajko","Risto");
    @Test
    void function() {
        assertFalse(si.function(u1es,listes));
        assertFalse(si.function(u2es,listes));
        assertFalse(si.function(u3es,listes));
        assertTrue(si.function(u4es,listes));
    }
    User u1ep = null;
    User u2ep = new User("Petko",null,null);
    User u3ep = new User("Petko","petko123","petkogmail.com");
    User u4ep = new User("Petko","petko123","petko@gmail.com");
    List<String> list1ep= Arrays.asList("Trajko","Risto");
    List<String> list2ep= Arrays.asList("Trajko","Risto","Petko");
    @Test
    void function1() {
        assertFalse(si.function(u1ep,list1ep));
        assertFalse(si.function(u2ep,list2ep));
        assertFalse(si.function(u3ep,list1ep));
        assertTrue(si.function(u4ep,list1ep));
    }
}