import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghs extends ahbh implements ahcw
{
    public static final aghs a;
    private static volatile ahdd b;
    private int c;
    private aqty d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aghs.class, (ahbh)(a = new aghs()));
    }
    
    private aghs() {
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
                if ((b = aghs.b) == null) {
                    synchronized (aghs.class) {
                        if (aghs.b == null) {
                            aghs.b = (ahdd)new ahba((ahbh)aghs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aghs.a;
            }
            case 4: {
                return new ahaz((ahbh)aghs.a);
            }
            case 3: {
                return new aghs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aghs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
