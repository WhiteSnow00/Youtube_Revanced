import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbr extends ahbh implements ahcw
{
    public static final ajbr a;
    private static volatile ahdd c;
    public aotp b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbr.class, (ahbh)(a = new ajbr()));
    }
    
    private ajbr() {
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
                if ((c = ajbr.c) == null) {
                    synchronized (ajbr.class) {
                        if (ajbr.c == null) {
                            ajbr.c = (ahdd)new ahba((ahbh)ajbr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajbr.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbr.a);
            }
            case 3: {
                return new ajbr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
