import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvt extends ahbh implements ahcw
{
    public static final ajvt a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvt.class, (ahbh)(a = new ajvt()));
    }
    
    private ajvt() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajvt.b) == null) {
                    synchronized (ajvt.class) {
                        if (ajvt.b == null) {
                            ajvt.b = (ahdd)new ahba((ahbh)ajvt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajvt.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvt.a);
            }
            case 3: {
                return new ajvt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvt.a, "\u0001\u0000", (Object[])null);
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
