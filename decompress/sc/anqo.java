import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anqo extends ahbh implements ahcw
{
    public static final anqo a;
    private static volatile ahdd b;
    private int c;
    private amxe d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anqo.class, (ahbh)(a = new anqo()));
    }
    
    private anqo() {
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
                final ahdd b;
                if ((b = anqo.b) == null) {
                    synchronized (anqo.class) {
                        if (anqo.b == null) {
                            anqo.b = (ahdd)new ahba((ahbh)anqo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anqo.a;
            }
            case 4: {
                return new ahaz((ahbh)anqo.a);
            }
            case 3: {
                return new anqo();
            }
            case 2: {
                return newMessageInfo((MessageLite)anqo.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "c", "d" });
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
