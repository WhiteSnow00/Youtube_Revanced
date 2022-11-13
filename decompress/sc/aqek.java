import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqek extends ahbh implements ahcw
{
    public static final aqek a;
    private static volatile ahdd b;
    private ahcr c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqek.class, (ahbh)(a = new aqek()));
    }
    
    private aqek() {
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
                if ((b = aqek.b) == null) {
                    synchronized (aqek.class) {
                        if (aqek.b == null) {
                            aqek.b = (ahdd)new ahba((ahbh)aqek.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqek.a;
            }
            case 4: {
                return new ahaz((ahbh)aqek.a);
            }
            case 3: {
                return new aqek();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqek.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", aqej.a });
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
