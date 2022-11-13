import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxq extends ahbh implements ahcw
{
    public static final ajxq a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxq.class, (ahbh)(a = new ajxq()));
    }
    
    private ajxq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajxq.b) == null) {
                    synchronized (ajxq.class) {
                        if (ajxq.b == null) {
                            ajxq.b = (ahdd)new ahba((ahbh)ajxq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajxq.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxq.a);
            }
            case 3: {
                return new ajxq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxq.a, "\u0001\u0000", (Object[])null);
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
