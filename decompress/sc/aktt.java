import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktt extends ahbh implements ahcw
{
    public static final aktt a;
    private static volatile ahdd d;
    public int b;
    public long c;
    
    static {
        ahbh.registerDefaultInstance((Class)aktt.class, (ahbh)(a = new aktt()));
    }
    
    private aktt() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aktt.d) == null) {
                    synchronized (aktt.class) {
                        if (aktt.d == null) {
                            aktt.d = (ahdd)new ahba((ahbh)aktt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aktt.a;
            }
            case 4: {
                return new ahaz((ahbh)aktt.a);
            }
            case 3: {
                return new aktt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1003\u0000", new Object[] { "b", "c" });
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