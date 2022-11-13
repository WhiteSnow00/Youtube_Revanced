import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldz extends ahbh implements ahcw
{
    public static final aldz a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aldz.class, (ahbh)(a = new aldz()));
    }
    
    private aldz() {
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
                if ((d = aldz.d) == null) {
                    synchronized (aldz.class) {
                        if (aldz.d == null) {
                            aldz.d = (ahdd)new ahba((ahbh)aldz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aldz.a;
            }
            case 4: {
                return new ahaz((ahbh)aldz.a);
            }
            case 3: {
                return new aldz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldz.a, "\u0001\u0001\u0001\u0000\uf61a\u163f\uf61a\u163f\u0001\u0000\u0000\u0001\uf61a\u163f\u143c\u0000", new Object[] { "c", "b", ahxm.class });
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
