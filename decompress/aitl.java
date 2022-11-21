import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitl extends ahcz implements aheo
{
    public static final aitl a;
    private static volatile ahev m;
    public int b;
    public ajws c;
    public ajws d;
    public aowb e;
    public aiet f;
    public aiet g;
    public anxb h;
    public String i;
    public String j;
    public anxb k;
    public boolean l;
    private aiet n;
    private ajws o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(aitl.class, a = new aitl());
    }
    
    private aitl() {
        this.p = 2;
        this.i = "";
        this.j = "";
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
                final ahev m;
                if ((m = aitl.m) == null) {
                    synchronized (aitl.class) {
                        if (aitl.m == null) {
                            aitl.m = (ahev)new ahcs((ahcz)aitl.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aitl.a;
            }
            case 4: {
                return new ahcr((ahcz)aitl.a);
            }
            case 3: {
                return new aitl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aitl.a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0001\u0006\u1409\u0005\u0007\u1409\u0006\t\u1409\u0007\u000b\u1008\b\f\u1409\n\r\u1007\u000b\u000e\u1008\t", new Object[] { "b", "c", "e", "f", "n", "d", "o", "g", "h", "i", "k", "l", "j" });
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
