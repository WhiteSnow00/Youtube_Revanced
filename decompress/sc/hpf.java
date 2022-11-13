import android.view.MotionEvent;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelWatchPagerViewPager;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpf extends GestureDetector$SimpleOnGestureListener
{
    final ReelWatchPagerViewPager a;
    
    public hpf(final ReelWatchPagerViewPager a) {
        this.a = a;
    }
    
    public final void onLongPress(final MotionEvent motionEvent) {
        this.a.i = true;
    }
}
