import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhq extends ahcz implements aheo
{
    public static final amhq a;
    private static volatile ahev q;
    public int b;
    public aowb c;
    public akfj d;
    public ajws e;
    public ahdp f;
    public amhp g;
    public amhp h;
    public int i;
    public ahbt j;
    public ahdp k;
    public boolean l;
    public boolean m;
    public aisc n;
    public int o;
    public ahdp p;
    private aisc r;
    private ahjl s;
    private byte t;
    
    static {
        ahcz.registerDefaultInstance(amhq.class, a = new amhq());
    }
    
    private amhq() {
        this.t = 2;
        this.f = ahcz.emptyProtobufList();
        this.j = ahbt.b;
        this.k = ahcz.emptyProtobufList();
        this.p = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte t = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev q;
                if ((q = amhq.q) == null) {
                    synchronized (amhq.class) {
                        if (amhq.q == null) {
                            amhq.q = (ahev)new ahcs((ahcz)amhq.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return amhq.a;
            }
            case 4: {
                return new ahcr((ahcz)amhq.a);
            }
            case 3: {
                return new amhq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhq.a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0003\n\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0005\u0004\u1409\u0006\u0005\u1409\b\u0006\u100c\n\b\u1409\f\t\u100a\r\n\u041b\u000b\u1007\u000e\r\u1409\u0001\u000e\u1409\u0004\u000f\u1007\u000f\u0010\u1409\u0010\u0011\u1004\u0011\u0014\u001b", new Object[] { "b", "c", "f", ajws.class, "g", "h", "r", "i", amgw.j, "s", "j", "k", aisc.class, "l", "d", "e", "m", "n", "o", "p", ainq.class });
            }
            case 1: {
                if (o == null) {
                    t = 0;
                }
                this.t = t;
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
