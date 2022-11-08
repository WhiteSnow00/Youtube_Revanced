// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.text.TextUtils;
import android.widget.SpinnerAdapter;
import android.util.AttributeSet;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.content.Context;

public class DropDownPreference extends ListPreference
{
    private final Context G;
    private final ArrayAdapter H;
    private Spinner I;
    private final AdapterView$OnItemSelectedListener J;
    
    public DropDownPreference(final Context g, final AttributeSet set) {
        super(g, set, 2130969288, 0);
        this.J = (AdapterView$OnItemSelectedListener)new ov(this, 2);
        this.G = g;
        this.H = new ArrayAdapter(g, 17367049);
        this.ac();
    }
    
    private final void ac() {
        this.H.clear();
        final CharSequence[] g = super.g;
        if (g != null) {
            for (int length = g.length, i = 0; i < length; ++i) {
                this.H.add((Object)g[i].toString());
            }
        }
    }
    
    protected final void c() {
        this.I.performClick();
    }
    
    public final void d() {
        super.d();
        final ArrayAdapter h = this.H;
        if (h != null) {
            h.notifyDataSetChanged();
        }
    }
    
    public final void e(final CharSequence[] g) {
        super.g = g;
        this.ac();
    }
    
    public final void f(final int n) {
        this.o(super.h[n].toString());
    }
    
    public final void rH(final cfi cfi) {
        (this.I = (Spinner)cfi.a.findViewById(2131431624)).setAdapter((SpinnerAdapter)this.H);
        this.I.setOnItemSelectedListener(this.J);
        final Spinner i = this.I;
        final String j = super.i;
        final CharSequence[] h = super.h;
        int selection;
        final int n = selection = -1;
        if (j != null) {
            selection = n;
            if (h != null) {
                int n2 = h.length - 1;
                while (true) {
                    selection = n;
                    if (n2 < 0) {
                        break;
                    }
                    if (TextUtils.equals((CharSequence)h[n2].toString(), (CharSequence)j)) {
                        selection = n2;
                        break;
                    }
                    --n2;
                }
            }
        }
        i.setSelection(selection);
        super.rH(cfi);
    }
}
