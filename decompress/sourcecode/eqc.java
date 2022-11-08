import android.content.Context;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.libraries.video.preview.VideoWithPreviewView;

// 
// Decompiled by Procyon v0.6.0
// 

final class eqc implements urd
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public eqc(final eqa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eqc(final eqd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final urf a(final VideoWithPreviewView videoWithPreviewView, final rbi rbi, final Track track, final long n, final int n2, final boolean b, final int n3) {
        if (this.b != 0) {
            final eqa eqa = (eqa)this.a;
            return vem.N((Context)eqa.a.qg.a, (umo)eqa.d.B.a(), videoWithPreviewView, rbi, track, n, n2, b, n3);
        }
        final eqd eqd = (eqd)this.a;
        return vem.N((Context)eqd.a.qg.a, (umo)eqd.b.eV.a(), videoWithPreviewView, rbi, track, n, n2, b, n3);
    }
}
