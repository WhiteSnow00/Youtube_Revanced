import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpt extends ahbh implements ahcw
{
    public static final alpt a;
    private static volatile ahdd d;
    public int b;
    public alpv c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alpt.class, (ahbh)(a = new alpt()));
    }
    
    private alpt() {
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
                if ((d = alpt.d) == null) {
                    synchronized (alpt.class) {
                        if (alpt.d == null) {
                            alpt.d = (ahdd)new ahba((ahbh)alpt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpt.a;
            }
            case 4: {
                return new ahaz((ahbh)alpt.a);
            }
            case 3: {
                return new alpt();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpt.a, "\u0001\u0001\u0000\u0001\uff36\u42bd\uff36\u42bd\u0001\u0000\u0000\u0001\uff36\u42bd\u1409\u0000", new Object[] { "b", "c" });
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
