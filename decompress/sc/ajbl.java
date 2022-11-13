import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbl extends ahbh implements ahcw
{
    private static final ajbl a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbl.class, (ahbh)(a = new ajbl()));
    }
    
    private ajbl() {
    }
    
    public static ajbl a() {
        return ajbl.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajbl.b) == null) {
                    synchronized (ajbl.class) {
                        if (ajbl.b == null) {
                            ajbl.b = (ahdd)new ahba((ahbh)ajbl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbl.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new ajbl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbl.a, "\u0001\u0000", (Object[])null);
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
