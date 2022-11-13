import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akuh extends ahbh implements ahcw
{
    public static final akuh a;
    private static volatile ahdd c;
    public aore b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akuh.class, (ahbh)(a = new akuh()));
    }
    
    private akuh() {
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
                if ((c = akuh.c) == null) {
                    synchronized (akuh.class) {
                        if (akuh.c == null) {
                            akuh.c = (ahdd)new ahba((ahbh)akuh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akuh.a;
            }
            case 4: {
                return new ahaz((ahbh)akuh.a);
            }
            case 3: {
                return new akuh();
            }
            case 2: {
                return newMessageInfo((MessageLite)akuh.a, "\u0001\u0001\u0000\u0001\uf091\u1e99\uf091\u1e99\u0001\u0000\u0000\u0001\uf091\u1e99\u1409\u0000", new Object[] { "d", "b" });
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
