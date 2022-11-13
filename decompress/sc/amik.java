import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amik extends ahbh implements ahcw
{
    public static final amik a;
    private static volatile ahdd d;
    public int b;
    public alfo c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amik.class, (ahbh)(a = new amik()));
    }
    
    private amik() {
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
                if ((d = amik.d) == null) {
                    synchronized (amik.class) {
                        if (amik.d == null) {
                            amik.d = (ahdd)new ahba((ahbh)amik.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amik.a;
            }
            case 4: {
                return new ahaz((ahbh)amik.a);
            }
            case 3: {
                return new amik();
            }
            case 2: {
                return newMessageInfo((MessageLite)amik.a, "\u0001\u0001\u0000\u0001\ue6c8\u3b15\ue6c8\u3b15\u0001\u0000\u0000\u0001\ue6c8\u3b15\u1409\u0000", new Object[] { "b", "c" });
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
