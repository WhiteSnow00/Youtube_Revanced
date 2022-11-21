import android.view.View$OnDragListener;
import android.view.View$OnLongClickListener;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.content.SharedPreferences;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acjy
{
    public static final int f = 0;
    public final xaj a;
    public final View b;
    public final View c;
    public final View d;
    public boolean e;
    private final View g;
    private final acju h;
    private final acju i;
    
    static {
        xbf.b(3832);
        xbf.b(6827);
    }
    
    public acjy(final Activity activity, final SharedPreferences sharedPreferences, final xaj a) {
        sharedPreferences.getClass();
        this.a = a;
        final View inflate = LayoutInflater.from((Context)activity).inflate(2131624601, (ViewGroup)null);
        this.b = inflate;
        final View viewById = inflate.findViewById(2131429714);
        this.c = viewById;
        final TextView textView = (TextView)inflate.findViewById(2131431262);
        final TextView textView2 = (TextView)inflate.findViewById(2131430260);
        final TextView textView3 = (TextView)inflate.findViewById(2131432183);
        final View viewById2 = inflate.findViewById(2131431534);
        this.d = viewById2;
        final View viewById3 = inflate.findViewById(2131429236);
        this.g = viewById3;
        viewById2.setOnClickListener((View$OnClickListener)new zhw(this, 11));
        viewById3.setOnClickListener((View$OnClickListener)new zhw(this, 12));
        final LinearLayout linearLayout = (LinearLayout)inflate.findViewById(2131429550);
        final ScrollView scrollView = (ScrollView)inflate.findViewById(2131428217);
        final ackb h = new ackb(linearLayout, (Context)activity);
        this.h = (acju)h;
        final ackb ackb = h;
        ((View)h.a).setId(2131432289);
        final ackc i = new ackc(scrollView, (Context)activity);
        this.i = (acju)i;
        final ackc ackc = i;
        ((View)i.a).setId(2131428967);
        viewById2.setOnLongClickListener((View$OnLongClickListener)new acjw());
        viewById2.setOnDragListener((View$OnDragListener)new acjx(this));
        viewById.setOnLongClickListener((View$OnLongClickListener)new acjw());
        viewById.setOnDragListener((View$OnDragListener)new acjx(this));
        tqf.cr((Context)activity, 2130970848);
        agz.a((Context)activity, 2131102387);
    }
}
