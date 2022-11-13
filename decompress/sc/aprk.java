import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprk extends ahbh implements ahcw
{
    public static final aprk a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aprk.class, (ahbh)(a = new aprk()));
    }
    
    private aprk() {
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
                if ((d = aprk.d) == null) {
                    synchronized (aprk.class) {
                        if (aprk.d == null) {
                            aprk.d = (ahdd)new ahba((ahbh)aprk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aprk.a;
            }
            case 4: {
                return new ahaz((ahbh)aprk.a);
            }
            case 3: {
                return new aprk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprk.a, "\u0001\u0005\u0001\u0000\ue018\u17aa\ueea5\u37f3\u0005\u0000\u0000\u0005\ue018\u17aa\u143c\u0000\ufa4c\u17d2\u143c\u0000\uf74f\u2a6b\u143c\u0000\uf415\u3337\u143c\u0000\ueea5\u37f3\u143c\u0000", new Object[] { "c", "b", apra.class, aprz.class, akcf.class, apry.class, apqy.class });
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
