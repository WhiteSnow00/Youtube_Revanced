// 
// Decompiled by Procyon v0.6.0
// 

public final class aomt implements vfu
{
    public static final vfv a;
    private final aomu b;
    
    static {
        a = new aoms();
    }
    
    public aomt(final aomu b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aomr(this.b.toBuilder());
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aomt && this.b.equals((Object)((aomt)o).b);
    }
    
    public aomv getState() {
        aomv aomv;
        if ((aomv = aomv.b(this.b.d)) == null) {
            aomv = aomv.a;
        }
        return aomv;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aomt.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("SubscriptionNotificationSettingEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
