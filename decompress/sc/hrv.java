import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class hrv implements abfb
{
    final boolean a;
    final aiqj b;
    final int c;
    final long d;
    final int e;
    final int f;
    final boolean g;
    final boolean h;
    final long i;
    final hrx j;
    final agmc k;
    
    public hrv(final hrx j, final boolean a, final aiqj b, final int c, final long d, final agmc k, final int e, final int f, final boolean g, final boolean h, final long i, final byte[] array, final byte[] array2, final byte[] array3) {
        this.j = j;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.k = k;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void a(final Throwable t) {
    }
    
    public final void b(final PlayerResponseModel playerResponseModel) {
        final cyb m = this.j.m;
        final boolean a = this.a;
        if (!((vai)m.a).f(45382055L) || !m.n(a)) {
            this.j.l.n(this.b, playerResponseModel.z(), this.c);
            return;
        }
        final hrx j = this.j;
        if (j.i) {
            return;
        }
        j.l.n(this.b, playerResponseModel.z(), this.c);
        this.j.f(this.d, this.b, this.k, this.c, this.e, this.f, true, this.g, this.h, this.i);
    }
    
    public final void c(final int n) {
    }
}
