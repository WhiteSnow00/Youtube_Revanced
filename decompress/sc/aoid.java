import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoid extends ahbh implements ahcw
{
    public static final aoid a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aoid.class, (ahbh)(a = new aoid()));
    }
    
    private aoid() {
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
                if ((d = aoid.d) == null) {
                    synchronized (aoid.class) {
                        if (aoid.d == null) {
                            aoid.d = (ahdd)new ahba((ahbh)aoid.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoid.a;
            }
            case 4: {
                return new ahaz((ahbh)aoid.a);
            }
            case 3: {
                return new aoid();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoid.a, "\u0001\u0005\u0001\u0000\ufe11\u3b6a\uff9f\u7e70\u0005\u0000\u0000\u0005\ufe11\u3b6a\u143c\u0000\ufe2d\u3b6a\u143c\u0000\uf492\u4933\u143c\u0000\uf5c0\u5903\u143c\u0000\uff9f\u7e70\u143c\u0000", new Object[] { "c", "b", aoic.class, aoif.class, ajmo.class, aoib.class, ahit.class });
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
