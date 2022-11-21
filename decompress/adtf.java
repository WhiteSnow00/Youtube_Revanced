// 
// Decompiled by Procyon v0.6.0
// 

public final class adtf
{
    public final odx a;
    public final adso b;
    public final adtq c;
    public final adgg d;
    public final aheu e;
    public final aapu f;
    
    public adtf() {
    }
    
    public adtf(final odx a, final adgg d, final adtq c, final aapu f, final adso b, final aheu e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.f = f;
        this.b = b;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adtf) {
            final adtf adtf = (adtf)o;
            if (this.a.equals(adtf.a) && this.d.equals(adtf.d) && this.c.equals(adtf.c) && this.f.equals(adtf.f) && this.b.equals(adtf.b) && this.e.equals((Object)adtf.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.d);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.f);
        final String value5 = String.valueOf(this.b);
        final String value6 = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder("LiveSharingSessionParams{ipcManager=");
        sb.append(value);
        sb.append(", heartbeatSchedule=");
        sb.append(value2);
        sb.append(", thinLocalState=");
        sb.append(value3);
        sb.append(", updateProcessor=");
        sb.append(value4);
        sb.append(", config=");
        sb.append(value5);
        sb.append(", delegate=");
        sb.append(value6);
        sb.append("}");
        return sb.toString();
    }
}
