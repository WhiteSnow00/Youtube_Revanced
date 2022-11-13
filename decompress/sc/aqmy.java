import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmy extends ahbh implements ahcw
{
    public static final aqmy a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmy.class, (ahbh)(a = new aqmy()));
    }
    
    private aqmy() {
        this.b = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqmy.c) == null) {
                    synchronized (aqmy.class) {
                        if (aqmy.c == null) {
                            aqmy.c = (ahdd)new ahba((ahbh)aqmy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqmy.a;
            }
            case 4: {
                return new ahaz((char[][][])null, (byte[][])null);
            }
            case 3: {
                return new aqmy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmy.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
