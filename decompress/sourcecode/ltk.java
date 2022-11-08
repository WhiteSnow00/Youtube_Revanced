// 
// Decompiled by Procyon v0.6.0
// 

public class ltk
{
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int O;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final int X;
    public static final int Y;
    public static final int Z;
    public static final int aA;
    public static final int aB;
    public static final int aC;
    public static final int aD;
    public static final int aE;
    public static final int aF;
    public static final int aG;
    public static final int aH;
    public static final int aI;
    public static final int aJ;
    public static final int aK;
    public static final int aL;
    public static final int aM;
    public static final int aN;
    public static final int aO;
    public static final int aP;
    public static final int aa;
    public static final int ab;
    public static final int ac;
    public static final int ad;
    public static final int ae;
    public static final int af;
    public static final int ag;
    public static final int ah;
    public static final int ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static final int am;
    public static final int an;
    public static final int ao;
    public static final int ap;
    public static final int aq;
    public static final int ar;
    public static final int as;
    public static final int at;
    public static final int au;
    public static final int av;
    public static final int aw;
    public static final int ax;
    public static final int ay;
    public static final int az;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;
    public final int aQ;
    
    static {
        d = lwj.c("ftyp");
        e = lwj.c("avc1");
        f = lwj.c("avc3");
        g = lwj.c("hvc1");
        h = lwj.c("hev1");
        i = lwj.c("s263");
        j = lwj.c("d263");
        k = lwj.c("mdat");
        l = lwj.c("mp4a");
        m = lwj.c(".mp3");
        n = lwj.c("wave");
        o = lwj.c("lpcm");
        p = lwj.c("sowt");
        q = lwj.c("ac-3");
        r = lwj.c("dac3");
        s = lwj.c("ec-3");
        t = lwj.c("dec3");
        u = lwj.c("dtsc");
        v = lwj.c("dtsh");
        w = lwj.c("dtsl");
        x = lwj.c("dtse");
        y = lwj.c("ddts");
        z = lwj.c("tfdt");
        A = lwj.c("tfhd");
        B = lwj.c("trex");
        C = lwj.c("trun");
        D = lwj.c("sidx");
        E = lwj.c("moov");
        F = lwj.c("mvhd");
        G = lwj.c("trak");
        H = lwj.c("mdia");
        I = lwj.c("minf");
        J = lwj.c("stbl");
        K = lwj.c("avcC");
        L = lwj.c("hvcC");
        M = lwj.c("esds");
        N = lwj.c("moof");
        O = lwj.c("traf");
        P = lwj.c("mvex");
        Q = lwj.c("mehd");
        R = lwj.c("tkhd");
        S = lwj.c("edts");
        T = lwj.c("elst");
        U = lwj.c("mdhd");
        V = lwj.c("hdlr");
        W = lwj.c("stsd");
        X = lwj.c("pssh");
        Y = lwj.c("sinf");
        Z = lwj.c("schm");
        aa = lwj.c("schi");
        ab = lwj.c("tenc");
        ac = lwj.c("encv");
        ad = lwj.c("enca");
        ae = lwj.c("frma");
        af = lwj.c("saiz");
        ag = lwj.c("saio");
        ah = lwj.c("sbgp");
        ai = lwj.c("sgpd");
        aj = lwj.c("uuid");
        ak = lwj.c("senc");
        al = lwj.c("pasp");
        am = lwj.c("TTML");
        lwj.c("vmhd");
        an = lwj.c("mp4v");
        ao = lwj.c("stts");
        ap = lwj.c("stss");
        aq = lwj.c("ctts");
        ar = lwj.c("stsc");
        as = lwj.c("stsz");
        at = lwj.c("stz2");
        au = lwj.c("stco");
        av = lwj.c("co64");
        aw = lwj.c("tx3g");
        ax = lwj.c("wvtt");
        ay = lwj.c("stpp");
        az = lwj.c("samr");
        aA = lwj.c("sawb");
        aB = lwj.c("udta");
        aC = lwj.c("meta");
        aD = lwj.c("ilst");
        aE = lwj.c("mean");
        aF = lwj.c("name");
        aG = lwj.c("data");
        aH = lwj.c("emsg");
        aI = lwj.c("st3d");
        aJ = lwj.c("sv3d");
        aK = lwj.c("proj");
        aL = lwj.c("vp08");
        aM = lwj.c("vp09");
        aN = lwj.c("vpcC");
        aO = lwj.c("camm");
        aP = lwj.c("----");
    }
    
    public ltk(final int aq) {
        this.aQ = aq;
    }
    
    public static int e(final int n) {
        return n & 0xFFFFFF;
    }
    
    public static int f(final int n) {
        return n >> 24 & 0xFF;
    }
    
    public static String g(final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append((char)(n >> 24));
        sb.append((char)(n >> 16 & 0xFF));
        sb.append((char)(n >> 8 & 0xFF));
        sb.append((char)(n & 0xFF));
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return g(this.aQ);
    }
}
