// 
// Decompiled by Procyon v0.6.0
// 

public final class aosq implements vdt
{
    public static final vdu a;
    private final aosr b;
    
    static {
        a = new aosp();
    }
    
    public aosq(final aosr b) {
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        this.getTimestampModel();
        afds.j((Iterable)new afds().g());
        return afds.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aosq && this.b.equals(((aosq)o).b);
    }
    
    public String getFormattedTime() {
        return this.b.e;
    }
    
    public aost getTimestamp() {
        aost aost;
        if ((aost = this.b.d) == null) {
            aost = aost.a;
        }
        return aost;
    }
    
    public aoss getTimestampModel() {
        aost aost;
        if ((aost = this.b.d) == null) {
            aost = aost.a;
        }
        return new aoss((aost)aost.toBuilder().build());
    }
    
    public vdu getType() {
        return aosq.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TimestampEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
