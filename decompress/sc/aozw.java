import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozw extends ahbh implements ahcw
{
    public static final aozw a;
    private static volatile ahdd d;
    public int b;
    public aozv c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aozw.class, (ahbh)(a = new aozw()));
    }
    
    private aozw() {
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
                if ((d = aozw.d) == null) {
                    synchronized (aozw.class) {
                        if (aozw.d == null) {
                            aozw.d = (ahdd)new ahba((ahbh)aozw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aozw.a;
            }
            case 4: {
                return new ahaz((ahbh)aozw.a);
            }
            case 3: {
                return new aozw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozw.a, "\u0001\u0001\u0000\u0001\uf27a\u400d\uf27a\u400d\u0001\u0000\u0000\u0001\uf27a\u400d\u1409\u0000", new Object[] { "b", "c" });
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
