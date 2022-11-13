import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxb extends ahbh implements ahcw
{
    public static final ajxb a;
    private static volatile ahdd b;
    private int c;
    private ajxc d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxb.class, (ahbh)(a = new ajxb()));
    }
    
    private ajxb() {
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
                if ((b = ajxb.b) == null) {
                    synchronized (ajxb.class) {
                        if (ajxb.b == null) {
                            ajxb.b = (ahdd)new ahba((ahbh)ajxb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajxb.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxb.a);
            }
            case 3: {
                return new ajxb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxb.a, "\u0001\u0001\u0000\u0001\ue8b5\u2c30\ue8b5\u2c30\u0001\u0000\u0000\u0001\ue8b5\u2c30\u1409\u0000", new Object[] { "c", "d" });
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
