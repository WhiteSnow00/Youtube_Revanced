// 
// Decompiled by Procyon v0.6.0
// 

final class attz extends RuntimeException
{
    private final atpa a;
    
    public attz(final atpa a) {
        this.a = a;
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
    
    @Override
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}
