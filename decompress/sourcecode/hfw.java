import java.util.List;
import android.net.Uri;
import android.os.Parcelable;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfw implements hga
{
    private final bu a;
    private final auip b;
    
    public hfw(final bu a, final auip b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final hgc hgc) {
        final Intent intent = new Intent(this.a.getApplicationContext(), (Class)UploadActivity.class);
        intent.setAction("com.google.android.youtube.intent.action.INTERNAL_UPLOAD");
        intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", hgc.a.k);
        intent.setDataAndType(hgc.b, "video/*");
        intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_hide_preview", true);
        final Uri c = hgc.c;
        if (c != null) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_edited_video_uri", (Parcelable)c);
        }
        final int s = hgc.s;
        if (s != 0) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_flavor", s - 1);
            final String e = hgc.e;
            if (e != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_shorts_project_path", e);
            }
            final String f = hgc.f;
            if (f != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_shorts_project_id", f);
            }
            final Long j = hgc.j;
            if (j != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_duration_ms", (long)j);
            }
            final Integer h = hgc.h;
            if (h != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_height", (int)h);
            }
            final Integer g = hgc.g;
            if (g != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_width", (int)g);
            }
            final Integer i = hgc.i;
            if (i != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_target_output_video_quality", (int)i);
            }
            if (hgc.d != null) {
                final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                agzc.e((agyr)amoa.b, hgc.d);
                intent.putExtra("navigation_endpoint", ((agxl)agzc.build()).toByteArray());
            }
            final apmo n = hgc.n;
            if (n != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_shorts_creation", ((agxl)n).toByteArray());
            }
            if (hgc.o) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_uses_yt_audio_source", true);
            }
            if (hgc.p) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", true);
            }
            apgj apgj;
            if ((apgj = ((arud)this.b.a).f().h) == null) {
                apgj = apgj.a;
            }
            final boolean u = apgj.u;
            int k = 0;
            if (u) {
                intent.putExtra("navigate_to_my_uploads", false);
            }
            final String q = hgc.q;
            if (q != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id", q);
            }
            final String l = hgc.k;
            if (l != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_flow_logging_nonce", l);
            }
            final afcr m = hgc.m;
            if (m != null) {
                final int[] array = new int[m.size()];
                final afcr m2 = hgc.m;
                for (int size = ((List)m2).size(), n2 = 0; k < size; ++k, ++n2) {
                    array[n2] = ((aocs)((List)m2).get(k)).w;
                }
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_creation_surfaces", array);
            }
            final String l2 = hgc.l;
            if (l2 != null && !l2.isEmpty()) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path", hgc.l);
            }
            final String r = hgc.r;
            if (r != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_title", r);
            }
            ((qt)this.a).startActivityForResult(intent, 902);
            return;
        }
        throw null;
    }
}
