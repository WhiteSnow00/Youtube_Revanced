import android.view.View;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import j$.util.Optional;
import androidx.core.widget.NestedScrollView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsp extends utv
{
    public final NestedScrollView a;
    public Optional b;
    public asir c;
    public final RecyclerView d;
    public Optional e;
    public final Context f;
    public final wyv g;
    public final acps h;
    public final acrr i;
    public final vnu j;
    public final oug k;
    public ajut l;
    public final ipd m;
    public final blu n;
    public final aeea o;
    private final vcy p;
    private final vlf q;
    private final zmf r;
    
    public hsp(final cl cl, final Context f, final vcy p18, final blu n, final wyv g, final acps h, final acrr i, final ipd m, final vnu j, final aeea o, final oug k, final vlf q, final zmf r, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(f, cl, (wyw)null, Optional.empty(), true, false, true);
        this.p = p18;
        this.n = n;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.m = m;
        this.j = j;
        this.o = o;
        this.k = k;
        this.q = q;
        this.r = r;
        this.a = new NestedScrollView(f);
        this.e = Optional.empty();
        this.b = Optional.empty();
        this.c = asfn.c();
        this.d = new RecyclerView(LayoutInflater.from(f).getContext());
    }
    
    protected final View a() {
        return (View)this.a;
    }
    
    protected final String f() {
        final ajut l = this.l;
        String string;
        if (l == null) {
            string = "";
        }
        else {
            string = acak.b(l).toString();
        }
        return string;
    }
    
    public final void h() {
        super.h();
        this.l = null;
        this.a.removeAllViews();
        if (this.b.isPresent()) {
            ((acns)this.b.get()).i();
            this.b = Optional.empty();
        }
        if (this.e.isPresent()) {
            this.p.a((aiqj)this.e.get());
            this.e = Optional.empty();
        }
    }
    
    public final void j(final hkj hkj) {
        synchronized (this) {
            if (hkj.a.f() == null) {
                zlm.b(zll.b, zlk.x, "browseResponseModel without section list");
                this.E();
                return;
            }
            if ((hkj.a.a.b & 0x2000000) != 0x0) {
                final vlf q = this.q;
                final zme c = this.r.c();
                ajvo ajvo;
                if ((ajvo = hkj.a.a.x) == null) {
                    ajvo = ajvo.a;
                }
                akli akli;
                if ((akli = hkj.a.a.c) == null) {
                    akli = akli.a;
                }
                q.a(c, ajvo, akli);
            }
            if (this.b.isPresent()) {
                ((acns)this.b.get()).i();
                ((acns)this.b.get()).N(hkj.a.f());
            }
        }
    }
}
