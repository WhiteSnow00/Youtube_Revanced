import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevs
{
    public final afgh a;
    
    public aevs(final afgh a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        return TextUtils.join((CharSequence)" -> ", (Iterable)this.a);
    }
}
