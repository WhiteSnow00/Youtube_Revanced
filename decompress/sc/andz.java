import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andz extends ahbh implements ahcw
{
    public static final andz a;
    private static volatile ahdd b;
    private int c;
    private andy d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)andz.class, (ahbh)(a = new andz()));
    }
    
    private andz() {
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
                final ahdd b;
                if ((b = andz.b) == null) {
                    synchronized (andz.class) {
                        if (andz.b == null) {
                            andz.b = (ahdd)new ahba((ahbh)andz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andz.a;
            }
            case 4: {
                return new ahaz((ahbh)andz.a);
            }
            case 3: {
                return new andz();
            }
            case 2: {
                return newMessageInfo((MessageLite)andz.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0003", new Object[] { "c", "d" });
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
