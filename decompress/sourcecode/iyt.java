// 
// Decompiled by Procyon v0.6.0
// 

public final class iyt implements fps
{
    public final long a;
    public final wwv b;
    public final vax c;
    public final atir d;
    public final atir e;
    public final atir f;
    public final atir g;
    public final atir h;
    public final atir i;
    public final aayj j;
    public final asgt k;
    public iuh l;
    public final mrm m;
    public final qpt n;
    public final qpt o;
    private final qv p;
    
    public iyt(final wwv b, final vax c, final aayj j, final asgt k, final mrm m, final qv p16, final qpt o, final long a, final qpt n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.p = p16;
        this.o = o;
        this.a = a;
        this.n = n;
        this.b = b;
        this.c = c;
        this.d = atir.e();
        this.e = atir.e();
        this.f = atir.e();
        this.h = atir.e();
        this.i = atir.e();
        this.g = atir.e();
        this.j = j;
        this.k = k;
        this.m = m;
        p16.a((ixw)new iuu(this, 5));
    }
    
    @Override
    public final void a(final boolean b) {
        final iuh l = this.l;
        if (l == null) {
            return;
        }
        l.a(b);
    }
    
    @Override
    public final void b(final boolean b) {
        this.e.tr((Object)b);
    }
    
    @Override
    public final void c(final boolean b) {
        this.d.tr((Object)b);
    }
    
    @Override
    public final void d(final boolean b) {
        this.f.tr((Object)b);
    }
    
    @Override
    public final void e(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        this.i.tr((Object)new aja(charSequence, charSequence2, charSequence3));
    }
    
    @Override
    public final void f(final boolean b) {
        Boolean b2;
        if (this.f.aV()) {
            b2 = (Boolean)this.f.aS();
        }
        else {
            b2 = null;
        }
        if (b2 != null && b2) {
            this.p.b();
        }
        final iuh l = this.l;
        if (l == null) {
            return;
        }
        l.f(b);
    }
    
    @Override
    public final void g(final boolean b) {
        final iuh l = this.l;
        if (l != null) {
            l.g(b);
        }
    }
}
