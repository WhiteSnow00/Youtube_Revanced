import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahki extends ahbh implements ahcw
{
    public static final ahki a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)ahki.class, (ahbh)(a = new ahki()));
    }
    
    private ahki() {
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
                if ((d = ahki.d) == null) {
                    synchronized (ahki.class) {
                        if (ahki.d == null) {
                            ahki.d = (ahdd)new ahba((ahbh)ahki.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahki.a;
            }
            case 4: {
                return new ahaz((ahbh)ahki.a);
            }
            case 3: {
                return new ahki();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahki.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
