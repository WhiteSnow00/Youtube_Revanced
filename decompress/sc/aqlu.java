import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlu extends ahbh implements ahcw
{
    public static final aqlu a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlu.class, (ahbh)(a = new aqlu()));
    }
    
    private aqlu() {
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
                if ((c = aqlu.c) == null) {
                    synchronized (aqlu.class) {
                        if (aqlu.c == null) {
                            aqlu.c = (ahdd)new ahba((ahbh)aqlu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqlu.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlu.a);
            }
            case 3: {
                return new aqlu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlu.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aqlh.class });
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
