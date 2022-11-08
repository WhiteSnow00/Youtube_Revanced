import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

final class lum
{
    public final lsv a;
    public int b;
    public long c;
    public long d;
    public boolean e;
    public long f;
    public long g;
    public boolean h;
    public final jfi i;
    private final SparseArray j;
    private final SparseArray k;
    
    public lum(final lsv a) {
        this.a = a;
        this.j = new SparseArray();
        this.k = new SparseArray();
        this.i = new jfi();
        this.b();
    }
    
    public final void a(final lwd lwd) {
        this.j.append(lwd.a, (Object)lwd);
    }
    
    public final void b() {
        this.e = false;
    }
    
    public final void c(final atvw atvw) {
        this.k.append(atvw.a, (Object)atvw);
    }
}
