import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hle extends hkv
{
    public hld ae;
    public CoordinatorLayout af;
    public hqa ag;
    public gko ah;
    private int ai;
    
    public hle() {
        this.ai = 0;
    }
    
    public static hle aM(final int n) {
        final hle hle = new hle();
        final Bundle bundle = new Bundle();
        bundle.putInt("COMMENT_HEIGHT_KEY", n);
        ((br)hle).ag(bundle);
        return hle;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.ai = this.ag.b();
        ((bi)this).d.setOnShowListener((DialogInterface$OnShowListener)new eyh(this, 6));
        return (View)this.af;
    }
    
    public final void aN(final ct ct, final CoordinatorLayout af, final String s) {
        af.getClass();
        this.af = af;
        ct.s((br)this, s);
        ct.d();
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final CoordinatorLayout af = this.af;
        if (af != null && af.getParent() != null) {
            ((ViewGroup)this.af.getParent()).removeView((View)this.af);
            this.af = null;
        }
        this.ag.c(this.ai);
        this.ai = 0;
        final hld ae = this.ae;
        if (ae != null) {
            ae.a();
        }
        super.onDismiss(dialogInterface);
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        int n;
        if (this.ah.a() == gkm.a) {
            n = 2132083465;
        }
        else {
            n = 2132083464;
        }
        ((bi)this).nc(0, n);
    }
}
