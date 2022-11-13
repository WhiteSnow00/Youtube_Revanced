import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnt extends ahbh implements ahcw
{
    public static final apnt a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private apnv f;
    private apnu g;
    private aiqj h;
    private anuv i;
    private ajut j;
    private ajut k;
    private ajut l;
    private ajut m;
    private ajut n;
    private ajut o;
    private ahhu p;
    private byte q;
    
    static {
        ahbh.registerDefaultInstance((Class)apnt.class, (ahbh)(a = new apnt()));
    }
    
    private apnt() {
        this.q = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apnt.b) == null) {
                    synchronized (apnt.class) {
                        if (apnt.b == null) {
                            apnt.b = (ahdd)new ahba((ahbh)apnt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnt.a;
            }
            case 4: {
                return new ahaz((ahbh)apnt.a);
            }
            case 3: {
                return new apnt();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnt.a, "\u0001\r\u0000\u0001\u0001\u0015\r\u0000\u0000\r\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0011\b\u1409\u0004\t\u1409\u0005\u000e\u1409\t\u000f\u1409\u000b\u0010\u1409\f\u0013\u1409\u0010\u0014\u1409\r\u0015\u1409\n", new Object[] { "c", "d", "e", "f", "g", "p", "h", "i", "j", "l", "m", "o", "n", "k" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
