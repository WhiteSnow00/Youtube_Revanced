import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adoj extends ahcz implements aheo
{
    public static final adoj a;
    private static volatile ahev aA;
    public boolean A;
    public adod B;
    public adog C;
    public boolean D;
    public adog E;
    public String F;
    public long G;
    public long H;
    public long I;
    public boolean J;
    public String K;
    public String L;
    public long M;
    public adog N;
    public adog O;
    public adog P;
    public adog Q;
    public adog R;
    public adog S;
    public ahdp T;
    public ahdp U;
    public adoe V;
    public String W;
    public ahdp X;
    public boolean Y;
    public boolean Z;
    private byte aB;
    public appc aa;
    public String ab;
    public String ac;
    public int ad;
    public adog ae;
    public apkx af;
    public adog ag;
    public adog ah;
    public boolean ai;
    public boolean aj;
    public int ak;
    public int al;
    public adog am;
    public adog an;
    public adog ao;
    public String ap;
    public String aq;
    public adog ar;
    public adog as;
    public adof at;
    public boolean au;
    public boolean av;
    public apre aw;
    public String ax;
    public ahdp ay;
    public float az;
    public int b;
    public int c;
    public int d;
    public String e;
    public String f;
    public String g;
    public long h;
    public adon i;
    public akwi j;
    public String k;
    public int l;
    public int m;
    public ahbt n;
    public ahbt o;
    public String p;
    public boolean q;
    public long r;
    public boolean s;
    public adok t;
    public adoc u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    static {
        ahcz.registerDefaultInstance(adoj.class, a = new adoj());
    }
    
    private adoj() {
        this.aB = 2;
        this.e = "";
        this.f = "";
        this.g = "";
        this.k = "";
        this.n = ahbt.b;
        this.o = ahbt.b;
        this.p = "";
        this.F = "";
        this.K = "";
        this.L = "";
        this.T = ahcz.emptyProtobufList();
        this.U = ahcz.emptyProtobufList();
        this.W = "";
        this.X = ahcz.emptyProtobufList();
        this.ab = "";
        this.ac = "";
        this.ap = "";
        this.aq = "";
        this.ax = "";
        this.ay = ahcz.emptyProtobufList();
    }
    
    public static void a(final adoj adoj) {
        adoj.c |= 0x20000;
        adoj.Y = true;
    }
    
    public static void b(final adoj adoj) {
        adoj.b |= 0x8000000;
        adoj.z = true;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte ab = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev aa;
                if ((aa = adoj.aA) == null) {
                    synchronized (adoj.class) {
                        if (adoj.aA == null) {
                            adoj.aA = (ahev)new ahcs((ahcz)adoj.a);
                        }
                    }
                }
                return aa;
            }
            case 5: {
                return adoj.a;
            }
            case 4: {
                return new ahcr((ahcz)adoj.a);
            }
            case 3: {
                return new adoj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adoj.a, "\u0001J\u0000\u0003\u0001\u03ebJ\u0000\u0004\u0002\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0004\u0004\u1008\u0006\u0005\u1008&\u0006\u1008'\u0007\u1009)\b\u1009,\t\u10085\n\u100c6\u000b\u10097\f\u10099\r\u1009:\u000e\u1007;\u000f\u1009?\u0010\u1003\u0003\u0011\u10084\u0012\u1008B\u0013\u1009D\u0014\u1009\u001d\u0015\u1009\u001e\u001c\u1009A\u001e\u1009-\u001f\u100c\u0007 \u1009.!\u001a\"\u001a$\u1009/%\u1007<&\u1009G'\u10080)\u100a\u000b*\u001a+\u10071,\u1009*-\u1003(.\u10093/\u1007I0\u100721\u1009 2\u1008!3\u1007\u001f4\u1009+5\u100c=6\u100c>7\u1009\u00118\u100c\u00149\u1409\u0005:\u14098;\u1009K<\u1007\u0018=\u1007\u0019>\u1008\u0002?\u100a\f@\u1009\u0012A\u1009@B\u1007%C\u100c\bD\u1007\u001aE\u1007JF\u1007\u001bG\u1008CH\u1009EI\u1008\rL\u1007\u001cM\u1007\u000eN\u1002\u000fO\u1007\u0010P\u1008LQ\u001bR\u1001M\u03e9\u1003\"\u03ea\u1003$\u03eb\u1003#", new Object[] { "b", "c", "d", "e", "f", "i", "k", "K", "L", "N", "Q", "ac", "ad", adoi.b(), "ae", "ag", "ah", "ai", "am", "h", "ab", "ap", "ar", "B", "C", "ao", "R", "l", adoh.b(), "S", "T", "U", "V", "aj", "at", "W", "n", "X", "Y", "O", "M", "aa", "au", "Z", "E", "F", "D", "P", "ak", apki.a(), "al", apkh.a(), "t", "v", pfw.o, "j", "af", "aw", "w", "x", "g", "o", "u", "an", "J", "m", apke.a(), "y", "av", "z", "aq", "as", "p", "A", "q", "r", "s", "ax", "ay", arek.class, "az", "G", "I", "H" });
            }
            case 1: {
                if (o == null) {
                    ab = 0;
                }
                this.aB = ab;
                return null;
            }
            case 0: {
                return this.aB;
            }
        }
    }
}
