// 
// Decompiled by Procyon v0.6.0
// 

final class aslr extends RuntimeException
{
    private static final long serialVersionUID = 3875212506787802066L;
    
    public aslr() {
    }
    
    @Override
    public final String getMessage() {
        return "Chain of Causes for CompositeException In Order Received =>";
    }
}
