import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpu extends ahbh implements ahcw
{
    public static final agpu a;
    private static volatile ahdd c;
    public String b;
    
    static {
        ahbh.registerDefaultInstance((Class)agpu.class, (ahbh)(a = new agpu()));
    }
    
    private agpu() {
        this.b = "";
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
                if ((c = agpu.c) == null) {
                    synchronized (agpu.class) {
                        if (agpu.c == null) {
                            agpu.c = (ahdd)new ahba((ahbh)agpu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agpu.a;
            }
            case 4: {
                return new ahaz((ahbh)agpu.a);
            }
            case 3: {
                return new agpu();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpu.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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
