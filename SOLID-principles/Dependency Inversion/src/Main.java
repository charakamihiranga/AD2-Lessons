

// Entities must depend on abstractions, not on
// concretions. It states that the high-level module
// must not depend on the low-level module, but they
// should depend on abstractions.

// high-level module - UI, Business Logic
// low-level module - database call function, authentication functions

public class Main {
    public static void main(String[] args) {
        SubClass subClass = new SubClassImpl();
    }
}

interface SubClass{

}

class SubClassImpl implements SubClass{
}






