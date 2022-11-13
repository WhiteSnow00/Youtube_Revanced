import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alby extends ahbh implements ahcw
{
    public static final alby a;
    private static volatile ahdd c;
    public akli b;
    private int d;
    private aifj e;
    private ajvo f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)alby.class, (ahbh)(a = new alby()));
    }
    
    private alby() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = alby.c) == null) {
                    synchronized (alby.class) {
                        if (alby.c == null) {
                            alby.c = (ahdd)new ahba((ahbh)alby.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alby.a;
            }
            case 4: {
                return new ahaz((ahbh)alby.a);
            }
            case 3: {
                return new alby();
            }
            case 2: {
                return newMessageInfo((MessageLite)alby.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0309\u1409\u001a", new Object[] { "d", "b", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
