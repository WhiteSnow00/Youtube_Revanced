import android.view.View$OnClickListener;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hne extends hng
{
    public final ViewGroup t;
    public final abzk u;
    public final wwu v;
    public final hok w;
    public final acae x;
    public String y;
    public hml z;
    
    public hne(final abzk u, final acae x, final wwu v, final hok w, final ViewGroup viewGroup, final boolean b) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(2131625280, viewGroup, false));
        this.u = u;
        this.x = x;
        this.v = v;
        this.w = w;
        this.t = (ViewGroup)this.a.findViewById(2131431088);
        final View viewById = this.a.findViewById(2131430812);
        viewById.setOnClickListener((View$OnClickListener)new hht(this, 12));
        iba.c(viewById);
        iba.e(viewById, b);
    }
    
    @Override
    public final hml E() {
        return this.z;
    }
    
    @Override
    public final hqo F() {
        return null;
    }
    
    @Override
    public final void G() {
        final hml z = this.z;
        if (z != null) {
            z.g = null;
            this.z = null;
        }
        this.y = null;
        this.t.removeAllViews();
        this.u.c((acir)null);
    }
    
    @Override
    public final boolean J() {
        return false;
    }
}
