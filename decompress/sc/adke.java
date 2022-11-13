// 
// Decompiled by Procyon v0.6.0
// 

final class adke
{
    public float a;
    public float b;
    public float c;
    public int d;
    
    public adke() {
        this.d = 1;
    }
    
    final void a(final float n) {
        this.a = Math.max(0.0f, Math.min(1.0f, n));
    }
    
    final void b(final float n) {
        this.c = Math.max(0.0f, Math.min(1.0f, n));
    }
    
    final void c(final float n) {
        this.b = Math.max(0.0f, Math.min(1.0f, n));
    }
}
