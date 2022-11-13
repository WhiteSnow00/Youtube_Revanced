import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfh extends ahbh implements ahcw
{
    public static final ajfh a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfh.class, (ahbh)(a = new ajfh()));
    }
    
    private ajfh() {
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
                if ((b = ajfh.b) == null) {
                    synchronized (ajfh.class) {
                        if (ajfh.b == null) {
                            ajfh.b = (ahdd)new ahba((ahbh)ajfh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajfh.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfh.a);
            }
            case 3: {
                return new ajfh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfh.a, "\u0001\u0000", (Object[])null);
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
