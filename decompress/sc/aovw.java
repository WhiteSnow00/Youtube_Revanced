import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovw extends ahbh implements ahcw
{
    public static final aovw a;
    private static volatile ahdd d;
    public int b;
    public aidn c;
    
    static {
        ahbh.registerDefaultInstance((Class)aovw.class, (ahbh)(a = new aovw()));
    }
    
    private aovw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aovw.d) == null) {
                    synchronized (aovw.class) {
                        if (aovw.d == null) {
                            aovw.d = (ahdd)new ahba((ahbh)aovw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aovw.a;
            }
            case 4: {
                return new ahaz((ahbh)aovw.a);
            }
            case 3: {
                return new aovw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
