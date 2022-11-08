import android.net.Uri;
import android.view.View$OnClickListener;
import android.view.View;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.app.Activity;
import android.content.Context;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import com.google.android.libraries.youtube.edit.camera.ProgressBarData;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdq implements hem
{
    CreationButtonView a;
    YouTubeButton b;
    TextView c;
    MultiSegmentCameraProgressIndicator d;
    final ProgressBarData e;
    final uir f;
    final avt g;
    private final heo h;
    private final ShortsVideoTrimView2 i;
    private final rbi j;
    private final Context k;
    private final urf l;
    private final wwv m;
    private uac n;
    private hel o;
    private final boolean p;
    private final boolean q;
    private final int r;
    private final int s;
    private auip t;
    
    public hdq(final Activity k, final wwv m, final avt g, final hdp hdp, final byte[] array, final byte[] array2, final byte[] array3) {
        this.k = (Context)k;
        this.m = m;
        this.g = g;
        this.h = hdp.a;
        this.i = hdp.b;
        this.j = hdp.c;
        this.l = hdp.d;
        this.p = hdp.e;
        final int f = hdp.f;
        this.q = (f > 0);
        this.r = hdp.g;
        this.f = hdp.h;
        this.s = hdp.i;
        final uir e = ProgressBarData.e();
        e.d(f);
        e.c(2131102065);
        e.e(2131102069);
        this.e = e.a();
    }
    
    private final void g() {
        if (this.f == null) {
            return;
        }
        final uac n = this.n;
        final ProgressBarData[] array = null;
        EditableVideo b;
        if (n == null) {
            b = null;
        }
        else {
            b = n.b;
        }
        int n2;
        if (b == null) {
            n2 = 0;
        }
        else {
            n2 = (int)(b.l() - b.n());
        }
        ProgressBarData a;
        if (n2 > 0) {
            final uir f = this.f;
            f.d((int)afqo.c((long)n2).toMillis());
            a = f.a();
        }
        else {
            final zjo a2 = zjo.a;
            final zjn l = zjn.l;
            final StringBuilder sb = new StringBuilder("[ShortsCreation][Android][Trim]Trim duration is not positive: ");
            sb.append(n2);
            zjp.b(a2, l, sb.toString());
            a = null;
        }
        final int q = this.q ? 1 : 0;
        ProgressBarData[] array2;
        if (q != 0 && a != null) {
            array2 = new ProgressBarData[] { this.e, a };
        }
        else if (q != 0) {
            array2 = new ProgressBarData[] { this.e };
        }
        else {
            array2 = array;
            if (a != null) {
                array2 = new ProgressBarData[] { a };
            }
        }
        final MultiSegmentCameraProgressIndicator d = this.d;
        if (d != null) {
            d.e(array2, q);
        }
    }
    
    public final void a(final View view) {
        view.getClass();
        ((YouTubeButton)view.findViewById(2131431522)).setVisibility(8);
        view.findViewById(2131432197).setVisibility(0);
        (this.b = (YouTubeButton)view.findViewById(2131431520)).setEnabled(true);
        this.b.setVisibility(0);
        this.b.setOnClickListener((View$OnClickListener)this);
        this.b.setText((CharSequence)this.k.getResources().getString(2132019800));
        this.b.setContentDescription((CharSequence)this.k.getResources().getString(2132019694));
        (this.a = (CreationButtonView)view.findViewById(2131431517)).setOnClickListener((View$OnClickListener)this);
        (this.c = (TextView)view.findViewById(2131432196)).setVisibility(0);
        this.c.setText((CharSequence)this.k.getResources().getString(2132019799));
        final MultiSegmentCameraProgressIndicator d = (MultiSegmentCameraProgressIndicator)view.findViewById(2131430658);
        this.d = d;
        if (this.f != null) {
            d.setVisibility(0);
            this.d.c(this.r);
        }
    }
    
    public final void b() {
        final YouTubeButton b = this.b;
        if (b != null) {
            b.setEnabled(true);
        }
    }
    
    public final void c() {
        final YouTubeButton b = this.b;
        if (b != null) {
            b.setEnabled(false);
        }
    }
    
    public final void d() {
        this.g();
    }
    
    public final void e(final Uri uri) {
        final YouTubeButton b = this.b;
        b.getClass();
        b.setEnabled(true);
        final wwv m = this.m;
        final wyb c = wya.c(97092);
        final ShortsVideoTrimView2 i = this.i;
        hgd.q(m, c, i.n, afqo.c(i.h()).toMillis());
        this.h.h();
        final uac n = this.n;
        n.getClass();
        final EditableVideo b2 = n.b;
        if (b2 == null) {
            final urf l = this.l;
            l.getClass();
            final EditableVideo d = l.d;
            if (n != null) {
                d.getClass();
                n.b = d;
            }
        }
        else {
            n.getClass();
            this.i.C(b2.n());
            this.i.D(b2.l());
            this.j.n();
        }
        this.g();
        this.g.S(wya.c(110247)).h();
        this.g.S(wya.c(140681)).h();
        final urf j = this.l;
        j.getClass();
        final EditableVideo d2 = j.d;
        final auip t = this.t;
        if (t != null) {
            d2.getClass();
            t.bl(d2, this.p);
        }
    }
    
    public final void f() {
        this.o = null;
    }
    
    public final void h(final hel o) {
        this.o = o;
    }
    
    public final void i(final uac n) {
        this.n = n;
    }
    
    public final void j(final apmt apmt) {
        final uac n = this.n;
        n.getClass();
        final EditableVideo b = n.b;
        if (b != null && this.t != null) {
            hgd.E(apmt, this.s, b, this.g, this.i, 140681);
            return;
        }
        zjp.b(zjo.a, zjn.l, "[ShortsCreation][Android][Trim]Unable to log trim client data in Segment Import.");
    }
    
    public final void m(final auip t) {
        this.t = t;
    }
    
    public final void onClick(final View view) {
        if (view == this.b) {
            final uac n = this.n;
            EditableVideo b;
            if (n == null) {
                b = null;
            }
            else {
                b = n.b;
            }
            final hel o = this.o;
            if (o != null && b != null) {
                o.b(b);
            }
        }
        else if (view == this.a) {
            final hel o2 = this.o;
            if (o2 != null) {
                o2.a();
            }
        }
    }
}
