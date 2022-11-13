import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpw extends ahbh implements ahcw
{
    public static final afpw a;
    private static volatile ahdd d;
    public int b;
    public afpx c;
    
    static {
        ahbh.registerDefaultInstance((Class)afpw.class, (ahbh)(a = new afpw()));
    }
    
    private afpw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = afpw.d) == null) {
                    synchronized (afpw.class) {
                        if (afpw.d == null) {
                            afpw.d = (ahdd)new ahba((ahbh)afpw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afpw.a;
            }
            case 4: {
                return new ahaz((ahbh)afpw.a);
            }
            case 3: {
                return new afpw();
            }
            case 2: {
                return newMessageInfo((MessageLite)afpw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
