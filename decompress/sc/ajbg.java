import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbg extends ahbh implements ahcw
{
    public static final ajbg a;
    private static volatile ahdd b;
    private int c;
    private ajbf d;
    private ajbf e;
    private ajbf f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbg.class, (ahbh)(a = new ajbg()));
    }
    
    private ajbg() {
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
                if ((b = ajbg.b) == null) {
                    synchronized (ajbg.class) {
                        if (ajbg.b == null) {
                            ajbg.b = (ahdd)new ahba((ahbh)ajbg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbg.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbg.a);
            }
            case 3: {
                return new ajbg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbg.a, "\u0001\u0003\u0000\u0001\u0007\t\u0003\u0000\u0000\u0003\u0007\u1409\u0000\b\u1409\u0001\t\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
