import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amky extends ahbh implements ahcw
{
    public static final amky a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private aiqj f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private ahre k;
    private amgv l;
    private ahhu m;
    private alob n;
    private ajut o;
    private byte p;
    
    static {
        ahbh.registerDefaultInstance((Class)amky.class, (ahbh)(a = new amky()));
    }
    
    private amky() {
        this.p = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = amky.b) == null) {
                    synchronized (amky.class) {
                        if (amky.b == null) {
                            amky.b = (ahdd)new ahba((ahbh)amky.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amky.a;
            }
            case 4: {
                return new ahaz((ahbh)amky.a);
            }
            case 3: {
                return new amky();
            }
            case 2: {
                return newMessageInfo((MessageLite)amky.a, "\u0001\f\u0000\u0001\u0002\u0013\f\u0000\u0000\f\u0002\u1409\u0001\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\f\u1409\n\u000f\u1409\r\u0011\u1409\u000f\u0012\u1409\u0010\u0013\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "l" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
