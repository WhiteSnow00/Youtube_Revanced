// 
// Decompiled by Procyon v0.6.0
// 

public final class aajy
{
    public final boolean a;
    
    public aajy() {
    }
    
    public aajy(final boolean a) {
        this.a = a;
    }
    
    public static aajy a(final boolean b) {
        return new aajy(b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof aajy && this.a == ((aajy)o).a);
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (n ^ 0xF4243) * 1000003;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final StringBuilder sb = new StringBuilder("OfflineActionDialogConfig{shouldShow=");
        sb.append(a);
        sb.append(", removeActionType=0}");
        return sb.toString();
    }
}
