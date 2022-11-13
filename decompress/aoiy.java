import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoiy extends ahbh implements ahcw
{
    public static final aoiy a;
    private static volatile ahdd d;
    public int b;
    public anul c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aoiy.class, (ahbh)(a = new aoiy()));
    }
    
    private aoiy() {
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
                if ((d = aoiy.d) == null) {
                    synchronized (aoiy.class) {
                        if (aoiy.d == null) {
                            aoiy.d = (ahdd)new ahba((ahbh)aoiy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoiy.a;
            }
            case 4: {
                return new ahaz((ahbh)aoiy.a);
            }
            case 3: {
                return new aoiy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoiy.a, "\u0001\u0001\u0000\u0001\uf697\u1cd7\uf697\u1cd7\u0001\u0000\u0000\u0001\uf697\u1cd7\u1409\u0000", new Object[] { "b", "c" });
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
