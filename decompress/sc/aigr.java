import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigr extends ahbh implements ahcw
{
    public static final aigr a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aigr.class, (ahbh)(a = new aigr()));
    }
    
    private aigr() {
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aigr.b) == null) {
                    synchronized (aigr.class) {
                        if (aigr.b == null) {
                            aigr.b = (ahdd)new ahba((ahbh)aigr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aigr.a;
            }
            case 4: {
                return new ahaz((ahbh)aigr.a);
            }
            case 3: {
                return new aigr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigr.a, "\u0001\u0000", (Object[])null);
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
