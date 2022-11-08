import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gid
{
    public final bu a;
    public gig b;
    public final arud c;
    public final hyq d;
    private final atjj e;
    private ListenableFuture f;
    
    public gid(final mrm mrm, final bu a, final hyq d, final arud c, final atjj e, final hdv hdv, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = gig.b();
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
        mrm.A((Callable)new exk(this, hdv, 11, null));
    }
    
    static boolean b(final PlayerResponseModel playerResponseModel) {
        return playerResponseModel != null && aaja.m(playerResponseModel.y());
    }
    
    public static boolean c(final abtt abtt) {
        return abtt != null && g(abtt) && b(abtt.d());
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
        final akuv y = playerResponseModel.y();
        return aaja.m(y) || aaja.p(y);
    }
    
    public static boolean f(final abtt abtt) {
        return abtt != null && e(abtt.d());
    }
    
    public static boolean g(final abtt abtt) {
        return abtt != null && abtt.d() != null;
    }
    
    public final ListenableFuture a() {
        if (this.f == null) {
            this.f = ((hdv)this.e.a()).d();
        }
        return this.f;
    }
}
