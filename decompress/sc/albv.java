import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albv extends ahbh implements ahcw
{
    public static final albv a;
    private static volatile ahdd d;
    public akli b;
    public boolean c;
    private int e;
    private aifj f;
    private ajvo g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)albv.class, (ahbh)(a = new albv()));
    }
    
    private albv() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = albv.d) == null) {
                    synchronized (albv.class) {
                        if (albv.d == null) {
                            albv.d = (ahdd)new ahba((ahbh)albv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albv.a;
            }
            case 4: {
                return new ahaz((ahbh)albv.a);
            }
            case 3: {
                return new albv();
            }
            case 2: {
                return newMessageInfo((MessageLite)albv.a, "\u0001\u0004\u0000\u0001\u0001\u0309\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0004\u1409\u0003\u0012\u1007\u000f\u0309\u1409\u0010", new Object[] { "e", "b", "f", "c", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
