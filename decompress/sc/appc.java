import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appc extends ahbh implements ahcw
{
    public static final appc a;
    private static volatile ahdd c;
    public amxe b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)appc.class, (ahbh)(a = new appc()));
    }
    
    private appc() {
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
                final ahdd c;
                if ((c = appc.c) == null) {
                    synchronized (appc.class) {
                        if (appc.c == null) {
                            appc.c = (ahdd)new ahba((ahbh)appc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return appc.a;
            }
            case 4: {
                return new ahaz((ahbh)appc.a);
            }
            case 3: {
                return new appc();
            }
            case 2: {
                return newMessageInfo((MessageLite)appc.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "d", "b" });
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
