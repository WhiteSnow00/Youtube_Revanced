import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsq extends ahbh implements ahcw
{
    public static final apsq a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private apsp f;
    private apso g;
    private aodo h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)apsq.class, (ahbh)(a = new apsq()));
    }
    
    private apsq() {
        this.j = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apsq.b) == null) {
                    synchronized (apsq.class) {
                        if (apsq.b == null) {
                            apsq.b = (ahdd)new ahba((ahbh)apsq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsq.a;
            }
            case 4: {
                return new ahaz((ahbh)apsq.a);
            }
            case 3: {
                return new apsq();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsq.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
