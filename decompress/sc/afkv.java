// 
// Decompiled by Procyon v0.6.0
// 

public final class afkv extends Exception
{
    public afkv(final Throwable t, final afle afle, final StackTraceElement[] stackTrace) {
        super(afle.toString(), t);
        this.setStackTrace(stackTrace);
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        return this;
    }
}
