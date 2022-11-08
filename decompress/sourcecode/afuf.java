import java.util.concurrent.TimeoutException;

// 
// Decompiled by Procyon v0.6.0
// 

final class afuf extends TimeoutException
{
    public afuf(final String s) {
        super(s);
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        synchronized (this) {
            this.setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }
}
