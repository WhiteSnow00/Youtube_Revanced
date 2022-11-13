import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigw extends ahbh implements ahcw
{
    public static final aigw a;
    private static volatile ahdd b;
    private int c;
    private aigu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aigw.class, (ahbh)(a = new aigw()));
    }
    
    private aigw() {
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
                if ((b = aigw.b) == null) {
                    synchronized (aigw.class) {
                        if (aigw.b == null) {
                            aigw.b = (ahdd)new ahba((ahbh)aigw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aigw.a;
            }
            case 4: {
                return new ahaz((ahbh)aigw.a);
            }
            case 3: {
                return new aigw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
