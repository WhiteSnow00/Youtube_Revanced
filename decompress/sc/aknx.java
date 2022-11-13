import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknx extends ahbh implements ahcw
{
    public static final aknx a;
    private static volatile ahdd d;
    public ajqs b;
    public long c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aknx.class, (ahbh)(a = new aknx()));
    }
    
    private aknx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aknx.d) == null) {
                    synchronized (aknx.class) {
                        if (aknx.d == null) {
                            aknx.d = (ahdd)new ahba((ahbh)aknx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aknx.a;
            }
            case 4: {
                return new ahaz((ahbh)aknx.a);
            }
            case 3: {
                return new aknx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001", new Object[] { "e", "b", "c" });
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
