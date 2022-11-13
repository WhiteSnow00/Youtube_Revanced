import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apog extends ahbc implements ahbd
{
    private static volatile ahdd F;
    public static final apog a;
    public apod A;
    public apod B;
    public apod C;
    public apkr D;
    public ahab E;
    private ajut G;
    private ajut H;
    private ajut I;
    private anuv J;
    private ajut K;
    private ajut L;
    private aiqj M;
    private ahre N;
    private alkp O;
    private aiqj P;
    private anuv Q;
    private apoe R;
    private aiqj S;
    private ahhu T;
    private byte U;
    public int b;
    public int c;
    public int d;
    public Object e;
    public String f;
    public aotp g;
    public ajut h;
    public ajut i;
    public ajut j;
    public ajut k;
    public ajut m;
    public ajut n;
    public aiqj o;
    public ahbx p;
    public aiao q;
    public aiao r;
    public aiao s;
    public apfs t;
    public apof u;
    public amgv v;
    public boolean w;
    public ahbx x;
    public apoh y;
    public apod z;
    
    static {
        ahbh.registerDefaultInstance((Class)apog.class, (ahbh)(a = new apog()));
    }
    
    private apog() {
        this.d = 0;
        this.U = 2;
        this.f = "";
        emptyProtobufList();
        this.p = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.x = emptyProtobufList();
        this.E = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte u = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = apog.F) == null) {
                    synchronized (apog.class) {
                        if (apog.F == null) {
                            apog.F = (ahdd)new ahba((ahbh)apog.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apog.a;
            }
            case 4: {
                return new ahbb((ahbc)apog.a);
            }
            case 3: {
                return new apog();
            }
            case 2: {
                return newMessageInfo((MessageLite)apog.a, "\u0001)\u0001\u0002\u00018)\u0000\u0002$\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0005\u0005\u1409\t\u0006\u1409\u000e\u0007\u1409\u000f\b\u1409\u0010\t\u1409\u0012\n\u041b\r\u1409\u0017\u000f\u1409\f\u0010\u1409+\u0011\u1409\u0019\u0012\u1409\r\u0013\u143c\u0000\u0014\u1409\u001a\u0015\u100a-\u0016\u1409\u0018\u001a\u1409\u0011\u001b\u1007\u001e\u001c\u1409\u001c\u001d\u1409! \u1409\u0015!\u143c\u0000\"\u041b#\u1409\u0014$\u1409\u0016&\u1009\"'\u1409#(\u1409$)\u1409%*\u1409&-\u1009(.\u1409\u001b2\u1409)3\u1409\u001f4\u1409\u00075\u1409\u00046\u1409\u00138\u1409\u0006", new Object[] { "e", "d", "b", "c", "f", "g", "h", "H", "K", "j", "k", "m", "o", "p", aiae.class, "N", "L", "T", "t", "i", aotp.class, "u", "E", "O", "n", "w", "v", "R", "r", aijz.class, "x", aotd.class, "q", "s", "y", "z", "A", "B", "C", "D", "P", "S", "Q", "J", "G", "M", "I" });
            }
            case 1: {
                if (o == null) {
                    u = 0;
                }
                this.U = u;
                return null;
            }
            case 0: {
                return this.U;
            }
        }
    }
}
