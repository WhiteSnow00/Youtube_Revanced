import android.content.Context;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.libraries.video.preview.VideoWithPreviewView;

// 
// Decompiled by Procyon v0.6.0
// 

final class eqf implements usy
{
    final Object a;
    private final int b;
    
    public eqf(final eqd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eqf(final eqg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final uta a(final VideoWithPreviewView videoWithPreviewView, final rdb rdb, final Track track, final long n, final int n2, final boolean b, final int n3) {
        if (this.b != 0) {
            final eqd eqd = (eqd)this.a;
            return vdh.Q((Context)eqd.a.qg.a, (uol)eqd.d.A.a(), videoWithPreviewView, rdb, track, n, n2, b, n3);
        }
        final eqg eqg = (eqg)this.a;
        return vdh.Q((Context)eqg.a.qg.a, (uol)eqg.b.eW.a(), videoWithPreviewView, rdb, track, n, n2, b, n3);
    }
}
