import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aniu extends ahbh implements ahcw
{
    public static final aniu a;
    private static volatile ahdd d;
    public int b;
    public aicz c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aniu.class, (ahbh)(a = new aniu()));
    }
    
    private aniu() {
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
                if ((d = aniu.d) == null) {
                    synchronized (aniu.class) {
                        if (aniu.d == null) {
                            aniu.d = (ahdd)new ahba((ahbh)aniu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aniu.a;
            }
            case 4: {
                return new ahaz((ahbh)aniu.a);
            }
            case 3: {
                return new aniu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aniu.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "b", "c" });
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