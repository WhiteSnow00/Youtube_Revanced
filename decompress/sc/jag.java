import com.google.protobuf.MessageLite;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jag extends abbk implements rqn
{
    private final jaf b;
    private final jaf c;
    private final jaf d;
    private rqm e;
    private jaf f;
    private boolean g;
    private int h;
    
    public jag(final Context context, final jak b, final jap c, final jaq d) {
        super(context);
        b.getClass();
        this.b = (jaf)b;
        c.getClass();
        this.c = (jaf)c;
        d.getClass();
        this.d = (jaf)d;
        this.m();
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final View c(final Context context) {
        final View inflate = LayoutInflater.from(context).inflate(2131624786, (ViewGroup)null, false);
        inflate.setVisibility(0);
        return inflate;
    }
    
    public final void e(final Context context, final View view) {
        if (this.f == null) {
            return;
        }
        if (this.ab(1)) {
            this.f.b(view);
            this.f.c();
        }
        if (this.ab(2)) {
            this.f.g(this.h, this.g);
        }
    }
    
    public final void l() {
        this.e = null;
        this.m();
    }
    
    public final void m() {
        this.b.d();
        this.c.d();
        final jaq jaq = (jaq)this.d;
        final ViewGroup c = jaq.c;
        if (c != null) {
            c.removeAllViews();
            jaq.c.setVisibility(8);
        }
        if (jaq.b != null) {
            jaq.a.c((acku)null);
            jaq.b = null;
        }
        jaq.e = null;
        jaq.d = null;
        this.f = null;
        this.h = 1;
        this.Z(3);
        this.mk();
    }
    
    public final void n(final rqm e) {
        this.e = e;
    }
    
    public final void o(final MessageLite messageLite) {
        this.m();
        if (messageLite instanceof ahuw) {
            final jaf b = this.b;
            ((jam)b).r = messageLite;
            this.f = b;
        }
        else if (messageLite instanceof aiqa) {
            final jaf c = this.c;
            ((jam)c).r = messageLite;
            this.f = c;
        }
        else if (messageLite instanceof ajmt) {
            final jaf d = this.d;
            ((jaq)d).d = (ajmt)messageLite;
            this.f = d;
        }
        final jaf f = this.f;
        if (f != null) {
            f.f(this.e);
            this.Z(1);
            this.mm();
        }
    }
    
    public final boolean oV() {
        return this.f != null;
    }
    
    public final void p(final boolean b) {
        final jaf f = this.f;
        if (f != null) {
            f.e(b);
        }
    }
    
    public final void q(final int h, final boolean g) {
        this.h = h;
        this.g = g;
        this.Z(2);
    }
}
