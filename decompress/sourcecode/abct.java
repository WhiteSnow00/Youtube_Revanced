import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class abct implements ydu
{
    public final abig a;
    public final auip b;
    private final acb c;
    
    public abct(final auip b, final acb c, final abig a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final void e() {
        this.c.b();
    }
    
    public final void f() {
        this.c.c(null);
    }
    
    public final void g(final FormatStreamModel formatStreamModel, final long n) {
    }
    
    public final void h() {
    }
    
    public final boolean i() {
        return false;
    }
    
    public final void j() {
        this.c.d(new IllegalArgumentException("Prebuffer failed"));
    }
    
    public final void k() {
    }
}
