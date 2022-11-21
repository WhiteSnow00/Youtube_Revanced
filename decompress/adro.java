import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adro
{
    public final String a;
    public final afhk b;
    public final afbh c;
    
    public adro() {
    }
    
    public adro(final String a, final afhk b, final afbh c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    static asdz b(final String a) {
        final asdz asdz = new asdz((byte[])null, (char[])null);
        if (a != null) {
            asdz.a = a;
            asdz.f((afhk)afkg.a);
            asdz.e((afbh)afag.a);
            return asdz;
        }
        throw new NullPointerException("Null id");
    }
    
    public final boolean a() {
        return !TextUtils.isEmpty((CharSequence)this.a) && !this.c.h() && this.b.isEmpty();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adro) {
            final adro adro = (adro)o;
            if (this.a.equals(adro.a) && this.b.equals(adro.b) && this.c.equals(adro.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("UploadTaskFutureResult{id=");
        sb.append(a);
        sb.append(", unmetRequirements=");
        sb.append(value);
        sb.append(", retryTime=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
