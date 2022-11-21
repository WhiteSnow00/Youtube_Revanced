import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amor extends ahcz implements aheo
{
    public static final amor a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private ajws g;
    private ajws h;
    private anxb i;
    private ahjl j;
    private ajws k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(amor.class, a = new amor());
    }
    
    private amor() {
        this.l = 2;
        final ahbt b = ahbt.b;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amor.b) == null) {
                    synchronized (amor.class) {
                        if (amor.b == null) {
                            amor.b = (ahev)new ahcs((ahcz)amor.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amor.a;
            }
            case 4: {
                return new ahcr((ahcz)amor.a);
            }
            case 3: {
                return new amor();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amor.a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0005\u0005\u1409\t\n\u1409\u0004\f\u1409\u0002\r\u1409\u000b", new Object[] { "c", "d", "e", "g", "i", "j", "h", "f", "k" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
