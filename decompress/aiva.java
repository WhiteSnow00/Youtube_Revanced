import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiva extends ahcz implements aheo
{
    public static final aiva a;
    private static volatile ahev o;
    public int b;
    public aivb c;
    public aiuv d;
    public ahbt e;
    public ajws f;
    public ajws g;
    public boolean h;
    public ahdp i;
    public ajws j;
    public anxb k;
    public boolean l;
    public ahdp m;
    public anxb n;
    private ajws p;
    private anxb q;
    private ahjl r;
    private ajws s;
    private ajws t;
    private anxb u;
    private anxb v;
    private anxb w;
    private anxb x;
    private anxb y;
    private byte z;
    
    static {
        ahcz.registerDefaultInstance(aiva.class, a = new aiva());
    }
    
    private aiva() {
        this.z = 2;
        emptyProtobufList();
        this.e = ahbt.b;
        this.i = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.m = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte z = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = aiva.o) == null) {
                    synchronized (aiva.class) {
                        if (aiva.o == null) {
                            aiva.o = (ahev)new ahcs((ahcz)aiva.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return aiva.a;
            }
            case 4: {
                return new ahcr((ahcz)aiva.a);
            }
            case 3: {
                return new aiva();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiva.a, "\u0001\u0016\u0000\u0001\u0001\"\u0016\u0000\u0002\u0013\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0007\u100a\u0004\b\u1409\u0005\n\u1409\u0007\u000b\u1409\b\u000e\u1007\f\u000f\u041b\u0010\u1409\u000f\u0011\u1409\u000b\u0012\u1409\u0010\u0014\u1409\u0003\u0015\u1409\t\u0016\u1409\n\u0017\u1409\u0012\u0018\u1409\u0013\u001d\u1409\u0015\u001e\u1409\u0016\u001f\u1007\u0017!\u041b\"\u1409\u0019", new Object[] { "b", "p", "c", "d", "e", "r", "f", "g", "h", "i", aisc.class, "v", "u", "w", "q", "s", "t", "j", "x", "k", "y", "l", "m", aivp.class, "n" });
            }
            case 1: {
                if (o == null) {
                    z = 0;
                }
                this.z = z;
                return null;
            }
            case 0: {
                return this.z;
            }
        }
    }
}
