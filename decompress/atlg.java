import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atlg implements Serializable
{
    private static final long serialVersionUID = -8759979445933046293L;
    public final Throwable a;
    
    public atlg(final Throwable a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof atlg && asng.a(this.a, ((atlg)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("NotificationLite.Error[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
