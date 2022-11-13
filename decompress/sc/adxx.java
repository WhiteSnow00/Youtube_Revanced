import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

final class adxx extends ahs
{
    final adxy a;
    final cgj b;
    
    public adxx(final adxy a, final cgj b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Typeface typeface) {
        final adxy a = this.a;
        a.k = Typeface.create(typeface, a.c);
        adxy.b(this.a);
        this.b.k(this.a.k);
    }
    
    public final void b() {
        adxy.b(this.a);
        this.b.l();
    }
}
