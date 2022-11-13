import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjy extends ahbh implements ahcw
{
    public static final aqjy a;
    private static volatile ahdd b;
    private int c;
    private aqjx d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjy.class, (ahbh)(a = new aqjy()));
    }
    
    private aqjy() {
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
                if ((b = aqjy.b) == null) {
                    synchronized (aqjy.class) {
                        if (aqjy.b == null) {
                            aqjy.b = (ahdd)new ahba((ahbh)aqjy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqjy.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjy.a);
            }
            case 3: {
                return new aqjy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
