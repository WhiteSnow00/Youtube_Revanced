import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appz extends ahbh implements ahcw
{
    public static final appz a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)appz.class, (ahbh)(a = new appz()));
    }
    
    private appz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = appz.b) == null) {
                    synchronized (appz.class) {
                        if (appz.b == null) {
                            appz.b = (ahdd)new ahba((ahbh)appz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appz.a;
            }
            case 4: {
                return new ahaz((ahbh)appz.a);
            }
            case 3: {
                return new appz();
            }
            case 2: {
                return newMessageInfo((MessageLite)appz.a, "\u0001\u0000", (Object[])null);
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