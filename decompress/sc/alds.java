import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alds extends ahbh implements ahcw
{
    public static final alds a;
    private static volatile ahdd d;
    public akli b;
    public boolean c;
    private int e;
    private ajvo f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)alds.class, (ahbh)(a = new alds()));
    }
    
    private alds() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alds.d) == null) {
                    synchronized (alds.class) {
                        if (alds.d == null) {
                            alds.d = (ahdd)new ahba((ahbh)alds.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alds.a;
            }
            case 4: {
                return new ahaz((ahbh)alds.a);
            }
            case 3: {
                return new alds();
            }
            case 2: {
                return newMessageInfo((MessageLite)alds.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1007\u0001\u0309\u1409\u0002", new Object[] { "e", "b", "c", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
