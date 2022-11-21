// 
// Decompiled by Procyon v0.6.0
// 

public final class aopd implements vhc
{
    public static final vhd a;
    private final aope b;
    
    static {
        a = new aopc();
    }
    
    public aopd(final aope b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aopb(this.b.toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aopd && this.b.equals(((aopd)o).b);
    }
    
    public aopf getState() {
        aopf aopf;
        if ((aopf = aopf.b(this.b.d)) == null) {
            aopf = aopf.a;
        }
        return aopf;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aopd.a;
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
