import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxy extends ahbh implements ahcw
{
    public static final aoxy a;
    private static volatile ahdd b;
    private int c;
    private anul d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxy.class, (ahbh)(a = new aoxy()));
    }
    
    private aoxy() {
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
                if ((b = aoxy.b) == null) {
                    synchronized (aoxy.class) {
                        if (aoxy.b == null) {
                            aoxy.b = (ahdd)new ahba((ahbh)aoxy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxy.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxy.a);
            }
            case 3: {
                return new aoxy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxy.a, "\u0001\u0001\u0000\u0001\uf697\u1cd7\uf697\u1cd7\u0001\u0000\u0000\u0001\uf697\u1cd7\u1409\u0000", new Object[] { "c", "d" });
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
