import android.view.ActionMode$Callback;
import android.view.WindowManager$LayoutParams;
import android.view.SearchEvent;
import java.util.List;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public class hz implements Window$Callback
{
    public final Window$Callback e;
    
    public hz(final Window$Callback e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }
    
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        return this.e.dispatchGenericMotionEvent(motionEvent);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.e.dispatchKeyEvent(keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        return this.e.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return this.e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return this.e.dispatchTouchEvent(motionEvent);
    }
    
    public final boolean dispatchTrackballEvent(final MotionEvent motionEvent) {
        return this.e.dispatchTrackballEvent(motionEvent);
    }
    
    public final void onActionModeFinished(final ActionMode actionMode) {
        this.e.onActionModeFinished(actionMode);
    }
    
    public final void onActionModeStarted(final ActionMode actionMode) {
        this.e.onActionModeStarted(actionMode);
    }
    
    public final void onAttachedToWindow() {
        this.e.onAttachedToWindow();
    }
    
    public void onContentChanged() {
        this.e.onContentChanged();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        return this.e.onCreatePanelMenu(n, menu);
    }
    
    public View onCreatePanelView(final int n) {
        return this.e.onCreatePanelView(n);
    }
    
    public final void onDetachedFromWindow() {
        this.e.onDetachedFromWindow();
    }
    
    public final boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return this.e.onMenuItemSelected(n, menuItem);
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return this.e.onMenuOpened(n, menu);
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        this.e.onPanelClosed(n, menu);
    }
    
    public final void onPointerCaptureChanged(final boolean b) {
        hy.kE(this.e, b);
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        return this.e.onPreparePanel(n, view, menu);
    }
    
    public void onProvideKeyboardShortcuts(final List list, final Menu menu, final int n) {
        hx.a(this.e, list, menu, n);
    }
    
    public final boolean onSearchRequested() {
        return this.e.onSearchRequested();
    }
    
    public final boolean onSearchRequested(final SearchEvent searchEvent) {
        return hw.b(this.e, searchEvent);
    }
    
    public final void onWindowAttributesChanged(final WindowManager$LayoutParams windowManager$LayoutParams) {
        this.e.onWindowAttributesChanged(windowManager$LayoutParams);
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        this.e.onWindowFocusChanged(b);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
        return this.e.onWindowStartingActionMode(actionMode$Callback);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback, final int n) {
        return hw.a(this.e, actionMode$Callback, n);
    }
}
