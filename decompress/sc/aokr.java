import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokr extends ahbh implements ahcw
{
    public static final aokr a;
    private static volatile ahdd d;
    public int b;
    public int c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aokr.class, (ahbh)(a = new aokr()));
    }
    
    private aokr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aokr.d) == null) {
                    synchronized (aokr.class) {
                        if (aokr.d == null) {
                            aokr.d = (ahdd)new ahba((ahbh)aokr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aokr.a;
            }
            case 4: {
                return new ahaz((ahbh)aokr.a);
            }
            case 3: {
                return new aokr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", aoet.u });
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
