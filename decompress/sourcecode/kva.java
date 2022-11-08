import android.app.Dialog;
import com.google.android.youtube.api.StandalonePlayerActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kva implements zku
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public kva(final aegi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public kva(final StandalonePlayerActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public kva(final hxc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public kva(final kvb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public kva(final rke a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public kva(final sze a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    ((aegi)this.a).a();
                    return;
                }
                if (b == 3) {
                    ((rke)this.a).a();
                    return;
                }
                if (b != 4) {
                    ((StandalonePlayerActivity)this.a).e();
                    return;
                }
                ((sze)this.a).dismiss();
            }
            else {
                ((hxc)this.a).pJ();
            }
        }
    }
    
    public final void b() {
        final int b = this.b;
        if (b == 0) {
            ((kvb)this.a).c();
            return;
        }
        if (b == 1) {
            final Dialog d = ((bi)this.a).d;
            if (d != null) {
                d.show();
                ((hxc)this.a).aN();
            }
            return;
        }
        if (b == 2) {
            ((aegi)this.a).a();
            return;
        }
        if (b == 3) {
            final rke rke = (rke)this.a;
            if (rke.f) {
                rke.f = false;
            }
            return;
        }
        if (b != 4) {
            ((StandalonePlayerActivity)this.a).e();
            return;
        }
        ((bi)this.a).d.show();
        ((sze)this.a).aN();
    }
    
    public final void c(final Exception ex) {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    ((aegi)this.a).a();
                    return;
                }
                if (b == 3) {
                    ((rke)this.a).b();
                    final String localizedMessage = ex.getLocalizedMessage();
                    if (localizedMessage != null) {
                        ((rke)this.a).a.l(localizedMessage);
                    }
                    return;
                }
                if (b != 4) {
                    ((StandalonePlayerActivity)this.a).e();
                    return;
                }
                ((sze)this.a).aj.e((Throwable)ex);
                ((sze)this.a).dismiss();
            }
            else {
                ((hxc)this.a).aj.e((Throwable)ex);
                ((hxc)this.a).pJ();
            }
        }
    }
}
