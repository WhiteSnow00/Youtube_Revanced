import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aboh implements aboj
{
    public final aboq a;
    public PlaybackStartDescriptor b;
    public final ablh c;
    public final abou d;
    public final abrj e;
    private final ashi f;
    private final ashi g;
    private final asiq h;
    private final abkl i;
    private final afhd j;
    
    public aboh(final ashi f, final ashi g, final abou d, final abkl i, final ablh c, final abrj e, final aboq a, final byte[] array) {
        this.f = f;
        this.g = g;
        this.d = d;
        this.i = i;
        this.c = c;
        this.e = e;
        this.a = a;
        this.h = new asiq();
        this.j = new afhd(this);
    }
    
    public final void a() {
        final atiw c = this.d.c;
        final boolean j = this.j(abop.b);
        final boolean i = this.j(abop.a);
        final aboq a = this.a;
        final boolean b = a instanceof abon;
        final boolean b2 = false;
        int n;
        if (b) {
            n = ((abon)a).n();
        }
        else {
            n = 0;
        }
        final aboq a2 = this.a;
        boolean b3 = b2;
        if (a2 instanceof abor) {
            b3 = b2;
            if (((abor)a2).pD()) {
                b3 = true;
            }
        }
        ((aukf)c).tu((Object)new aanh(j, i, n, b3));
    }
    
    public final void b() {
        this.b = null;
    }
    
    public final void c() {
        this.h.c(this.f.am((asjm)new abja(this, 15)));
        this.h.c(this.g.am((asjm)new abja(this, 16)));
        this.i.j();
        this.a();
        final atiw d = this.d.d;
        final PlaybackStartDescriptor n = this.c.n;
        String i;
        if (n == null) {
            i = null;
        }
        else {
            i = n.i();
        }
        ((aukf)d).tu((Object)new abit(i));
        this.a.l(this.j);
    }
    
    public final void d(final boolean b) {
        this.a.e(b);
    }
    
    public final void e(final abiu abiu) {
        ((aukf)this.d.e).tu((Object)new abiv(abiu));
    }
    
    public final void f() {
        this.e(abiu.f);
    }
    
    public final void g() {
        this.e(abiu.a);
    }
    
    public final void h() {
        ((aukf)this.d.a).tu((Object)new aang(false));
        ((aukf)this.d.g).tu((Object)aani.a);
        this.i.d();
        this.h.dispose();
        this.a.m(this.j);
        this.a.g();
    }
    
    public final void i(final String s) {
        final String c = this.i.c();
        if ((TextUtils.isEmpty((CharSequence)s) && TextUtils.isEmpty((CharSequence)c)) || TextUtils.equals((CharSequence)s, (CharSequence)c)) {
            return;
        }
        ((aukf)this.d.d).tu((Object)new abit(s));
    }
    
    public final boolean j(final abop abop) {
        return this.l(abop) == 2;
    }
    
    public final boolean k(final Class clazz) {
        return this.a.getClass().equals(clazz);
    }
    
    public final int l(final abop abop) {
        return this.a.j(abop);
    }
}
