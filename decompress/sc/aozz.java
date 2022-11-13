import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozz extends ahbh implements ahcw
{
    public static final aozz a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aozz.class, (ahbh)(a = new aozz()));
    }
    
    private aozz() {
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
                if ((d = aozz.d) == null) {
                    synchronized (aozz.class) {
                        if (aozz.d == null) {
                            aozz.d = (ahdd)new ahba((ahbh)aozz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aozz.a;
            }
            case 4: {
                return new ahaz((ahbh)aozz.a);
            }
            case 3: {
                return new aozz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozz.a, "\u0001\u0002\u0001\u0000\ue4d5\u2c3b\uec92\u3fc5\u0002\u0000\u0000\u0002\ue4d5\u2c3b\u143c\u0000\uec92\u3fc5\u143c\u0000", new Object[] { "c", "b", aozy.class, apaa.class });
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
