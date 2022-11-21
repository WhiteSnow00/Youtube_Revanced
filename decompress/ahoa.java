import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoa extends ahcz implements aheo
{
    public static final ahoa a;
    private static volatile ahev j;
    public int b;
    public ajws c;
    public ajws d;
    public ajws e;
    public aisc f;
    public aowb g;
    public ahob h;
    public aisc i;
    private ajws k;
    private ahjl l;
    private aisc m;
    private aisc n;
    private anxb o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(ahoa.class, a = new ahoa());
    }
    
    private ahoa() {
        this.p = 2;
        final ahbt b = ahbt.b;
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
                final ahev j;
                if ((j = ahoa.j) == null) {
                    synchronized (ahoa.class) {
                        if (ahoa.j == null) {
                            ahoa.j = (ahev)new ahcs((ahcz)ahoa.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahoa.a;
            }
            case 4: {
                return new ahcr((ahcz)ahoa.a);
            }
            case 3: {
                return new ahoa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahoa.a, "\u0001\f\u0000\u0001\u0001\u0013\f\u0000\u0000\f\u0001\u1409\u0000\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u1409\u0006\u0005\u1409\r\t\u1409\u000f\n\u1409\u0010\u000b\u1409\u0011\f\u1409\u0002\u0010\u1409\t\u0011\u1409\n\u0013\u1409\u0012", new Object[] { "b", "c", "e", "f", "g", "m", "h", "i", "n", "d", "k", "l", "o" });
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
