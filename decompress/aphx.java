import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphx extends ahcz implements aheo
{
    public static final aphx a;
    private static volatile ahev b;
    private int c;
    private aiet d;
    private ajws e;
    private anxb f;
    private anxb g;
    private ajws h;
    private ajws i;
    private anxb j;
    private anxb k;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(aphx.class, a = new aphx());
    }
    
    private aphx() {
        this.m = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aphx.b) == null) {
                    synchronized (aphx.class) {
                        if (aphx.b == null) {
                            aphx.b = (ahev)new ahcs((ahcz)aphx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphx.a;
            }
            case 4: {
                return new ahcr((ahcz)aphx.a);
            }
            case 3: {
                return new aphx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphx.a, "\u0001\t\u0000\u0001\u0004\u000f\t\u0000\u0000\t\u0004\u1409\u0004\u0005\u1409\u0005\u0007\u1409\r\n\u1409\u0006\u000b\u1409\u0007\f\u1409\b\r\u1409\t\u000e\u1409\n\u000f\u1409\u000b", new Object[] { "c", "d", "e", "l", "f", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
