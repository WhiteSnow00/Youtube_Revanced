import android.view.KeyEvent;
import android.view.Window;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.content.Context;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.view.View;
import android.app.Activity;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lou extends Dialog
{
    private final Activity a;
    
    public lou(final Activity a, View view, final lot lot, final PlaybackStartDescriptor playbackStartDescriptor, final boolean b, final boolean b2, final boolean b3) {
        int n;
        if (b) {
            if (b2) {
                n = 2132083290;
            }
            else {
                n = 2132083289;
            }
        }
        else if (b3) {
            n = 2132083224;
        }
        else {
            n = 2132083222;
        }
        super((Context)a, n);
        playbackStartDescriptor.getClass();
        this.a = a;
        lot.getClass();
        int n2 = -2;
        if (b) {
            final FrameLayout frameLayout = new FrameLayout(this.getContext());
            frameLayout.setBackgroundResource(17301521);
            frameLayout.addView(view, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -2, 17));
            final Window window = a.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(2131099835);
            }
            view = (View)frameLayout;
        }
        else {
            final Window window2 = a.getWindow();
            if (window2 != null) {
                window2.setNavigationBarColor(0);
            }
            view.setBackgroundColor(-16777216);
        }
        final FrameLayout contentView = new FrameLayout(this.getContext());
        if (!b) {
            n2 = -1;
        }
        contentView.addView(view, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, n2, 17));
        this.setContentView((View)contentView);
        lot.b.m(lot.c, jfi.ah(playbackStartDescriptor), true);
        lot.a.k(playbackStartDescriptor, lot.c);
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return this.a.onKeyDown(n, keyEvent) || super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return this.a.onKeyUp(n, keyEvent) || super.onKeyUp(n, keyEvent);
    }
    
    protected final void onStop() {
        if (!this.a.isFinishing()) {
            this.a.finish();
        }
        super.onStop();
    }
}
