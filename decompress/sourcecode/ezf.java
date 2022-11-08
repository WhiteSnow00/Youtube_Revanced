import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.text.TextUtils;
import java.util.WeakHashMap;
import com.google.protos.youtube.api.innertube.ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import android.graphics.drawable.Drawable;
import android.view.ViewStub;
import android.util.DisplayMetrics;
import android.support.constraint.ConstraintLayout;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.content.res.Resources;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezf extends acja
{
    private final acek A;
    private final LinearLayout B;
    private ezd C;
    private ezd D;
    private ezd E;
    private ezd F;
    private ezd G;
    private final TextView H;
    private acqu I;
    private tqq J;
    private final TextView K;
    private acqu L;
    private tqq M;
    private View N;
    private final hdv O;
    private final avt P;
    private final fzo Q;
    public final Activity a;
    public final vax b;
    public final Resources c;
    public final View d;
    public final TextView e;
    public final ImageView f;
    public final View g;
    public final fwu h;
    public final acts i;
    public final fvf j;
    public final View k;
    public eya l;
    public boolean m;
    public View n;
    public final zhb o;
    public final hyc p;
    public final hyc q;
    public final hyc r;
    private final aceo s;
    private final View t;
    private final View u;
    private final ImageView v;
    private final View x;
    private final sgm y;
    private final acek z;
    
    public ezf(final Activity a, final aceo s, final vax b, final sgm y, final fwu h, final fvf j, final hyc q, final hyc p20, final hyc r, final avt p21, final fzo q2, final hdv o, final acts i, final zhb o2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.m = false;
        a.getClass();
        this.a = a;
        this.c = a.getResources();
        s.getClass();
        this.s = s;
        this.b = b;
        y.getClass();
        this.y = y;
        h.getClass();
        this.h = h;
        this.Q = q2;
        this.O = o;
        this.i = i;
        this.r = r;
        j.getClass();
        this.j = j;
        this.p = p20;
        this.q = q;
        this.P = p21;
        this.o = o2;
        final View inflate = LayoutInflater.from((Context)a).inflate(2131624147, (ViewGroup)null);
        this.d = inflate;
        this.k = inflate.findViewById(2131428114);
        this.x = inflate.findViewById(2131428087);
        this.v = (ImageView)inflate.findViewById(2131428086);
        this.u = inflate.findViewById(2131428096);
        this.f = (ImageView)inflate.findViewById(2131428094);
        (this.e = (TextView)inflate.findViewById(2131428109)).setOnClickListener((View$OnClickListener)new jl(this, 17));
        this.t = inflate.findViewById(2131428633);
        this.g = inflate.findViewById(2131431380);
        final acej b2 = s.b().b();
        b2.c = (acem)new eze(this);
        this.z = b2.a();
        final acej b3 = s.b().b();
        b3.b(2131232282);
        this.A = b3.a();
        this.B = (LinearLayout)inflate.findViewById(2131429575);
        final ConstraintLayout constraintLayout = (ConstraintLayout)inflate.findViewById(2131428137);
        this.H = (TextView)constraintLayout.findViewById(2131428787);
        this.K = (TextView)constraintLayout.findViewById(2131429724);
    }
    
    private final int j(final TextView textView) {
        final DisplayMetrics displayMetrics = this.c.getDisplayMetrics();
        final int minHeight = textView.getMinHeight();
        final int az = tmy.aZ(displayMetrics, 48);
        if (minHeight < az) {
            final double n = az - minHeight;
            Double.isNaN(n);
            return (int)Math.ceil(n * 0.5);
        }
        return 0;
    }
    
    private final ezd l() {
        if (this.C == null) {
            final ViewStub viewStub = (ViewStub)this.d.findViewById(2131428124);
            if (viewStub == null) {
                final ezd ezd = new ezd(this, this.d);
                this.C = ezd;
                this.E = ezd;
            }
            else {
                viewStub.setLayoutResource(2131624148);
                this.C = new ezd(this, viewStub.inflate());
            }
        }
        return this.C;
    }
    
    private final ezd m() {
        if (this.E == null) {
            final ViewStub viewStub = (ViewStub)this.d.findViewById(2131428126);
            if (viewStub == null) {
                final ezd ezd = new ezd(this, this.d);
                this.E = ezd;
                this.C = ezd;
            }
            else {
                viewStub.setLayoutResource(2131624150);
                this.E = new ezd(this, viewStub.inflate());
            }
        }
        return this.E;
    }
    
    public final View a() {
        return this.d;
    }
    
    public final void c(final acir acir) {
        final ezd g = this.G;
        if (g != null) {
            g.f.f();
        }
        final View n = this.n;
        if (n != null) {
            n.setOnClickListener((View$OnClickListener)null);
            this.n.setClickable(false);
            this.n.setContentDescription((CharSequence)null);
        }
        this.Q.T(this.d);
    }
    
    public final fwd f() {
        final ezd g = this.G;
        if (g != null) {
            return g.g;
        }
        return null;
    }
    
    public final void g() {
        this.f.setBackgroundResource(2131231491);
        this.f.setImageDrawable((Drawable)null);
    }
    
    public final void h(final ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer, final wwv wwv) {
        final View viewById = this.d.findViewById(2131428089);
        if (viewById == null) {
            return;
        }
        int ci;
        if ((ci = aqql.ci(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.e)) == 0) {
            ci = 1;
        }
        Label_0128: {
            if (ci != 3 && (channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.b & 0x2) != 0x0) {
                if (ci != 2) {
                    final fzo q = this.Q;
                    aioe aioe;
                    if ((aioe = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d) == null) {
                        aioe = aioe.a;
                    }
                    if (!q.V(aioe)) {
                        tmy.v(viewById, true);
                        viewById.setEnabled(true);
                        break Label_0128;
                    }
                }
                tmy.v(viewById, true);
                viewById.setEnabled(false);
            }
            else {
                tmy.v(viewById, false);
            }
        }
        aioe aioe2;
        if ((aioe2 = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d) == null) {
            aioe2 = aioe.a;
        }
        if (((agzd)aioe2).rs((agyr)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand)) {
            tcp.i(this.O.c(), (tco)new fdd(this, viewById, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer, wwv, 1));
        }
    }
}
