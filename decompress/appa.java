import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appa extends ahbh implements ahcw
{
    public static final appa a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public ajut d;
    private ajut f;
    private ajut g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)appa.class, (ahbh)(a = new appa()));
    }
    
    private appa() {
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
                final ahdd e;
                if ((e = appa.e) == null) {
                    synchronized (appa.class) {
                        if (appa.e == null) {
                            appa.e = (ahdd)new ahba((ahbh)appa.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return appa.a;
            }
            case 4: {
                return new ahaz((ahbh)appa.a);
            }
            case 3: {
                return new appa();
            }
            case 2: {
                return newMessageInfo((MessageLite)appa.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0003\u0004\u1409\u0001\u0005\u1409\u0002", new Object[] { "b", "c", "g", "f", "d" });
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
