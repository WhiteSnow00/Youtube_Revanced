// 
// Decompiled by Procyon v0.6.0
// 

final class ldm
{
    private final String a;
    private final String b;
    
    public ldm() {
    }
    
    public ldm(final String a, final String b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null videoId");
    }
    
    static ldm a(final String s, final String s2) {
        return new ldm(s, s2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ldm) {
            final ldm ldm = (ldm)o;
            if (this.a.equals(ldm.a)) {
                final String b = this.b;
                final String b2 = ldm.b;
                if (b == null) {
                    if (b2 != null) {
                        return false;
                    }
                }
                else if (!b.equals(b2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("VideoIdentifier{videoId=");
        sb.append(a);
        sb.append(", playlistSetVideoId=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
