import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkj extends ahbh implements ahcw
{
    public static final ajkj a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajkj.class, (ahbh)(a = new ajkj()));
    }
    
    private ajkj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajkj.f) == null) {
                    synchronized (ajkj.class) {
                        if (ajkj.f == null) {
                            ajkj.f = (ahdd)new ahba((ahbh)ajkj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajkj.a;
            }
            case 4: {
                return new ahaz((ahbh)ajkj.a);
            }
            case 3: {
                return new ajkj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajkj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
