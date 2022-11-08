import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

final class bzu
{
    public final buc a;
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
    public final bhs m;
    private final SparseArray n;
    private final SparseArray o;
    
    public bzu(final buc a) {
        this.a = a;
        this.b = false;
        this.c = false;
        this.n = new SparseArray();
        this.o = new SparseArray();
        this.m = new bhs();
        final byte[] d = new byte[128];
        this.d = d;
        new chr(d, 0, 0);
        this.b();
    }
    
    public final void a(final btv btv) {
        this.n.append(btv.d, (Object)btv);
    }
    
    public final void b() {
        this.g = false;
        this.i = false;
    }
    
    public final void c(final atvw atvw) {
        this.o.append(atvw.a, (Object)atvw);
    }
}
