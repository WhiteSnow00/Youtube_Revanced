import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appb extends ahbh implements ahcw
{
    public static final appb a;
    private static volatile ahdd b;
    private int c;
    private aqkp d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)appb.class, (ahbh)(a = new appb()));
    }
    
    private appb() {
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
                if ((b = appb.b) == null) {
                    synchronized (appb.class) {
                        if (appb.b == null) {
                            appb.b = (ahdd)new ahba((ahbh)appb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appb.a;
            }
            case 4: {
                return new ahaz((ahbh)appb.a);
            }
            case 3: {
                return new appb();
            }
            case 2: {
                return newMessageInfo((MessageLite)appb.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
