// 
// Decompiled by Procyon v0.6.0
// 

public final class oec extends RuntimeException
{
    public oec(final String s, final StackTraceElement[] stackTrace) {
        super(s);
        this.setStackTrace(stackTrace);
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        monitorenter(this);
        monitorexit(this);
        return this;
    }
}
