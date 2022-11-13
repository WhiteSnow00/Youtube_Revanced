import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hoc extends on
{
    public hoc(final View view) {
        super(view);
        view.setTag((Object)this);
    }
    
    public static hoc L(final View view) {
        final Object tag = view.getTag();
        if (tag instanceof hoc) {
            return (hoc)tag;
        }
        return null;
    }
    
    public abstract hnf E();
    
    public abstract hri F();
    
    public abstract void G();
    
    public void H(final aanw aanw) {
    }
    
    public abstract boolean J();
}
