import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkv extends ahbh implements ahcw
{
    public static final ahkv a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkv.class, (ahbh)(a = new ahkv()));
    }
    
    private ahkv() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahkv.b) == null) {
                    synchronized (ahkv.class) {
                        if (ahkv.b == null) {
                            ahkv.b = (ahdd)new ahba((ahbh)ahkv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahkv.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkv.a);
            }
            case 3: {
                return new ahkv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkv.a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
