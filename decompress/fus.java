import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fus
{
    public final View a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final Button g;
    public final fut h;
    
    public fus(final fut h, final View a) {
        this.h = h;
        this.a = a;
        this.b = (TextView)a.findViewById(2131432095);
        this.c = (TextView)a.findViewById(2131427819);
        final ajxm c = h.c;
        c.getClass();
        (this.d = (ImageView)a.findViewById(2131428701)).setOnClickListener((View$OnClickListener)new exq(this, c, 16));
        this.e = (ImageView)a.findViewById(2131427747);
        this.f = (ImageView)a.findViewById(2131429076);
        (this.g = (Button)a.findViewById(2131427452)).setOnClickListener((View$OnClickListener)new exq(this, c, 17));
    }
}
