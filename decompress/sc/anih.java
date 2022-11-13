import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anih extends ahbh implements ahcw
{
    public static final anih a;
    private static volatile ahdd c;
    public ajkd b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anih.class, (ahbh)(a = new anih()));
    }
    
    private anih() {
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
                if ((c = anih.c) == null) {
                    synchronized (anih.class) {
                        if (anih.c == null) {
                            anih.c = (ahdd)new ahba((ahbh)anih.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anih.a;
            }
            case 4: {
                return new ahaz((ahbh)anih.a);
            }
            case 3: {
                return new anih();
            }
            case 2: {
                return newMessageInfo((MessageLite)anih.a, "\u0001\u0001\u0000\u0001\uee5d\u21e7\uee5d\u21e7\u0001\u0000\u0000\u0001\uee5d\u21e7\u1409\u0000", new Object[] { "d", "b" });
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
