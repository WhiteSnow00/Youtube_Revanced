import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtt extends ahbh implements ahcw
{
    public static final aqtt a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqtt.class, (ahbh)(a = new aqtt()));
    }
    
    private aqtt() {
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
                if ((c = aqtt.c) == null) {
                    synchronized (aqtt.class) {
                        if (aqtt.c == null) {
                            aqtt.c = (ahdd)new ahba((ahbh)aqtt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqtt.a;
            }
            case 4: {
                return new ahaz((boolean[][])null, (byte[][])null);
            }
            case 3: {
                return new aqtt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqtt.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aqto.class });
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
