import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansn extends ahcz implements aheo
{
    public static final ansn a;
    private static volatile ahev j;
    public int b;
    public anrs c;
    public ahdp d;
    public anxb e;
    public boolean f;
    public ahof g;
    public ahbt h;
    public String i;
    private ahjl k;
    private anxb l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(ansn.class, a = new ansn());
    }
    
    private ansn() {
        this.m = 2;
        this.d = ahcz.emptyProtobufList();
        this.h = ahbt.b;
        this.i = "";
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
                final ahev j;
                if ((j = ansn.j) == null) {
                    synchronized (ansn.class) {
                        if (ansn.j == null) {
                            ansn.j = (ahev)new ahcs((ahcz)ansn.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ansn.a;
            }
            case 4: {
                return new ahcr((ahcz)ansn.a);
            }
            case 3: {
                return new ansn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansn.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0004\u0005\u100a\u0005\u0006\u1007\u0002\u0007\u1409\u0003\b\u1409\u0006\t\u1008\u0007", new Object[] { "b", "c", "d", anro.class, "e", "k", "h", "f", "g", "l", "i" });
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
