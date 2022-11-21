import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

final class bzy
{
    public final bug a;
    public final boolean b;
    public final boolean c;
    public final byte[] d;
    public int e;
    public long f;
    public boolean g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    public final bhx m;
    private final SparseArray n;
    private final SparseArray o;
    
    public bzy(final bug a) {
        this.a = a;
        this.b = false;
        this.c = false;
        this.n = new SparseArray();
        this.o = new SparseArray();
        this.m = new bhx();
        final byte[] d = new byte[128];
        this.d = d;
        new chv(d, 0, 0);
        this.b();
    }
    
    public final void a(final btz btz) {
        this.n.append(btz.d, (Object)btz);
    }
    
    public final void b() {
        this.g = false;
        this.i = false;
    }
    
    public final void c(final atzq atzq) {
        this.o.append(atzq.a, (Object)atzq);
    }
}
