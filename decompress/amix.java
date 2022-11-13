import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amix extends ahbh implements ahcw
{
    public static final amix a;
    private static volatile ahdd d;
    public int b;
    public amiu c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amix.class, (ahbh)(a = new amix()));
    }
    
    private amix() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = amix.d) == null) {
                    synchronized (amix.class) {
                        if (amix.d == null) {
                            amix.d = (ahdd)new ahba((ahbh)amix.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amix.a;
            }
            case 4: {
                return new ahaz((ahbh)amix.a);
            }
            case 3: {
                return new amix();
            }
            case 2: {
                return newMessageInfo((MessageLite)amix.a, "\u0001\u0001\u0000\u0001\ufa18\u3c15\ufa18\u3c15\u0001\u0000\u0000\u0001\ufa18\u3c15\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
