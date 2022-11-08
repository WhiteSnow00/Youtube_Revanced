import androidx.preference.Preference;
import android.os.Bundle;
import android.content.DialogInterface$OnClickListener;
import androidx.preference.ListPreference;

// 
// Decompiled by Procyon v0.6.0
// 

public class ceh extends cer
{
    int ae;
    private CharSequence[] af;
    private CharSequence[] ag;
    
    private ListPreference aR() {
        return (ListPreference)this.aQ();
    }
    
    @Override
    public void aL(final boolean b) {
        if (b) {
            final int ae = this.ae;
            if (ae >= 0) {
                final String string = this.ag[ae].toString();
                final ListPreference ar = this.aR();
                if (((Preference)ar).R((Object)string)) {
                    ar.o(string);
                }
            }
        }
    }
    
    @Override
    protected void ll(final ex ex) {
        final CharSequence[] af = this.af;
        final int ae = this.ae;
        final ceg q = new ceg(this, 0);
        final et a = ex.a;
        a.o = af;
        a.q = (DialogInterface$OnClickListener)q;
        a.v = ae;
        a.u = true;
        ex.l((CharSequence)null, (DialogInterface$OnClickListener)null);
    }
    
    @Override
    public void oq(final Bundle bundle) {
        super.oq(bundle);
        if (bundle != null) {
            this.ae = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.af = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.ag = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        final ListPreference ar = this.aR();
        if (ar.g != null && ar.h != null) {
            this.ae = ar.k(ar.i);
            this.af = ar.g;
            this.ag = ar.h;
            return;
        }
        throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
    }
    
    @Override
    public void pK(final Bundle bundle) {
        super.pK(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ae);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.af);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.ag);
    }
}
