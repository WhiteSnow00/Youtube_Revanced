import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjh extends ahbh implements ahcw
{
    public static final amjh a;
    private static volatile ahdd d;
    public int b;
    public alfs c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amjh.class, (ahbh)(a = new amjh()));
    }
    
    private amjh() {
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
                if ((d = amjh.d) == null) {
                    synchronized (amjh.class) {
                        if (amjh.d == null) {
                            amjh.d = (ahdd)new ahba((ahbh)amjh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjh.a;
            }
            case 4: {
                return new ahaz((ahbh)amjh.a);
            }
            case 3: {
                return new amjh();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjh.a, "\u0001\u0001\u0000\u0001\ue697\u3b15\ue697\u3b15\u0001\u0000\u0000\u0001\ue697\u3b15\u1409\u0000", new Object[] { "b", "c" });
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
