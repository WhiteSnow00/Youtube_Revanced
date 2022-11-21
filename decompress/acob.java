import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.AdapterView$OnItemSelectedListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acob implements AdapterView$OnItemSelectedListener
{
    final acoc a;
    private final Spinner b;
    private final String c;
    
    public acob(final acoc a, final Spinner b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a.a();
        final ajmb ajmb = (ajmb)this.b.getSelectedItem();
        final String c = this.c;
        if (c != null && ajmb != null && (ajmb.b & 0x200) != 0x0) {
            final Spinner b = this.b;
            ahkb ahkb;
            if ((ahkb = ajmb.i) == null) {
                ahkb = ahkb.a;
            }
            final String c2 = ahkb.c;
            final StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(" ");
            sb.append(c2);
            b.setContentDescription((CharSequence)sb.toString());
        }
    }
    
    public final void onNothingSelected(final AdapterView adapterView) {
        this.a.a();
    }
}
