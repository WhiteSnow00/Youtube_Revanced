import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aklr extends ahbh implements ahcw
{
    public static final aklr a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aklr.class, (ahbh)(a = new aklr()));
    }
    
    private aklr() {
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
                if ((d = aklr.d) == null) {
                    synchronized (aklr.class) {
                        if (aklr.d == null) {
                            aklr.d = (ahdd)new ahba((ahbh)aklr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aklr.a;
            }
            case 4: {
                return new ahaz((ahbh)aklr.a);
            }
            case 3: {
                return new aklr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aklr.a, "\u0001\u0002\u0001\u0000\uf5a1\u3b97\ue470\u461f\u0002\u0000\u0000\u0002\uf5a1\u3b97\u143c\u0000\ue470\u461f\u143c\u0000", new Object[] { "c", "b", amjl.class, ajah.class });
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
