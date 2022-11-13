import android.widget.TextView;
import android.view.View;
import android.util.SparseArray;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfj extends on
{
    public final Drawable t;
    public ColorStateList u;
    public boolean v;
    public boolean w;
    private final SparseArray x;
    
    public cfj(final View view) {
        super(view);
        final SparseArray x = new SparseArray(4);
        this.x = x;
        final TextView textView = (TextView)view.findViewById(16908310);
        x.put(16908310, (Object)textView);
        x.put(16908304, (Object)view.findViewById(16908304));
        x.put(16908294, (Object)view.findViewById(16908294));
        x.put(2131429276, (Object)view.findViewById(2131429276));
        x.put(16908350, (Object)view.findViewById(16908350));
        this.t = view.getBackground();
        if (textView != null) {
            this.u = textView.getTextColors();
        }
    }
    
    public final View E(final int n) {
        final View view = (View)this.x.get(n);
        if (view != null) {
            return view;
        }
        final View viewById = this.a.findViewById(n);
        if (viewById != null) {
            this.x.put(n, (Object)viewById);
        }
        return viewById;
    }
}
