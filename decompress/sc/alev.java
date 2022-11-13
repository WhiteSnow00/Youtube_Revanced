import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alev extends ahbh implements ahcw
{
    public static final alev a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alev.class, (ahbh)(a = new alev()));
    }
    
    private alev() {
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
                if ((d = alev.d) == null) {
                    synchronized (alev.class) {
                        if (alev.d == null) {
                            alev.d = (ahdd)new ahba((ahbh)alev.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alev.a;
            }
            case 4: {
                return new ahaz((ahbh)alev.a);
            }
            case 3: {
                return new alev();
            }
            case 2: {
                return newMessageInfo((MessageLite)alev.a, "\u0001\u0002\u0001\u0000\ue18f\u3ee5\ue923\u4da1\u0002\u0000\u0000\u0002\ue18f\u3ee5\u143c\u0000\ue923\u4da1\u143c\u0000", new Object[] { "c", "b", amva.class, ajvp.class });
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
