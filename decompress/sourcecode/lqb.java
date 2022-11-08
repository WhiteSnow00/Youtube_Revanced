import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqb extends agzi implements ahax
{
    private static volatile ahbe H;
    public static final lqb a;
    public int A;
    public boolean B;
    public apqa C;
    public agyc D;
    public agyc E;
    public antn F;
    public String G;
    public int b;
    public int c;
    public String d;
    public agzy e;
    public String f;
    public int g;
    public String h;
    public String i;
    public agyc j;
    public boolean k;
    public boolean l;
    public boolean m;
    public long n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public amvk t;
    public amvl u;
    public agyc v;
    public boolean w;
    public boolean x;
    public int y;
    public ahas z;
    
    static {
        agzi.registerDefaultInstance(lqb.class, a = new lqb());
    }
    
    private lqb() {
        this.z = ahas.a;
        this.d = "";
        this.e = agzi.emptyProtobufList();
        this.f = "";
        this.h = "";
        this.i = "";
        this.j = agyc.b;
        this.o = "";
        final agyc b = agyc.b;
        this.v = b;
        this.D = b;
        this.E = b;
        this.G = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = lqb.H) == null) {
                    synchronized (lqb.class) {
                        if (lqb.H == null) {
                            lqb.H = (ahbe)new agzb((agzi)lqb.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return lqb.a;
            }
            case 4: {
                return new agza((agzi)lqb.a);
            }
            case 3: {
                return new lqb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lqb.a, "\u0001\u001e\u0000\u0002\u0001(\u001e\u0001\u0001\u0000\u0001\u1008\u0000\u0002\u001a\u0003\u1008\u0001\u0004\u1004\u0002\u0005\u1008\u0004\u0006\u100a\u0005\u0007\u1007\u0006\b\u1007\u0007\u000b\u1002\t\f\u1008\n\r\u1007\u000b\u000e\u1007\f\u000f\u1007\r\u0012\u1007\u0010\u0013\u1009\u0011\u0015\u1009\u0013\u0016\u100a\u0014\u001a\u1007\u0016\u001b\u1007\u0017\u001e\u100c\u001a\u001f2 \u100c\u001b!\u1007\u001c\"\u1007\b#\u1009\u001d$\u100a\u001e%\u100a\u001f&\u1009 '\u1008!(\u1008\u0003", new Object[] { "b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", lpz.b(), "z", lqa.a, "A", amsc.l, "B", "m", "C", "D", "E", "F", "G", "h" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
