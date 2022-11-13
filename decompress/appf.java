import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appf extends ahbh implements ahcw
{
    public static final appf a;
    private static volatile ahdd e;
    public int b;
    public float c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)appf.class, (ahbh)(a = new appf()));
    }
    
    private appf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = appf.e) == null) {
                    synchronized (appf.class) {
                        if (appf.e == null) {
                            appf.e = (ahdd)new ahba((ahbh)appf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return appf.a;
            }
            case 4: {
                return new ahaz((ahbh)appf.a);
            }
            case 3: {
                return new appf();
            }
            case 2: {
                return newMessageInfo((MessageLite)appf.a, "\u0001\u0002\u0000\u0001\u0004\u000b\u0002\u0000\u0000\u0000\u0004\u1001\u0001\u000b\u100c\u0007", new Object[] { "b", "c", "d", apow.k });
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
