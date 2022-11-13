import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class fyc
{
    public final Drawable a;
    
    protected fyc(Drawable a) {
        final Drawable mutate = a.mutate();
        if (mutate != null) {
            a = mutate;
        }
        this.a = a;
    }
    
    public boolean a(final fyc fyc) {
        throw null;
    }
    
    @Override
    public String toString() {
        return "resId 0 drawable ".concat(this.a.toString());
    }
}
