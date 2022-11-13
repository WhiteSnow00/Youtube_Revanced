import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxa extends ahbh implements ahcw
{
    public static final anxa a;
    private static volatile ahdd d;
    public int b;
    public aicz c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anxa.class, (ahbh)(a = new anxa()));
    }
    
    private anxa() {
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
                if ((d = anxa.d) == null) {
                    synchronized (anxa.class) {
                        if (anxa.d == null) {
                            anxa.d = (ahdd)new ahba((ahbh)anxa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anxa.a;
            }
            case 4: {
                return new ahaz((ahbh)anxa.a);
            }
            case 3: {
                return new anxa();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxa.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "b", "c" });
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
