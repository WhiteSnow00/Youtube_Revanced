import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acon implements View$OnClickListener
{
    public final TextView a;
    public final Spinner b;
    public final RadioButton c;
    public final View d;
    final acoo e;
    
    public acon(final acoo e, final View view) {
        this.e = e;
        this.c = (RadioButton)view.findViewById(2131431155);
        this.a = (TextView)view.findViewById(2131431158);
        this.b = (Spinner)view.findViewById(2131431157);
        this.d = view.findViewById(2131431156);
    }
    
    public final void onClick(final View view) {
        final RadioButton c = this.c;
        c.setChecked(c.isChecked() ^ true);
        if (this.c.isChecked()) {
            this.e.b((anaf)this.c.getTag());
            return;
        }
        this.e.b(null);
    }
}
