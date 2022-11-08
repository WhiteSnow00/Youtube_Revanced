import com.google.protobuf.MessageLite;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izh extends aazp implements roj
{
    private final izg b;
    private final izg c;
    private final izg d;
    private roi e;
    private izg f;
    private boolean g;
    private int h;
    
    public izh(final Context context, final izm b, final izr c, final izs d) {
        super(context);
        b.getClass();
        this.b = (izg)b;
        c.getClass();
        this.c = (izg)c;
        d.getClass();
        this.d = (izg)d;
        this.m();
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final View c(final Context context) {
        final View inflate = LayoutInflater.from(context).inflate(2131624785, (ViewGroup)null, false);
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
        final izs izs = (izs)this.d;
        final ViewGroup c = izs.c;
        if (c != null) {
            c.removeAllViews();
            izs.c.setVisibility(8);
        }
        if (izs.b != null) {
            izs.a.c((acir)null);
            izs.b = null;
        }
        izs.e = null;
        izs.d = null;
        this.f = null;
        this.h = 1;
        this.Z(3);
        this.mk();
    }
    
    public final void n(final roi e) {
        this.e = e;
    }
    
    public final void o(final MessageLite messageLite) {
        this.m();
        if (messageLite instanceof ahsy) {
            final izg b = this.b;
            ((izo)b).r = messageLite;
            this.f = b;
        }
        else if (messageLite instanceof ainv) {
            final izg c = this.c;
            ((izo)c).r = messageLite;
            this.f = c;
        }
        else if (messageLite instanceof ajko) {
            final izg d = this.d;
            ((izs)d).d = (ajko)messageLite;
            this.f = d;
        }
        final izg f = this.f;
        if (f != null) {
            f.f(this.e);
            this.Z(1);
            this.mm();
        }
    }
    
    public final boolean oU() {
        return this.f != null;
    }
    
    public final void p(final boolean b) {
        final izg f = this.f;
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
