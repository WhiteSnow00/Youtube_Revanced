import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itd implements abcu, iss
{
    public final itc a;
    public boolean b;
    private final bu c;
    private final ftk d;
    private boolean e;
    private ist f;
    private String g;
    private final aeea h;
    
    public itd(final bu c, final itc a, final aeea h, final ftk d, final byte[] array, final byte[] array2, final byte[] array3) {
        c.getClass();
        this.c = c;
        this.a = a;
        this.h = h;
        (this.d = d).a("menu_item_playback_speed", false);
    }
    
    public final ist a() {
        if (this.f == null) {
            final ist f = new ist(this.c.getString(2132019152), new iso(this, 8));
            this.f = f;
            ((qkq)f).e = tpe.k((Context)this.c, 2131233862, 2130970924);
            this.f.g(this.e);
            this.f.f(this.g);
        }
        final ist f2 = this.f;
        f2.getClass();
        return f2;
    }
    
    public final void c(final apjo[] array, final int n) {
        this.a.b(array, n);
        String o;
        final String s = o = null;
        if (array != null) {
            o = s;
            if (n >= 0) {
                o = s;
                if (n < array.length) {
                    o = jgk.o(array[n]);
                }
            }
        }
        if (adkp.ae(this.g, o)) {
            return;
        }
        this.g = o;
        this.d.d("menu_item_playback_speed", o);
        final ist f = this.f;
        if (f != null) {
            f.f(o);
        }
    }
    
    public final void d(final boolean e) {
        if (this.e == e) {
            return;
        }
        this.e = e;
        this.d.a("menu_item_playback_speed", e);
        final ist f = this.f;
        if (f != null) {
            f.g(e);
        }
    }
    
    public final void f() {
        if (this.b) {
            final ex ex = new ex((Context)this.c, 2132084300);
            ex.n(2132020125);
            ex.f(2132020124);
            ex.k(2132018939, (DialogInterface$OnClickListener)null);
            final ey b = ex.b();
            if (this.h.ao()) {
                b.setOnShowListener((DialogInterface$OnShowListener)new eyk(b, 9));
            }
            b.show();
            return;
        }
        this.a.c(this.c);
    }
    
    public final void oO() {
        this.f = null;
    }
    
    public final boolean oP() {
        return false;
    }
    
    public final String oQ() {
        return "menu_item_playback_speed";
    }
}
