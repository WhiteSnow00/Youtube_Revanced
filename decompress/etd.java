import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etd extends acld
{
    public aiqj a;
    private final View b;
    
    public etd(final Context context, final vcy vcy) {
        (this.b = View.inflate(context, 2131625426, (ViewGroup)null)).setOnClickListener((View$OnClickListener)new exq(this, vcy, 1));
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acku acku) {
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aohd)o).c.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        aiqj a;
        if ((a = ((aohd)o).b) == null) {
            a = aiqj.a;
        }
        this.a = a;
    }
}
