import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abcu implements Runnable, abdg
{
    private final abdh a;
    private final PlaybackStartDescriptor b;
    private final abig c;
    private final acb d;
    private final aeby e;
    
    public abcu(final abdh a, final aeby e, final acb d, final PlaybackStartDescriptor b, final abig c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.e = e;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            this.d.d((Throwable)new IllegalArgumentException("Empty prefetch response."));
        }
        if (!aaja.o(playerResponseModel.y())) {
            this.d.d((Throwable)new IllegalArgumentException("Prefetch not playable."));
        }
        final aeby e = this.e;
        final acb d = this.d;
        final abig c = this.c;
        final auip auip = (auip)((atjj)e.a).a();
        auip.getClass();
        final abct abct = new abct(auip, d, c, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        szc.e();
        abct.b.aB(playerResponseModel, playerResponseModel.m().A(), abct.a.a, (ydu)abct);
    }
    
    public final void c(final int n) {
        if (n == 4) {
            this.d.d((Throwable)new IllegalArgumentException("Prefetch failed."));
        }
    }
    
    @Override
    public final void run() {
        szc.e();
        this.a.b(this.b, this.c.b, (abdg)this);
    }
}
