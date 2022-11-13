import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

final class czo extends ThreadLocal
{
    public czo() {
    }
    
    @Override
    protected final /* bridge */ Object initialValue() {
        return new Path();
    }
}
