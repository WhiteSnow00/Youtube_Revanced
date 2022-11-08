import androidx.preference.Preference;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.os.SystemClock;
import androidx.preference.EditTextPreference;
import android.widget.EditText;

// 
// Decompiled by Procyon v0.6.0
// 

public class ced extends cer
{
    private EditText ae;
    private CharSequence af;
    private final Runnable ag;
    private long ah;
    
    public ced() {
        this.ag = new cdi(this, 2);
        this.ah = -1L;
    }
    
    private final EditTextPreference aR() {
        return (EditTextPreference)this.aQ();
    }
    
    private final void aS(final boolean b) {
        long currentThreadTimeMillis;
        if (b) {
            currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        }
        else {
            currentThreadTimeMillis = -1L;
        }
        this.ah = currentThreadTimeMillis;
    }
    
    @Override
    protected void aK(final View view) {
        super.aK(view);
        final EditText ae = (EditText)view.findViewById(16908291);
        this.ae = ae;
        if (ae != null) {
            ae.requestFocus();
            this.ae.setText(this.af);
            final EditText ae2 = this.ae;
            ae2.setSelection(ae2.getText().length());
            this.aR();
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }
    
    @Override
    public void aL(final boolean b) {
        if (b) {
            final String string = this.ae.getText().toString();
            final EditTextPreference ar = this.aR();
            if (((Preference)ar).R((Object)string)) {
                ar.i(string);
            }
        }
    }
    
    @Override
    protected final void aM() {
        this.aS(true);
        this.aN();
    }
    
    public final void aN() {
        final long ah = this.ah;
        if (ah != -1L && ah + 1000L > SystemClock.currentThreadTimeMillis()) {
            final EditText ae = this.ae;
            if (ae != null && ae.isFocused()) {
                if (((InputMethodManager)this.ae.getContext().getSystemService("input_method")).showSoftInput((View)this.ae, 0)) {
                    this.aS(false);
                    return;
                }
                this.ae.removeCallbacks(this.ag);
                this.ae.postDelayed(this.ag, 50L);
            }
            else {
                this.aS(false);
            }
        }
    }
    
    @Override
    protected final boolean aO() {
        return true;
    }
    
    @Override
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        if (bundle == null) {
            this.af = this.aR().g;
            return;
        }
        this.af = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }
    
    @Override
    public final void pK(final Bundle bundle) {
        super.pK(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.af);
    }
}
