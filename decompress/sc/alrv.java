import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrv extends ahbh implements ahcw
{
    public static final alrv a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private anuv f;
    private anuv g;
    private anuv h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)alrv.class, (ahbh)(a = new alrv()));
    }
    
    private alrv() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alrv.b) == null) {
                    synchronized (alrv.class) {
                        if (alrv.b == null) {
                            alrv.b = (ahdd)new ahba((ahbh)alrv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alrv.a;
            }
            case 4: {
                return new ahaz((ahbh)alrv.a);
            }
            case 3: {
                return new alrv();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrv.a, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0005\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0003", new Object[] { "c", "d", "f", "g", "h", "e" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
