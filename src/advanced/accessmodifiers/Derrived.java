
package advanced.accessmodifiers;

public class Derrived extends Base {
	public String derivedVariable = "Derived Class Public Variable";

    
    @Override
    public void baseMethod() {
        System.out.println("Derived Class Public Method (overriding Base Class)");
    }

    
    public void derivedMethod() {
        System.out.println("Derived Class Public Method");
    }
}



