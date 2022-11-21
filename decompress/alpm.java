import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpm extends ahcz implements aheo
{
    public static final alpm a;
    private static volatile ahev o;
    public int b;
    public ajws c;
    public ajws d;
    public String e;
    public int f;
    public ajws g;
    public ajws h;
    public ajws i;
    public anxb j;
    public anxb k;
    public ajws l;
    public ajws m;
    public aiet n;
    private ajws p;
    private ajws q;
    private aiet r;
    private byte s;
    
    static {
        ahcz.registerDefaultInstance(alpm.class, a = new alpm());
    }
    
    private alpm() {
        this.s = 2;
        this.e = "";
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
                final ahev o3;
                if ((o3 = alpm.o) == null) {
                    synchronized (alpm.class) {
                        if (alpm.o == null) {
                            alpm.o = (ahev)new ahcs((ahcz)alpm.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return alpm.a;
            }
            case 4: {
                return new ahcr((ahcz)alpm.a);
            }
            case 3: {
                return new alpm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpm.a, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0000\r\u0001\u1409\u0000\u0002\u1409\u0005\u0003\u1409\u0006\u0005\u1409\u0007\u0007\u1409\b\t\u1409\t\n\u1409\n\f\u1409\u0001\r\u1409\u000b\u000e\u1409\f\u000f\u1409\u000e\u0010\u1409\u0002\u0011\u1409\u000f\u0012\u1004\u0004\u0014\u1008\u0003", new Object[] { "b", "c", "g", "h", "i", "j", "k", "q", "d", "l", "m", "n", "p", "r", "f", "e" });
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
