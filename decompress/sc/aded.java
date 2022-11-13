// 
// Decompiled by Procyon v0.6.0
// 

public final class aded
{
    public final String a;
    public final String b;
    public final String c;
    
    public aded() {
    }
    
    public aded(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static aded a(final String s, final String s2, final String s3) {
        final aded aded = new aded(s2, s, s3);
        adkp.I(aded.b.isEmpty() ^ true, (Object)"userId cannot be empty");
        adkp.I(aded.c.isEmpty() ^ true, (Object)"Key cannot be empty.");
        adkp.I(aded.a.isEmpty() ^ true, (Object)"namespace cannot be empty.");
        return aded;
    }
    
    public static aded b(final String s) {
        adkp.M("AppGlobalScope".equals(s) ^ true, "userId cannot be %s. Use createAppGlobalKey to generate an app scoped key.", (Object)"AppGlobalScope");
        adkp.M("SignedOutID".equals(s) ^ true, "userId cannot be %s. Use createSignedOutUserKey to generate a key for signed out user.", (Object)"SignedOutID");
        return a(s, "search_namespace", "voice_language");
    }
    
    public static aded c() {
        return a("SignedOutID", "search_namespace", "voice_language");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aded) {
            final aded aded = (aded)o;
            if (this.a.equals(aded.a) && this.b.equals(aded.b) && this.c.equals(aded.c)) {
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
