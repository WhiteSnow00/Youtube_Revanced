import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhz extends ahbh implements ahcw
{
    public static final anhz a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anhz.class, (ahbh)(a = new anhz()));
    }
    
    private anhz() {
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
                if ((b = anhz.b) == null) {
                    synchronized (anhz.class) {
                        if (anhz.b == null) {
                            anhz.b = (ahdd)new ahba((ahbh)anhz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anhz.a;
            }
            case 4: {
                return new ahaz((ahbh)anhz.a);
            }
            case 3: {
                return new anhz();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhz.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
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
