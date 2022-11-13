import android.widget.TextView;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwn implements fpz
{
    public boolean a;
    final toz b;
    private boolean c;
    private boolean d;
    private CharSequence e;
    private boolean f;
    
    public iwn(final toz b) {
        (this.b = b).l(false, false);
    }
    
    private final void j(final boolean b) {
        this.b.l(this.c, b);
    }
    
    public final void a(final boolean b) {
        this.c = false;
        this.j(b);
    }
    
    public final void b(final boolean b) {
    }
    
    public final void c(final boolean b) {
        if (!this.a) {
            this.d = (b ^ true);
        }
    }
    
    public final void d(final boolean d) {
        if (!this.a) {
            this.d = d;
        }
    }
    
    public final void e(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        if (this.d) {
            this.i(charSequence);
        }
    }
    
    public final void f(final boolean b) {
        if (this.c) {
            return;
        }
        this.c = true;
        this.j(b);
    }
    
    public final void g(final boolean b) {
    }
    
    final void h(final CharSequence charSequence) {
        this.d(this.a = false);
        this.a = true;
        this.i(charSequence);
    }
    
    final void i(final CharSequence e) {
        final boolean f = this.d ^ true;
        if (TextUtils.equals(this.e, e) && this.f == f) {
            return;
        }
        this.f = f;
        this.e = e;
        ((TextView)this.b.a).setText(this.e);
    }
}
