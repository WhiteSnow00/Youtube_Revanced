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

public final class acil
{
    public static final int f = 0;
    public final wze a;
    public final View b;
    public final View c;
    public final View d;
    public boolean e;
    private final View g;
    private final acih h;
    private final acih i;
    
    static {
        xaa.b(3832);
        xaa.b(6827);
    }
    
    public acil(final Activity activity, final SharedPreferences sharedPreferences, final wze a) {
        sharedPreferences.getClass();
        this.a = a;
        final View inflate = LayoutInflater.from((Context)activity).inflate(2131624599, (ViewGroup)null);
        this.b = inflate;
        final View viewById = inflate.findViewById(2131429714);
        this.c = viewById;
        final TextView textView = (TextView)inflate.findViewById(2131431261);
        final TextView textView2 = (TextView)inflate.findViewById(2131430260);
        final TextView textView3 = (TextView)inflate.findViewById(2131432182);
        final View viewById2 = inflate.findViewById(2131431533);
        this.d = viewById2;
        final View viewById3 = inflate.findViewById(2131429236);
        this.g = viewById3;
        viewById2.setOnClickListener((View$OnClickListener)new xqn(this, 12));
        viewById3.setOnClickListener((View$OnClickListener)new xqn(this, 13));
        final LinearLayout linearLayout = (LinearLayout)inflate.findViewById(2131429550);
        final ScrollView scrollView = (ScrollView)inflate.findViewById(2131428217);
        final acio h = new acio(linearLayout, (Context)activity);
        this.h = (acih)h;
        final acio acio = h;
        ((View)h.a).setId(2131432288);
        final acip i = new acip(scrollView, (Context)activity);
        this.i = (acih)i;
        final acip acip = i;
        ((View)i.a).setId(2131428967);
        viewById2.setOnLongClickListener((View$OnLongClickListener)new acij());
        viewById2.setOnDragListener((View$OnDragListener)new acik(this));
        viewById.setOnLongClickListener((View$OnLongClickListener)new acij());
        viewById.setOnDragListener((View$OnDragListener)new acik(this));
        tpe.cr((Context)activity, 2130970850);
        agy.a((Context)activity, 2131102391);
    }
}
