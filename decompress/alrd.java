import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrd extends ahbh implements ahcw
{
    public static final alrd a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alrd.class, (ahbh)(a = new alrd()));
    }
    
    private alrd() {
        this.b = 0;
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
                if ((d = alrd.d) == null) {
                    synchronized (alrd.class) {
                        if (alrd.d == null) {
                            alrd.d = (ahdd)new ahba((ahbh)alrd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alrd.a;
            }
            case 4: {
                return new ahaz((ahbh)alrd.a);
            }
            case 3: {
                return new alrd();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrd.a, "\u0001\u0001\u0001\u0000\ue202\u39d6\ue202\u39d6\u0001\u0000\u0000\u0001\ue202\u39d6\u143c\u0000", new Object[] { "c", "b", alsn.class });
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
