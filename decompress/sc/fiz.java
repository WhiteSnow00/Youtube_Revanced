import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import android.app.Dialog;
import android.graphics.Point;
import android.view.WindowManager;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.common.dialog.ProgressBarDialogFragmentController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fiz extends fiy
{
    public int ae;
    public int af;
    public ProgressBarDialogFragmentController ag;
    private double ah;
    private double ai;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131624767, viewGroup, false);
        inflate.post((Runnable)new coh(this, inflate, 20));
        return inflate;
    }
    
    public final void aM() {
        if (!((br)this).ar()) {
            return;
        }
        final bu od = ((br)this).od();
        final Dialog d = ((bi)this).d;
        Window window;
        if (d != null) {
            window = d.getWindow();
        }
        else {
            window = null;
        }
        if (od != null && d != null) {
            if (window != null) {
                final WindowManager windowManager = (WindowManager)od.getSystemService("window");
                final Point point = new Point();
                windowManager.getDefaultDisplay().getSize(point);
                window.setGravity(8388691);
                final WindowManager$LayoutParams attributes = window.getAttributes();
                final double n = point.y;
                final double ah = this.ah;
                Double.isNaN(n);
                attributes.y = (int)(n * ah) - this.af / 2;
                final double n2 = point.x;
                final double ai = this.ai;
                Double.isNaN(n2);
                attributes.x = (int)(n2 * ai) - this.ae / 2;
                window.setAttributes(attributes);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.aM();
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        final ProgressBarDialogFragmentController ag = this.ag;
        if (ag != null) {
            ag.m();
        }
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        m = ((br)this).m;
        m.getClass();
        this.ah = m.getDouble("progressbar_height", 0.5);
        this.ai = m.getDouble("progressbar_width", 0.5);
        ((bi)this).nc(1, 0);
    }
    
    public final Dialog pN(final Bundle bundle) {
        final Dialog pn = super.pN(bundle);
        pn.setCanceledOnTouchOutside(false);
        final Window window = pn.getWindow();
        if (window == null) {
            return pn;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(17170445);
        pn.setOnKeyListener((DialogInterface$OnKeyListener)new gqq(this, 1));
        return pn;
    }
}
