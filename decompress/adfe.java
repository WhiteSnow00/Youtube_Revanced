import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfe extends CardView
{
    public final LinearLayout g;
    public final LayoutInflater h;
    public final afeq i;
    
    public adfe(final Context context, final afeq i) {
        super(context);
        (this.h = LayoutInflater.from(context)).inflate(2131624171, (ViewGroup)this);
        this.g = (LinearLayout)this.findViewById(2131428171);
        this.i = i;
        this.setBackgroundColor(0);
        this.d(0);
        this.g();
    }
}
