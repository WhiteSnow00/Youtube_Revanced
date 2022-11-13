import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgs extends ahbh implements ahcw
{
    public static final ajgs a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajgs.class, (ahbh)(a = new ajgs()));
    }
    
    private ajgs() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajgs.b) == null) {
                    synchronized (ajgs.class) {
                        if (ajgs.b == null) {
                            ajgs.b = (ahdd)new ahba((ahbh)ajgs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajgs.a;
            }
            case 4: {
                return new ahaz((ahbh)ajgs.a);
            }
            case 3: {
                return new ajgs();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajgs.a, "\u0001\u0000", (Object[])null);
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
