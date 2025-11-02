
// 9. Package Access Modifier Control

package com.access.one;
public class Base {
    private void privateMethod() { System.out.println("Private Method"); }
    void defaultMethod() { System.out.println("Default Method"); }
    protected void protectedMethod() { System.out.println("Protected Method"); }
    public void publicMethod() { System.out.println("Public Method"); }
}

package com.access.two;
import com.access.one.Base;

public class Derived extends Base {
    public void showAccess() {
        // privateMethod(); // Not accessible
        // defaultMethod(); // Not accessible
        protectedMethod(); // Accessible (subclass)
        publicMethod(); // Accessible
    }
}

// Main Class
import com.access.two.Derived;

public class AccessModifierControl {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.showAccess();
    }
}

// Access Summary Table:
// Private - Same class only
// Default - Same package only
// Protected - Same package + subclasses
// Public - Everywhere
