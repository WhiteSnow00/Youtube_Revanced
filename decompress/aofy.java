import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aofy extends ahbh implements ahcw
{
    public static final aofy a;
    private static volatile ahdd d;
    public int b;
    public aixf c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aofy.class, (ahbh)(a = new aofy()));
    }
    
    private aofy() {
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
                if ((d = aofy.d) == null) {
                    synchronized (aofy.class) {
                        if (aofy.d == null) {
                            aofy.d = (ahdd)new ahba((ahbh)aofy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aofy.a;
            }
            case 4: {
                return new ahaz((ahbh)aofy.a);
            }
            case 3: {
                return new aofy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aofy.a, "\u0001\u0001\u0000\u0001\uf321\u1e90\uf321\u1e90\u0001\u0000\u0000\u0001\uf321\u1e90\u1409\u0000", new Object[] { "b", "c" });
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
