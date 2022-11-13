import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfp extends ahbh implements ahcw
{
    public static final anfp a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anfp.class, (ahbh)(a = new anfp()));
    }
    
    private anfp() {
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
                if ((b = anfp.b) == null) {
                    synchronized (anfp.class) {
                        if (anfp.b == null) {
                            anfp.b = (ahdd)new ahba((ahbh)anfp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anfp.a;
            }
            case 4: {
                return new ahaz((ahbh)anfp.a);
            }
            case 3: {
                return new anfp();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfp.a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0001\r\u1409\b", new Object[] { "c", "d" });
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
