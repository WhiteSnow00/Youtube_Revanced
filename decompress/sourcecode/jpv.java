// 
// Decompiled by Procyon v0.6.0
// 

public final class jpv
{
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final amuv e;
    public final float f;
    public final long g;
    
    public jpv() {
    }
    
    public jpv(final boolean a, final long b, final long c, final long d, final amuv e, final float f, final long g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (e != null) {
            this.e = e;
            this.f = f;
            this.g = g;
            return;
        }
        throw new NullPointerException("Null offlineabilityFormatType");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jpv) {
            final jpv jpv = (jpv)o;
            if (this.a == jpv.a && this.b == jpv.b && Float.floatToIntBits(102.4f) == Float.floatToIntBits(102.4f) && this.c == jpv.c && this.d == jpv.d && this.e.equals((Object)jpv.e) && Float.floatToIntBits(this.f) == Float.floatToIntBits(jpv.f) && this.g == jpv.g) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final long b = this.b;
        final int floatToIntBits = Float.floatToIntBits(102.4f);
        final long c = this.c;
        final long d = this.d;
        final int hashCode = this.e.hashCode();
        final int floatToIntBits2 = Float.floatToIntBits(this.f);
        final long g = this.g;
        return (((((((n ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ floatToIntBits) * 1000003 ^ (int)(c >>> 32 ^ c)) * 1000003 ^ (int)(d >>> 32 ^ d)) * 1000003 ^ hashCode) * 1000003 ^ floatToIntBits2) * 1000003 ^ (int)(g >>> 32 ^ g);
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final String string = this.e.toString();
        final float f = this.f;
        final long g = this.g;
        final StringBuilder sb = new StringBuilder("SmartDownloadsStorageControlsViewModel{forSdCard=");
        sb.append(a);
        sb.append(", userSavedMaxStorageMb=");
        sb.append(b);
        sb.append(", incrementValueMb=102.4, manualDownloadSpaceUsedMb=");
        sb.append(c);
        sb.append(", storageAvailableMb=");
        sb.append(d);
        sb.append(", offlineabilityFormatType=");
        sb.append(string);
        sb.append(", sliderMinimumValueMb=");
        sb.append(f);
        sb.append(", sliderMaximumValueMb=");
        sb.append(g);
        sb.append("}");
        return sb.toString();
    }
}
