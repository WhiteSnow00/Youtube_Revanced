import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqei extends ahbh implements ahcw
{
    public static final aqei a;
    private static volatile ahdd b;
    private ahcr c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqei.class, (ahbh)(a = new aqei()));
    }
    
    private aqei() {
        this.c = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqei.b) == null) {
                    synchronized (aqei.class) {
                        if (aqei.b == null) {
                            aqei.b = (ahdd)new ahba((ahbh)aqei.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqei.a;
            }
            case 4: {
                return new ahaz((ahbh)aqei.a);
            }
            case 3: {
                return new aqei();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqei.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", aqeh.a });
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
