import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovx extends ahbh implements ahcw
{
    public static final aovx a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)aovx.class, (ahbh)(a = new aovx()));
    }
    
    private aovx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aovx.d) == null) {
                    synchronized (aovx.class) {
                        if (aovx.d == null) {
                            aovx.d = (ahdd)new ahba((ahbh)aovx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aovx.a;
            }
            case 4: {
                return new ahaz((ahbh)aovx.a);
            }
            case 3: {
                return new aovx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovx.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0001", new Object[] { "b", "c" });
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
