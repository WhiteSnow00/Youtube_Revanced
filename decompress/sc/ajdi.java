import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdi extends ahbh implements ahcw
{
    public static final ajdi a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public ajdj e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdi.class, (ahbh)(a = new ajdi()));
    }
    
    private ajdi() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajdi.f) == null) {
                    synchronized (ajdi.class) {
                        if (ajdi.f == null) {
                            ajdi.f = (ahdd)new ahba((ahbh)ajdi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajdi.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdi.a);
            }
            case 3: {
                return new ajdi();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdi.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u1004\u0000\u0003\u1004\u0001\u0004\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
