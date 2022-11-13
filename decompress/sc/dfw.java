import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfw
{
    public final akr a;
    public final List b;
    public final String c;
    
    public dfw(final Class clazz, final Class clazz2, final Class clazz3, final List b, final akr a) {
        this.a = a;
        clm.k((Collection)b);
        this.b = b;
        final String simpleName = clazz.getSimpleName();
        final String simpleName2 = clazz2.getSimpleName();
        final String simpleName3 = clazz3.getSimpleName();
        final StringBuilder sb = new StringBuilder("Failed LoadPath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.c = sb.toString();
    }
    
    @Override
    public final String toString() {
        final String string = Arrays.toString(this.b.toArray());
        final StringBuilder sb = new StringBuilder("LoadPath{decodePaths=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
