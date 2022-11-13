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

public final class gxk extends utv implements hbw
{
    hbx a;
    int b;
    public pvh c;
    private final Context d;
    private final View e;
    private final AccountId f;
    private final aeea g;
    
    public gxk(final Context d, final cl cl, final aeea g, final int b, final AccountId f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(d, cl, (wyw)g.a, Optional.empty(), true, true, true);
        this.f = f;
        this.d = d;
        this.g = g;
        this.b = b;
        this.e = LayoutInflater.from(d).inflate(2131625419, (ViewGroup)null);
    }
    
    protected final View a() {
        return this.e;
    }
    
    public final void b() {
    }
    
    public final void e(final DeviceLocalFile deviceLocalFile) {
        final hbx a = this.a;
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
        final pvh c = this.c;
        if (c != null) {
            final gwt g = ((gww)c.a).g;
            if (g != null) {
                final hcd hcd = (hcd)g;
                hcd.ay = l;
                hcd.aS(deviceLocalFile, 5);
            }
        }
    }
    
    protected final String f() {
        return this.d.getString(2132019783);
    }
    
    public final void h() {
        super.h();
        final pvh c = this.c;
        if (c != null) {
            ((gww)c.a).bx = -1;
        }
    }
    
    public final void l() {
        super.l();
        final hbx a = (hbx)this.D().f("nestedGalleryFragment");
        this.a = a;
        if (a == null) {
            this.a = hbx.aK(true, (aiqj)null, this.f);
        }
        final hbx a2 = this.a;
        a2.ae = this;
        final int b = this.b;
        if (b != -1) {
            a2.ai = b;
            this.b = -1;
        }
        final ct i = this.D().i();
        i.w(2131430040, (br)this.a, "nestedGalleryFragment");
        i.d();
        this.g.cD(xaa.b(121258)).b();
        final twx cg = this.g.cG(xaa.c(97092));
        cg.k(true);
        cg.c();
    }
    
    public final void nh() {
        final pvh c = this.c;
        if (c != null) {
            final gwt g = ((gww)c.a).g;
            if (g != null) {
                g.nh();
            }
        }
    }
}
