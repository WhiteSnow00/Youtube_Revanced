import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class hwf
{
    public final aiqj a;
    public final BrowseResponseModel b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    
    public hwf() {
    }
    
    public hwf(final aiqj a, final BrowseResponseModel b, final boolean c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static hwe a() {
        return new hwe();
    }
    
    final boolean b() {
        return (boolean)this.b.h("browse_response_is_error_message", (Object)false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hwf) {
            final hwf hwf = (hwf)o;
            if (((ahbh)this.a).equals((Object)hwf.a) && this.b.equals(hwf.b) && this.c == hwf.c && this.d == hwf.d && this.e == hwf.e) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = ((ahbh)this.a).hashCode();
        final int hashCode2 = this.b.hashCode();
        final boolean c = this.c;
        int n = 1237;
        int n2;
        if (!c) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.d) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        if (this.e) {
            n = 1231;
        }
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final boolean c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final StringBuilder sb = new StringBuilder("BrowseResponseWrapper{endpoint=");
        sb.append(value);
        sb.append(", browseResponseModel=");
        sb.append(value2);
        sb.append(", isLoggingEnabled=");
        sb.append(c);
        sb.append(", isNewResponseNeeded=");
        sb.append(d);
        sb.append(", isLoadingResponse=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
