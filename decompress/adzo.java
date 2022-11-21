import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

final class adzo extends aht
{
    final adzp a;
    final cgm b;
    
    public adzo(final adzp a, final cgm b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Typeface typeface) {
        final adzp a = this.a;
        a.k = Typeface.create(typeface, a.c);
        adzp.b(this.a);
        this.b.k(this.a.k);
    }
    
    public final void b() {
        adzp.b(this.a);
        this.b.l();
    }
}
