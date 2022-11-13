import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuw extends ahbh implements ahcw
{
    public static final anuw a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)anuw.class, (ahbh)(a = new anuw()));
    }
    
    private anuw() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anuw.c) == null) {
                    synchronized (anuw.class) {
                        if (anuw.c == null) {
                            anuw.c = (ahdd)new ahba((ahbh)anuw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anuw.a;
            }
            case 4: {
                return new ahaz((ahbh)anuw.a);
            }
            case 3: {
                return new anuw();
            }
            case 2: {
                return newMessageInfo((MessageLite)anuw.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", anux.class });
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
