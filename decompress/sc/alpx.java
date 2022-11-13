import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpx extends ahbh implements ahcw
{
    public static final alpx a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)alpx.class, (ahbh)(a = new alpx()));
    }
    
    private alpx() {
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
                final ahdd b;
                if ((b = alpx.b) == null) {
                    synchronized (alpx.class) {
                        if (alpx.b == null) {
                            alpx.b = (ahdd)new ahba((ahbh)alpx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alpx.a;
            }
            case 4: {
                return new ahaz((ahbh)alpx.a);
            }
            case 3: {
                return new alpx();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
