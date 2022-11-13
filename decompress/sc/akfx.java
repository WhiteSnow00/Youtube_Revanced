import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfx extends ahbh implements ahcw
{
    public static final akfx a;
    private static volatile ahdd d;
    public int b;
    public anqq c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akfx.class, (ahbh)(a = new akfx()));
    }
    
    private akfx() {
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
                if ((d = akfx.d) == null) {
                    synchronized (akfx.class) {
                        if (akfx.d == null) {
                            akfx.d = (ahdd)new ahba((ahbh)akfx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akfx.a;
            }
            case 4: {
                return new ahaz((ahbh)akfx.a);
            }
            case 3: {
                return new akfx();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfx.a, "\u0001\u0001\u0000\u0001\uff43\u1dfd\uff43\u1dfd\u0001\u0000\u0000\u0001\uff43\u1dfd\u1409\u0000", new Object[] { "b", "c" });
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
