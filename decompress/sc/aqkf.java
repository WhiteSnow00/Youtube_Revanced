import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkf extends ahbh implements ahcw
{
    public static final aqkf a;
    private static volatile ahdd b;
    private int c;
    private aqib d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqkf.class, (ahbh)(a = new aqkf()));
    }
    
    private aqkf() {
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
                if ((b = aqkf.b) == null) {
                    synchronized (aqkf.class) {
                        if (aqkf.b == null) {
                            aqkf.b = (ahdd)new ahba((ahbh)aqkf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqkf.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkf.a);
            }
            case 3: {
                return new aqkf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkf.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
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
