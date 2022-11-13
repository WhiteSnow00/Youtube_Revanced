import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokm extends ahbh implements ahcw
{
    public static final aokm a;
    private static volatile ahdd d;
    public int b;
    public int c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aokm.class, (ahbh)(a = new aokm()));
    }
    
    private aokm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aokm.d) == null) {
                    synchronized (aokm.class) {
                        if (aokm.d == null) {
                            aokm.d = (ahdd)new ahba((ahbh)aokm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aokm.a;
            }
            case 4: {
                return new ahaz((ahbh)aokm.a);
            }
            case 3: {
                return new aokm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001", new Object[] { "e", "b", "c" });
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
