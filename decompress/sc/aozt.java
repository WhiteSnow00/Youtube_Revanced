import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozt extends ahbh implements ahcw
{
    public static final aozt a;
    private static volatile ahdd d;
    public aozs b;
    public aozz c;
    private int e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aozt.class, (ahbh)(a = new aozt()));
    }
    
    private aozt() {
        this.g = 2;
        final ahab b = ahab.b;
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
                if ((d = aozt.d) == null) {
                    synchronized (aozt.class) {
                        if (aozt.d == null) {
                            aozt.d = (ahdd)new ahba((ahbh)aozt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aozt.a;
            }
            case 4: {
                return new ahaz((ahbh)aozt.a);
            }
            case 3: {
                return new aozt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozt.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0001\u0003\u1409\u0003\u0005\u1409\u0000", new Object[] { "e", "c", "f", "b" });
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
