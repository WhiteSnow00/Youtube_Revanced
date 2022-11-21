import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apen extends ahcz implements aheo
{
    public static final apen a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aiet f;
    private aisc g;
    private ajws h;
    private ajws i;
    private ajws j;
    private ajws k;
    private ajws l;
    private ajws m;
    private ajws n;
    private ajws o;
    private ajws p;
    private ajws q;
    private ajws r;
    private ahjl s;
    private ajws t;
    private aiet u;
    private aiet v;
    private byte w;
    
    static {
        ahcz.registerDefaultInstance(apen.class, a = new apen());
    }
    
    private apen() {
        this.w = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte w = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apen.b) == null) {
                    synchronized (apen.class) {
                        if (apen.b == null) {
                            apen.b = (ahev)new ahcs((ahcz)apen.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apen.a;
            }
            case 4: {
                return new ahcr((ahcz)apen.a);
            }
            case 3: {
                return new apen();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apen.a, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0000\u0013\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\u0012\u000b\u1409\u0013\f\u1409\u000f\u000e\u1409\u0011\u000f\u1409\t\u0010\u1409\u000b\u0011\u1409\n\u0012\u1409\f\u0013\u1409\r\u0014\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "u", "v", "s", "t", "m", "o", "n", "p", "q", "r" });
            }
            case 1: {
                if (o == null) {
                    w = 0;
                }
                this.w = w;
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
