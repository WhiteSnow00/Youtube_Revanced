import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyo extends agzd implements agze
{
    public static final alyo a;
    public static final agzg b;
    private static volatile ahbe u;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public long h;
    public int i;
    public aorm j;
    public ajsq k;
    public long m;
    public long n;
    public long o;
    public apwz p;
    public alyq q;
    public String r;
    public agzy s;
    public alyd t;
    private byte v;
    
    static {
        final alyo a2 = new alyo();
        agzi.registerDefaultInstance((Class)alyo.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, (Object)a2, (MessageLite)a2, (agzn)null, 261, ahcm.k, (Class)alyo.class);
    }
    
    private alyo() {
        this.v = 2;
        this.d = "";
        final agyc b = agyc.b;
        this.e = "";
        this.f = "";
        this.g = "";
        this.r = "";
        this.s = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe u;
                if ((u = alyo.u) == null) {
                    synchronized (alyo.class) {
                        if (alyo.u == null) {
                            alyo.u = (ahbe)new agzb((agzi)alyo.a);
                        }
                    }
                }
                return u;
            }
            case 5: {
                return alyo.a;
            }
            case 4: {
                return new agzc(alyo.a);
            }
            case 3: {
                return new alyo();
            }
            case 2: {
                return newMessageInfo((MessageLite)alyo.a, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0001\u0003\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1003\u0005\u0007\u1004\u0006\b\u1409\u0007\t\u1409\b\n\u1003\t\u000b\u1003\n\f\u1003\u000b\r\u1009\f\u000e\u1409\r\u000f\u1008\u000e\u0010\u001b\u0011\u1009\u000f", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", ajdq.class, "t" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.v = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
