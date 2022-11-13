import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqki extends ahbh implements ahcw
{
    public static final aqki a;
    private static volatile ahdd b;
    private int c;
    private aqia d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqki.class, (ahbh)(a = new aqki()));
    }
    
    private aqki() {
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
                if ((b = aqki.b) == null) {
                    synchronized (aqki.class) {
                        if (aqki.b == null) {
                            aqki.b = (ahdd)new ahba((ahbh)aqki.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqki.a;
            }
            case 4: {
                return new ahaz((ahbh)aqki.a);
            }
            case 3: {
                return new aqki();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqki.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
