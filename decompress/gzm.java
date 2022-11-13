import android.content.res.Resources;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.widget.SeekBar;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import android.content.Context;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class gzm extends View$AccessibilityDelegate
{
    private final Context a;
    final TextTrackView b;
    private final int c;
    
    public gzm(final TextTrackView b, final Context a, final int c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    protected abstract long a();
    
    protected abstract void b(final long p0);
    
    protected abstract void c(final long p0);
    
    protected final String d(final long n) {
        return vdh.aL(this.a, n, this.b.d());
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setContentDescription((CharSequence)this.b.getResources().getString(2132017156, new Object[] { accessibilityNodeInfo.getContentDescription(), this.d(this.a()) }));
        accessibilityNodeInfo.setClassName((CharSequence)SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_BACKWARD);
        }
    }
    
    public final boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        final long n2 = this.b.d() / 20L;
        if (n != 4096) {
            if (n != 8192) {
                return super.performAccessibilityAction(view, n, bundle);
            }
            this.b(this.a() - n2);
        }
        else {
            this.c(this.a() + n2);
        }
        final TextTrackView b = this.b;
        final qlj e = b.e;
        final Resources resources = b.getResources();
        String s;
        if (this.b.b != null) {
            s = this.a.getResources().getString(this.c, new Object[] { this.b.b.a });
        }
        else {
            s = this.a.getResources().getString(this.c, new Object[] { "" });
        }
        e.b(view, (CharSequence)resources.getString(2132017155, new Object[] { s, this.d(this.a()) }));
        return true;
    }
}
