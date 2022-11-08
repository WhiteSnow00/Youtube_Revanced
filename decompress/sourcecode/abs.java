// 
// Decompiled by Procyon v0.6.0
// 

class abs extends Throwable
{
    public abs() {
        super("Failure occurred while trying to finish a future.");
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        monitorenter(this);
        monitorexit(this);
        return this;
    }
}
