import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhu extends ahcz implements aheo
{
    public static final alhu a;
    private static volatile ahev k;
    public int b;
    public anxb c;
    public anxb d;
    public anxb e;
    public anxb f;
    public anxb g;
    public anxb h;
    public ahbt i;
    public ahng j;
    private anxb l;
    private anxb m;
    private anxb n;
    private ahjl o;
    private anxb p;
    private anxb q;
    private anxb r;
    private byte s;
    
    static {
        ahcz.registerDefaultInstance(alhu.class, a = new alhu());
    }
    
    private alhu() {
        this.s = 2;
        this.i = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = alhu.k) == null) {
                    synchronized (alhu.class) {
                        if (alhu.k == null) {
                            alhu.k = (ahev)new ahcs((ahcz)alhu.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return alhu.a;
            }
            case 4: {
                return new ahcr((ahcz)alhu.a);
            }
            case 3: {
                return new alhu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhu.a, "\u0001\u000f\u0000\u0001\u0001\u0012\u000f\u0000\u0000\r\u0001\u1409\u0000\u0002\u1409\b\u0003\u100a\u000b\u0004\u1409\u0001\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u1409\u0003\n\u1409\t\u000b\u1409\n\r\u1409\u0007\u000e\u1009\r\u0010\u1409\u0002\u0011\u1409\u000f\u0012\u1409\u0010", new Object[] { "b", "c", "o", "i", "d", "m", "f", "n", "e", "h", "p", "g", "j", "l", "q", "r" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
