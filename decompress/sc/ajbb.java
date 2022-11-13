import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbb extends ahbh implements ahcw
{
    private static final ajbb a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbb.class, (ahbh)(a = new ajbb()));
    }
    
    private ajbb() {
    }
    
    public static ajbb a() {
        return ajbb.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajbb.b) == null) {
                    synchronized (ajbb.class) {
                        if (ajbb.b == null) {
                            ajbb.b = (ahdd)new ahba((ahbh)ajbb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbb.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new ajbb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbb.a, "\u0001\u0000", (Object[])null);
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
