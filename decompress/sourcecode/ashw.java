// 
// Decompiled by Procyon v0.6.0
// 

public final class ashw
{
    private static final asho a;
    
    static {
        final asjc a2 = arxj.a;
        try {
            final asho a3 = ashv.a;
            if (a3 != null) {
                a = a3;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        }
        finally {
            final Throwable t;
            throw athp.b(t);
        }
    }
    
    public static asho a() {
        final asho a = ashw.a;
        if (a != null) {
            final asjc b = arxj.b;
            return a;
        }
        throw new NullPointerException("scheduler == null");
    }
}
