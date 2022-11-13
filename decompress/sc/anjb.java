import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anjb extends ahbc implements ahbd
{
    public static final anjb a;
    public static final ahbf b;
    private static volatile ahdd z;
    private aiqj A;
    private anja B;
    private ajut C;
    private ajut D;
    private ajut E;
    private ahhu F;
    private ahxa G;
    private ajut H;
    private anix I;
    private aidd J;
    private anjd K;
    private aiqj L;
    private ajut M;
    private byte N;
    public int c;
    public int d;
    public int e;
    public Object f;
    public String g;
    public ajut h;
    public ahbx i;
    public int j;
    public int k;
    public String m;
    public int n;
    public ajut o;
    public ajut p;
    public boolean q;
    public ahab r;
    public alob s;
    public ahbx t;
    public int u;
    public ahbx v;
    public aniz w;
    public amgv x;
    public akdi y;
    
    static {
        final anjb a2 = new anjb();
        ahbh.registerDefaultInstance((Class)anjb.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)anuu.a, (Object)a2, (MessageLite)a2, (ahbm)null, 50631000, ahek.k, (Class)anjb.class);
    }
    
    private anjb() {
        this.e = 0;
        this.N = 2;
        this.g = "";
        this.i = emptyProtobufList();
        this.m = "";
        this.r = ahab.b;
        this.t = emptyProtobufList();
        emptyProtobufList();
        this.v = emptyProtobufList();
    }
    
    public final void a() {
        final ahbx i = this.i;
        if (!i.c()) {
            this.i = ahbh.mutableCopy(i);
        }
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd z;
                if ((z = anjb.z) == null) {
                    synchronized (anjb.class) {
                        if (anjb.z == null) {
                            anjb.z = (ahdd)new ahba((ahbh)anjb.a);
                        }
                    }
                }
                return z;
            }
            case 5: {
                return anjb.a;
            }
            case 4: {
                return new ahbb((ahbc)anjb.a);
            }
            case 3: {
                return new anjb();
            }
            case 2: {
                return newMessageInfo((MessageLite)anjb.a, "\u0001\u001f\u0001\u0002\u0001)\u001f\u0000\u0003\u0018\u0001\u1008\u0000\u0002\u041b\u0003\u1004\u0004\u0005\u1008\u0006\u0006\u1004\u0007\u0007\u1409\n\b\u1007\r\n\u1409\u0012\u000e\u1409\u0014\u000f\u041b\u0010\u1409\u000b\u0011\u1409\f\u0012\u1409\b\u0014\u100a\u0013\u0016\u1409\u0001\u0018\u1409\u0002\u0019\u1409\u0016\u001a\u1409\u0017\u001b\u1004\u0005\u001c\u1409\u0018\u001d\u1409\u0019\u001e\u1409\u001a\u001f\u1409\u001b \u1409\u001c\"\u143c\u0000#\u041b$\u1409\t%\u1409\u001f'\u1409!(\u1409\")\u1409\u0003", new Object[] { "f", "e", "c", "d", "g", "i", anja.class, "j", "m", "n", "D", "q", "F", "s", "t", anjh.class, "E", "p", "o", "r", "h", "A", "w", "x", "k", "G", "H", "I", "J", "K", anuv.class, "v", aiae.class, "C", "L", "y", "M", "B" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.N = n;
                return null;
            }
            case 0: {
                return this.N;
            }
        }
    }
}
