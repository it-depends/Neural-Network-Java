/*
 *   A simple Neuron that simply holds a value rather than
 *   calculating one.  It is used in the Input layer to 
 *   represent the provided input values.
 *   
 */

package Java_Neural_Network;

public class ValueNeuron extends Neuron {

    public ValueNeuron() { 
    	super(null, null); 
    }

    @Override
    public void feedForward()
    {
        // do nothing
    }

    @Override
    public void propagateBack()
    {
        // do nothing
    }

    public void SetValue(double value)
    {
        super.value = value;
    }

    @Override
    protected double calcValueDelta()  
    {
    	assert false; // "Don't expect CalcValueDelta to be called on a Value neuron because PropagateBack does nothing"
        return 0;
    }
	
}
