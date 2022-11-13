import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alca extends ahbh implements ahcw
{
    public static final alca a;
    private static volatile ahdd c;
    public akli b;
    private int d;
    private ajvo e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)alca.class, (ahbh)(a = new alca()));
    }
    
    private alca() {
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
                final ahdd c;
                if ((c = alca.c) == null) {
                    synchronized (alca.class) {
                        if (alca.c == null) {
                            alca.c = (ahdd)new ahba((ahbh)alca.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alca.a;
            }
            case 4: {
                return new ahaz((ahbh)alca.a);
            }
            case 3: {
                return new alca();
            }
            case 2: {
                return newMessageInfo((MessageLite)alca.a, "\u0001\u0002\u0000\u0001\u0001\u0309\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0309\u1409\u0001", new Object[] { "d", "b", "e" });
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
