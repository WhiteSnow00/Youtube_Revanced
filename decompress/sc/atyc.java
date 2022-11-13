import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyc extends ahbh implements ahcw
{
    public static final atyc a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)atyc.class, (ahbh)(a = new atyc()));
    }
    
    private atyc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = atyc.d) == null) {
                    synchronized (atyc.class) {
                        if (atyc.d == null) {
                            atyc.d = (ahdd)new ahba((ahbh)atyc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atyc.a;
            }
            case 4: {
                return new ahaz((ahbh)atyc.a);
            }
            case 3: {
                return new atyc();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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
