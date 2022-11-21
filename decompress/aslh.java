// 
// Decompiled by Procyon v0.6.0
// 

public final class aslh
{
    private static final askz a;
    
    static {
        final asmn a2 = asjv.a;
        try {
            final askz a3 = aslg.a;
            if (a3 != null) {
                a = a3;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        }
        finally {
            final Throwable t;
            throw atle.b(t);
        }
    }
    
    public static askz a() {
        final askz a = aslh.a;
        if (a != null) {
            final asmn b = asjv.b;
            return a;
        }
        throw new NullPointerException("scheduler == null");
    }
}
