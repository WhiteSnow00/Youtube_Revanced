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

public final class acgi
{
    public final wxe a;
    public final View b;
    public final View c;
    public final View d;
    public boolean e;
    private final View g;
    private final acge h;
    private final acge i;
    
    static {
        wya.b(3832);
        wya.b(6827);
    }
    
    public acgi(final Activity activity, final SharedPreferences sharedPreferences, final wxe a) {
        sharedPreferences.getClass();
        this.a = a;
        final View inflate = LayoutInflater.from((Context)activity).inflate(2131624598, (ViewGroup)null);
        this.b = inflate;
        final View viewById = inflate.findViewById(2131429714);
        this.c = viewById;
        final TextView textView = (TextView)inflate.findViewById(2131431258);
        final TextView textView2 = (TextView)inflate.findViewById(2131430259);
        final TextView textView3 = (TextView)inflate.findViewById(2131432179);
        final View viewById2 = inflate.findViewById(2131431530);
        this.d = viewById2;
        final View viewById3 = inflate.findViewById(2131429236);
        this.g = viewById3;
        viewById2.setOnClickListener((View$OnClickListener)new zee(this, 11));
        viewById3.setOnClickListener((View$OnClickListener)new zee(this, 12));
        final LinearLayout linearLayout = (LinearLayout)inflate.findViewById(2131429550);
        final ScrollView scrollView = (ScrollView)inflate.findViewById(2131428217);
        final acgl h = new acgl(linearLayout, (Context)activity);
        this.h = (acge)h;
        final acgl acgl = h;
        ((View)h.a).setId(2131432285);
        final acgm i = new acgm(scrollView, (Context)activity);
        this.i = (acge)i;
        final acgm acgm = i;
        ((View)i.a).setId(2131428967);
        viewById2.setOnLongClickListener((View$OnLongClickListener)new acgg());
        viewById2.setOnDragListener((View$OnDragListener)new acgh(this));
        viewById.setOnLongClickListener((View$OnLongClickListener)new acgg());
        viewById.setOnDragListener((View$OnDragListener)new acgh(this));
        tmy.cn((Context)activity, 2130970850);
        agx.a((Context)activity, 2131102363);
    }
}
