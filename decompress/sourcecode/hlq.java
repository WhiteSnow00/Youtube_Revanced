import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hlq extends hng
{
    public final View t;
    public final boolean u;
    public final TextView v;
    
    public hlq(final ViewGroup viewGroup, final boolean b, final boolean u) {
        int n;
        if (!b) {
            n = 2131625235;
        }
        else {
            n = 2131625236;
        }
        super(LayoutInflater.from(viewGroup.getContext()).inflate(n, viewGroup, false));
        this.t = super.a.findViewById(2131430904);
        final TextView v = (TextView)super.a.findViewById(2131430902);
        this.v = v;
        this.u = u;
        if (v != null && u) {
            v.setText((CharSequence)"");
        }
    }
    
    @Override
    public final hml E() {
        return null;
    }
    
    @Override
    public final hqo F() {
        return null;
    }
    
    @Override
    public final void G() {
    }
    
    @Override
    public final boolean J() {
        return false;
    }
}
