import android.view.View;
import android.view.LayoutInflater;
import android.widget.RadioGroup;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class jmb implements View$OnClickListener
{
    final RadioGroup a;
    final LayoutInflater b;
    final anyj c;
    final /* synthetic */ jmd d;
    
    public jmb(final jmd d, final LayoutInflater b, final RadioGroup a, final anyj c) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final void onClick(final View view) {
        this.a.removeAllViews();
        this.d.aP(this.b, this.a, this.c);
    }
}
