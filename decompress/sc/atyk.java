import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyk extends ahbh implements ahcw
{
    public static final atyk a;
    private static volatile ahdd d;
    public int b;
    public atyj c;
    
    static {
        ahbh.registerDefaultInstance((Class)atyk.class, (ahbh)(a = new atyk()));
    }
    
    private atyk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = atyk.d) == null) {
                    synchronized (atyk.class) {
                        if (atyk.d == null) {
                            atyk.d = (ahdd)new ahba((ahbh)atyk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atyk.a;
            }
            case 4: {
                return new ahaz((ahbh)atyk.a);
            }
            case 3: {
                return new atyk();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
