import android.view.Window;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.os.Build$VERSION;
import android.app.Dialog;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import android.view.ViewGroup$LayoutParams;
import java.util.List;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import android.content.DialogInterface$OnShowListener;
import android.view.ViewStub;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmr extends gmm
{
    public CoordinatorLayout ae;
    public WebView af;
    public gms ag;
    public gkx ah;
    public abpq ai;
    public wyw aj;
    public wxx ak;
    public vcy al;
    private aiqj am;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.ai.a();
        final View inflate = layoutInflater.inflate(2131625818, viewGroup, false);
        final CoordinatorLayout ae = (CoordinatorLayout)inflate.findViewById(2131427863);
        this.ae = ae;
        this.af = (WebView)ae.findViewById(2131432474);
        final gms ag = new gms((ViewStub)inflate.findViewById(2131432476), this.ah, this.aj);
        this.ag = ag;
        ag.e.H((Object)new ght(this, 16));
        ((bi)this).d.setOnShowListener((DialogInterface$OnShowListener)new eyk(this, 4));
        this.aj.l((wzz)new wyt(xaa.c(116203)));
        return inflate;
    }
    
    public final void W() {
        this.aj.o((wzz)new wyt(xaa.c(116203)), (alhi)null);
        this.al.b((List)((apis)((ahbc)this.am).rx((ahaq)UrlEndpointOuterClass.urlEndpoint)).e);
        super.W();
    }
    
    public final void aM(int round) {
        if (round == 3) {
            tpe.aF((View)this.af, tpe.at(this.ae.getRootView().getMeasuredHeight() - this.ag.a.getHeight()), (Class)ViewGroup$LayoutParams.class);
            return;
        }
        if (round == 4) {
            round = Math.round(this.ae.getRootView().getMeasuredHeight() * 0.8f);
            tpe.aF((View)this.af, tpe.at(round - this.ag.a.getHeight()), (Class)ViewGroup$LayoutParams.class);
        }
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.am = (aiqj)((ParcelableMessageLite)((br)this).m.getParcelable("navigation_endpoint")).a((MessageLite)aiqj.a);
        int n;
        if (this.ah.a() == gkv.a) {
            n = 2132084580;
        }
        else {
            n = 2132084579;
        }
        ((bi)this).nc(0, n);
    }
    
    public final Dialog pN(final Bundle bundle) {
        final gmo gmo = new gmo(this, ((br)this).nT(), ((bi)this).b);
        if (Build$VERSION.SDK_INT >= 27) {
            final Window window = ((Dialog)gmo).getWindow();
            if (window != null) {
                window.getDecorView().setSystemUiVisibility(-2147475440);
                window.clearFlags(2);
                final DisplayMetrics displayMetrics = new DisplayMetrics();
                window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                final ColorDrawable colorDrawable = new ColorDrawable();
                colorDrawable.setColor(window.getDecorView().getResources().getColor(2131102371));
                final LayerDrawable backgroundDrawable = new LayerDrawable(new Drawable[] { (Drawable)colorDrawable, (Drawable)new ColorDrawable() });
                backgroundDrawable.setLayerInsetTop(1, displayMetrics.heightPixels);
                window.setBackgroundDrawable((Drawable)backgroundDrawable);
            }
        }
        return (Dialog)gmo;
    }
}
