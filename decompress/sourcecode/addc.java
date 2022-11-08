import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addc extends CardView
{
    public final LinearLayout g;
    public final LayoutInflater h;
    public final afcr i;
    
    public addc(final Context context, final afcr i) {
        super(context);
        (this.h = LayoutInflater.from(context)).inflate(2131624172, (ViewGroup)this);
        this.g = (LinearLayout)this.findViewById(2131428171);
        this.i = i;
        this.setBackgroundColor(0);
        this.d(0);
        this.g();
    }
}
