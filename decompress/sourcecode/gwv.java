import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.edit.gallery.MediaGridRecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import j$.util.Optional;
import com.google.apps.tiktok.account.AccountId;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwv extends usa implements hbf
{
    hbg a;
    int b;
    public qpt c;
    private final Context d;
    private final View e;
    private final AccountId f;
    private final avt g;
    
    public gwv(final Context d, final cl cl, final avt g, final int b, final AccountId f, final byte[] array, final byte[] array2, final byte[] array3) {
        super(d, cl, (wwv)g.a, Optional.empty(), true, true, true);
        this.f = f;
        this.d = d;
        this.g = g;
        this.b = b;
        this.e = LayoutInflater.from(d).inflate(2131625414, (ViewGroup)null);
    }
    
    protected final View a() {
        return this.e;
    }
    
    public final void b() {
    }
    
    public final void e(final DeviceLocalFile deviceLocalFile) {
        final hbg a = this.a;
        final boolean b = false;
        int l;
        if (a == null) {
            l = (b ? 1 : 0);
        }
        else {
            final MediaGridRecyclerView ah = a.ah;
            l = (b ? 1 : 0);
            if (ah != null) {
                final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)((RecyclerView)ah).n;
                l = (b ? 1 : 0);
                if (linearLayoutManager != null) {
                    l = linearLayoutManager.L();
                }
            }
        }
        this.E();
        final qpt c = this.c;
        if (c != null) {
            final gwd g = ((gwg)c.a).g;
            if (g != null) {
                final hbl hbl = (hbl)g;
                hbl.ay = l;
                hbl.aS(deviceLocalFile, 5);
            }
        }
    }
    
    protected final String f() {
        return this.d.getString(2132019782);
    }
    
    public final void h() {
        super.h();
        final qpt c = this.c;
        if (c != null) {
            ((gwg)c.a).bw = -1;
        }
    }
    
    public final void l() {
        super.l();
        final hbg a = (hbg)this.D().f("nestedGalleryFragment");
        this.a = a;
        if (a == null) {
            this.a = hbg.aK(true, null, this.f);
        }
        final hbg a2 = this.a;
        a2.ae = (hbf)this;
        final int b = this.b;
        if (b != -1) {
            a2.ai = b;
            this.b = -1;
        }
        final ct i = this.D().i();
        i.w(2131430040, (br)this.a, "nestedGalleryFragment");
        i.d();
        this.g.P(wya.b(121258)).b();
        final tuw s = this.g.S(wya.c(97092));
        s.k(true);
        s.c();
    }
    
    public final void nh() {
        final qpt c = this.c;
        if (c != null) {
            final gwd g = ((gwg)c.a).g;
            if (g != null) {
                g.nh();
            }
        }
    }
}
