import com.google.apps.tiktok.account.AccountId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeka
{
    public final AccountId a;
    private final aejz b;
    
    public aeka() {
    }
    
    public aeka(final AccountId a, final aejz b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null id");
    }
    
    public static aeka a(final AccountId accountId, final aejz aejz) {
        return new aeka(accountId, aejz);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aeka) {
            final aeka aeka = (aeka)o;
            if (this.a.equals(aeka.a) && ((ahbh)this.b).equals((Object)aeka.b)) {
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
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final StringBuilder sb = new StringBuilder("AccountContext{id=");
        sb.append(string);
        sb.append(", info=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
