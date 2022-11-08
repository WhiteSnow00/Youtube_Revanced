// 
// Decompiled by Procyon v0.6.0
// 

public final class adcb
{
    public final String a;
    public final String b;
    public final String c;
    
    public adcb() {
    }
    
    public adcb(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static adcb a(final String s, final String s2, final String s3) {
        final adcb adcb = new adcb(s2, s, s3);
        agot.v(adcb.b.isEmpty() ^ true, (Object)"userId cannot be empty");
        agot.v(adcb.c.isEmpty() ^ true, (Object)"Key cannot be empty.");
        agot.v(adcb.a.isEmpty() ^ true, (Object)"namespace cannot be empty.");
        return adcb;
    }
    
    public static adcb b(final String s) {
        agot.z("AppGlobalScope".equals(s) ^ true, "userId cannot be %s. Use createAppGlobalKey to generate an app scoped key.", (Object)"AppGlobalScope");
        agot.z("SignedOutID".equals(s) ^ true, "userId cannot be %s. Use createSignedOutUserKey to generate a key for signed out user.", (Object)"SignedOutID");
        return a(s, "search_namespace", "voice_language");
    }
    
    public static adcb c() {
        return a("SignedOutID", "search_namespace", "voice_language");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adcb) {
            final adcb adcb = (adcb)o;
            if (this.a.equals(adcb.a) && this.b.equals(adcb.b) && this.c.equals(adcb.c)) {
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
        final String b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder("BlobStorageKey{namespace=");
        sb.append(a);
        sb.append(", userId=");
        sb.append(b);
        sb.append(", key=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
