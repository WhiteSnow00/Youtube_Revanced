// 
// Decompiled by Procyon v0.6.0
// 

public final class hgq
{
    public final aexq a;
    public final atjj b;
    public final boolean c;
    
    public hgq() {
    }
    
    public hgq(final aexq a, final atjj b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hgq) {
            final hgq hgq = (hgq)o;
            if (this.a.equals((Object)hgq.a) && this.b.equals(hgq.b) && this.c == hgq.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int n;
        if (!this.c) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder("CarouselThumbnailViewData{videoDurationMs=");
        sb.append(value);
        sb.append(", thumbnailBitmapProvider=");
        sb.append(value2);
        sb.append(", isSelected=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
