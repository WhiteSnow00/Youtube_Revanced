import android.widget.TextView;
import android.text.SpannableStringBuilder;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acow implements acov
{
    public View a;
    
    public acow() {
        this.a = null;
    }
    
    public acow(final View a) {
        this.a = a;
    }
    
    @Override
    public final void a(final SpannableStringBuilder text, final int n) {
        final View a = this.a;
        if (a == null) {
            return;
        }
        final View viewById = a.findViewById(n);
        if (viewById instanceof TextView) {
            ((TextView)viewById).setText((CharSequence)text);
        }
    }
}
