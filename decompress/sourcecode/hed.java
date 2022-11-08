import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class hed implements hey
{
    final /* synthetic */ br a;
    private final /* synthetic */ int b;
    
    public hed(final hea a, final int b) {
        this.b = b;
        this.a = (br)a;
    }
    
    public hed(final hef a, final int b) {
        this.b = b;
        this.a = (br)a;
    }
    
    public hed(final hek a, final int b) {
        this.b = b;
        this.a = (br)a;
    }
    
    public final void a(final Uri uri) {
        final int b = this.b;
        if (b == 0) {
            if (tmy.bP(this.a)) {
                ((hef)this.a).ar.h();
                final hef hef = (hef)this.a;
                final maw ag = hef.aG;
                if (ag != null) {
                    final EditableVideo d = ((urf)ag.b).d;
                    final auip ak = hef.aK;
                    if (ak != null && d != null) {
                        ak.bl(d, true);
                        final qxv az = ((hef)this.a).az;
                        if (az != null) {
                            d.q(az);
                        }
                    }
                }
            }
            return;
        }
        if (b != 1) {
            if (!((hek)this.a).ae) {
                zjp.b(zjo.a, zjn.l, "[ShortsCreation][Android][Trim]Attempting to prepare trim state before trimmer finished setting up.");
                ((hek)this.a).s(false);
            }
            final hem ak2 = ((hek)this.a).ak;
            if (ak2 != null) {
                ak2.e(uri);
            }
            final hek hek = (hek)this.a;
            final urf n = hek.n();
            EditableVideo d2;
            if (n == null) {
                d2 = null;
            }
            else {
                d2 = n.d;
            }
            if (d2 != null) {
                final qxv av = hek.av;
                if (av != null) {
                    d2.q(av);
                }
            }
            return;
        }
        if (!tmy.bP(this.a)) {
            return;
        }
        final hea hea = (hea)this.a;
        final TrimVideoControllerView ah = hea.ah;
        if (ah != null) {
            final rbr an = hea.an;
            if (an != null) {
                ah.i(an);
            }
        }
        final hea hea2 = (hea)this.a;
        final TrimVideoControllerView ah2 = hea2.ah;
        if (ah2 != null) {
            final rbq ao = hea2.ao;
            if (ao != null) {
                ah2.h(ao);
            }
        }
        ((hea)this.a).ar.h();
    }
    
    public final void b() {
        final int b = this.b;
        if (b == 0) {
            ((hef)this.a).aI.N();
            return;
        }
        if (b != 1) {
            ((hek)this.a).aE.N();
            return;
        }
        ((hea)this.a).aH.N();
    }
}
