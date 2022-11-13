import android.view.View;
import android.content.Context;
import com.google.protos.youtube.api.innertube.PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsr extends utv
{
    public final PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer a;
    public final hsu b;
    public final ackm c;
    
    public hsr(final bu bu, final hsu b, final anuv anuv, final ackm c) {
        super((Context)bu, bu.getSupportFragmentManager(), (wyw)null, false, false);
        this.b = b;
        this.a = (PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer)anuv.rx((ahaq)PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.pendingReelUploadsBottomSheetRenderer);
        this.c = c;
    }
    
    protected final View a() {
        return (View)this.b.f;
    }
    
    protected final String f() {
        ajut ajut;
        if ((ajut = this.a.c) == null) {
            ajut = ajut.a;
        }
        return acak.b(ajut).toString();
    }
}
