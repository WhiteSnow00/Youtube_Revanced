import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajki extends ahbh implements ahcw
{
    public static final ajki a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajki.class, (ahbh)(a = new ajki()));
    }
    
    private ajki() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajki.b) == null) {
                    synchronized (ajki.class) {
                        if (ajki.b == null) {
                            ajki.b = (ahdd)new ahba((ahbh)ajki.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajki.a;
            }
            case 4: {
                return new ahaz((ahbh)ajki.a);
            }
            case 3: {
                return new ajki();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajki.a, "\u0001\u0000", (Object[])null);
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
