import android.content.Context;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
import com.google.android.apps.youtube.app.offline.ui.UploadArrowView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvj implements huu
{
    private final atke a;
    private final atke b;
    private final atke c;
    private final atke d;
    private final atke e;
    private final atke f;
    private final atke g;
    
    public hvj(final atke a, final atke b, final atke c, final atke d, final atke e, final atke f, final atke g) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
    }
    
    public final /* bridge */ huw a(final UploadArrowView uploadArrowView, final UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer) {
        final asid asid = (asid)this.a.a();
        asid.getClass();
        final Context context = (Context)this.b.a();
        context.getClass();
        final vdr vdr = (vdr)this.c.a();
        vdr.getClass();
        final hyx hyx = (hyx)this.d.a();
        hyx.getClass();
        final heo heo = (heo)this.e.a();
        heo.getClass();
        final vaf vaf = (vaf)this.f.a();
        vaf.getClass();
        final msr msr = (msr)this.g.a();
        msr.getClass();
        uploadArrowView.getClass();
        uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.getClass();
        return (huw)new hvi(asid, context, vdr, hyx, heo, vaf, msr, (hvh)new hvb(uploadArrowView, 1), uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final /* bridge */ huw b(final adqh adqh, final UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer) {
        final asid asid = (asid)this.a.a();
        asid.getClass();
        final Context context = (Context)this.b.a();
        context.getClass();
        final vdr vdr = (vdr)this.c.a();
        vdr.getClass();
        final hyx hyx = (hyx)this.d.a();
        hyx.getClass();
        final heo heo = (heo)this.e.a();
        heo.getClass();
        final vaf vaf = (vaf)this.f.a();
        vaf.getClass();
        final msr msr = (msr)this.g.a();
        msr.getClass();
        return (huw)new hvi(asid, context, vdr, hyx, heo, vaf, msr, (hvh)new hvb(adqh, 0, (byte[])null, (byte[])null), uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
