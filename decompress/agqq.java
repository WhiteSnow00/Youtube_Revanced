import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqq
{
    public final String a;
    
    public agqq(final agpb agpb, final byte[] array) {
        this.a = (String)agpb.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof agqq && Objects.equals((Object)this.a, (Object)((agqq)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hashCode((Object)this.a);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("CapabilityAlias{alias='");
        sb.append(a);
        sb.append("'}");
        return sb.toString();
    }
}
