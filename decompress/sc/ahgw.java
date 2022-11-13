import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgw extends ahbh implements ahcw
{
    public static final ahgw a;
    private static volatile ahdd b;
    private int c;
    private afsd d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahgw.class, (ahbh)(a = new ahgw()));
    }
    
    private ahgw() {
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
                if ((b = ahgw.b) == null) {
                    synchronized (ahgw.class) {
                        if (ahgw.b == null) {
                            ahgw.b = (ahdd)new ahba((ahbh)ahgw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahgw.a;
            }
            case 4: {
                return new ahaz((ahbh)ahgw.a);
            }
            case 3: {
                return new ahgw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahgw.a, "\u0001\u0001\u0000\u0001\u0017\u0017\u0001\u0000\u0000\u0001\u0017\u1409\r", new Object[] { "c", "d" });
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
