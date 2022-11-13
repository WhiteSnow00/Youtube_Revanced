import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahho extends ahbh implements ahcw
{
    public static final ahho a;
    private static volatile ahdd c;
    public ahcr b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahho.class, (ahbh)(a = new ahho()));
    }
    
    private ahho() {
        this.b = ahcr.a;
        ahbh.emptyProtobufList();
        ahbh.emptyProtobufList();
        ahbh.emptyProtobufList();
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ahho.c) == null) {
                    synchronized (ahho.class) {
                        if (ahho.c == null) {
                            ahho.c = (ahdd)new ahba((ahbh)ahho.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahho.a;
            }
            case 4: {
                return new ahaz((ahbh)ahho.a);
            }
            case 3: {
                return new ahho();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahho.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", ahhn.a });
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
