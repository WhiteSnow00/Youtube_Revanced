import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldx extends ahbh implements ahcw
{
    public static final aldx a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aldx.class, (ahbh)(a = new aldx()));
    }
    
    private aldx() {
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
                if ((d = aldx.d) == null) {
                    synchronized (aldx.class) {
                        if (aldx.d == null) {
                            aldx.d = (ahdd)new ahba((ahbh)aldx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aldx.a;
            }
            case 4: {
                return new ahaz((ahbh)aldx.a);
            }
            case 3: {
                return new aldx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldx.a, "\u0001\u0002\u0001\u0000\uf3e6\u1e05\ue823\u259d\u0002\u0000\u0000\u0002\uf3e6\u1e05\u143c\u0000\ue823\u259d\u143c\u0000", new Object[] { "c", "b", ahmj.class, angl.class });
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
