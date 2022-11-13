import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpq extends ahbh implements ahcw
{
    public static final alpq a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alpq.class, (ahbh)(a = new alpq()));
    }
    
    private alpq() {
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
                if ((d = alpq.d) == null) {
                    synchronized (alpq.class) {
                        if (alpq.d == null) {
                            alpq.d = (ahdd)new ahba((ahbh)alpq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpq.a;
            }
            case 4: {
                return new ahaz((ahbh)alpq.a);
            }
            case 3: {
                return new alpq();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpq.a, "\u0001\u0002\u0001\u0000\ueb11\u1f11\ue6d4\u423b\u0002\u0000\u0000\u0002\ueb11\u1f11\u143c\u0000\ue6d4\u423b\u143c\u0000", new Object[] { "c", "b", aicz.class, alpp.class });
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
