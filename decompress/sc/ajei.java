import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajei extends ahbh implements ahcw
{
    public static final ajei a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajei.class, (ahbh)(a = new ajei()));
    }
    
    private ajei() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajei.d) == null) {
                    synchronized (ajei.class) {
                        if (ajei.d == null) {
                            ajei.d = (ahdd)new ahba((ahbh)ajei.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajei.a;
            }
            case 4: {
                return new ahaz((ahbh)ajei.a);
            }
            case 3: {
                return new ajei();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajei.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u1007\u0000", new Object[] { "b", "c" });
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
