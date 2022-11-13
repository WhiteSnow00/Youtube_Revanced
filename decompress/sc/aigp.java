import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigp extends ahbh implements ahcw
{
    public static final aigp a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aigp.class, (ahbh)(a = new aigp()));
    }
    
    private aigp() {
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aigp.b) == null) {
                    synchronized (aigp.class) {
                        if (aigp.b == null) {
                            aigp.b = (ahdd)new ahba((ahbh)aigp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aigp.a;
            }
            case 4: {
                return new ahaz((ahbh)aigp.a);
            }
            case 3: {
                return new aigp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigp.a, "\u0001\u0000", (Object[])null);
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
