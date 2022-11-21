// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.view.KeyEvent$DispatcherState;
import android.view.KeyEvent;
import android.graphics.Rect;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;

public class SearchView$SearchAutoComplete extends ka
{
    public SearchView a;
    public boolean b;
    final Runnable c;
    private int d;
    
    public SearchView$SearchAutoComplete(final Context context) {
        this(context, null);
    }
    
    public SearchView$SearchAutoComplete(final Context context, final AttributeSet set) {
        this(context, set, 2130968761);
    }
    
    public SearchView$SearchAutoComplete(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = (Runnable)new pg(this, 1);
        this.d = this.getThreshold();
    }
    
    final void a() {
        Object c;
        if (Build$VERSION.SDK_INT >= 29) {
            ox.b(this, 1);
            if (this.enoughToFilter()) {
                this.showDropDown();
            }
            return;
        }
        else {
            final pb pre_API_29_HIDDEN_METHOD_INVOKER = SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER;
            pb.a();
            c = pre_API_29_HIDDEN_METHOD_INVOKER.c;
            if (c == null) {
                return;
            }
        }
        try {
            ((Method)c).invoke(this, true);
        }
        catch (final Exception ex) {}
    }
    
    final void b(final boolean b) {
        final InputMethodManager inputMethodManager = (InputMethodManager)this.getContext().getSystemService("input_method");
        if (!b) {
            this.b = false;
            this.removeCallbacks(this.c);
            inputMethodManager.hideSoftInputFromWindow(this.getWindowToken(), 0);
            return;
        }
        if (inputMethodManager.isActive((View)this)) {
            this.b = false;
            this.removeCallbacks(this.c);
            inputMethodManager.showSoftInput((View)this, 0);
            return;
        }
        this.b = true;
    }
    
    public final boolean enoughToFilter() {
        return this.d <= 0 || super.enoughToFilter();
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.b) {
            this.removeCallbacks(this.c);
            this.post(this.c);
        }
        return onCreateInputConnection;
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        final Configuration configuration = this.getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        int n;
        if (screenWidthDp >= 960 && screenHeightDp >= 720 && configuration.orientation == 2) {
            n = 256;
        }
        else if (screenWidthDp < 600) {
            n = 160;
        }
        else {
            n = 192;
        }
        this.setMinWidth((int)TypedValue.applyDimension(1, (float)n, displayMetrics));
    }
    
    protected final void onFocusChanged(final boolean b, final int n, final Rect rect) {
        super.onFocusChanged(b, n, rect);
        this.a.onTextFocusChanged();
    }
    
    public final boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
        int n2 = n;
        if (n == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final KeyEvent$DispatcherState keyDispatcherState = this.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, (Object)this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                final KeyEvent$DispatcherState keyDispatcherState2 = this.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking()) {
                    if (!keyEvent.isCanceled()) {
                        this.a.clearFocus();
                        this.b(false);
                        return true;
                    }
                }
            }
            n2 = 4;
        }
        return super.onKeyPreIme(n2, keyEvent);
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (b && this.a.hasFocus() && this.getVisibility() == 0) {
            this.b = true;
            if (SearchView.isLandscapeMode(this.getContext())) {
                this.a();
            }
        }
    }
    
    public final void performCompletion() {
    }
    
    protected final void replaceText(final CharSequence charSequence) {
    }
    
    public final void setThreshold(final int n) {
        super.setThreshold(n);
        this.d = n;
    }
}
