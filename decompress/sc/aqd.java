import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aqd extends aqa
{
    private final int a;
    public final int h;
    public final LayoutInflater i;
    
    @Deprecated
    public aqd(final Context context, final int n) {
        this.a = n;
        this.h = n;
        this.i = (LayoutInflater)context.getSystemService("layout_inflater");
    }
    
    public View f(final ViewGroup viewGroup) {
        throw null;
    }
    
    public final View h(final ViewGroup viewGroup) {
        return this.i.inflate(this.a, viewGroup, false);
    }
}
