import com.google.apps.tiktok.account.AccountId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejy
{
    public final AccountId a;
    public final aejz b;
    public final int c;
    
    public aejy() {
    }
    
    public aejy(final AccountId a, final aejz b, final int c) {
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null info");
    }
    
    public static aejy a(final AccountId accountId, final aejz aejz, final int n) {
        return new aejy(accountId, aejz, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aejy) {
            final aejy aejy = (aejy)o;
            if (this.a.equals(aejy.a) && ((ahbh)this.b).equals((Object)aejy.b) && this.c == aejy.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ ((ahbh)this.b).hashCode()) * 1000003 ^ this.c;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final String string3 = Integer.toString(this.c - 1);
        final StringBuilder sb = new StringBuilder("Account{id=");
        sb.append(string);
        sb.append(", info=");
        sb.append(string2);
        sb.append(", state=");
        sb.append(string3);
        sb.append("}");
        return sb.toString();
    }
}
