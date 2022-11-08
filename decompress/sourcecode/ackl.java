import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.AdapterView$OnItemSelectedListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ackl implements AdapterView$OnItemSelectedListener
{
    final /* synthetic */ ackm a;
    private final Spinner b;
    private final String c;
    
    public ackl(final ackm a, final Spinner b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a.a();
        final ajhy ajhy = (ajhy)this.b.getSelectedItem();
        final String c = this.c;
        if (c != null && ajhy != null && (ajhy.b & 0x200) != 0x0) {
            final Spinner b = this.b;
            ahgm ahgm;
            if ((ahgm = ajhy.i) == null) {
                ahgm = ahgm.a;
            }
            final String c2 = ahgm.c;
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
