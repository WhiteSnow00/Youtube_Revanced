import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjg extends ArrayAdapter
{
    private final int a;
    private int b;
    
    public kjg(final Context context) {
        super(context, 17367048);
        this.b = 17367048;
        this.a = 17367048;
    }
    
    public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        final ajvb ajvb = (ajvb)this.getItem(n);
        return khl.i(view, viewGroup, ajvb.c, ajvb.b, ajvb.e, this.getContext(), this.b);
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final ajvb ajvb = (ajvb)this.getItem(n);
        return khl.j(view, viewGroup, ajvb.c, ajvb.b, ajvb.e, false, this.getContext(), this.a);
    }
    
    public final boolean isEnabled(final int n) {
        return khl.h(((ajvb)this.getItem(n)).e);
    }
    
    public final void setDropDownViewResource(final int n) {
        super.setDropDownViewResource(n);
        this.b = n;
    }
}
