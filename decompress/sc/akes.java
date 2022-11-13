import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akes extends ahbh implements ahcw
{
    public static final akes a;
    private static volatile ahdd c;
    public aker b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akes.class, (ahbh)(a = new akes()));
    }
    
    private akes() {
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
                if ((c = akes.c) == null) {
                    synchronized (akes.class) {
                        if (akes.c == null) {
                            akes.c = (ahdd)new ahba((ahbh)akes.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akes.a;
            }
            case 4: {
                return new ahaz((ahbh)akes.a);
            }
            case 3: {
                return new akes();
            }
            case 2: {
                return newMessageInfo((MessageLite)akes.a, "\u0001\u0001\u0000\u0001\ufdf9\u1d9f\ufdf9\u1d9f\u0001\u0000\u0000\u0001\ufdf9\u1d9f\u1409\u0000", new Object[] { "d", "b" });
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
