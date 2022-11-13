import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajuf extends ahbh implements ahcw
{
    public static final ajuf a;
    private static volatile ahdd c;
    public ajut b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajuf.class, (ahbh)(a = new ajuf()));
    }
    
    private ajuf() {
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
                if ((c = ajuf.c) == null) {
                    synchronized (ajuf.class) {
                        if (ajuf.c == null) {
                            ajuf.c = (ahdd)new ahba((ahbh)ajuf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajuf.a;
            }
            case 4: {
                return new ahaz((ahbh)ajuf.a);
            }
            case 3: {
                return new ajuf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajuf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
