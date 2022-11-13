import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appv extends ahbh implements ahcw
{
    private static final appv a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)appv.class, (ahbh)(a = new appv()));
    }
    
    private appv() {
    }
    
    public static appv a() {
        return appv.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = appv.b) == null) {
                    synchronized (appv.class) {
                        if (appv.b == null) {
                            appv.b = (ahdd)new ahba((ahbh)appv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appv.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new appv();
            }
            case 2: {
                return newMessageInfo((MessageLite)appv.a, "\u0001\u0000", (Object[])null);
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
