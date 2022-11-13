import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjy extends ahbh implements ahcw
{
    public static final ahjy a;
    private static volatile ahdd b;
    private int c;
    private akav d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjy.class, (ahbh)(a = new ahjy()));
    }
    
    private ahjy() {
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
                if ((b = ahjy.b) == null) {
                    synchronized (ahjy.class) {
                        if (ahjy.b == null) {
                            ahjy.b = (ahdd)new ahba((ahbh)ahjy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahjy.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjy.a);
            }
            case 3: {
                return new ahjy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjy.a, "\u0001\u0001\u0000\u0001\uf339\u2d68\uf339\u2d68\u0001\u0000\u0000\u0001\uf339\u2d68\u1409\u0000", new Object[] { "c", "d" });
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
