import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.AdapterView$OnItemSelectedListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acmo implements AdapterView$OnItemSelectedListener
{
    final acmp a;
    private final Spinner b;
    private final String c;
    
    public acmo(final acmp a, final Spinner b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a.a();
        final ajkc ajkc = (ajkc)this.b.getSelectedItem();
        final String c = this.c;
        if (c != null && ajkc != null && (ajkc.b & 0x200) != 0x0) {
            final Spinner b = this.b;
            ahik ahik;
            if ((ahik = ajkc.i) == null) {
                ahik = ahik.a;
            }
            final String c2 = ahik.c;
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
