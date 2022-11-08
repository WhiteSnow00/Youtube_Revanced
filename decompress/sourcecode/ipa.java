import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipa
{
    public final afcr a;
    public final ajfl b;
    public final Boolean c;
    public final Boolean d;
    
    public ipa() {
    }
    
    public ipa(final afcr a, final ajfl b, final Boolean c, final Boolean d) {
        if (a == null) {
            throw new NullPointerException("Null contentItems");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            this.d = d;
            return;
        }
        throw new NullPointerException("Null filterType");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ipa) {
            final ipa ipa = (ipa)o;
            if (adwd.ar((List)this.a, (Object)ipa.a) && this.b.equals((Object)ipa.b) && this.c.equals(ipa.c) && this.d.equals(ipa.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final Boolean c = this.c;
        final Boolean d = this.d;
        final StringBuilder sb = new StringBuilder("ContentItemsData{contentItems=");
        sb.append(string);
        sb.append(", filterType=");
        sb.append(string2);
        sb.append(", hasManualVideos=");
        sb.append(c);
        sb.append(", hasManualPlaylists=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
