import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkb extends ahbh implements ahcw
{
    public static final ajkb a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajkb.class, (ahbh)(a = new ajkb()));
    }
    
    private ajkb() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b = ajkb.b) == null) {
                    synchronized (ajkb.class) {
                        if (ajkb.b == null) {
                            ajkb.b = (ahdd)new ahba((ahbh)ajkb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajkb.a;
            }
            case 4: {
                return new ahaz((ahbh)ajkb.a);
            }
            case 3: {
                return new ajkb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajkb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
