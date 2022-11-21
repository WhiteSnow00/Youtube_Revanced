import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifm extends ahcz implements aheo
{
    public static final aifm a;
    private static volatile ahev x;
    private aifl A;
    private ajws B;
    private ahjl C;
    private aisc D;
    private aisc E;
    private anxb F;
    private aisc G;
    private aisc H;
    private aifo I;
    private aifp J;
    private aisc K;
    private aisc L;
    private aisc M;
    private aiet N;
    private aisc O;
    private anxb P;
    private byte Q;
    public int b;
    public int c;
    public int d;
    public Object e;
    public String f;
    public ajws g;
    public aifh h;
    public aowb i;
    public aisc j;
    public ahdp k;
    public ajws l;
    public aifj m;
    public boolean n;
    public aifn o;
    public ahdp p;
    public aifq q;
    public ajws r;
    public ahbt s;
    public aisc t;
    public aifk u;
    public anxb v;
    public anxb w;
    private aisc y;
    private anxb z;
    
    static {
        ahcz.registerDefaultInstance(aifm.class, a = new aifm());
    }
    
    private aifm() {
        this.d = 0;
        this.Q = 2;
        this.f = "";
        this.k = ahcz.emptyProtobufList();
        this.p = ahcz.emptyProtobufList();
        this.s = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev x;
                if ((x = aifm.x) == null) {
                    synchronized (aifm.class) {
                        if (aifm.x == null) {
                            aifm.x = (ahev)new ahcs((ahcz)aifm.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return aifm.a;
            }
            case 4: {
                return new ahcr((ahcz)aifm.a);
            }
            case 3: {
                return new aifm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifm.a, "\u0001&\u0001\u0002\u0006>&\u0000\u0002!\u0006\u1008\u0002\u0007\u1409\u0004\t\u143c\u0000\r\u041b\u000f\u1409\u000f\u0012\u1409\u0012\u0014\u1009\u0014\u0015\u1409\u0013\u0016\u1409\u0015\u0019\u1409\n\u001a\u1409\u0017\u001b\u100a\u0018\u001c\u1409\u0019\u001d\u1409\u001c\u001e\u1409\u001e \u1409 !\u1409!\"\u1409\"#\u1409#$\u1409$%\u1409\r&\u1007\u0011'\u1409%(\u1409&)\u1409'.\u1009\u0005/\u1409*0\u041b2\u1409\u001a4\u1409\u001b5\u1409\f6\u1409+7\u143c\u00008\u1409,9\u1409-;\u1409\u0003=\u1409\u0016>\u1409\u000e", new Object[] { "e", "d", "b", "c", "f", "y", aowb.class, "k", aibx.class, "m", "o", "q", "A", "r", "i", "C", "s", "D", "G", "H", "I", "J", "K", "L", "M", "l", "n", "t", "N", "O", "h", "u", "p", aifi.class, "E", "F", "j", "v", anxb.class, "w", "P", "g", "B", "z" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.Q = q;
                return null;
            }
            case 0: {
                return this.Q;
            }
        }
    }
}
