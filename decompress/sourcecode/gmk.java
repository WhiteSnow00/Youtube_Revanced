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

public final class gmk extends gmf
{
    public CoordinatorLayout ae;
    public WebView af;
    public gml ag;
    public gko ah;
    public abno ai;
    public wwv aj;
    public wvu ak;
    public vax al;
    private aioe am;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.ai.a();
        final View inflate = layoutInflater.inflate(2131625814, viewGroup, false);
        final CoordinatorLayout ae = (CoordinatorLayout)inflate.findViewById(2131427863);
        this.ae = ae;
        this.af = (WebView)ae.findViewById(2131432471);
        final gml ag = new gml((ViewStub)inflate.findViewById(2131432473), this.ah, this.aj);
        this.ag = ag;
        ag.e.D((Object)new ghh(this, 17));
        ((bi)this).d.setOnShowListener((DialogInterface$OnShowListener)new eyh(this, 4));
        this.aj.l((wxz)new wws(wya.c(116203)));
        return inflate;
    }
    
    public final void W() {
        this.aj.o((wxz)new wws(wya.c(116203)), (alff)null);
        this.al.b((List)((apgo)((agzd)this.am).rr((agyr)UrlEndpointOuterClass.urlEndpoint)).e);
        super.W();
    }
    
    public final void aM(int round) {
        if (round == 3) {
            tmy.aF((View)this.af, tmy.at(this.ae.getRootView().getMeasuredHeight() - this.ag.a.getHeight()), (Class)ViewGroup$LayoutParams.class);
            return;
        }
        if (round == 4) {
            round = Math.round(this.ae.getRootView().getMeasuredHeight() * 0.8f);
            tmy.aF((View)this.af, tmy.at(round - this.ag.a.getHeight()), (Class)ViewGroup$LayoutParams.class);
        }
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.am = (aioe)((ParcelableMessageLite)((br)this).m.getParcelable("navigation_endpoint")).a((MessageLite)aioe.a);
        int n;
        if (this.ah.a() == gkm.a) {
            n = 2132084579;
        }
        else {
            n = 2132084578;
        }
        ((bi)this).nc(0, n);
    }
    
    public final Dialog pI(final Bundle bundle) {
        final gmh gmh = new gmh(this, ((br)this).nT(), ((bi)this).b);
        if (Build$VERSION.SDK_INT >= 27) {
            final Window window = ((Dialog)gmh).getWindow();
            if (window != null) {
                window.getDecorView().setSystemUiVisibility(-2147475440);
                window.clearFlags(2);
                final DisplayMetrics displayMetrics = new DisplayMetrics();
                window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                final ColorDrawable colorDrawable = new ColorDrawable();
                colorDrawable.setColor(window.getDecorView().getResources().getColor(2131102343));
                final LayerDrawable backgroundDrawable = new LayerDrawable(new Drawable[] { (Drawable)colorDrawable, (Drawable)new ColorDrawable() });
                backgroundDrawable.setLayerInsetTop(1, displayMetrics.heightPixels);
                window.setBackgroundDrawable((Drawable)backgroundDrawable);
            }
        }
        return (Dialog)gmh;
    }
}
