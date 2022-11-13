import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akop extends ahbh implements ahcw
{
    public static final akop a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)akop.class, (ahbh)(a = new akop()));
    }
    
    private akop() {
        this.k = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akop.b) == null) {
                    synchronized (akop.class) {
                        if (akop.b == null) {
                            akop.b = (ahdd)new ahba((ahbh)akop.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akop.a;
            }
            case 4: {
                return new ahaz((ahbh)akop.a);
            }
            case 3: {
                return new akop();
            }
            case 2: {
                return newMessageInfo((MessageLite)akop.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
