// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqq
{
    public final aiqc a;
    
    public aiqq(final aiqc a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqq && this.a.equals(((aiqq)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("NotificationInteractionDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
