import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajuc extends ahbh implements ahcw
{
    public static final ajuc a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajuc.class, (ahbh)(a = new ajuc()));
    }
    
    private ajuc() {
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
                if ((c = ajuc.c) == null) {
                    synchronized (ajuc.class) {
                        if (ajuc.c == null) {
                            ajuc.c = (ahdd)new ahba((ahbh)ajuc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajuc.a;
            }
            case 4: {
                return new ahaz((ahbh)ajuc.a);
            }
            case 3: {
                return new ajuc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajuc.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[] { "b", ahmw.class });
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
