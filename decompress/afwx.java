import java.util.Arrays;
import java.lang.reflect.Constructor;

// 
// Decompiled by Procyon v0.6.0
// 

final class afwx implements afax
{
    public afwx() {
    }
    
    @Override
    public final /* bridge */ Object apply(final Object o) {
        return Arrays.asList(((Constructor)o).getParameterTypes()).contains(String.class);
    }
}
