import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahke extends ahbh implements ahcw
{
    public static final ahke a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)ahke.class, (ahbh)(a = new ahke()));
    }
    
    private ahke() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ahke.d) == null) {
                    synchronized (ahke.class) {
                        if (ahke.d == null) {
                            ahke.d = (ahdd)new ahba((ahbh)ahke.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahke.a;
            }
            case 4: {
                return new ahaz((ahbh)ahke.a);
            }
            case 3: {
                return new ahke();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahke.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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