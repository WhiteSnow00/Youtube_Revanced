import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrt implements tet
{
    public final hrx a;
    public final aiqj b;
    public final int c;
    public final boolean d;
    public final long e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final agmc l;
    
    public hrt(final hrx a, final aiqj b, final int c, final boolean d, final long e, final agmc l, final int f, final int g, final boolean h, final boolean i, final boolean j, final long k, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.l = l;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final void a(final Object o) {
        final hrx a = this.a;
        final aiqj b = this.b;
        final int c = this.c;
        final boolean d = this.d;
        final long e = this.e;
        final agmc l = this.l;
        final int f = this.f;
        final int g = this.g;
        final boolean h = this.h;
        final boolean i = this.i;
        final boolean j = this.j;
        final long k = this.k;
        a.l.n(b, ((PlayerResponseModel)o).z(), c);
        if (!a.i) {
            if (a.m.o(d)) {
                a.f(e, b, l, c, f, g, h, i, j, k);
            }
        }
    }
}
