import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amuo implements vfu
{
    public static final vfv a;
    public final amup b;
    private final vfp c;
    
    static {
        a = new amun();
    }
    
    public amuo(final amup b, final vfp c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vfk a() {
        return new amum(((ahbh)this.b).toBuilder());
    }
    
    public final afft b() {
        final affr affr = new affr();
        affr.j((Iterable)this.getActionProtoModel().a());
        return affr.g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amuo && ((ahbh)this.b).equals((Object)((amuo)o).b);
    }
    
    public amul getActionProto() {
        amul amul;
        if ((amul = this.b.f) == null) {
            amul = amul.a;
        }
        return amul;
    }
    
    public amuk getActionProtoModel() {
        amul amul;
        if ((amul = this.b.f) == null) {
            amul = amul.a;
        }
        return amuk.b(amul).H(this.c);
    }
    
    public List getChildActionIds() {
        return (List)this.b.i;
    }
    
    public Long getEnqueueTimeNs() {
        final amup b = this.b;
        long longValue;
        if (b.c == 11) {
            longValue = (long)b.d;
        }
        else {
            longValue = 0L;
        }
        return longValue;
    }
    
    public Long getEnqueueTimeSec() {
        final amup b = this.b;
        long longValue;
        if (b.c == 3) {
            longValue = (long)b.d;
        }
        else {
            longValue = 0L;
        }
        return longValue;
    }
    
    public Boolean getHasChildActionFailed() {
        return this.b.m;
    }
    
    public String getParentActionId() {
        return this.b.h;
    }
    
    public List getPostreqActionIds() {
        return (List)this.b.k;
    }
    
    public String getPrereqActionId() {
        return this.b.j;
    }
    
    public Integer getRetryScheduleIndex() {
        return this.b.l;
    }
    
    public String getRootActionId() {
        return this.b.g;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return amuo.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("OfflineOrchestrationActionWrapperEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
