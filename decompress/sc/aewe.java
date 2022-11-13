import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewe extends ahbh implements ahcw
{
    public static final aewe a;
    private static volatile ahdd c;
    public ahbp b;
    
    static {
        ahbh.registerDefaultInstance((Class)aewe.class, (ahbh)(a = new aewe()));
    }
    
    private aewe() {
        this.b = emptyIntList();
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
                if ((c = aewe.c) == null) {
                    synchronized (aewe.class) {
                        if (aewe.c == null) {
                            aewe.c = (ahdd)new ahba((ahbh)aewe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aewe.a;
            }
            case 4: {
                return new ahaz((ahbh)aewe.a);
            }
            case 3: {
                return new aewe();
            }
            case 2: {
                return newMessageInfo((MessageLite)aewe.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001e", new Object[] { "b", aeki.e });
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
