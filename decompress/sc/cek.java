import android.content.DialogInterface$OnMultiChoiceClickListener;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collection;
import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cek extends ces
{
    final Set ae;
    boolean af;
    CharSequence[] ag;
    CharSequence[] ah;
    
    public cek() {
        this.ae = new HashSet();
    }
    
    private final MultiSelectListPreference aR() {
        return (MultiSelectListPreference)this.aQ();
    }
    
    @Override
    public final void aL(final boolean b) {
        if (b && this.af) {
            final MultiSelectListPreference ar = this.aR();
            if (((Preference)ar).R((Object)this.ae)) {
                ar.k(this.ae);
            }
        }
        this.af = false;
    }
    
    @Override
    protected final void ll(final ex ex) {
        final int length = this.ah.length;
        final boolean[] s = new boolean[length];
        for (int i = 0; i < length; ++i) {
            s[i] = this.ae.contains(this.ah[i].toString());
        }
        final CharSequence[] ag = this.ag;
        final cej w = new cej(this);
        final et a = ex.a;
        a.o = ag;
        a.w = (DialogInterface$OnMultiChoiceClickListener)w;
        a.s = s;
        a.t = true;
    }
    
    @Override
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        if (bundle != null) {
            this.ae.clear();
            this.ae.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.af = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.ag = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.ah = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        final MultiSelectListPreference ar = this.aR();
        if (ar.g != null && ar.h != null) {
            this.ae.clear();
            this.ae.addAll(ar.i);
            this.af = false;
            this.ag = ar.g;
            this.ah = ar.h;
            return;
        }
        throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
    }
    
    @Override
    public final void pP(final Bundle bundle) {
        super.pP(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.ae));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.af);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ag);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.ah);
    }
}
