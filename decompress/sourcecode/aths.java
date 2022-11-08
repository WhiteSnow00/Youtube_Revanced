import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class aths implements Serializable
{
    private static final long serialVersionUID = -1322257508628817540L;
    final aujq a;
    
    public aths(final aujq a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("NotificationLite.Subscription[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
