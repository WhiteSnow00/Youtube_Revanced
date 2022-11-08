// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.account;

public final class AutoValue_AccountId extends AccountId
{
    public final int a;
    
    public AutoValue_AccountId(final int a) {
        this.a = a;
    }
    
    @Deprecated
    public final int a() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof AccountId && this.a == ((AccountId)o).a());
    }
    
    public final int hashCode() {
        return this.a ^ 0xF4243;
    }
    
    public final String toString() {
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("AccountId{id=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
