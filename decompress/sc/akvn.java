import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvn extends ahbh implements ahcw
{
    public static final akvn a;
    private static volatile ahdd c;
    public akvk b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akvn.class, (ahbh)(a = new akvn()));
    }
    
    private akvn() {
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
                final ahdd c;
                if ((c = akvn.c) == null) {
                    synchronized (akvn.class) {
                        if (akvn.c == null) {
                            akvn.c = (ahdd)new ahba((ahbh)akvn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akvn.a;
            }
            case 4: {
                return new ahaz((ahbh)akvn.a);
            }
            case 3: {
                return new akvn();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvn.a, "\u0001\u0001\u0000\u0001\uf30f\u240b\uf30f\u240b\u0001\u0000\u0000\u0001\uf30f\u240b\u1409\u0000", new Object[] { "d", "b" });
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
