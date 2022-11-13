import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbv extends ahbh implements ahcw
{
    public static final ajbv a;
    private static volatile ahdd b;
    private int c;
    private ajbu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbv.class, (ahbh)(a = new ajbv()));
    }
    
    private ajbv() {
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
                if ((b = ajbv.b) == null) {
                    synchronized (ajbv.class) {
                        if (ajbv.b == null) {
                            ajbv.b = (ahdd)new ahba((ahbh)ajbv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbv.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbv.a);
            }
            case 3: {
                return new ajbv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbv.a, "\u0001\u0001\u0000\u0001\ue67f\u252f\ue67f\u252f\u0001\u0000\u0000\u0001\ue67f\u252f\u1409\u0000", new Object[] { "c", "d" });
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
