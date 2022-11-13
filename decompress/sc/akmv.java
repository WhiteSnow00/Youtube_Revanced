import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmv extends ahbh implements ahcw
{
    public static final akmv a;
    private static volatile ahdd d;
    public akli b;
    public int c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akmv.class, (ahbh)(a = new akmv()));
    }
    
    private akmv() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akmv.d) == null) {
                    synchronized (akmv.class) {
                        if (akmv.d == null) {
                            akmv.d = (ahdd)new ahba((ahbh)akmv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmv.a;
            }
            case 4: {
                return new ahaz((ahbh)akmv.a);
            }
            case 3: {
                return new akmv();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmv.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100c\u0001", new Object[] { "e", "b", "c", anqj.q });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
