import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amme extends ahbh implements ahcw
{
    public static final amme a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)amme.class, (ahbh)(a = new amme()));
    }
    
    private amme() {
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = amme.b) == null) {
                    synchronized (amme.class) {
                        if (amme.b == null) {
                            amme.b = (ahdd)new ahba((ahbh)amme.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amme.a;
            }
            case 4: {
                return new ahaz((ahbh)amme.a);
            }
            case 3: {
                return new amme();
            }
            case 2: {
                return newMessageInfo((MessageLite)amme.a, "\u0001\u0000", (Object[])null);
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
