import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class amjo extends ahbh implements ahcw
{
    public static final amjo a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)amjo.class, (ahbh)(a = new amjo()));
    }
    
    private amjo() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = amjo.b) == null) {
                    synchronized (amjo.class) {
                        if (amjo.b == null) {
                            amjo.b = (ahdd)new ahba((ahbh)amjo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amjo.a;
            }
            case 4: {
                return new ahaz((ahbh)amjo.a);
            }
            case 3: {
                return new amjo();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjo.a, "\u0001\u0000", (Object[])null);
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
