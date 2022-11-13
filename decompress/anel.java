import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anel extends ahbh implements ahcw
{
    public static final anel a;
    private static volatile ahdd d;
    public int b;
    public anek c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anel.class, (ahbh)(a = new anel()));
    }
    
    private anel() {
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
                if ((d = anel.d) == null) {
                    synchronized (anel.class) {
                        if (anel.d == null) {
                            anel.d = (ahdd)new ahba((ahbh)anel.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anel.a;
            }
            case 4: {
                return new ahaz((ahbh)anel.a);
            }
            case 3: {
                return new anel();
            }
            case 2: {
                return newMessageInfo((MessageLite)anel.a, "\u0001\u0001\u0000\u0001\ue201\u42ae\ue201\u42ae\u0001\u0000\u0000\u0001\ue201\u42ae\u1409\u0000", new Object[] { "b", "c" });
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
