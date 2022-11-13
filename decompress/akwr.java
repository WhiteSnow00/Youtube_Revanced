import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwr extends ahbh implements ahcw
{
    public static final akwr a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)akwr.class, (ahbh)(a = new akwr()));
    }
    
    private akwr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akwr.d) == null) {
                    synchronized (akwr.class) {
                        if (akwr.d == null) {
                            akwr.d = (ahdd)new ahba((ahbh)akwr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akwr.a;
            }
            case 4: {
                return new ahaz((ahbh)akwr.a);
            }
            case 3: {
                return new akwr();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
