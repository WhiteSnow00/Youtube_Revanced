import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aklv extends ahbh implements ahcw
{
    public static final aklv a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)aklv.class, (ahbh)(a = new aklv()));
    }
    
    private aklv() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aklv.d) == null) {
                    synchronized (aklv.class) {
                        if (aklv.d == null) {
                            aklv.d = (ahdd)new ahba((ahbh)aklv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aklv.a;
            }
            case 4: {
                return new ahaz((ahbh)aklv.a);
            }
            case 3: {
                return new aklv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aklv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
