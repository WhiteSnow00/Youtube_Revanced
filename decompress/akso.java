import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akso extends ahcz implements aheo
{
    public static final akso a;
    private static volatile ahev p;
    public int b;
    public aknj c;
    public anvl d;
    public akzi e;
    public aisc f;
    public aisc g;
    public int h;
    public ahbt i;
    public int j;
    public aisc k;
    public String l;
    public anxb m;
    public ahdp n;
    public anxb o;
    private ahjl q;
    private ajxn r;
    private anxb s;
    private byte t;
    
    static {
        ahcz.registerDefaultInstance(akso.class, a = new akso());
    }
    
    private akso() {
        this.t = 2;
        this.i = ahbt.b;
        this.l = "";
        this.n = ahcz.emptyProtobufList();
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
                final ahev p3;
                if ((p3 = akso.p) == null) {
                    synchronized (akso.class) {
                        if (akso.p == null) {
                            akso.p = (ahev)new ahcs((ahcz)akso.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return akso.a;
            }
            case 4: {
                return new ahcr((ahcz)akso.a);
            }
            case 3: {
                return new akso();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akso.a, "\u0001\u0010\u0000\u0001\u0001\u0309\u0010\u0000\u0001\f\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u100c\u0005\t\u1409\u0007\n\u100a\b\f\u100c\n\r\u1409\f\u000e\u1008\r\u000f\u1409\u000e\u0010\u1409\u000f\u0011\u041b\u0012\u1409\u0010\u0309\u1409\u000b", new Object[] { "b", "c", "d", "e", "f", "g", "h", ansp.r, "q", "i", "j", anuo.a(), "k", "l", "s", "m", "n", ajrl.class, "o", "r" });
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
