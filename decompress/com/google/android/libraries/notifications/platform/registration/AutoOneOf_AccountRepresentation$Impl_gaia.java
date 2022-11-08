// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.notifications.platform.registration;

public final class AutoOneOf_AccountRepresentation$Impl_gaia extends AutoOneOf_AccountRepresentation$Parent_
{
    private final String a;
    
    public AutoOneOf_AccountRepresentation$Impl_gaia(final String a) {
        this.a = a;
    }
    
    public final pru a() {
        return pru.a;
    }
    
    public final String b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof AccountRepresentation) {
            final AccountRepresentation accountRepresentation = (AccountRepresentation)o;
            if (pru.a == accountRepresentation.a() && this.a.equals(accountRepresentation.b())) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("AccountRepresentation{gaia=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
