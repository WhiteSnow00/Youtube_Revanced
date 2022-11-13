import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdf extends ahbh implements ahcw
{
    public static final ajdf a;
    private static volatile ahdd g;
    public int b;
    public boolean c;
    public alwj d;
    public ajdi e;
    public boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdf.class, (ahbh)(a = new ajdf()));
    }
    
    private ajdf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ajdf.g) == null) {
                    synchronized (ajdf.class) {
                        if (ajdf.g == null) {
                            ajdf.g = (ahdd)new ahba((ahbh)ajdf.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajdf.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdf.a);
            }
            case 3: {
                return new ajdf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdf.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001\u0004\u1009\u0003\u0005\u1007\u0004", new Object[] { "b", "c", "d", "e", "f" });
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
