import android.view.View$OnClickListener;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.graphics.drawable.GradientDrawable;
import android.app.Activity;
import java.util.concurrent.Semaphore;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelObscuredPlaybackSuspender;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.apps.youtube.app.common.ui.scrollselection.DefaultScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneFragmentOrientationLocker;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esa implements asjg
{
    public final Object a;
    private final int b;
    
    public esa(final asiq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final asiu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final aslr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final blu a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final ActiveStateLifecycleController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final PaneFragmentOrientationLocker a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final DefaultScrollSelectionController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final ReelWatchActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final ReelObscuredPlaybackSuspender a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final YouTubeControlsOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final eg a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final ert a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final esm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final ewp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final exr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final for a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final iav a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final tek a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final uxa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esa(final vlf a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        switch (this.b) {
            default: {
                ((YouTubeControlsOverlay)this.a).b.d(iux.a);
                return;
            }
            case 19: {
                ((Semaphore)this.a).release();
                return;
            }
            case 18: {
                ((asiu)this.a).dispose();
                return;
            }
            case 17: {
                final iav iav = (iav)this.a;
                iav.b.b();
                iav.c();
                return;
            }
            case 16: {
                ((aslr)this.a).a();
                return;
            }
            case 15: {
                ((ReelObscuredPlaybackSuspender)this.a).g();
                return;
            }
            case 14: {
                ((Activity)this.a).finishAfterTransition();
                return;
            }
            case 13: {
                ((vlf)this.a).a = true;
                return;
            }
            case 12: {
                ((DefaultScrollSelectionController)this.a).q((Integer)null);
                return;
            }
            case 11: {
                ((PaneFragmentOrientationLocker)this.a).j();
                return;
            }
            case 10: {
                ((ActiveStateLifecycleController)this.a).b.clear();
                return;
            }
            case 9: {
                final eg eg = (eg)this.a;
                final int[] colors = (int[])eg.b;
                colors[1] = (colors[0] = 0);
                ((GradientDrawable)eg.d).setColors(colors);
                return;
            }
            case 8: {
                ((for)this.a).b();
                return;
            }
            case 7: {
                ((uxa)this.a).a();
                return;
            }
            case 6: {
                ((asiq)this.a).dispose();
                return;
            }
            case 5: {
                final blu blu = (blu)this.a;
                final Object e = blu.e;
                final exj exj = (exj)e;
                if (!exj.b) {
                    exj.b = true;
                    exj.a.registerReceiver((BroadcastReceiver)e, new IntentFilter("com.google.android.apps.wellbeing.action.ACTION_WIND_DOWN_STATE_CHANGED"));
                }
                blu.g();
                return;
            }
            case 4: {
                ((exr)this.a).a.setOnClickListener((View$OnClickListener)null);
                return;
            }
            case 3: {
                ((ewp)this.a).j();
                return;
            }
            case 2: {
                ((ewp)this.a).k(1);
                return;
            }
            case 1: {
                ((ert)this.a).b = 1;
                return;
            }
            case 0: {
                ((esm)this.a).a();
            }
        }
    }
}
