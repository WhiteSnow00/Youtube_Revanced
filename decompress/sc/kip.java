import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kip extends ArrayAdapter
{
    private final int a;
    private int b;
    private final boolean c;
    
    public kip(final Context context, final boolean c) {
        super(context, 17367048);
        this.b = 17367048;
        this.a = 17367048;
        this.c = c;
    }
    
    public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        final ajux ajux = (ajux)this.getItem(n);
        return khl.i(view, viewGroup, ajux.c, ajux.b, n == 0, this.getContext(), this.b);
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final ajux ajux = (ajux)this.getItem(n);
        return khl.j(view, viewGroup, ajux.c, ajux.b, n == 0, this.c, this.getContext(), this.a);
    }
    
    public final boolean isEnabled(final int n) {
        return khl.h(((ajux)this.getItem(n)).d);
    }
    
    public final void setDropDownViewResource(final int n) {
        super.setDropDownViewResource(n);
        this.b = n;
    }
}
