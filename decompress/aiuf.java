import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuf extends ahcz implements aheo
{
    public static final aiuf a;
    private static volatile ahev n;
    public int b;
    public aowb c;
    public ajws d;
    public ajws e;
    public aiet f;
    public aiet g;
    public ajws h;
    public aiet i;
    public anxb j;
    public String k;
    public anxb l;
    public boolean m;
    private aiet o;
    private aiue p;
    private aiud q;
    private ajws r;
    private ajws s;
    private aisc t;
    private aisc u;
    private byte v;
    
    static {
        ahcz.registerDefaultInstance(aiuf.class, a = new aiuf());
    }
    
    private aiuf() {
        this.v = 2;
        this.k = "";
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
                final ahev n;
                if ((n = aiuf.n) == null) {
                    synchronized (aiuf.class) {
                        if (aiuf.n == null) {
                            aiuf.n = (ahev)new ahcs((ahcz)aiuf.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return aiuf.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuf.a);
            }
            case 3: {
                return new aiuf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuf.a, "\u0001\u0012\u0000\u0001\u0002\u0017\u0012\u0000\u0000\u0010\u0002\u1409\u0005\u0003\u1409\u0006\u0004\u1409\u0001\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0007\b\u1409\n\t\u1409\b\n\u1409\t\u000b\u1409\u000b\r\u1409\f\u000e\u1409\r\u000f\u1409\u000e\u0011\u1409\u000f\u0013\u1008\u0010\u0014\u1409\u0011\u0015\u1007\u0012\u0017\u1409\u0014", new Object[] { "b", "f", "o", "c", "d", "e", "g", "r", "p", "q", "s", "h", "t", "i", "j", "k", "l", "m", "u" });
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
