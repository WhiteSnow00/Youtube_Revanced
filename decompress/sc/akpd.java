import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpd extends ahbh implements ahcw
{
    public static final akpd a;
    private static volatile ahdd d;
    public int b;
    public altz c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akpd.class, (ahbh)(a = new akpd()));
    }
    
    private akpd() {
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
                if ((d = akpd.d) == null) {
                    synchronized (akpd.class) {
                        if (akpd.d == null) {
                            akpd.d = (ahdd)new ahba((ahbh)akpd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akpd.a;
            }
            case 4: {
                return new ahaz((ahbh)akpd.a);
            }
            case 3: {
                return new akpd();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpd.a, "\u0001\u0001\u0000\u0001\ue572\u3b21\ue572\u3b21\u0001\u0000\u0000\u0001\ue572\u3b21\u1409\u0000", new Object[] { "b", "c" });
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
