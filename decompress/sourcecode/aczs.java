import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.SharingProviderDataCommandOuterClass$SharingProviderDataCommand;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczs implements vau
{
    public static final String a;
    public final vax b;
    public bi c;
    private final Executor d;
    private final vmt e;
    private final cl f;
    private final wwu g;
    private final atjj h;
    
    static {
        a = trn.a("SharingProviderDataCommandResolver");
    }
    
    public aczs(final vax b, final Executor d, final vmt e, final cl f, final wwu g, final atjj h) {
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        this.h = h;
    }
    
    public final void mE(aioe aioe, final Map map) {
        final SharingProviderDataCommandOuterClass$SharingProviderDataCommand sharingProviderDataCommandOuterClass$SharingProviderDataCommand = (SharingProviderDataCommandOuterClass$SharingProviderDataCommand)((agzd)aioe).rr((agyr)SharingProviderDataCommandOuterClass$SharingProviderDataCommand.sharingProviderDataCommand);
        final boolean d = sharingProviderDataCommandOuterClass$SharingProviderDataCommand.d;
        final aczl aczl = (aczl)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)aczl.class);
        if (aczl != null) {
            aczl.j();
        }
        if (d) {
            final adbp adbp = (adbp)this.h.a();
            (this.c = new aczx()).rD(this.f, "fullscreen_spinner_fragment");
        }
        wwv n;
        if (map == null || (n = map.get("interaction_logger_override")) == null) {
            n = this.g.n();
        }
        n.J(3, (wxz)new wws(aioe.c), (alff)null);
        final vmt e = this.e;
        final String c = sharingProviderDataCommandOuterClass$SharingProviderDataCommand.c;
        final afsl a = afsl.a;
        final vmz vmz = new vmz(e.c, e.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        vmz.a = c;
        tcp.k(((vkm)e).c((MessageLite)akoq.a, e.f, (tad)vmq.g, (tac)vlh.s).b((vjn)vmz, (Executor)a), this.d, (tcn)new aczq(this, sharingProviderDataCommandOuterClass$SharingProviderDataCommand, d), (tco)new aczr(this, d, 0));
        if ((sharingProviderDataCommandOuterClass$SharingProviderDataCommand.b & 0x4) != 0x0) {
            final vax b = this.b;
            if ((aioe = sharingProviderDataCommandOuterClass$SharingProviderDataCommand.e) == null) {
                aioe = aioe.a;
            }
            b.a(aioe);
        }
    }
}
