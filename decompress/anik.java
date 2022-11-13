import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anik extends ahbh implements ahcw
{
    public static final anik a;
    private static volatile ahdd d;
    public int b;
    public akav c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anik.class, (ahbh)(a = new anik()));
    }
    
    private anik() {
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
                if ((d = anik.d) == null) {
                    synchronized (anik.class) {
                        if (anik.d == null) {
                            anik.d = (ahdd)new ahba((ahbh)anik.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anik.a;
            }
            case 4: {
                return new ahaz((ahbh)anik.a);
            }
            case 3: {
                return new anik();
            }
            case 2: {
                return newMessageInfo((MessageLite)anik.a, "\u0001\u0001\u0000\u0001\uf339\u2d68\uf339\u2d68\u0001\u0000\u0000\u0001\uf339\u2d68\u1409\u0000", new Object[] { "b", "c" });
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
