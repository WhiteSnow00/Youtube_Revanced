import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class athq implements Serializable
{
    private static final long serialVersionUID = -7482590109178395495L;
    final asic a;
    
    public athq(final asic a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("NotificationLite.Disposable[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
