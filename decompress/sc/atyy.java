import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyy extends ahbh implements ahcw
{
    public static final atyy a;
    private static volatile ahdd b;
    private int c;
    private atyo d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)atyy.class, (ahbh)(a = new atyy()));
    }
    
    private atyy() {
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
                final ahdd b;
                if ((b = atyy.b) == null) {
                    synchronized (atyy.class) {
                        if (atyy.b == null) {
                            atyy.b = (ahdd)new ahba((ahbh)atyy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return atyy.a;
            }
            case 4: {
                return new ahaz((ahbh)atyy.a);
            }
            case 3: {
                return new atyy();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
