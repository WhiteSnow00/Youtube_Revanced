import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abja extends abxh
{
    final abjb a;
    private final String b;
    
    public abja(final abjb a, final String b, final long n, final long n2) {
        this.a = a;
        super(n, n2, 1, 2, b);
        this.b = b;
    }
    
    protected final void a() {
        if (this.b.equals(this.a.a)) {
            this.a.e.k((abxh)this);
        }
    }
    
    protected final void ta(final long n) {
        if (super.r && ((abxl)this).s(n)) {
            this.tb(false, false, false, n);
        }
    }
    
    public final void tb(final boolean b, final boolean b2, final boolean b3, final long n) {
        final abjb a = this.a;
        final ablj j = a.j;
        long c;
        String s;
        if (j != null && (!j.a.equals(a.a) || b2)) {
            final ablj i = this.a.j;
            c = i.c;
            s = i.a;
        }
        else {
            if (this.a.d(this.b)) {
                return;
            }
            s = this.a.a;
            c = n;
        }
        this.a.c(s, this.b, c, false, b2);
        this.a.c(this.b, s, n, true, b2);
        final boolean d = this.a.d(this.b);
        final String s2 = null;
        String b4;
        if (!d) {
            b4 = this.b;
        }
        else {
            b4 = null;
        }
        final acbb d2 = this.a.b.d(this.b);
        String k = s2;
        if (d2 != null) {
            final PlayerResponseModel f = d2.f;
            k = s2;
            if (f != null) {
                k = f.K();
            }
        }
        this.a.c.ab().tt(new aaoi(this.a.a, b4, k));
        this.a.c.ab().tt(new aaon(n, true));
        this.a.j = new ablj(this.b, n, ((abxl)this).p());
    }
}
