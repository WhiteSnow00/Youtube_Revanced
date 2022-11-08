// 
// Decompiled by Procyon v0.6.0
// 

abstract class advf
{
    protected advg j;
    protected final float[] k;
    protected final int[] l;
    
    protected advf(final int n) {
        this.k = new float[n + n];
        this.l = new int[n];
    }
    
    protected static final float f(final int n, final int n2, final int n3) {
        return (n - n2) / (float)n3;
    }
    
    public abstract void a();
    
    public abstract void b(final cju p0);
    
    public abstract void c();
    
    public abstract void d();
    
    public abstract void e();
}
