// 
// Decompiled by Procyon v0.6.0
// 

final class atld extends Throwable
{
    private static final long serialVersionUID = -4649703670690200604L;
    
    public atld() {
        super("No further exceptions");
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        return this;
    }
}
