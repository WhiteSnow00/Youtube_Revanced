import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoo extends ahbh implements ahcw
{
    public static final agoo a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)agoo.class, (ahbh)(a = new agoo()));
    }
    
    private agoo() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agoo.d) == null) {
                    synchronized (agoo.class) {
                        if (agoo.d == null) {
                            agoo.d = (ahdd)new ahba((ahbh)agoo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agoo.a;
            }
            case 4: {
                return new ahaz((ahbh)agoo.a);
            }
            case 3: {
                return new agoo();
            }
            case 2: {
                return newMessageInfo((MessageLite)agoo.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1035\u0000\u0002\u1033\u0000\u0003\u103c\u0000", new Object[] { "c", "b", agom.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
