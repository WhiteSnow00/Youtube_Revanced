import java.util.concurrent.Executor;
import android.net.Uri;
import java.util.function.Consumer;
import java.util.function.Function;
import j$.util.Optional;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hue implements zhc
{
    public final Intent a;
    private final ucs b;
    
    public hue(final Intent a, final ucs b) {
        this.a = a;
        this.b = b;
    }
    
    public final ListenableFuture a() {
        final Intent a = this.a;
        if (!"com.google.android.youtube.intent.action.INTERNAL_UPLOAD".equals(a.getAction())) {
            final String action = a.getAction();
            final StringBuilder sb = new StringBuilder("Invalid intent action ");
            sb.append(action);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        final ahaz builder = ((ahbh)zhs.a).createBuilder();
        final Optional map = Optional.ofNullable((Object)a.getData()).map((Function)hpl.q);
        builder.getClass();
        map.ifPresent((Consumer)new hoa(builder, 15));
        Optional.ofNullable((Object)a.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_shorts_project_id")).ifPresent((Consumer)new hoa(builder, 16));
        Optional.ofNullable((Object)a.getParcelableExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_edited_video_uri")).map((Function)hpl.q).ifPresent((Consumer)new hoa(builder, 17));
        Optional.ofNullable((Object)a.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id")).ifPresent((Consumer)new hoa(builder, 18));
        final long longExtra = a.getLongExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_duration_ms", -1L);
        if (longExtra != -1L) {
            builder.copyOnWrite();
            final zhs zhs = (zhs)builder.instance;
            zhs.b |= 0x10;
            zhs.g = longExtra;
        }
        final int intExtra = a.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_width", -1);
        if (intExtra != -1) {
            builder.copyOnWrite();
            final zhs zhs2 = (zhs)builder.instance;
            zhs2.b |= 0x20;
            zhs2.h = intExtra;
        }
        final int intExtra2 = a.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_height", -1);
        if (intExtra2 != -1) {
            builder.copyOnWrite();
            final zhs zhs3 = (zhs)builder.instance;
            zhs3.b |= 0x40;
            zhs3.i = intExtra2;
        }
        final int b = ((zhs)builder.instance).b;
        if ((b & 0x1) == 0x0) {
            throw new IllegalArgumentException("ShortsEditThumbnailVideo doesn't have a file uri.");
        }
        if ((b & 0x10) == 0x0) {
            throw new IllegalArgumentException("ShortsEditThumbnailVideo doesn't have a duration.");
        }
        if ((b & 0x20) == 0x0) {
            throw new IllegalArgumentException("ShortsEditThumbnailVideo doesn't have a width.");
        }
        if ((b & 0x40) != 0x0) {
            final zhs zhs4 = (zhs)builder.build();
            final ucs b2 = this.b;
            if (b2.b && b2.f != ucn.c) {
                final String h = b2.h;
                if (h != null) {
                    final String f = vgl.f(397, h);
                    if (!b2.e()) {
                        final ListenableFuture listenableFuture = afwm.m((Object)Optional.of((Object)f));
                        return (ListenableFuture)aevf.f(listenableFuture).g((aezf)new etz(this, zhs4, 7), (Executor)afum.a);
                    }
                    final bu k = b2.k;
                    final vfw c = b2.n.c();
                    c.g(f);
                    final ListenableFuture listenableFuture = teu.c((aun)k, tpe.cp(c.b()), (aezf)new rrw(b2, f, 9));
                    return (ListenableFuture)aevf.f(listenableFuture).g((aezf)new etz(this, zhs4, 7), (Executor)afum.a);
                }
            }
            final ListenableFuture listenableFuture = afwm.m((Object)Optional.empty());
            return (ListenableFuture)aevf.f(listenableFuture).g((aezf)new etz(this, zhs4, 7), (Executor)afum.a);
        }
        throw new IllegalArgumentException("ShortsEditThumbnailVideo doesn't have a height.");
    }
}
