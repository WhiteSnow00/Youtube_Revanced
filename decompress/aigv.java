import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigv extends ahbh implements ahcw
{
    public static final aigv a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aigv.class, (ahbh)(a = new aigv()));
    }
    
    private aigv() {
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
                if ((b = aigv.b) == null) {
                    synchronized (aigv.class) {
                        if (aigv.b == null) {
                            aigv.b = (ahdd)new ahba((ahbh)aigv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aigv.a;
            }
            case 4: {
                return new ahaz((ahbh)aigv.a);
            }
            case 3: {
                return new aigv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigv.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
