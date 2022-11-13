import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqea extends ahbh implements ahcw
{
    public static final aqea a;
    private static volatile ahdd c;
    public aqeg b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqea.class, (ahbh)(a = new aqea()));
    }
    
    private aqea() {
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
                final ahdd c;
                if ((c = aqea.c) == null) {
                    synchronized (aqea.class) {
                        if (aqea.c == null) {
                            aqea.c = (ahdd)new ahba((ahbh)aqea.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqea.a;
            }
            case 4: {
                return new ahaz((ahbh)aqea.a);
            }
            case 3: {
                return new aqea();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqea.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
