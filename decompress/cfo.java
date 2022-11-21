import android.widget.SeekBar;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.preference.SeekBarPreference;
import android.support.v7.widget.SearchView;
import android.view.View$OnKeyListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfo implements View$OnKeyListener
{
    final Object a;
    private final int b;
    
    public cfo(final SearchView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfo(final SeekBarPreference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfo(final nqn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        final int b = this.b;
        final boolean b2 = false;
        final boolean b3 = false;
        boolean b4 = false;
        if (b == 0) {
            boolean onKeyDown;
            if (keyEvent.getAction() != 0) {
                onKeyDown = b3;
            }
            else {
                final SeekBarPreference seekBarPreference = (SeekBarPreference)this.a;
                if (!seekBarPreference.e) {
                    onKeyDown = b3;
                    if (n == 21) {
                        return onKeyDown;
                    }
                    if (n == 22) {
                        onKeyDown = b3;
                        return onKeyDown;
                    }
                }
                onKeyDown = b3;
                if (n != 23) {
                    if (n == 66) {
                        onKeyDown = b3;
                    }
                    else {
                        final SeekBar d = seekBarPreference.d;
                        if (d == null) {
                            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                            onKeyDown = b3;
                        }
                        else {
                            onKeyDown = d.onKeyDown(n, keyEvent);
                        }
                    }
                }
            }
            return onKeyDown;
        }
        if (b != 1) {
            final Object a = this.a;
            if (keyEvent.getAction() == 0) {
                if (n != 4) {
                    return b4;
                }
                final nqn nqn = (nqn)a;
                if (nqn.d.canGoBack()) {
                    nqn.d.goBack();
                }
                else {
                    nqn.a();
                }
            }
            b4 = true;
            return b4;
        }
        final SearchView searchView = (SearchView)this.a;
        boolean onSuggestionsKey;
        if (searchView.mSearchable == null) {
            onSuggestionsKey = b2;
        }
        else if (searchView.mSearchSrcTextView.isPopupShowing() && ((SearchView)this.a).mSearchSrcTextView.getListSelection() != -1) {
            onSuggestionsKey = ((SearchView)this.a).onSuggestionsKey(view, n, keyEvent);
        }
        else if (TextUtils.getTrimmedLength((CharSequence)((SearchView)this.a).mSearchSrcTextView.getText()) == 0) {
            onSuggestionsKey = b2;
        }
        else {
            onSuggestionsKey = b2;
            if (keyEvent.hasNoModifiers()) {
                onSuggestionsKey = b2;
                if (keyEvent.getAction() == 1) {
                    if (n == 66) {
                        view.cancelLongPress();
                        final SearchView searchView2 = (SearchView)this.a;
                        searchView2.launchQuerySearch(0, null, searchView2.mSearchSrcTextView.getText().toString());
                        return true;
                    }
                    onSuggestionsKey = b2;
                }
            }
        }
        return onSuggestionsKey;
    }
}
