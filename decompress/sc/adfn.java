// 
// Decompiled by Procyon v0.6.0
// 

public final class adfn
{
    public final String a;
    public final aicn b;
    
    public adfn() {
    }
    
    public adfn(final String a, final aicn b) {
        if (a == null) {
            throw new NullPointerException("Null filterChipBarId");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null browseFormData");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adfn) {
            final adfn adfn = (adfn)o;
            if (this.a.equals(adfn.a) && ((ahbh)this.b).equals((Object)adfn.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ ((ahbh)this.b).hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("FilterState{filterChipBarId=");
        sb.append(a);
        sb.append(", browseFormData=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
