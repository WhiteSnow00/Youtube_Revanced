import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbp extends ahbh implements ahcw
{
    public static final ajbp a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbp.class, (ahbh)(a = new ajbp()));
    }
    
    private ajbp() {
        this.b = 0;
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
                if ((d = ajbp.d) == null) {
                    synchronized (ajbp.class) {
                        if (ajbp.d == null) {
                            ajbp.d = (ahdd)new ahba((ahbh)ajbp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajbp.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbp.a);
            }
            case 3: {
                return new ajbp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbp.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u143c\u0000\u0002\u143c\u0000", new Object[] { "c", "b", aiqj.class, ajnb.class });
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
