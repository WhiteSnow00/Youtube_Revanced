import android.support.v7.widget.LinearLayoutManager;
import android.text.Spanned;
import com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.libraries.youtube.rendering.ui.OverScrollLinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.LinearLayout;
import android.view.View$OnLayoutChangeListener;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.concurrent.Executor;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hlk implements acpf, hld, hlr, acvn
{
    public final LoadingFrameLayout a;
    public final gkh b;
    public final wwu c;
    public final kww d;
    public final tny e;
    public final acor f;
    public smh g;
    private final CoordinatorLayout h;
    private final vlq i;
    private final Executor j;
    private final hls k;
    private InteractionLoggingScreen l;
    private aioe m;
    
    public hlk(final Context context, final tdz tdz, final wwu c, final tny e, final vlq i, final acno acno, final qbo qbo, final sxv sxv, final aeby aeby, final tdg tdg, final auip auip, final hls k, final Executor j, final arud arud, final asgt asgt, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.c = c;
        this.i = i;
        this.j = j;
        this.k = k;
        this.e = e;
        final hlj hlj = new hlj(this, sxv, i, c.n(), tdg, auip, k, qbo, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        final View inflate = LayoutInflater.from(context).inflate(2131625191, (ViewGroup)null);
        final CoordinatorLayout h = (CoordinatorLayout)inflate.findViewById(2131430841);
        this.h = h;
        k.e = LayoutInflater.from(k.c).inflate(2131625208, (ViewGroup)null, false);
        k.f = (TextView)k.e.findViewById(2131432092);
        k.e.findViewById(2131430905).setOnClickListener((View$OnClickListener)new hht(k, 8));
        k.e.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fta(k, 9));
        k.k = new CoordinatorLayout(k.c);
        final LinearLayout linearLayout = new LinearLayout(k.c);
        linearLayout.setOrientation(1);
        linearLayout.addView(k.e);
        linearLayout.addView((View)h);
        k.k.addView((View)linearLayout);
        k.b.ae = (hld)this;
        k.l = (hlr)this;
        final LoadingFrameLayout a = (LoadingFrameLayout)inflate.findViewById(2131430842);
        (this.a = a).f((acvn)this);
        tmy.aF((View)a, tmy.at(k.i), (Class)ViewGroup$LayoutParams.class);
        tmy.aF((View)a, tmy.aD(k.h), (Class)ViewGroup$LayoutParams.class);
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(2131430843);
        final OverScrollLinearLayoutManager overScrollLinearLayoutManager = new OverScrollLinearLayoutManager((byte[])null);
        ((LinearLayoutManager)overScrollLinearLayoutManager).ac(1);
        recyclerView.af((nw)overScrollLinearLayoutManager);
        final kww d = new kww();
        (this.d = d).A(c.n());
        final acor f = new acor(null, recyclerView, aeby, new acoc(), (vke)i, tdz, (acnq)hlj, e, (wwv)d, (acir)acno.a(), (acpf)this, acot.d, arud, asgt, null, null, null, null);
        this.b = new gkh((StickyHeaderContainer)inflate.findViewById(2131431754), (nq)f.g, (gjw)new hli((achk)f.f));
        this.f = f;
    }
    
    private final void e() {
        this.f.i();
        this.b.e();
        this.a.c();
    }
    
    public final void a() {
        this.e();
        final InteractionLoggingScreen l = this.l;
        if (l != null) {
            this.d.B(l);
        }
    }
    
    public final void b() {
        this.k.a();
    }
    
    public final void c() {
        this.d(this.m, this.g, true);
    }
    
    public final void d(final aioe m, final smh g, final boolean b) {
        this.e();
        this.m = m;
        this.g = g;
        final byte[] v = gkt.V(m);
        final vlo f = this.i.f();
        ((vii)f).k(v);
        ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
        if (m != null) {
            showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand)((agzd)m).rr((agyr)ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand);
        }
        else {
            showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = null;
        }
        if (showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand != null) {
            f.w(showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.c);
            f.y(showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.e);
            final hls k = this.k;
            ajsq ajsq;
            if ((ajsq = showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.d) == null) {
                ajsq = ajsq.a;
            }
            final Spanned b2 = abyh.b(ajsq);
            k.j = (CharSequence)b2;
            final TextView f2 = k.f;
            if (f2 != null) {
                f2.setText((CharSequence)b2);
                final TextView f3 = k.f;
                int visibility;
                if (b2 != null) {
                    visibility = 0;
                }
                else {
                    visibility = 8;
                }
                f3.setVisibility(visibility);
                final String string = k.j.toString();
                final View e = k.e;
                if (e != null) {
                    e.setContentDescription((CharSequence)string);
                }
            }
            final hls i = this.k;
            if (!i.b.ar() && i.d == null && i.k != null) {
                (i.d = i.a.getSupportFragmentManager().i()).x((Runnable)new hcp(i, 18));
                i.b.aN(i.d, i.k, "REEL_COMMENT_REPLIES_VIEW_TAG");
            }
            this.l = this.d.a();
            final kww d = this.d;
            wyb wyb;
            if (m == null) {
                wyb = wya.b(32276);
            }
            else {
                final int h = ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand)((agzd)m).rr((agyr)ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand)).h;
                if (h == 0) {
                    wyb = wya.b(32276);
                }
                else {
                    wyb = wya.b(h);
                }
            }
            d.G(wyb, wxr.b, m);
            this.a.c();
            if (b || showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.f) {
                ((vii)f).s(2);
            }
        }
        else {
            trn.b("ReelCommentRepliesController: cannot load navigation endpoint.");
        }
        tcp.k(this.i.h(f, this.j), (Executor)afsl.a, (tcn)new fcb(this, 20), (tco)new hfi(this, 2));
    }
    
    public final void om() {
    }
    
    public final boolean pN() {
        return false;
    }
}
