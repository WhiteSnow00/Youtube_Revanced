// 
// Decompiled by Procyon v0.6.0
// 

public final class huq
{
    public final apij a;
    public final apij b;
    
    public huq() {
    }
    
    public huq(final apij a, final apij b) {
        this.a = a;
        this.b = b;
    }
    
    public static huq a(final vft vft) {
        return new huq(b(vft.b), b(vft.c));
    }
    
    private static apij b(final vfn vfn) {
        if (vfn instanceof apij) {
            return (apij)vfn;
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof huq) {
            final huq huq = (huq)o;
            final apij a = this.a;
            if (a == null) {
                if (huq.a != null) {
                    return false;
                }
            }
            else if (!a.equals((Object)huq.a)) {
                return false;
            }
            final apij b = this.b;
            final apij b2 = huq.b;
            if (b == null) {
                if (b2 != null) {
                    return false;
                }
            }
            else if (!b.equals((Object)b2)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final apij a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final apij b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("UploadStatusEntityPair{previousEntity=");
        sb.append(value);
        sb.append(", currentEntity=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
