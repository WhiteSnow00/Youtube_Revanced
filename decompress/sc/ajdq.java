import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdq extends ahbh implements ahcw
{
    public static final ajdq a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdq.class, (ahbh)(a = new ajdq()));
    }
    
    private ajdq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajdq.b) == null) {
                    synchronized (ajdq.class) {
                        if (ajdq.b == null) {
                            ajdq.b = (ahdd)new ahba((ahbh)ajdq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajdq.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdq.a);
            }
            case 3: {
                return new ajdq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdq.a, "\u0001\u0000", (Object[])null);
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
