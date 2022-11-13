import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjw extends ahbh implements ahcw
{
    public static final aqjw a;
    private static volatile ahdd b;
    private int c;
    private aqjo d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjw.class, (ahbh)(a = new aqjw()));
    }
    
    private aqjw() {
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
                if ((b = aqjw.b) == null) {
                    synchronized (aqjw.class) {
                        if (aqjw.b == null) {
                            aqjw.b = (ahdd)new ahba((ahbh)aqjw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqjw.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjw.a);
            }
            case 3: {
                return new aqjw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjw.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
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
