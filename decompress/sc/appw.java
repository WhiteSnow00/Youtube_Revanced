import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appw extends ahbh implements ahcw
{
    public static final appw a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)appw.class, (ahbh)(a = new appw()));
    }
    
    private appw() {
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = appw.b) == null) {
                    synchronized (appw.class) {
                        if (appw.b == null) {
                            appw.b = (ahdd)new ahba((ahbh)appw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appw.a;
            }
            case 4: {
                return new ahaz((ahbh)appw.a);
            }
            case 3: {
                return new appw();
            }
            case 2: {
                return newMessageInfo((MessageLite)appw.a, "\u0001\u0000", (Object[])null);
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
