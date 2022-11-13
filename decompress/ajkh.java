import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkh extends ahbh implements ahcw
{
    public static final ajkh a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajkh.class, (ahbh)(a = new ajkh()));
    }
    
    private ajkh() {
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
                if ((b = ajkh.b) == null) {
                    synchronized (ajkh.class) {
                        if (ajkh.b == null) {
                            ajkh.b = (ahdd)new ahba((ahbh)ajkh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajkh.a;
            }
            case 4: {
                return new ahaz((ahbh)ajkh.a);
            }
            case 3: {
                return new ajkh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajkh.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
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
