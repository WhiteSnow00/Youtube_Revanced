import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alez extends ahbh implements ahcw
{
    public static final alez a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alez.class, (ahbh)(a = new alez()));
    }
    
    private alez() {
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
                if ((d = alez.d) == null) {
                    synchronized (alez.class) {
                        if (alez.d == null) {
                            alez.d = (ahdd)new ahba((ahbh)alez.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alez.a;
            }
            case 4: {
                return new ahaz((ahbh)alez.a);
            }
            case 3: {
                return new alez();
            }
            case 2: {
                return newMessageInfo((MessageLite)alez.a, "\u0001\u0002\u0001\u0000\uf11d\u1f0a\uf437\u1f3b\u0002\u0000\u0000\u0002\uf11d\u1f0a\u143c\u0000\uf437\u1f3b\u143c\u0000", new Object[] { "c", "b", apxu.class, apxx.class });
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
