import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.TranscodeOptions;
import android.net.Uri;
import android.content.Context;
import com.google.android.libraries.video.editablevideo.EditableVideo;

// 
// Decompiled by Procyon v0.6.0
// 

final class hej implements hel
{
    final /* synthetic */ hek a;
    
    public hej(final hek a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.r();
    }
    
    public final void b(final EditableVideo editableVideo) {
        this.a.aL();
        final hek a = this.a;
        final Uri ah = a.ah;
        final uac ai = a.ai;
        ai.getClass();
        final aqyq b = hgd.b(editableVideo, ah, ai.c);
        final agza builder = ((agzi)apit.a).createBuilder();
        final boolean l = editableVideo.L();
        builder.copyOnWrite();
        final apit apit = (apit)builder.instance;
        apit.b |= 0x1;
        apit.c = l;
        final boolean i = editableVideo.I();
        builder.copyOnWrite();
        final apit apit2 = (apit)builder.instance;
        apit2.b |= 0x2;
        apit2.d = i;
        final apit apit3 = (apit)builder.build();
        final hek a2 = this.a;
        if (!editableVideo.L()) {
            if (!editableVideo.I()) {
                if (!a2.aM()) {
                    final hek a3 = this.a;
                    final tzs ar = a3.ar;
                    final uac ai2 = a3.ai;
                    ai2.getClass();
                    ar.g((uab)ai2);
                    this.a.am.m();
                    return;
                }
            }
        }
        if (uab.ad(this.a.ar.b())) {
            final tzs ar2 = this.a.ar;
            final tzw f = tzw.f("TrimProjectState", (Context)ar2.d);
            if (f != null) {
                f.G();
            }
            final tzw e = tzw.e((Context)ar2.d, ((acko)ar2.c).c(), "TrimProjectState");
            tmy.bG((Context)ar2.d);
            ar2.h((uab)e);
            if (this.a.aH.bu()) {
                this.a.az.j(60.0f);
            }
        }
        if (this.a.aH.bx()) {
            final hek a4 = this.a;
            if (a4.e == 5) {
                final hyq az = a4.az;
                if (az.e() == 6) {
                    final tzw h = az.h();
                    if (h != null && !h.S()) {
                        final double n = editableVideo.b.j();
                        final double d = editableVideo.d();
                        final double a5 = editableVideo.a();
                        Double.isNaN(n);
                        if ((int)Math.round(n * (1.0 - d - a5)) < 1600) {
                            az.i(5);
                        }
                    }
                }
            }
        }
        final hek a6 = this.a;
        TranscodeOptions transcodeOptions;
        if (a6.aM()) {
            if (a6.aH.bx() && a6.e == 7) {
                transcodeOptions = hgd.e(editableVideo, a6.az.e(), 30.0f, true);
            }
            else {
                transcodeOptions = a6.az.g();
            }
        }
        else if (a6.aH.bu()) {
            transcodeOptions = hgd.e(editableVideo, a6.az.e(), 60.0f, editableVideo.I());
        }
        else if (editableVideo.I()) {
            transcodeOptions = a6.az.g();
        }
        else {
            transcodeOptions = hgd.e(editableVideo, 5, 60.0f, false);
        }
        this.a.o((trb)new hei(this, b, apit3, transcodeOptions, 0));
    }
}
