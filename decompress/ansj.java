import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansj extends ahcz implements aheo
{
    public static final ansj a;
    private static volatile ahev n;
    public int b;
    public ajws c;
    public ajws d;
    public ajws e;
    public aisc f;
    public ahdp g;
    public anxb h;
    public long i;
    public aidv j;
    public ahdp k;
    public anrh l;
    public anxb m;
    private anxb o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(ansj.class, a = new ansj());
    }
    
    private ansj() {
        this.p = 2;
        this.g = ahcz.emptyProtobufList();
        this.k = ahcz.emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev n;
                if ((n = ansj.n) == null) {
                    synchronized (ansj.class) {
                        if (ansj.n == null) {
                            ansj.n = (ahev)new ahcs((ahcz)ansj.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ansj.a;
            }
            case 4: {
                return new ahcr((ahcz)ansj.a);
            }
            case 3: {
                return new ansj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansj.a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0002\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u041b\u0006\u1409\u0004\u0007\u1002\u0005\b\u1009\u0006\t\u041b\n\u1009\u0007\u000b\u1409\b\u000e\u1409\n", new Object[] { "b", "c", "d", "e", "f", "g", aisc.class, "h", "i", "j", "k", aisc.class, "l", "m", "o" });
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
