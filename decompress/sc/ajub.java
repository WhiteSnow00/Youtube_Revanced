import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajub extends ahbh implements ahcw
{
    public static final ajub a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajub.class, (ahbh)(a = new ajub()));
    }
    
    private ajub() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajub.b) == null) {
                    synchronized (ajub.class) {
                        if (ajub.b == null) {
                            ajub.b = (ahdd)new ahba((ahbh)ajub.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajub.a;
            }
            case 4: {
                return new ahaz((ahbh)ajub.a);
            }
            case 3: {
                return new ajub();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajub.a, "\u0001\u0000", (Object[])null);
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
