// 
// Decompiled by Procyon v0.6.0
// 

public final class aeqe extends aeqd
{
    public final Throwable fillInStackTrace() {
        synchronized (this) {
            this.setStackTrace(new StackTraceElement[0]);
            return (Throwable)this;
        }
    }
}
