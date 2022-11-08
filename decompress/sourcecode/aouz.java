import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aouz implements vdt
{
    public static final vdu a;
    public final aova b;
    private final vdo c;
    
    static {
        a = new aouy();
    }
    
    public aouz(final aova b, final vdo c) {
        this.b = b;
        this.c = c;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        if (this.b.h.size() > 0) {
            afds.j((Iterable)this.b.h);
        }
        if (this.b.n.size() > 0) {
            afds.j((Iterable)this.b.n);
        }
        final afif d = ((afcr)this.getStreamProgressModels()).D();
        while (((Iterator)d).hasNext()) {
            final aojj aojj = (aojj)((Iterator)d).next();
            afds.j((Iterable)aojj.a());
        }
        return afds.g();
    }
    
    public final afcr c() {
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.b.h).iterator();
        while (iterator.hasNext()) {
            final vdm b = this.c.b((String)iterator.next());
            if (b != null) {
                if (!(b instanceof amuh)) {
                    final String string = b.toString();
                    final StringBuilder sb = new StringBuilder("Entity ");
                    sb.append(string);
                    sb.append(" is not a OfflineVideoStreamsEntityModel");
                    throw new IllegalArgumentException(sb.toString());
                }
                afcm.h(b);
            }
        }
        return afcm.g();
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aouz && ((agzi)this.b).equals(((aouz)o).b);
    }
    
    public final aoux f() {
        return new aoux((agzc)((agzi)this.b).toBuilder());
    }
    
    public final List g() {
        return (List)this.b.h;
    }
    
    public String getCotn() {
        return this.b.i;
    }
    
    public Long getEnqueuedTimestampMs() {
        return this.b.j;
    }
    
    public aouw getFailureReason() {
        aouw aouw;
        if ((aouw = aouw.b(this.b.g)) == null) {
            aouw = aouw.a;
        }
        return aouw;
    }
    
    public Boolean getHasLoggedFirstStarted() {
        return this.b.q;
    }
    
    public Boolean getIsRefresh() {
        return this.b.p;
    }
    
    public amuv getMaximumDownloadQuality() {
        amuv amuv;
        if ((amuv = amuv.b(this.b.k)) == null) {
            amuv = amuv.a;
        }
        return amuv;
    }
    
    public String getPreferredAudioTrack() {
        return this.b.m;
    }
    
    public List getStreamProgress() {
        return (List)this.b.f;
    }
    
    public List getStreamProgressModels() {
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.b.f).iterator();
        while (iterator.hasNext()) {
            afcm.h(aojj.b((aojk)iterator.next()).K());
        }
        return (List)afcm.g();
    }
    
    public Integer getTransferRetryCount() {
        return this.b.o;
    }
    
    public aouv getTransferState() {
        aouv aouv;
        if ((aouv = aouv.b(this.b.e)) == null) {
            aouv = aouv.a;
        }
        return aouv;
    }
    
    public vdu getType() {
        return aouz.a;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TransferEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
