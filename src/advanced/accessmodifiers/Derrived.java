
package advanced.accessmodifiers;

public class Derrived  {
	public String derivedVariable = "Derived Class Public Variable";

    
    public void baseMethod() {
        System.out.println("Derived Class Public Method (overriding Base Class)");
    }

    
    public void derivedMethod() {
        System.out.println("Derived Class Public Method");
    }
}



