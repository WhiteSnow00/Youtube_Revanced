import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.util.LruCache;
import java.util.Map;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.content.Context;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knk extends acja implements acie, abyw
{
    private final bx A;
    private final aeby B;
    private final adcr C;
    public final ImageView a;
    public amqf b;
    private final Context c;
    private final TextView d;
    private final TextView e;
    private final ImageView f;
    private final ImageView g;
    private final FrameLayout h;
    private final aceo i;
    private final FixedAspectRatioFrameLayout j;
    private final acnj k;
    private final acio l;
    private final vax m;
    private final acih n;
    private final atjj o;
    private aioe p;
    private final ImageView q;
    private final FrameLayout r;
    private final ImageView s;
    private final vbq t;
    private final int u;
    private ftp v;
    private final int x;
    private final uyf y;
    private final alm z;
    
    public knk(final Context c, final aceo i, final vax m, final giz l, final acnj k, final atjj o, final alm z, final adcr c2, final vbq t, final bx a, final aeby b, final uyf y, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.c = c;
        this.i = i;
        this.l = (acio)l;
        this.k = k;
        this.m = m;
        this.o = o;
        this.z = z;
        this.C = c2;
        this.t = t;
        this.A = a;
        this.B = b;
        this.y = y;
        final LinearLayout linearLayout = (LinearLayout)View.inflate(c, 2131624920, (ViewGroup)null);
        this.d = (TextView)linearLayout.findViewById(2131431416);
        this.e = (TextView)linearLayout.findViewById(2131431379);
        this.f = (ImageView)linearLayout.findViewById(2131430097);
        this.g = (ImageView)linearLayout.findViewById(2131430101);
        this.j = (FixedAspectRatioFrameLayout)linearLayout.findViewById(2131430102);
        this.h = (FrameLayout)linearLayout.findViewById(2131427916);
        this.r = (FrameLayout)linearLayout.findViewById(2131428449);
        this.q = (ImageView)linearLayout.findViewById(2131428448);
        (this.s = (ImageView)linearLayout.findViewById(2131428234)).setOnClickListener((View$OnClickListener)new kdw(this, m, 18));
        this.a = (ImageView)linearLayout.findViewById(2131430050);
        this.u = tmy.aZ(c.getResources().getDisplayMetrics(), 720);
        this.x = c.getResources().getDimensionPixelSize(2131168311);
        l.c((View)linearLayout);
        this.n = new acih(m, (acio)l, (acie)this);
    }
    
    public final View a() {
        return ((giz)this.l).a;
    }
    
    public final void c(final acir acir) {
        this.n.c();
        this.h.removeAllViews();
        final ftp v = this.v;
        if (v != null) {
            v.c(acir);
        }
        this.B.am((abyw)this);
    }
    
    public final void f() {
        this.a.setVisibility(4);
    }
    
    public final boolean h(final View view) {
        final aioe p = this.p;
        if (p != null) {
            this.m.c(p, (Map)null);
        }
        this.a.setVisibility(4);
        if (this.b != null) {
            final vcb e = ((vbw)this.t.b()).e();
            final String c = icm.c(this.b.m);
            final icl icl = new icl();
            icl.c(c);
            icl.d();
            ((vdv)e).d((vdm)icl.b());
            ((vdv)e).b();
        }
        return false;
    }
    
    public final void nu() {
        this.k.h();
    }
}
