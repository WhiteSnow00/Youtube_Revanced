import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogh extends ahbh implements ahcw
{
    public static final aogh a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aogh.class, (ahbh)(a = new aogh()));
    }
    
    private aogh() {
        this.b = 0;
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
                if ((d = aogh.d) == null) {
                    synchronized (aogh.class) {
                        if (aogh.d == null) {
                            aogh.d = (ahdd)new ahba((ahbh)aogh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogh.a;
            }
            case 4: {
                return new ahaz((ahbh)aogh.a);
            }
            case 3: {
                return new aogh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogh.a, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u143c\u0000\u0002\u143c\u0000\u0003\u103c\u0000\u0004\u143c\u0000", new Object[] { "c", "b", aojh.class, aisd.class, anyo.class, akfi.class });
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