import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adsw implements odw
{
    public final adsx a;
    
    public adsw(final adsx a) {
        this.a = a;
    }
    
    private final void e(final int n) {
        ((adsy)this.a.l.get()).d.q(n);
        if (this.a.e.isPresent()) {
            this.a.k();
        }
        if (this.a.d.isPresent()) {
            this.a.j();
        }
        this.a.l();
    }
    
    public final void a(final ocw ocw) {
        this.a.j.execute(new adra(this, ocw, 4));
    }
    
    public final void b(final ocx ocx) {
        if (((List)ocx.b).isEmpty()) {
            ((afly)((afly)((aflw)adsx.c).f()).j("com/google/android/livesharing/internal/LiveSharingClientImpl$LiveSharingIpcHandler", "handleParticipantMetadataSetUpdate", 806, "LiveSharingClientImpl.java")).r("Participant metadata set is empty. Not updating delegate.");
            return;
        }
        this.a.j.execute(new adra(this, ocx, 5));
    }
    
    public final void c(final agvu agvu) {
        this.a.j.execute(new adra(this, agvu, 6));
    }
    
    public final void d(final ocw ocw) {
        final afly afly = (afly)((afly)((aflw)adsx.c).d()).j("com/google/android/livesharing/internal/LiveSharingClientImpl$LiveSharingIpcHandler", "lambda$handleMeetingStateUpdate$2", 845, "LiveSharingClientImpl.java");
        odd odd;
        if ((odd = odd.a(ocw.d)) == null) {
            odd = odd.i;
        }
        afly.t("Received updated Meeting State : %s", (Object)odd);
        if (!this.a.m()) {
            ((afly)((afly)((aflw)adsx.c).h()).j("com/google/android/livesharing/internal/LiveSharingClientImpl$LiveSharingIpcHandler", "lambda$handleMeetingStateUpdate$2", 851, "LiveSharingClientImpl.java")).r("Received a meeting state update while disconnected");
            return;
        }
        try {
            this.a.s = adtu.b(ocw);
        }
        catch (final AssertionError assertionError) {
            c.i(((aflw)adsx.c).g(), "Invalid meeting info proto.", "com/google/android/livesharing/internal/LiveSharingClientImpl$LiveSharingIpcHandler", "lambda$handleMeetingStateUpdate$2", '\u035b', "LiveSharingClientImpl.java", assertionError);
        }
        final odd g = odd.g;
        odd odd2;
        if ((odd2 = odd.a(ocw.d)) == null) {
            odd2 = odd.i;
        }
        if (g.equals((Object)odd2)) {
            this.e(1);
            return;
        }
        final odd h = odd.h;
        odd odd3;
        if ((odd3 = odd.a(ocw.d)) == null) {
            odd3 = odd.i;
        }
        if (h.equals((Object)odd3)) {
            this.e(2);
        }
    }
}
