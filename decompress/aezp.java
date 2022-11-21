import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aezp extends ahcz implements aheo
{
    private static final aezp a;
    private static volatile ahev b;
    private int c;
    private int d;
    private long e;
    
    static {
        ahcz.registerDefaultInstance(aezp.class, a = new aezp());
    }
    
    private aezp() {
    }
    
    public static aezn a() {
        return (aezn)aezp.a.createBuilder();
    }
    
    static aezp b() {
        return aezp.a;
    }
    
    public static void c(final aezp aezp, final aezo aezo) {
        aezp.f(aezo);
    }
    
    public static void d(final aezp aezp, final long n) {
        aezp.e(n);
    }
    
    private void e(final long e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void f(final aezo aezo) {
        this.d = aezo.p;
        this.c |= 0x1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aezp.b) == null) {
                    synchronized (aezp.class) {
                        if (aezp.b == null) {
                            aezp.b = (ahev)new ahcs((ahcz)aezp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aezp.a;
            }
            case 4: {
                return new aezn();
            }
            case 3: {
                return new aezp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aezp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001", new Object[] { "c", "d", aezo.b(), "e" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
