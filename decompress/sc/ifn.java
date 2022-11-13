import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ifn extends ArrayAdapter
{
    final ifr a;
    final jwr[] b;
    
    public ifn(final ifr a, final Context context, final jwr[] array, final jwr[] b, final byte[] array2) {
        this.a = a;
        this.b = b;
        super(context, 2131624348, 2131432095, (Object[])array);
    }
    
    public final View getView(final int n, View view, final ViewGroup viewGroup) {
        view = super.getView(n, view, viewGroup);
        final TextView textView = (TextView)view.findViewById(2131432095);
        textView.setText((CharSequence)this.a.a.getString(this.b[n].b));
        textView.setTextColor(tpe.cx((Context)this.a.a, 2130970926).orElse(0));
        apj.i(textView, this.b[n].a, 0);
        textView.setCompoundDrawablePadding(tpe.aZ(this.a.a.getResources().getDisplayMetrics(), 16));
        return view;
    }
}
