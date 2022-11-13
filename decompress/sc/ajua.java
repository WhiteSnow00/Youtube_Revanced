import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajua extends ahbh implements ahcw
{
    public static final ajua a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajua.class, (ahbh)(a = new ajua()));
    }
    
    private ajua() {
        ahbh.emptyProtobufList();
        ahbh.emptyProtobufList();
        final ahab b = ahab.b;
        emptyProtobufList();
        emptyLongList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajua.b) == null) {
                    synchronized (ajua.class) {
                        if (ajua.b == null) {
                            ajua.b = (ahdd)new ahba((ahbh)ajua.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajua.a;
            }
            case 4: {
                return new ahaz((ahbh)ajua.a);
            }
            case 3: {
                return new ajua();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajua.a, "\u0001\u0000", (Object[])null);
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
