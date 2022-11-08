import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.youtube.creation.trim.crop.CroppedVideoWithPreviewView;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

final class hee implements uco
{
    final /* synthetic */ wxf a;
    private final /* synthetic */ int b;
    
    public hee(final hea a, final int b) {
        this.b = b;
        this.a = (wxf)a;
    }
    
    public hee(final hef a, final int b) {
        this.b = b;
        this.a = (wxf)a;
    }
    
    public final void b(final float n) {
        if (this.b != 0) {
            return;
        }
        final hef hef = (hef)this.a;
        final CroppedVideoWithPreviewView d = hef.d();
        final auip ak = hef.aK;
        final avt aj = hef.aJ;
        if (aj != null) {
            final maw ag = hef.aG;
            if (ag != null && d != null && ak != null) {
                final boolean ag2 = hef.ag;
                Optional optional = null;
                Label_0141: {
                    if (d.g()) {
                        aj.S(wya.c(121259)).i();
                        d.j(n);
                        if (ag2) {
                            ((urf)ag.b).m();
                        }
                        final EditableVideo d2 = ((urf)ag.b).d;
                        if (d2 != null) {
                            ak.bm(d2);
                            optional = Optional.ofNullable((Object)d2);
                            break Label_0141;
                        }
                    }
                    optional = Optional.empty();
                }
                if (optional.isPresent()) {
                    final EditableVideo editableVideo = (EditableVideo)optional.get();
                    final agza builder = ((agzi)hef.ai).toBuilder();
                    final double b = editableVideo.b();
                    builder.copyOnWrite();
                    final aqyq aqyq = (aqyq)builder.instance;
                    aqyq.b |= 0x20;
                    aqyq.h = (float)b;
                    final double d3 = editableVideo.d();
                    builder.copyOnWrite();
                    final aqyq aqyq2 = (aqyq)builder.instance;
                    aqyq2.b |= 0x4;
                    aqyq2.e = (float)d3;
                    final double c = editableVideo.c();
                    builder.copyOnWrite();
                    final aqyq aqyq3 = (aqyq)builder.instance;
                    aqyq3.b |= 0x10;
                    aqyq3.g = (float)c;
                    final double a = editableVideo.a();
                    builder.copyOnWrite();
                    final aqyq aqyq4 = (aqyq)builder.instance;
                    aqyq4.b |= 0x8;
                    aqyq4.f = (float)a;
                    hef.ai = (aqyq)builder.build();
                }
            }
        }
    }
    
    public final void nx() {
        if (this.b != 0) {
            hgd.D(((hea)this.a).aI, 97091);
            final CroppedVideoWithPreviewView a = ((hea)this.a).a();
            if (a != null) {
                final wxf a2 = this.a;
                final hea hea = (hea)a2;
                if (hgd.A((rbi)hea.ah, hea.ai, hea.aF, (VideoWithPreviewView)a, ((br)a2).nT(), ((hea)this.a).r())) {
                    final hea hea2 = (hea)this.a;
                    hea2.ae = (hea2.r() ^ true);
                }
            }
            return;
        }
        hgd.D(((hef)this.a).aJ, 97091);
        final CroppedVideoWithPreviewView d = ((hef)this.a).d();
        if (d != null) {
            final wxf a3 = this.a;
            final hef hef = (hef)a3;
            if (hgd.A((rbi)hef.an, hef.ao, hef.aG, (VideoWithPreviewView)d, ((br)a3).nT(), ((hef)this.a).aL())) {
                final hef hef2 = (hef)this.a;
                hef2.ag = (hef2.aL() ^ true);
            }
        }
    }
}
