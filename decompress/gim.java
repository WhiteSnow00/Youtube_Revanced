import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gim
{
    public final bu a;
    public gip b;
    public final arwh c;
    public final hzm d;
    private final atke e;
    private ListenableFuture f;
    
    public gim(final msr msr, final bu a, final hzm d, final arwh c, final atke e, final eg eg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = gip.b();
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
        msr.Q((Callable)new exo(this, eg, 11, (byte[])null, (byte[])null));
    }
    
    static boolean b(final PlayerResponseModel playerResponseModel) {
        return playerResponseModel != null && aakv.m(playerResponseModel.y());
    }
    
    public static boolean c(final abvx abvx) {
        return abvx != null && g(abvx) && b(abvx.d());
    }
    
    public static boolean d(final PlayerResponseModel playerResponseModel, final boolean b, final boolean b2) {
        return playerResponseModel != null && e(playerResponseModel) && b && b2;
    }
    
    static boolean e(final PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            return true;
        }
        final VideoStreamingData n = playerResponseModel.n();
        if (n != null && (n.r() || n.B())) {
            return false;
        }
        final akwz y = playerResponseModel.y();
        return aakv.m(y) || aakv.p(y);
    }
    
    public static boolean f(final abvx abvx) {
        return abvx != null && e(abvx.d());
    }
    
    public static boolean g(final abvx abvx) {
        return abvx != null && abvx.d() != null;
    }
    
    public final ListenableFuture a() {
        if (this.f == null) {
            this.f = ((eg)this.e.a()).M();
        }
        return this.f;
    }
}
