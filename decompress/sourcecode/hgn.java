import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgn
{
    public final afcr a;
    public final aexq b;
    
    public hgn() {
    }
    
    public hgn(final afcr a, final aexq b) {
        this.a = a;
        this.b = b;
    }
    
    public static hgm a() {
        final hgm hgm = new hgm((byte[])null);
        hgm.b = aewp.a;
        return hgm;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hgn) {
            final hgn hgn = (hgn)o;
            if (adwd.ar((List)this.a, (Object)hgn.a) && this.b.equals((Object)hgn.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CarouselThumbnailRecyclerViewData{thumbnailList=");
        sb.append(value);
        sb.append(", selectedIndex=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
