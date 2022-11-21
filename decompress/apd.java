import android.view.animation.PathInterpolator;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apd
{
    public static PathInterpolator a(final Path path) {
        return new PathInterpolator(path);
    }
    
    public static PathInterpolator b(final float n, final float n2) {
        return new PathInterpolator(n, n2);
    }
    
    public static PathInterpolator c(final float n, final float n2, final float n3, final float n4) {
        return new PathInterpolator(n, n2, n3, n4);
    }
}
