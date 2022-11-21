import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnv extends ahcz implements aheo
{
    public static final amnv a;
    private static volatile ahev i;
    public int b;
    public ajws c;
    public ajws d;
    public ajws e;
    public ajws f;
    public anxb g;
    public aisc h;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(amnv.class, a = new amnv());
    }
    
    private amnv() {
        this.k = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = amnv.i) == null) {
                    synchronized (amnv.class) {
                        if (amnv.i == null) {
                            amnv.i = (ahev)new ahcs((ahcz)amnv.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amnv.a;
            }
            case 4: {
                return new ahcr((ahcz)amnv.a);
            }
            case 3: {
                return new amnv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnv.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\b\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "j", "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
