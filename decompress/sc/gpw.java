import java.util.Set;
import java.util.List;
import java.util.Iterator;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.content.Context;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpw extends gpv implements fvs, ggt
{
    public zmf a;
    public acxi b;
    public vcy c;
    public aels d;
    private ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand e;
    
    private static final void q(final View view, final int n) {
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { view.getPaddingBottom(), n - view.getResources().getDimensionPixelSize(2131165550) });
        ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(view, 10));
        ofInt.setDuration(200L);
        ofInt.start();
    }
    
    public final boolean I() {
        return !this.b.e();
    }
    
    public final boolean J() {
        if (this.b.e()) {
            this.b.b();
            return true;
        }
        return false;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        final aiqj aiqj = null;
        ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand e = null;
        Label_0087: {
            try {
                final byte[] byteArray = ((br)this).m.getByteArray("show_webview_dialog_command");
                byteArray.getClass();
                final aiqj aiqj2 = (aiqj)ahbh.parseFrom((ahbh)aiqj.a, (byte[])byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                if (((ahbc)aiqj2).ry((ahaq)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand)) {
                    e = (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand)((ahbc)aiqj2).rx((ahaq)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand);
                    break Label_0087;
                }
            }
            catch (final ahca ahca) {
                ttr.f("WebViewPaneFragment", "Failed to deserialize show command.", (Throwable)ahca);
            }
            e = null;
        }
        e.getClass();
        this.e = e;
        final gad b = ((ggq)this).aw.b();
        b.n((aezf)glc.e);
        this.aw = b.a();
        final ViewGroup viewGroup2 = (ViewGroup)layoutInflater.inflate(2131625821, viewGroup, false);
        q((View)viewGroup2, this.d.b);
        this.d.g((fvs)this);
        final LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout)viewGroup2.findViewById(2131432469);
        final ViewGroup viewGroup3 = (ViewGroup)viewGroup2.findViewById(2131432475);
        final acxi b2 = this.b;
        final bu od = ((br)this).od();
        final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand e2 = this.e;
        final String c = e2.c;
        final boolean d = e2.d;
        final zme c2 = this.a.c();
        final vcy c3 = this.c;
        final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand e3 = this.e;
        aiqj aiqj3 = aiqj;
        if ((e3.b & 0x8) != 0x0 && (aiqj3 = e3.f) == null) {
            aiqj3 = aiqj.a;
        }
        viewGroup3.addView((View)b2.g((Context)od, c, d, c2, c3, loadingFrameLayout, aiqj3, (acxh)new tah(this, 1)));
        return (View)viewGroup2;
    }
    
    public final boolean L(final PaneDescriptor paneDescriptor) {
        ttr.g("Navigate to a pane is not implemented for WebView.");
        return false;
    }
    
    public final boolean N() {
        return this.J();
    }
    
    public final void W() {
        super.W();
        final Iterator<Object> iterator = ((List<Object>)this.e.e).iterator();
        while (iterator.hasNext()) {
            this.c.a((aiqj)iterator.next());
        }
    }
    
    public final void a(final int n) {
        final View o = ((br)this).O;
        if (o != null) {
            q(o, n);
        }
    }
    
    public final CharSequence bb() {
        ajut ajut;
        if ((ajut = this.e.h) == null) {
            ajut = ajut.a;
        }
        return (CharSequence)acak.b(ajut);
    }
    
    public final boolean bq() {
        return this.J();
    }
    
    public final boolean mF() {
        if (!this.I()) {
            while (!this.I()) {
                this.J();
            }
            return true;
        }
        return false;
    }
    
    public final void nm() {
        super.nm();
        ((Set)this.d.c).remove(this);
        final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand e = this.e;
        if (e != null) {
            this.b.d(e.c, this.c, (List)e.g);
        }
    }
    
    public final void r() {
        throw null;
    }
}
