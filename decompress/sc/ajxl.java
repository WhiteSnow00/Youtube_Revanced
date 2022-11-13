import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxl extends ahbh implements ahcw
{
    private static final ajxl a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxl.class, (ahbh)(a = new ajxl()));
    }
    
    private ajxl() {
    }
    
    public static ajxl a() {
        return ajxl.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajxl.b) == null) {
                    synchronized (ajxl.class) {
                        if (ajxl.b == null) {
                            ajxl.b = (ahdd)new ahba((ahbh)ajxl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajxl.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new ajxl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxl.a, "\u0001\u0000", (Object[])null);
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
