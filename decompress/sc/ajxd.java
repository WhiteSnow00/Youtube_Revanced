import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxd extends ahbh implements ahcw
{
    public static final ajxd a;
    private static volatile ahdd b;
    private int c;
    private aome d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxd.class, (ahbh)(a = new ajxd()));
    }
    
    private ajxd() {
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
                if ((b = ajxd.b) == null) {
                    synchronized (ajxd.class) {
                        if (ajxd.b == null) {
                            ajxd.b = (ahdd)new ahba((ahbh)ajxd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajxd.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxd.a);
            }
            case 3: {
                return new ajxd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxd.a, "\u0001\u0001\u0000\u0001\ue2d9\u1a6d\ue2d9\u1a6d\u0001\u0000\u0000\u0001\ue2d9\u1a6d\u1409\u0000", new Object[] { "c", "d" });
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
