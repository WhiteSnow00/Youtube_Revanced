import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

final class czp extends ThreadLocal
{
    public czp() {
    }
    
    @Override
    protected final /* bridge */ Object initialValue() {
        return new Path();
    }
}
