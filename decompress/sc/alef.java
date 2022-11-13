import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alef extends ahbh implements ahcw
{
    public static final alef a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alef.class, (ahbh)(a = new alef()));
    }
    
    private alef() {
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
                if ((d = alef.d) == null) {
                    synchronized (alef.class) {
                        if (alef.d == null) {
                            alef.d = (ahdd)new ahba((ahbh)alef.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alef.a;
            }
            case 4: {
                return new ahaz((ahbh)alef.a);
            }
            case 3: {
                return new alef();
            }
            case 2: {
                return newMessageInfo((MessageLite)alef.a, "\u0001\u0006\u0001\u0000\uf321\u1e90\ue16f\u3ce9\u0006\u0000\u0000\u0006\uf321\u1e90\u143c\u0000\ueaaa\u1fae\u143c\u0000\uf42f\u24e3\u143c\u0000\ueaae\u2522\u143c\u0000\ue282\u363f\u143c\u0000\ue16f\u3ce9\u143c\u0000", new Object[] { "c", "b", aixf.class, amgs.class, aoho.class, amyd.class, anvi.class, alls.class });
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
