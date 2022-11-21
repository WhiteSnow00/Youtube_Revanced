// 
// Decompiled by Procyon v0.6.0
// 

public final class aety extends aetx
{
    @Override
    public final Throwable fillInStackTrace() {
        synchronized (this) {
            this.setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }
}
