import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigb extends ahbh implements ahcw
{
    public static final aigb a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aigb.class, (ahbh)(a = new aigb()));
    }
    
    private aigb() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b = aigb.b) == null) {
                    synchronized (aigb.class) {
                        if (aigb.b == null) {
                            aigb.b = (ahdd)new ahba((ahbh)aigb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aigb.a;
            }
            case 4: {
                return new ahaz((ahbh)aigb.a);
            }
            case 3: {
                return new aigb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigb.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
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