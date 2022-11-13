import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akux extends ahbh implements ahcw
{
    public static final akux a;
    private static volatile ahdd d;
    public int b;
    public aklg c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akux.class, (ahbh)(a = new akux()));
    }
    
    private akux() {
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
                if ((d = akux.d) == null) {
                    synchronized (akux.class) {
                        if (akux.d == null) {
                            akux.d = (ahdd)new ahba((ahbh)akux.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akux.a;
            }
            case 4: {
                return new ahaz((ahbh)akux.a);
            }
            case 3: {
                return new akux();
            }
            case 2: {
                return newMessageInfo((MessageLite)akux.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
