import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amis extends ahbh implements ahcw
{
    public static final amis a;
    private static volatile ahdd c;
    public aicz b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amis.class, (ahbh)(a = new amis()));
    }
    
    private amis() {
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
                if ((c = amis.c) == null) {
                    synchronized (amis.class) {
                        if (amis.c == null) {
                            amis.c = (ahdd)new ahba((ahbh)amis.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amis.a;
            }
            case 4: {
                return new ahaz((ahbh)amis.a);
            }
            case 3: {
                return new amis();
            }
            case 2: {
                return newMessageInfo((MessageLite)amis.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "d", "b" });
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
