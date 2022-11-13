import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidt extends ahbh implements ahcw
{
    public static final aidt a;
    private static volatile ahdd x;
    private aids A;
    private ajut B;
    private ahhu C;
    private aiqj D;
    private aiqj E;
    private anuv F;
    private aiqj G;
    private aiqj H;
    private aidv I;
    private aidw J;
    private aiqj K;
    private aiqj L;
    private aiqj M;
    private aida N;
    private aiqj O;
    private anuv P;
    private byte Q;
    public int b;
    public int c;
    public int d;
    public Object e;
    public String f;
    public ajut g;
    public aido h;
    public aotp i;
    public aiqj j;
    public ahbx k;
    public ajut l;
    public aidq m;
    public boolean n;
    public aidu o;
    public ahbx p;
    public aidx q;
    public ajut r;
    public ahab s;
    public aiqj t;
    public aidr u;
    public anuv v;
    public anuv w;
    private aiqj y;
    private anuv z;
    
    static {
        ahbh.registerDefaultInstance((Class)aidt.class, (ahbh)(a = new aidt()));
    }
    
    private aidt() {
        this.d = 0;
        this.Q = 2;
        this.f = "";
        this.k = emptyProtobufList();
        this.p = emptyProtobufList();
        this.s = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd x;
                if ((x = aidt.x) == null) {
                    synchronized (aidt.class) {
                        if (aidt.x == null) {
                            aidt.x = (ahdd)new ahba((ahbh)aidt.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return aidt.a;
            }
            case 4: {
                return new ahaz((ahbh)aidt.a);
            }
            case 3: {
                return new aidt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidt.a, "\u0001&\u0001\u0002\u0006>&\u0000\u0002!\u0006\u1008\u0002\u0007\u1409\u0004\t\u143c\u0000\r\u041b\u000f\u1409\u000f\u0012\u1409\u0012\u0014\u1009\u0014\u0015\u1409\u0013\u0016\u1409\u0015\u0019\u1409\n\u001a\u1409\u0017\u001b\u100a\u0018\u001c\u1409\u0019\u001d\u1409\u001c\u001e\u1409\u001e \u1409 !\u1409!\"\u1409\"#\u1409#$\u1409$%\u1409\r&\u1007\u0011'\u1409%(\u1409&)\u1409'.\u1009\u0005/\u1409*0\u041b2\u1409\u001a4\u1409\u001b5\u1409\f6\u1409+7\u143c\u00008\u1409,9\u1409-;\u1409\u0003=\u1409\u0016>\u1409\u000e", new Object[] { "e", "d", "b", "c", "f", "y", aotp.class, "k", aiae.class, "m", "o", "q", "A", "r", "i", "C", "s", "D", "G", "H", "I", "J", "K", "L", "M", "l", "n", "t", "N", "O", "h", "u", "p", aidp.class, "E", "F", "j", "v", anuv.class, "w", "P", "g", "B", "z" });
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
