import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifg extends ahbh implements ahcw
{
    public static final aifg a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aifg.class, (ahbh)(a = new aifg()));
    }
    
    private aifg() {
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
                if ((d = aifg.d) == null) {
                    synchronized (aifg.class) {
                        if (aifg.d == null) {
                            aifg.d = (ahdd)new ahba((ahbh)aifg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aifg.a;
            }
            case 4: {
                return new ahaz((ahbh)aifg.a);
            }
            case 3: {
                return new aifg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifg.a, "\u0001\u0002\u0001\u0000\uf26a\u2912\uf63f\u4515\u0002\u0000\u0000\u0002\uf26a\u2912\u143c\u0000\uf63f\u4515\u143c\u0000", new Object[] { "c", "b", aljh.class, ajdb.class });
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
