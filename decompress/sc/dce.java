// 
// Decompiled by Procyon v0.6.0
// 

public final class dce extends dcb
{
    public dce(final Class clazz) {
        final String value = String.valueOf(clazz);
        final StringBuilder sb = new StringBuilder("Failed to find result encoder for resource class: ");
        sb.append(value);
        sb.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        super(sb.toString());
    }
}
