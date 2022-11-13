import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjd extends ahbh implements ahcw
{
    public static final amjd a;
    private static volatile ahdd d;
    public int b;
    public aicz c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amjd.class, (ahbh)(a = new amjd()));
    }
    
    private amjd() {
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
                if ((d = amjd.d) == null) {
                    synchronized (amjd.class) {
                        if (amjd.d == null) {
                            amjd.d = (ahdd)new ahba((ahbh)amjd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjd.a;
            }
            case 4: {
                return new ahaz((ahbh)amjd.a);
            }
            case 3: {
                return new amjd();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjd.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "b", "c" });
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
