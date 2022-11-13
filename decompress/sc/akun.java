import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akun extends ahbh implements ahcw
{
    public static final akun a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akun.class, (ahbh)(a = new akun()));
    }
    
    private akun() {
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
                if ((b = akun.b) == null) {
                    synchronized (akun.class) {
                        if (akun.b == null) {
                            akun.b = (ahdd)new ahba((ahbh)akun.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akun.a;
            }
            case 4: {
                return new ahaz((ahbh)akun.a);
            }
            case 3: {
                return new akun();
            }
            case 2: {
                return newMessageInfo((MessageLite)akun.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
