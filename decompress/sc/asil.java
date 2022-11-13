// 
// Decompiled by Procyon v0.6.0
// 

public final class asil
{
    private static final asid a;
    
    static {
        final asjr a2 = asfn.a;
        try {
            final asid a3 = asik.a;
            if (a3 != null) {
                a = a3;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        }
        finally {
            final Throwable t;
            throw atih.b(t);
        }
    }
    
    public static asid a() {
        final asid a = asil.a;
        if (a != null) {
            final asjr b = asfn.b;
            return a;
        }
        throw new NullPointerException("scheduler == null");
    }
}
