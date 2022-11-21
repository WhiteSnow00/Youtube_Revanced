import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aish extends ahcz implements aheo
{
    public static final aish a;
    private static volatile ahev i;
    public int b;
    public aiet c;
    public aiet d;
    public aiet e;
    public ajcy f;
    public anxb g;
    public long h;
    private anxb j;
    private anxb k;
    private aiet l;
    private aisj m;
    private aiet n;
    private aisj o;
    private aiet p;
    private aisj q;
    private aiet r;
    private aisj s;
    private aisj t;
    private ahjl u;
    private byte v;
    
    static {
        ahcz.registerDefaultInstance(aish.class, a = new aish());
    }
    
    private aish() {
        this.v = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte v = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = aish.i) == null) {
                    synchronized (aish.class) {
                        if (aish.i == null) {
                            aish.i = (ahev)new ahcs((ahcz)aish.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aish.a;
            }
            case 4: {
                return new ahcr((ahcz)aish.a);
            }
            case 3: {
                return new aish();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aish.a, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0000\u0011\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\n\u0004\u1409\u0006\u0005\u1409\b\u0006\u1409\f\u0007\u1409\u0001\t\u1409\u0013\n\u1409\u0007\u000b\u1409\t\f\u1409\u000b\r\u1409\r\u000e\u1409\u000e\u000f\u1409\u0005\u0010\u1002\u0011\u0011\u1409\u0004\u0013\u1409\u0003\u0014\u1409\u000f", new Object[] { "b", "c", "e", "p", "l", "n", "r", "d", "u", "m", "o", "q", "s", "t", "f", "h", "k", "j", "g" });
            }
            case 1: {
                if (o == null) {
                    v = 0;
                }
                this.v = v;
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
