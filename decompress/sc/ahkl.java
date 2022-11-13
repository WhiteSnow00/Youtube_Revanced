import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkl extends ahbh implements ahcw
{
    public static final ahkl a;
    private static volatile ahdd d;
    public String b;
    public String c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkl.class, (ahbh)(a = new ahkl()));
    }
    
    private ahkl() {
        this.b = "";
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ahkl.d) == null) {
                    synchronized (ahkl.class) {
                        if (ahkl.d == null) {
                            ahkl.d = (ahdd)new ahba((ahbh)ahkl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahkl.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkl.a);
            }
            case 3: {
                return new ahkl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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
