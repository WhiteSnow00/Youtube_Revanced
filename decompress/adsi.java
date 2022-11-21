// 
// Decompiled by Procyon v0.6.0
// 

public final class adsi
{
    public final String a;
    
    public adsi() {
    }
    
    public adsi(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof adsi && this.a.equals(((adsi)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("LiveSharingExceptionMetadata{packageName=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
