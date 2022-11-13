import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilr implements Serializable, imc
{
    private static final long serialVersionUID = -4019560255984295982L;
    private final Class a;
    private final Class b;
    
    public ilr(final Class a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    public final Class a() {
        return this.a;
    }
    
    public final Class annotationType() {
        return imc.class;
    }
    
    public final Class b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof imc) {
            final imc imc = (imc)o;
            if (this.a.equals(imc.a()) && this.b.equals(imc.b())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0x471B6CA0) + (this.b.hashCode() ^ 0x17D023E3);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("@com.google.android.apps.youtube.app.offline.renderergenerator.OfflineModelToRendererGeneratorKey(offlineModelType=");
        sb.append(this.a);
        sb.append(", rendererType=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
