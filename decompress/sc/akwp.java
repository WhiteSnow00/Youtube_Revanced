import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwp extends ahbh implements ahcw
{
    public static final akwp a;
    private static volatile ahdd c;
    public ahwj b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akwp.class, (ahbh)(a = new akwp()));
    }
    
    private akwp() {
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
                if ((c = akwp.c) == null) {
                    synchronized (akwp.class) {
                        if (akwp.c == null) {
                            akwp.c = (ahdd)new ahba((ahbh)akwp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akwp.a;
            }
            case 4: {
                return new ahaz((ahbh)akwp.a);
            }
            case 3: {
                return new akwp();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwp.a, "\u0001\u0001\u0000\u0001\ue0c0\u2dd9\ue0c0\u2dd9\u0001\u0000\u0000\u0001\ue0c0\u2dd9\u1409\u0000", new Object[] { "d", "b" });
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
