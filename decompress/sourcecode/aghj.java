import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghj extends aghk
{
    public aghj(final List list) {
        super("Dependency cycle detected: ".concat(String.valueOf(Arrays.toString(list.toArray()))));
    }
}
