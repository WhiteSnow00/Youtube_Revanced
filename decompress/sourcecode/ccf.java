import android.content.ComponentName;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccf
{
    public final ComponentName a;
    
    public ccf(final ComponentName a) {
        this.a = a;
    }
    
    public final String a() {
        return this.a.getPackageName();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ProviderMetadata{ componentName=");
        sb.append(this.a.flattenToShortString());
        sb.append(" }");
        return sb.toString();
    }
}
