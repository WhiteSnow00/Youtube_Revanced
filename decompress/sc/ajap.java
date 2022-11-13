import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajap extends ahbh implements ahcw
{
    public static final ajap a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajap.class, (ahbh)(a = new ajap()));
    }
    
    private ajap() {
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajap.b) == null) {
                    synchronized (ajap.class) {
                        if (ajap.b == null) {
                            ajap.b = (ahdd)new ahba((ahbh)ajap.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajap.a;
            }
            case 4: {
                return new ahaz((ahbh)ajap.a);
            }
            case 3: {
                return new ajap();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajap.a, "\u0001\u0000", (Object[])null);
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
