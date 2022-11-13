import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdj extends ahbh implements ahcw
{
    public static final ajdj a;
    private static volatile ahdd d;
    public int b;
    public int c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdj.class, (ahbh)(a = new ajdj()));
    }
    
    private ajdj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajdj.d) == null) {
                    synchronized (ajdj.class) {
                        if (ajdj.d == null) {
                            ajdj.d = (ahdd)new ahba((ahbh)ajdj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajdj.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdj.a);
            }
            case 3: {
                return new ajdj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "e", "b", "c" });
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
