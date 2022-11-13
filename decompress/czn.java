import android.graphics.PathMeasure;

// 
// Decompiled by Procyon v0.6.0
// 

final class czn extends ThreadLocal
{
    public czn() {
    }
    
    @Override
    protected final /* bridge */ Object initialValue() {
        return new PathMeasure();
    }
}
