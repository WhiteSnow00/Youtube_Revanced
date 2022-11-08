import android.app.Activity;
import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.content.DialogInterface;
import android.view.Window;
import android.app.Dialog;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcj extends hcv
{
    public boolean ae;
    public View af;
    public boolean ag;
    public boolean ah;
    public zhb ai;
    public auip aj;
    public qpt ak;
    private boolean al;
    private FrameLayout am;
    
    public hcj() {
        this.ae = false;
        this.al = false;
        this.ag = true;
        this.ah = true;
    }
    
    private final void aN() {
        final bu od = ((br)this).od();
        if (od != null) {
            ((Activity)od).getWindow().clearFlags(128);
        }
    }
    
    private final void aO() {
        final bu od = ((br)this).od();
        if (od != null) {
            ((Activity)od).getWindow().addFlags(128);
        }
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131624965, viewGroup, false);
        this.am = (FrameLayout)inflate.findViewById(2131430225);
        this.al = this.aj.bz();
        final View viewById = inflate.findViewById(2131430224);
        if (this.al) {
            viewById.setVisibility(0);
            viewById.setOnClickListener((View$OnClickListener)new gxu(this, 11));
        }
        else {
            viewById.setVisibility(8);
        }
        final View viewById2 = inflate.findViewById(2131430226);
        if (this.ag) {
            viewById2.setOnClickListener((View$OnClickListener)new gxu(this, 12));
        }
        else {
            viewById2.setVisibility(8);
        }
        final View viewById3 = inflate.findViewById(2131431278);
        if (this.ah) {
            viewById3.setVisibility(0);
        }
        else {
            viewById3.setVisibility(8);
        }
        final acqu g = this.ai.g((TextView)inflate.findViewById(2131430227));
        tmy.cg(g, ((br)this).nT().getString(2132017900), false, 36);
        ((acqt)g).c = new ezi(this, 9);
        this.ae = true;
        if (this.af != null) {
            this.aK();
        }
        this.aO();
        return inflate;
    }
    
    public final void Y() {
        super.Y();
        final qpt ak = this.ak;
        if (ak != null) {
            ((hcu)ak.a).q();
        }
        this.aN();
    }
    
    final void aK() {
        this.am.removeAllViews();
        if (this.af.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.af.getParent()).removeView(this.af);
        }
        if (this.af.getParent() == null) {
            this.am.addView(this.af);
        }
    }
    
    public final void aa() {
        super.aa();
        final qpt ak = this.ak;
        if (ak != null) {
            ((hcu)ak.a).r();
        }
        this.aO();
    }
    
    public final void no() {
        super.no();
        final Dialog d = ((bi)this).d;
        if (d != null) {
            if (d.getWindow() != null) {
                if (this.al) {
                    final Window window = d.getWindow();
                    window.getClass();
                    window.setWindowAnimations(2132083220);
                }
            }
        }
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        final qpt ak = this.ak;
        if (ak != null) {
            ((hcu)ak.a).p();
        }
        this.aN();
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        ((bi)this).nc(1, 16974383);
    }
    
    public final Dialog pI(final Bundle bundle) {
        final Dialog pi = super.pI(bundle);
        final Window window = pi.getWindow();
        final Context nt = ((br)this).nT();
        if (window != null && nt != null) {
            final GradientDrawable backgroundDrawable = new GradientDrawable();
            backgroundDrawable.setColor(agx.a(nt, 2131102343));
            window.setBackgroundDrawable((Drawable)backgroundDrawable);
        }
        final qpt ak = this.ak;
        if (ak != null) {
            ((hcu)ak.a).t();
            final hcu hcu = (hcu)ak.a;
            if (hcu.o) {
                final ShortsCreationSelectedTrack a = hcu.c.a();
                if (a != null) {
                    ((hcu)ak.a).s = a.c();
                }
            }
        }
        return pi;
    }
}
