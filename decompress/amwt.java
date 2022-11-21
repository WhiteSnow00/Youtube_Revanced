import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwt implements vhc
{
    public static final vhd a;
    public final amwu b;
    private final vgx c;
    
    static {
        a = new amws();
    }
    
    public amwt(final amwu b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return new amwr(((ahcz)this.b).toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        afhi.j(this.getActionProtoModel().a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amwt && ((ahcz)this.b).equals(((amwt)o).b);
    }
    
    public amwq getActionProto() {
        amwq amwq;
        if ((amwq = this.b.f) == null) {
            amwq = amwq.a;
        }
        return amwq;
    }
    
    public amwp getActionProtoModel() {
        amwq amwq;
        if ((amwq = this.b.f) == null) {
            amwq = amwq.a;
        }
        return amwp.b(amwq).s(this.c);
    }
    
    public List getChildActionIds() {
        return (List)this.b.i;
    }
    
    public Long getEnqueueTimeNs() {
        final amwu b = this.b;
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
        final amwu b = this.b;
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
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amwt.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
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
