import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdl
{
    public final Optional a;
    public final jdm b;
    
    public jdl(final Optional a, final jdm b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("OverlayVisibilityUpdate{latestRequest=");
        sb.append(value);
        sb.append(", visibilityUpdateAction=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
