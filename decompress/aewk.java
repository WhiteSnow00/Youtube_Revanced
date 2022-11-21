import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewk extends RuntimeException
{
    public aewk(final Throwable t, final StackTraceElement[] stackTrace) {
        super("", t);
        this.setStackTrace(stackTrace);
    }
    
    public static RuntimeException a(final Thread thread) {
        synchronized (aewp.a) {
            final aewo aewo = aewp.a.get(thread);
            monitorexit(aewp.a);
            aevk c;
            if (aewo == null) {
                c = null;
            }
            else {
                c = aewo.c;
            }
            return new aewk(null, c(c, null));
        }
    }
    
    public static RuntimeException b() {
        return new aewk(null, c(aewp.a(), null));
    }
    
    public static StackTraceElement[] c(final aevk aevk, final aevk aevk2) {
        final ArrayList list = new ArrayList();
        for (aevk a = aevk; a != aevk2; a = a.a()) {
            list.add(new StackTraceElement("tk_trace", a.b(), null, 0));
        }
        if (aevk instanceof aetz) {
            list.add(new StackTraceElement("tk_trace", "Missing root trace", null, 0));
        }
        return list.toArray(new StackTraceElement[0]);
    }
    
    public static void d(final Throwable t) {
        agsk.ai(t, (Throwable)b());
    }
    
    public static void e(final Throwable t, final StackTraceElement[] array) {
        agsk.ai(t, (Throwable)new aewj(array));
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        monitorenter(this);
        monitorexit(this);
        return this;
    }
}
