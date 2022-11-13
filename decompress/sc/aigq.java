import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigq extends ahbh implements ahcw
{
    public static final aigq a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private aiqj g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aigq.class, (ahbh)(a = new aigq()));
    }
    
    private aigq() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aigq.b) == null) {
                    synchronized (aigq.class) {
                        if (aigq.b == null) {
                            aigq.b = (ahdd)new ahba((ahbh)aigq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aigq.a;
            }
            case 4: {
                return new ahaz((ahbh)aigq.a);
            }
            case 3: {
                return new aigq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigq.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
