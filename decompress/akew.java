import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akew extends ahbh implements ahcw
{
    public static final akew a;
    private static volatile ahdd b;
    private int c;
    private aiah d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akew.class, (ahbh)(a = new akew()));
    }
    
    private akew() {
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
                if ((b = akew.b) == null) {
                    synchronized (akew.class) {
                        if (akew.b == null) {
                            akew.b = (ahdd)new ahba((ahbh)akew.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akew.a;
            }
            case 4: {
                return new ahaz((ahbh)akew.a);
            }
            case 3: {
                return new akew();
            }
            case 2: {
                return newMessageInfo((MessageLite)akew.a, "\u0001\u0001\u0000\u0001\uffc6\u1847\uffc6\u1847\u0001\u0000\u0000\u0001\uffc6\u1847\u1409\u0000", new Object[] { "c", "d" });
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
