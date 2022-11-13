import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghe extends ahbh implements ahcw
{
    public static final aghe a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aghe.class, (ahbh)(a = new aghe()));
    }
    
    private aghe() {
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
                if ((c = aghe.c) == null) {
                    synchronized (aghe.class) {
                        if (aghe.c == null) {
                            aghe.c = (ahdd)new ahba((ahbh)aghe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aghe.a;
            }
            case 4: {
                return new ahaz((ahbh)aghe.a);
            }
            case 3: {
                return new aghe();
            }
            case 2: {
                return newMessageInfo((MessageLite)aghe.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
