import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgx extends ahbh implements ahcw
{
    public static final ahgx a;
    private static volatile ahdd b;
    private int c;
    private afrf d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahgx.class, (ahbh)(a = new ahgx()));
    }
    
    private ahgx() {
        this.e = 2;
        emptyIntList();
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
                if ((b = ahgx.b) == null) {
                    synchronized (ahgx.class) {
                        if (ahgx.b == null) {
                            ahgx.b = (ahdd)new ahba((ahbh)ahgx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahgx.a;
            }
            case 4: {
                return new ahaz((ahbh)ahgx.a);
            }
            case 3: {
                return new ahgx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahgx.a, "\u0001\u0001\u0000\u0001%%\u0001\u0000\u0000\u0001%\u1409\u0003", new Object[] { "c", "d" });
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
