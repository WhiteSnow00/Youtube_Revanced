import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcb extends ahbh implements ahcw
{
    public static final alcb a;
    private static volatile ahdd d;
    public int b;
    public aklg c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alcb.class, (ahbh)(a = new alcb()));
    }
    
    private alcb() {
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
                if ((d = alcb.d) == null) {
                    synchronized (alcb.class) {
                        if (alcb.d == null) {
                            alcb.d = (ahdd)new ahba((ahbh)alcb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alcb.a;
            }
            case 4: {
                return new ahaz((ahbh)alcb.a);
            }
            case 3: {
                return new alcb();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
