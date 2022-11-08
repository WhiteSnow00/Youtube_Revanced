import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hng extends on
{
    public hng(final View view) {
        super(view);
        view.setTag((Object)this);
    }
    
    public static hng L(final View view) {
        final Object tag = view.getTag();
        if (tag instanceof hng) {
            return (hng)tag;
        }
        return null;
    }
    
    public abstract hml E();
    
    public abstract hqo F();
    
    public abstract void G();
    
    public void H(final aamc aamc) {
    }
    
    public abstract boolean J();
}
