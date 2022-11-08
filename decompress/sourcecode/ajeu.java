import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajeu extends agzi implements ahax
{
    public static final ajeu a;
    public static final agzg b;
    private static volatile ahbe w;
    public int c;
    public int d;
    public Object e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public String k;
    public int l;
    public boolean m;
    public String n;
    public String o;
    public int p;
    public String q;
    public int r;
    public String s;
    public String t;
    public agzy u;
    public aorm v;
    private byte x;
    
    static {
        final ajeu a2 = new ajeu();
        agzi.registerDefaultInstance(ajeu.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 284, ahcm.k, ajeu.class);
    }
    
    private ajeu() {
        this.d = 0;
        this.x = 2;
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.k = "";
        this.n = "";
        this.o = "";
        this.q = "";
        this.s = "";
        this.t = "";
        this.u = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe w;
                if ((w = ajeu.w) == null) {
                    synchronized (ajeu.class) {
                        if (ajeu.w == null) {
                            ajeu.w = (ahbe)new agzb((agzi)ajeu.a);
                        }
                    }
                }
                return w;
            }
            case 5: {
                return ajeu.a;
            }
            case 4: {
                return new agza((float[][][])null, (char[][][])null);
            }
            case 3: {
                return new ajeu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajeu.a, "\u0001\u0013\u0001\u0001\u0001\u0014\u0013\u0000\u0001\u0003\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1004\u0006\b\u143c\u0000\t\u1004\u000e\n\u1008\u000f\u000b\u1008\u0010\f\u001b\r\u1409\u0011\u000e\u1007\u0007\u000f\u1008\b\u0010\u1008\t\u0011\u1004\n\u0013\u143c\u0000\u0014\u1008\r", new Object[] { "e", "d", "c", "f", "g", "h", "i", "j", "k", "l", aorm.class, "r", "s", "t", "u", ahyd.class, "v", "m", "n", "o", "p", ajet.class, "q" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.x = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
