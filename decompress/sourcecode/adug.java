import android.view.View;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.support.v7.widget.Toolbar;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adug
{
    public static final Comparator a;
    
    static {
        a = new mm(19);
    }
    
    public static List a(final Toolbar toolbar, final CharSequence charSequence) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); ++i) {
            final View child = toolbar.getChildAt(i);
            if (child instanceof TextView) {
                final TextView textView = (TextView)child;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    list.add(textView);
                }
            }
        }
        return list;
    }
}
