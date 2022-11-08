import java.util.concurrent.locks.LockSupport;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odj extends Exception
{
    public odj(final Thread thread) {
        final String a = a(thread);
        final StackTraceElement[] stackTrace = thread.getStackTrace();
        super(a);
        this.setStackTrace(stackTrace);
    }
    
    public static String a(final Thread thread) {
        final Object blocker = LockSupport.getBlocker(thread);
        final Thread.State state = thread.getState();
        final String string = thread.toString();
        String concat = "";
        String concat2;
        if (state == null) {
            concat2 = "";
        }
        else {
            concat2 = " in state ".concat(state.toString());
        }
        if (blocker != null) {
            concat = " blocked on ".concat(String.valueOf(blocker.toString()));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(concat2);
        sb.append(concat);
        return sb.toString();
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        monitorenter(this);
        monitorexit(this);
        return this;
    }
}
