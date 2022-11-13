import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjz extends ahbh implements ahcw
{
    public static final aqjz a;
    private static volatile ahdd b;
    private int c;
    private aqka d;
    private aqka e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjz.class, (ahbh)(a = new aqjz()));
    }
    
    private aqjz() {
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
                final ahdd b;
                if ((b = aqjz.b) == null) {
                    synchronized (aqjz.class) {
                        if (aqjz.b == null) {
                            aqjz.b = (ahdd)new ahba((ahbh)aqjz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqjz.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjz.a);
            }
            case 3: {
                return new aqjz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjz.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f" });
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
