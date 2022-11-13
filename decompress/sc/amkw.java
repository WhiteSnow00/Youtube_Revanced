import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkw extends ahbh implements ahcw
{
    public static final amkw a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amkw.class, (ahbh)(a = new amkw()));
    }
    
    private amkw() {
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
                if ((d = amkw.d) == null) {
                    synchronized (amkw.class) {
                        if (amkw.d == null) {
                            amkw.d = (ahdd)new ahba((ahbh)amkw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amkw.a;
            }
            case 4: {
                return new ahaz((ahbh)amkw.a);
            }
            case 3: {
                return new amkw();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkw.a, "\u0001\u0001\u0001\u0000\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u143c\u0000", new Object[] { "c", "b", aicz.class });
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
