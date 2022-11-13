import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcd extends dcb
{
    public dcd(final Class clazz, final Class clazz2) {
        final String string = clazz.toString();
        final String string2 = clazz2.toString();
        final StringBuilder sb = new StringBuilder("Failed to find any ModelLoaders for model: ");
        sb.append(string);
        sb.append(" and data: ");
        sb.append(string2);
        super(sb.toString());
    }
    
    public dcd(final Object o) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(String.valueOf(String.valueOf(o.getClass()))));
    }
    
    public dcd(final Object o, final List list) {
        final String value = String.valueOf(list);
        final String value2 = String.valueOf(o);
        final StringBuilder sb = new StringBuilder("Found ModelLoaders for model class: ");
        sb.append(value);
        sb.append(", but none that handle this specific model instance: ");
        sb.append(value2);
        super(sb.toString());
    }
}
