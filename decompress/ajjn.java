import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjn extends ahbh implements ahcw
{
    public static final ajjn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajjn.class, (ahbh)(a = new ajjn()));
    }
    
    private ajjn() {
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
                if ((b = ajjn.b) == null) {
                    synchronized (ajjn.class) {
                        if (ajjn.b == null) {
                            ajjn.b = (ahdd)new ahba((ahbh)ajjn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajjn.a;
            }
            case 4: {
                return new ahaz((ahbh)ajjn.a);
            }
            case 3: {
                return new ajjn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjn.a, "\u0001\u0000", (Object[])null);
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
