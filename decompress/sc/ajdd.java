import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdd extends ahbh implements ahcw
{
    public static final ajdd a;
    private static volatile ahdd c;
    public ahcr b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdd.class, (ahbh)(a = new ajdd()));
    }
    
    private ajdd() {
        this.b = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajdd.c) == null) {
                    synchronized (ajdd.class) {
                        if (ajdd.c == null) {
                            ajdd.c = (ahdd)new ahba((ahbh)ajdd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajdd.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdd.a);
            }
            case 3: {
                return new ajdd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdd.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", ajdc.a });
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
