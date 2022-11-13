import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfq extends ahbh implements ahcw
{
    public static final ajfq a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfq.class, (ahbh)(a = new ajfq()));
    }
    
    private ajfq() {
        this.h = 2;
        final ahab b = ahab.b;
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
                if ((b = ajfq.b) == null) {
                    synchronized (ajfq.class) {
                        if (ajfq.b == null) {
                            ajfq.b = (ahdd)new ahba((ahbh)ajfq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajfq.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfq.a);
            }
            case 3: {
                return new ajfq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfq.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0005\u1409\u0006\u0006\u1409\u0002\u0007\u1409\u0004", new Object[] { "c", "d", "g", "e", "f" });
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
