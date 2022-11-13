import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohb extends ahbh implements ahcw
{
    public static final aohb a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aohb.class, (ahbh)(a = new aohb()));
    }
    
    private aohb() {
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
                if ((b = aohb.b) == null) {
                    synchronized (aohb.class) {
                        if (aohb.b == null) {
                            aohb.b = (ahdd)new ahba((ahbh)aohb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aohb.a;
            }
            case 4: {
                return new ahaz((ahbh)aohb.a);
            }
            case 3: {
                return new aohb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
