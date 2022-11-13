import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aofv extends ahbh implements ahcw
{
    public static final aofv a;
    private static volatile ahdd d;
    public int b;
    public long c;
    
    static {
        ahbh.registerDefaultInstance((Class)aofv.class, (ahbh)(a = new aofv()));
    }
    
    private aofv() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aofv.d) == null) {
                    synchronized (aofv.class) {
                        if (aofv.d == null) {
                            aofv.d = (ahdd)new ahba((ahbh)aofv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aofv.a;
            }
            case 4: {
                return new ahaz((ahbh)aofv.a);
            }
            case 3: {
                return new aofv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aofv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
