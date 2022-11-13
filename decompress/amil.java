import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amil extends ahbh implements ahcw
{
    public static final amil a;
    private static volatile ahdd d;
    public int b;
    public alfs c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amil.class, (ahbh)(a = new amil()));
    }
    
    private amil() {
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
                if ((d = amil.d) == null) {
                    synchronized (amil.class) {
                        if (amil.d == null) {
                            amil.d = (ahdd)new ahba((ahbh)amil.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amil.a;
            }
            case 4: {
                return new ahaz((ahbh)amil.a);
            }
            case 3: {
                return new amil();
            }
            case 2: {
                return newMessageInfo((MessageLite)amil.a, "\u0001\u0001\u0000\u0001\ue697\u3b15\ue697\u3b15\u0001\u0000\u0000\u0001\ue697\u3b15\u1409\u0000", new Object[] { "b", "c" });
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
