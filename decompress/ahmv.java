import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmv extends ahcz implements aheo
{
    public static final ahmv a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private ajws j;
    private aisc k;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(ahmv.class, a = new ahmv());
    }
    
    private ahmv() {
        this.m = 2;
        emptyProtobufList();
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
                if ((b = ahmv.b) == null) {
                    synchronized (ahmv.class) {
                        if (ahmv.b == null) {
                            ahmv.b = (ahev)new ahcs((ahcz)ahmv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahmv.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmv.a);
            }
            case 3: {
                return new ahmv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmv.a, "\u0001\t\u0000\u0001\u0005\u000f\t\u0000\u0000\t\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\n\u1409\b\u000b\u1409\t\f\u1409\n\u000e\u1409\u000b\u000f\u1409\f", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
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
