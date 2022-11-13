import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohi extends ahbh implements ahcw
{
    public static final aohi a;
    private static volatile ahdd c;
    public ahnk b;
    private int d;
    private ahhu e;
    private ahmr f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aohi.class, (ahbh)(a = new aohi()));
    }
    
    private aohi() {
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
                final ahdd c;
                if ((c = aohi.c) == null) {
                    synchronized (aohi.class) {
                        if (aohi.c == null) {
                            aohi.c = (ahdd)new ahba((ahbh)aohi.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aohi.a;
            }
            case 4: {
                return new ahaz((ahbh)aohi.a);
            }
            case 3: {
                return new aohi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohi.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0002\u0005\u1409\u0004", new Object[] { "d", "b", "e", "f" });
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
