import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqj extends ahbh implements ahcw
{
    public static final agqj a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)agqj.class, (ahbh)(a = new agqj()));
    }
    
    private agqj() {
        ahbh.emptyProtobufList();
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = agqj.b) == null) {
                    synchronized (agqj.class) {
                        if (agqj.b == null) {
                            agqj.b = (ahdd)new ahba((ahbh)agqj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agqj.a;
            }
            case 4: {
                return new ahaz((ahbh)agqj.a);
            }
            case 3: {
                return new agqj();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqj.a, "\u0000\u0000", (Object[])null);
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
