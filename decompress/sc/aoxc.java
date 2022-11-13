import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxc implements vfu
{
    public static final vfv a;
    public final aoxd b;
    private final vfp c;
    
    static {
        a = new aoxb();
    }
    
    public aoxc(final aoxd b, final vfp c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vfk a() {
        return this.f();
    }
    
    public final afft b() {
        final affr affr = new affr();
        if (this.b.h.size() > 0) {
            affr.j((Iterable)this.b.h);
        }
        if (this.b.n.size() > 0) {
            affr.j((Iterable)this.b.n);
        }
        final afkf d = ((afeq)this.getStreamProgressModels()).D();
        while (((Iterator)d).hasNext()) {
            final aolm aolm = (aolm)((Iterator)d).next();
            affr.j((Iterable)aolm.a());
        }
        return affr.g();
    }
    
    public final afeq c() {
        final afel afel = new afel();
        final Iterator<Object> iterator = ((List<Object>)this.b.h).iterator();
        while (iterator.hasNext()) {
            final vfn b = this.c.b((String)iterator.next());
            if (b != null) {
                if (!(b instanceof amwl)) {
                    final String string = b.toString();
                    final StringBuilder sb = new StringBuilder("Entity ");
                    sb.append(string);
                    sb.append(" is not a OfflineVideoStreamsEntityModel");
                    throw new IllegalArgumentException(sb.toString());
                }
                afel.h((Object)b);
            }
        }
        return afel.g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aoxc && ((ahbh)this.b).equals((Object)((aoxc)o).b);
    }
    
    public final aoxa f() {
        return new aoxa((ahbb)((ahbh)this.b).toBuilder());
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
    
    public aowz getFailureReason() {
        aowz aowz;
        if ((aowz = aowz.b(this.b.g)) == null) {
            aowz = aowz.a;
        }
        return aowz;
    }
    
    public Boolean getHasLoggedFirstStarted() {
        return this.b.q;
    }
    
    public Boolean getIsRefresh() {
        return this.b.p;
    }
    
    public amwz getMaximumDownloadQuality() {
        amwz amwz;
        if ((amwz = amwz.b(this.b.k)) == null) {
            amwz = amwz.a;
        }
        return amwz;
    }
    
    public String getPreferredAudioTrack() {
        return this.b.m;
    }
    
    public List getStreamProgress() {
        return (List)this.b.f;
    }
    
    public List getStreamProgressModels() {
        final afel afel = new afel();
        final Iterator<Object> iterator = ((List<Object>)this.b.f).iterator();
        while (iterator.hasNext()) {
            afel.h((Object)aolm.b((aoln)iterator.next()).F());
        }
        return (List)afel.g();
    }
    
    public Integer getTransferRetryCount() {
        return this.b.o;
    }
    
    public aowy getTransferState() {
        aowy aowy;
        if ((aowy = aowy.b(this.b.e)) == null) {
            aowy = aowy.a;
        }
        return aowy;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aoxc.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
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
