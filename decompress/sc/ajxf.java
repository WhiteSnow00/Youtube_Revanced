import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxf extends ahbh implements ahcw
{
    public static final ajxf a;
    private static volatile ahdd b;
    private int c;
    private amxe d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxf.class, (ahbh)(a = new ajxf()));
    }
    
    private ajxf() {
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
                if ((b = ajxf.b) == null) {
                    synchronized (ajxf.class) {
                        if (ajxf.b == null) {
                            ajxf.b = (ahdd)new ahba((ahbh)ajxf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajxf.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxf.a);
            }
            case 3: {
                return new ajxf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxf.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "c", "d" });
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