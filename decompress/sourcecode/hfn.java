import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.TranscodeOptions;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import android.net.Uri;
import java.util.Locale;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfn implements View$OnClickListener
{
    public final Context a;
    public final wwv b;
    public final boolean c;
    CreationButtonView d;
    YouTubeButton e;
    TextView f;
    View g;
    TextView h;
    ImageView i;
    Drawable j;
    Drawable k;
    MultiSegmentCameraProgressIndicator l;
    final uir m;
    final avt n;
    public qpt o;
    
    public hfn(final hfm hfm) {
        final Context a = hfm.a;
        a.getClass();
        this.a = a;
        final wwv b = hfm.b;
        b.getClass();
        this.b = b;
        this.n = new avt(b, (byte[])null);
        final aqyx c = hfm.c;
        if (c == aqyx.c) {
            this.m = hor.d();
        }
        else if (c != null && c != aqyx.a) {
            this.m = hor.e(c);
        }
        else {
            this.m = null;
        }
        this.c = (c == aqyx.c);
    }
    
    public final void a(final long n) {
        final MultiSegmentCameraProgressIndicator l = this.l;
        if (l != null && n > 0L) {
            l.c((int)afqo.c(n).toMillis());
        }
        final TextView h = this.h;
        if (h != null) {
            h.setText((CharSequence)String.format(Locale.US, "%d", afqo.c(n).getSeconds()));
        }
    }
    
    public final void b(final boolean b) {
        final ImageView i = this.i;
        if (i != null) {
            Drawable imageDrawable;
            if (b) {
                imageDrawable = this.j;
            }
            else {
                imageDrawable = this.k;
            }
            i.setImageDrawable(imageDrawable);
        }
    }
    
    public final void onClick(final View view) {
        final qpt o = this.o;
        if (o == null) {
            return;
        }
        if (view == this.e) {
            final alft a = alft.a;
            final hfl hfl = (hfl)o.a;
            alft bh = a;
            if (hfl.aP != null) {
                final EditableVideo ar = hfl.ar;
                bh = a;
                if (ar != null) {
                    bh = auip.bh(ar);
                }
            }
            final hfn au = ((hfl)o.a).au;
            if (au != null) {
                final agza builder = ((agzi)alff.a).createBuilder();
                final agza builder2 = ((agzi)algf.a).createBuilder();
                builder2.copyOnWrite();
                final algf algf = (algf)builder2.instance;
                bh.getClass();
                algf.d = bh;
                algf.b |= 0x4;
                final algf d = (algf)builder2.build();
                builder.copyOnWrite();
                final alff alff = (alff)builder.instance;
                d.getClass();
                alff.D = d;
                alff.c |= 0x40000;
                final alff b = (alff)builder.build();
                final tuw s = au.n.S(wya.c(96644));
                s.b = (agzi)b;
                s.d();
            }
            final qpt o2 = this.o;
            ((hfl)o2.a).aO();
            final hfl hfl2 = (hfl)o2.a;
            final EditableVideo ar2 = hfl2.ar;
            if (ar2 != null) {
                final long as = hfl2.as;
                final Uri uri = null;
                final aqyq b2 = hgd.b(ar2, null, as);
                final hfl hfl3 = (hfl)o2.a;
                final Uri an = hfl3.an;
                if (an != null && hfl3.aw != null && hfl3.e != null) {
                    final aock ae = hfl3.ae;
                    ae.getClass();
                    aoch aoch;
                    if ((aoch = ae.e) == null) {
                        aoch = aoch.a;
                    }
                    final int m = (int)aoch.c;
                    final boolean l = ((hfl)o2.a).aB.l();
                    final hfl hfl4 = (hfl)o2.a;
                    final aqyy aw = hfl4.aw;
                    aw.getClass();
                    final boolean j = b2.f != 0.0f || b2.h != 0.0f || b2.g != 0.0f || b2.e != 0.0f;
                    final int d2 = b2.d;
                    final int c = b2.c;
                    final int n = d2 - c;
                    final agza builder3 = ((agzi)aw).toBuilder();
                    final agza builder4 = ((agzi)aqyv.a).createBuilder();
                    builder4.copyOnWrite();
                    final aqyv aqyv = (aqyv)builder4.instance;
                    aqyv.b |= 0x1;
                    aqyv.c = c;
                    builder4.copyOnWrite();
                    final aqyv aqyv2 = (aqyv)builder4.instance;
                    aqyv2.b |= 0x2;
                    aqyv2.d = n;
                    final aqyv d3 = (aqyv)builder4.build();
                    builder3.copyOnWrite();
                    final aqyy aqyy = (aqyy)builder3.instance;
                    d3.getClass();
                    aqyy.d = d3;
                    aqyy.b |= 0x2;
                    final agza builder5 = ((agzi)aqyv.a).createBuilder();
                    builder5.copyOnWrite();
                    final aqyv aqyv3 = (aqyv)builder5.instance;
                    aqyv3.b |= 0x1;
                    aqyv3.c = c + m;
                    builder5.copyOnWrite();
                    final aqyv aqyv4 = (aqyv)builder5.instance;
                    aqyv4.b |= 0x2;
                    aqyv4.d = n;
                    final aqyv f = (aqyv)builder5.build();
                    builder3.copyOnWrite();
                    final aqyy aqyy2 = (aqyy)builder3.instance;
                    f.getClass();
                    aqyy2.f = f;
                    aqyy2.b |= 0x8;
                    builder3.copyOnWrite();
                    final aqyy aqyy3 = (aqyy)builder3.instance;
                    aqyy3.b |= 0x80;
                    aqyy3.j = j;
                    builder3.copyOnWrite();
                    final aqyy aqyy4 = (aqyy)builder3.instance;
                    aqyy4.b |= 0x100;
                    aqyy4.k = l;
                    hfl4.aw = (aqyy)builder3.build();
                    final hfl hfl5 = (hfl)o2.a;
                    final hfd ae2 = hfl5.aE;
                    Uri ao;
                    if (l) {
                        ao = uri;
                    }
                    else {
                        ao = hfl5.ao;
                    }
                    final TranscodeOptions g = hfl5.aK.g();
                    final aqyy aw2 = ((hfl)o2.a).aw;
                    aw2.getClass();
                    final hfc hfc = (hfc)ae2;
                    hfc.k = an;
                    hfc.l = ao;
                    hfc.m = m;
                    hfc.n = aw2;
                    hfc.h(b2, (apit)null, (Integer)null, 9, g);
                }
            }
        }
        else {
            if (view == this.d) {
                ((hfl)o.a).aM();
                return;
            }
            if (view == this.i) {
                ((hfl)o.a).aB.k();
                final hfl hfl6 = (hfl)o.a;
                final hfn au2 = hfl6.au;
                if (au2 != null) {
                    au2.b(hfl6.aB.l());
                }
            }
            else if (view == this.h) {
                final hfl hfl7 = (hfl)o.a;
                final EditableVideo ar3 = hfl7.ar;
                if (ar3 != null) {
                    final long am = hfl7.am;
                    long am2 = hfl.a;
                    if (am == am2) {
                        am2 = hfl.b;
                    }
                    hfl7.am = am2;
                    final long n2 = ar3.n();
                    final hfl hfl8 = (hfl)o.a;
                    ar3.D(Math.min(n2 + hfl8.am, hfl8.ar.l()));
                    final hfl hfl9 = (hfl)o.a;
                    hfl9.ar.a.a(hfl9.am);
                    ((hfl)o.a).aQ();
                    final hfl hfl10 = (hfl)o.a;
                    final hfn au3 = hfl10.au;
                    if (au3 != null) {
                        au3.a(hfl10.am);
                    }
                    final hfl hfl11 = (hfl)o.a;
                    final hfs d4 = hfl11.d;
                    if (d4 != null) {
                        d4.b(hfl11.am);
                        d4.d(d4.l);
                        d4.c();
                    }
                    final ShortsVideoTrimView2 c2 = ((hfl)o.a).c;
                    if (c2 != null) {
                        final EditableVideo w = c2.w;
                        if (w != null) {
                            c2.J(ShortsVideoTrimView2.s(w, c2.F));
                            c2.M();
                        }
                    }
                }
            }
        }
    }
}
