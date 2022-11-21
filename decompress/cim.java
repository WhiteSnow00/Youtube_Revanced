import android.animation.TypeConverter;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cim
{
    static ObjectAnimator a(final Object o, final Property property, final Path path) {
        return ObjectAnimator.ofObject(o, property, (TypeConverter)null, path);
    }
    
    public static final cqz b(final crk crk) {
        crk.getClass();
        return new cqz(crk.c, crk.s);
    }
    
    public static int c(final long n) {
        return (int)(n ^ n >>> 32);
    }
}
