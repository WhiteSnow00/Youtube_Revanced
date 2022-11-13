import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agom extends ahbh implements ahcw
{
    public static final agom a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)agom.class, (ahbh)(a = new agom()));
    }
    
    private agom() {
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
                if ((c = agom.c) == null) {
                    synchronized (agom.class) {
                        if (agom.c == null) {
                            agom.c = (ahdd)new ahba((ahbh)agom.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agom.a;
            }
            case 4: {
                return new ahaz((ahbh)agom.a);
            }
            case 3: {
                return new agom();
            }
            case 2: {
                return newMessageInfo((MessageLite)agom.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", agol.class });
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
