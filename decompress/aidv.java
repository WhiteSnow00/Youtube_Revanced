import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidv extends ahbh implements ahcw
{
    public static final aidv a;
    private static volatile ahdd b;
    private int c;
    private aiki d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aidv.class, (ahbh)(a = new aidv()));
    }
    
    private aidv() {
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
                if ((b = aidv.b) == null) {
                    synchronized (aidv.class) {
                        if (aidv.b == null) {
                            aidv.b = (ahdd)new ahba((ahbh)aidv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aidv.a;
            }
            case 4: {
                return new ahaz((ahbh)aidv.a);
            }
            case 3: {
                return new aidv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidv.a, "\u0001\u0001\u0000\u0001\ufd96\u2704\ufd96\u2704\u0001\u0000\u0000\u0001\ufd96\u2704\u1409\u0000", new Object[] { "c", "d" });
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
