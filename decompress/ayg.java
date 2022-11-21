import androidx.media3.common.DrmInitData;
import java.util.List;
import androidx.media3.common.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayg
{
    public int A;
    public int B;
    public int C;
    public int D;
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h;
    public Metadata i;
    public String j;
    public String k;
    public int l;
    public List m;
    public DrmInitData n;
    public long o;
    public int p;
    public int q;
    public float r;
    public int s;
    public float t;
    public byte[] u;
    public int v;
    public ayb w;
    public int x;
    public int y;
    public int z;
    
    public ayg() {
        this.f = -1;
        this.g = -1;
        this.l = -1;
        this.o = Long.MAX_VALUE;
        this.p = -1;
        this.q = -1;
        this.r = -1.0f;
        this.t = 1.0f;
        this.v = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.C = -1;
        this.D = 0;
    }
    
    public ayg(final ayh ayh) {
        this.a = ayh.c;
        this.b = ayh.d;
        this.c = ayh.e;
        this.d = ayh.f;
        this.e = ayh.g;
        this.f = ayh.h;
        this.g = ayh.i;
        this.h = ayh.k;
        this.i = ayh.l;
        this.j = ayh.m;
        this.k = ayh.n;
        this.l = ayh.o;
        this.m = ayh.p;
        this.n = ayh.q;
        this.o = ayh.r;
        this.p = ayh.s;
        this.q = ayh.t;
        this.r = ayh.u;
        this.s = ayh.v;
        this.t = ayh.w;
        this.u = ayh.x;
        this.v = ayh.y;
        this.w = ayh.z;
        this.x = ayh.A;
        this.y = ayh.B;
        this.z = ayh.C;
        this.A = ayh.D;
        this.B = ayh.E;
        this.C = ayh.F;
        this.D = ayh.G;
    }
    
    public final ayh a() {
        return new ayh(this);
    }
    
    public final void b(final int n) {
        this.a = Integer.toString(n);
    }
}
