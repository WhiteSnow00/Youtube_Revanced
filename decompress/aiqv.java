// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqv
{
    public final aipy a;
    
    public aiqv(final aipy a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqv && this.a.equals(((aiqv)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("YoutubeNotificationsStateModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
