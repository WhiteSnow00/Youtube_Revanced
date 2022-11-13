import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjv extends ahbh implements ahcw
{
    public static final ahjv a;
    private static volatile ahdd d;
    public int b;
    public ahjp c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjv.class, (ahbh)(a = new ahjv()));
    }
    
    private ahjv() {
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
                final ahdd d;
                if ((d = ahjv.d) == null) {
                    synchronized (ahjv.class) {
                        if (ahjv.d == null) {
                            ahjv.d = (ahdd)new ahba((ahbh)ahjv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahjv.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjv.a);
            }
            case 3: {
                return new ahjv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjv.a, "\u0001\u0001\u0000\u0001\uf2eb\u2c8b\uf2eb\u2c8b\u0001\u0000\u0000\u0001\uf2eb\u2c8b\u1409\u0000", new Object[] { "b", "c" });
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
