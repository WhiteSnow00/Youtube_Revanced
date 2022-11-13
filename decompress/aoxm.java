import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxm extends ahbh implements ahcw
{
    private static final aoxm a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxm.class, (ahbh)(a = new aoxm()));
    }
    
    private aoxm() {
    }
    
    public static aoxm a() {
        return aoxm.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoxm.b) == null) {
                    synchronized (aoxm.class) {
                        if (aoxm.b == null) {
                            aoxm.b = (ahdd)new ahba((ahbh)aoxm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxm.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aoxm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxm.a, "\u0001\u0000", (Object[])null);
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
