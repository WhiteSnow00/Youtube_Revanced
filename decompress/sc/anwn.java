import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwn extends ahbh implements ahcw
{
    public static final anwn a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)anwn.class, (ahbh)(a = new anwn()));
    }
    
    private anwn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anwn.d) == null) {
                    synchronized (anwn.class) {
                        if (anwn.d == null) {
                            anwn.d = (ahdd)new ahba((ahbh)anwn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anwn.a;
            }
            case 4: {
                return new ahaz((ahbh)anwn.a);
            }
            case 3: {
                return new anwn();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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
