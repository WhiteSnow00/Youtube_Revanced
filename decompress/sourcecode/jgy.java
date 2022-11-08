import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jgy extends ArrayAdapter
{
    final /* synthetic */ Context a;
    final /* synthetic */ boolean b;
    
    public jgy(final Context context, final Context a, final boolean b) {
        this.a = a;
        this.b = b;
        super(context, 17367048);
    }
    
    public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        final TextView textView = (TextView)super.getDropDownView(n, view, viewGroup);
        textView.setTextColor(tmy.ct(this.a, 2130970924).orElse(0));
        if (this.b) {
            tmy.s((View)textView, (Drawable)new ColorDrawable(tmy.cn(this.a, 2130970868)), 1);
        }
        return (View)textView;
    }
    
    public final boolean isEnabled(final int n) {
        return true;
    }
}
