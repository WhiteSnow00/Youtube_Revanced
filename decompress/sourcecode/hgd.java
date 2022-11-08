import android.app.Activity;
import java.util.concurrent.Executor;
import android.os.Parcelable;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
import android.widget.ImageView;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Bundle;
import android.text.Spanned;
import android.text.SpannableString;
import com.google.android.libraries.video.encoder.AudioEncoderOptions;
import com.google.android.libraries.video.encoder.VideoEncoderOptions;
import android.util.Size;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.TranscodeOptions;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import android.database.Cursor;
import android.provider.MediaStore$Video;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import android.net.Uri;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.content.Context;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgd
{
    public static boolean A(final rbi rbi, final ShortsVideoTrimView2 shortsVideoTrimView2, final maw maw, final VideoWithPreviewView videoWithPreviewView, final Context context, final boolean b) {
        if (rbi != null && rbi.d) {
            return false;
        }
        if (shortsVideoTrimView2 != null && shortsVideoTrimView2.D) {
            return false;
        }
        if (maw != null) {
            maw.q();
        }
        if (context != null) {
            String contentDescription;
            if (b) {
                contentDescription = context.getResources().getString(2132019721);
            }
            else {
                contentDescription = context.getResources().getString(2132019722);
            }
            videoWithPreviewView.setContentDescription((CharSequence)contentDescription);
        }
        return true;
    }
    
    public static void B(final maw maw, final ShortsVideoTrimView2 shortsVideoTrimView2, final rbr rbr, final rbq rbq) {
        if (maw != null && rbr != null && rbq != null) {
            final urf urf = (urf)maw.b;
            urf.g = null;
            urf.p();
            ((rbi)maw.a).q(rbr);
            ((rbi)maw.a).p(rbq);
            ((rbi)maw.a).s((EditableVideo)null);
        }
        if (shortsVideoTrimView2 != null) {
            shortsVideoTrimView2.B();
        }
    }
    
    public static void C(final ShortsVideoTrimView2 shortsVideoTrimView2, final maw maw, final rdc rdc, final Uri uri, final boolean b, final long n, final EditableVideo editableVideo, final Track h, final long n2) {
        final long h2 = editableVideo.b.h;
        final long min = Math.min(h2, editableVideo.h());
        shortsVideoTrimView2.H = (ucj)new hfg((urf)maw.b, 1);
        final ube ube = new ube(editableVideo.b, rdc, false);
        final qxj qxj = new qxj(min, h2);
        qxj.i(n, n + min, false, false);
        shortsVideoTrimView2.L(editableVideo, (ubd)ube, qxj, b);
        final VideoMetaData b2 = editableVideo.b;
        final rcy a = rdc.a(b2);
        ((rbi)maw.a).s(editableVideo);
        if (b2 != null && b2.i) {
            final Object c = maw.c;
            if (c != null) {
                ((hey)c).b();
            }
        }
        if (h != null) {
            final urf urf = (urf)maw.b;
            urf.h = h;
            editableVideo.y(h.d);
            editableVideo.z(1.0f);
            editableVideo.x(n2);
            urf.o(editableVideo, uri, a);
        }
        else {
            ((urf)maw.b).o(editableVideo, uri, a);
        }
        final Object c2 = maw.c;
        if (c2 != null) {
            ((hey)c2).a(uri);
        }
    }
    
    public static void D(final avt avt, final int n) {
        if (avt != null) {
            avt.S(wya.c(n)).d();
        }
    }
    
    public static void E(final apmt apmt, int ordinal, final EditableVideo editableVideo, final avt avt, final ShortsVideoTrimView2 shortsVideoTrimView2, final int n) {
        if (avt == null) {
            return;
        }
        final VideoMetaData b = editableVideo.b;
        final agza builder = ((agzi)algd.a).createBuilder();
        final long millis = afqo.c(b.h).toMillis();
        builder.copyOnWrite();
        final algd algd = (algd)builder.instance;
        algd.b |= 0x1;
        algd.c = millis;
        final int k = b.k();
        builder.copyOnWrite();
        final algd algd2 = (algd)builder.instance;
        algd2.b |= 0x2;
        algd2.d = k;
        final int j = b.j();
        builder.copyOnWrite();
        final algd algd3 = (algd)builder.instance;
        algd3.b |= 0x4;
        algd3.e = j;
        final algd algd4 = (algd)builder.build();
        final agza builder2 = ((agzi)algc.a).createBuilder();
        if (shortsVideoTrimView2.n) {
            builder2.copyOnWrite();
            final algc algc = (algc)builder2.instance;
            algc.b |= 0x1;
            algc.c = true;
        }
        else {
            final long millis2 = afqo.c(shortsVideoTrimView2.h()).toMillis();
            builder2.copyOnWrite();
            final algc algc2 = (algc)builder2.instance;
            algc2.b |= 0x200;
            algc2.e = millis2;
        }
        builder2.copyOnWrite();
        final algc algc3 = (algc)builder2.instance;
        algc3.b |= 0x4;
        algc3.d = true;
        final agza builder3 = ((agzi)algd.a).createBuilder((agzi)algd4);
        final algc f = (algc)builder2.build();
        builder3.copyOnWrite();
        final algd algd5 = (algd)builder3.instance;
        f.getClass();
        algd5.f = f;
        algd5.b |= 0x8;
        final algd algd6 = (algd)builder3.build();
        final alft bh = auip.bh(editableVideo);
        final agza builder4 = ((agzi)algd.a).createBuilder((agzi)algd6);
        builder4.copyOnWrite();
        final algd algd7 = (algd)builder4.instance;
        bh.getClass();
        algd7.g = bh;
        algd7.b |= 0x10;
        final algd i = (algd)builder4.build();
        final agza builder5 = ((agzi)alff.a).createBuilder();
        final agza builder6 = ((agzi)algf.a).createBuilder();
        builder6.copyOnWrite();
        final algf algf = (algf)builder6.instance;
        i.getClass();
        algf.k = i;
        algf.b |= 0x2000;
        builder6.copyOnWrite();
        final algf algf2 = (algf)builder6.instance;
        if (ordinal == 0) {
            throw null;
        }
        algf2.l = ordinal - 1;
        algf2.b |= 0x4000;
        builder6.copyOnWrite();
        final algf algf3 = (algf)builder6.instance;
        algf3.m = apmt.getNumber();
        algf3.b |= 0x8000;
        final algf d = (algf)builder6.build();
        builder5.copyOnWrite();
        final alff alff = (alff)builder5.instance;
        d.getClass();
        alff.D = d;
        alff.c |= 0x40000;
        final alff b2 = (alff)builder5.build();
        ordinal = apmt.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 4) {
                    final tuw s = avt.S(wya.b(96659));
                    s.b = (agzi)b2;
                    s.f();
                    return;
                }
                if (ordinal != 5) {
                    return;
                }
            }
            final tuw s2 = avt.S(wya.c(n));
            s2.b = (agzi)b2;
            s2.d();
            return;
        }
        final tuw s3 = avt.S(wya.b(96659));
        s3.b = (agzi)b2;
        s3.h();
    }
    
    public static String a(final Context context, final Uri uri) {
        final String s = "";
        if (context != null && uri != null) {
            final Cursor query = MediaStore$Video.query(context.getContentResolver(), uri, new String[] { "_data" });
            String string = s;
            if (query != null) {
                query.moveToFirst();
                final int columnIndex = query.getColumnIndex("_data");
                string = s;
                if (columnIndex >= 0) {
                    string = query.getString(columnIndex);
                }
                query.close();
            }
            return aexs.e(string);
        }
        return "";
    }
    
    public static aqyq b(final EditableVideo editableVideo, final Uri uri, final long k) {
        final agza builder = ((agzi)aqyq.a).createBuilder();
        final long millis = afqo.c(editableVideo.n()).toMillis();
        builder.copyOnWrite();
        final aqyq aqyq = (aqyq)builder.instance;
        aqyq.b |= 0x1;
        aqyq.c = (int)millis;
        final long millis2 = afqo.c(editableVideo.l()).toMillis();
        builder.copyOnWrite();
        final aqyq aqyq2 = (aqyq)builder.instance;
        aqyq2.b |= 0x2;
        aqyq2.d = (int)millis2;
        final long n = editableVideo.n();
        builder.copyOnWrite();
        final aqyq aqyq3 = (aqyq)builder.instance;
        aqyq3.b |= 0x200;
        aqyq3.l = n;
        final long l = editableVideo.l();
        builder.copyOnWrite();
        final aqyq aqyq4 = (aqyq)builder.instance;
        aqyq4.b |= 0x400;
        aqyq4.m = l;
        final double d = editableVideo.d();
        builder.copyOnWrite();
        final aqyq aqyq5 = (aqyq)builder.instance;
        aqyq5.b |= 0x4;
        aqyq5.e = (float)d;
        final double a = editableVideo.a();
        builder.copyOnWrite();
        final aqyq aqyq6 = (aqyq)builder.instance;
        aqyq6.b |= 0x8;
        aqyq6.f = (float)a;
        final double c = editableVideo.c();
        builder.copyOnWrite();
        final aqyq aqyq7 = (aqyq)builder.instance;
        aqyq7.b |= 0x10;
        aqyq7.g = (float)c;
        final double b = editableVideo.b();
        builder.copyOnWrite();
        final aqyq aqyq8 = (aqyq)builder.instance;
        aqyq8.b |= 0x20;
        aqyq8.h = (float)b;
        if (uri != null) {
            final String string = uri.toString();
            builder.copyOnWrite();
            final aqyq aqyq9 = (aqyq)builder.instance;
            string.getClass();
            aqyq9.b |= 0x40;
            aqyq9.i = string;
        }
        builder.copyOnWrite();
        final aqyq aqyq10 = (aqyq)builder.instance;
        aqyq10.b |= 0x100;
        aqyq10.k = k;
        return (aqyq)builder.build();
    }
    
    public static long c(final ShortsCreationSelectedTrack shortsCreationSelectedTrack, final int n) {
        if (shortsCreationSelectedTrack != null && shortsCreationSelectedTrack.f().h()) {
            return -TimeUnit.MILLISECONDS.toMicros(shortsCreationSelectedTrack.c() + n);
        }
        return 0L;
    }
    
    public static cl d(br c) {
        c = c.C;
        if (c != null) {
            return c.og();
        }
        return null;
    }
    
    public static TranscodeOptions e(final EditableVideo editableVideo, int i, final float n, final boolean b) {
        final int round = Math.round(auip.bf(editableVideo));
        final int round2 = Math.round(auip.be(editableVideo));
        int n2 = round;
        int n3 = round2;
        if (b) {
            final double n4 = round;
            final double b2 = editableVideo.b();
            final double c = editableVideo.c();
            Double.isNaN(n4);
            n2 = (int)Math.round(n4 * (1.0 - b2 - c));
            final double n5 = round2;
            final double d = editableVideo.d();
            final double a = editableVideo.a();
            Double.isNaN(n5);
            n3 = (int)Math.round(n5 * (1.0 - d - a));
        }
        final Size size = new Size(n2, n3);
        int n6;
        if (i == 6) {
            n6 = 1920;
        }
        else {
            n6 = 1280;
        }
        if (i == 6) {
            i = 1080;
        }
        else {
            i = 720;
        }
        final Size v = vem.V(size, n6, i);
        final int width = v.getWidth();
        final int height = v.getHeight();
        final int min = Math.min(width, height);
        final int[][] array = { { 720, 7500000 }, { 1080, 12000000 }, { 1440, 24000000 }, { 2160, 68000000 } };
        while (true) {
            int[] array2;
            qyt f;
            VideoEncoderOptions a2;
            zvm d2;
            for (i = 0; i < 4; ++i) {
                array2 = array[i];
                if (min <= array2[0]) {
                    i = array2[1];
                    f = VideoEncoderOptions.f();
                    f.e(Math.max(width, height));
                    f.d(Math.min(width, height));
                    f.f();
                    f.c(n);
                    f.b(i);
                    a2 = f.a();
                    d2 = AudioEncoderOptions.d();
                    d2.h(44100);
                    d2.g(2);
                    return hjp.g(a2, d2.f());
                }
            }
            i = array[3][1];
            continue;
        }
    }
    
    public static Track f(final ShortsCreationSelectedTrack shortsCreationSelectedTrack, final Context context) {
        if (shortsCreationSelectedTrack != null && shortsCreationSelectedTrack.f().h()) {
            final String m = shortsCreationSelectedTrack.m();
            final Uri d = shortsCreationSelectedTrack.d();
            final SpannableString spannableString = new SpannableString((CharSequence)tsx.i(m));
            final SpannableString spannableString2 = new SpannableString((CharSequence)context.getString(2132018941));
            final int intValue = ((Long)shortsCreationSelectedTrack.f().c()).intValue();
            Uri empty;
            if ((empty = d) == null) {
                empty = Uri.EMPTY;
            }
            return new Track((Spanned)spannableString, (Spanned)spannableString2, intValue, empty, shortsCreationSelectedTrack.k(), (Spanned)null, (Spanned)null);
        }
        return null;
    }
    
    public static aqyq g(final String s, final Bundle bundle) {
        if (bundle.containsKey(s)) {
            try {
                return (aqyq)aeda.aq(bundle, s, (MessageLite)aqyq.a, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahab ahab) {
                return aqyq.a;
            }
        }
        return aqyq.a;
    }
    
    public static aqyq h(final aqyq aqyq, final EditableVideo editableVideo) {
        final agza builder = ((agzi)aqyq).toBuilder();
        final long millis = afqo.c(editableVideo.n()).toMillis();
        builder.copyOnWrite();
        final aqyq aqyq2 = (aqyq)builder.instance;
        aqyq2.b |= 0x1;
        aqyq2.c = (int)millis;
        final long millis2 = afqo.c(editableVideo.l()).toMillis();
        builder.copyOnWrite();
        final aqyq aqyq3 = (aqyq)builder.instance;
        aqyq3.b |= 0x2;
        aqyq3.d = (int)millis2;
        final long n = editableVideo.n();
        builder.copyOnWrite();
        final aqyq aqyq4 = (aqyq)builder.instance;
        aqyq4.b |= 0x200;
        aqyq4.l = n;
        final long l = editableVideo.l();
        builder.copyOnWrite();
        final aqyq aqyq5 = (aqyq)builder.instance;
        aqyq5.b |= 0x400;
        aqyq5.m = l;
        final double d = editableVideo.d();
        builder.copyOnWrite();
        final aqyq aqyq6 = (aqyq)builder.instance;
        aqyq6.b |= 0x4;
        aqyq6.e = (float)d;
        final double a = editableVideo.a();
        builder.copyOnWrite();
        final aqyq aqyq7 = (aqyq)builder.instance;
        aqyq7.b |= 0x8;
        aqyq7.f = (float)a;
        final double c = editableVideo.c();
        builder.copyOnWrite();
        final aqyq aqyq8 = (aqyq)builder.instance;
        aqyq8.b |= 0x10;
        aqyq8.g = (float)c;
        final double b = editableVideo.b();
        builder.copyOnWrite();
        final aqyq aqyq9 = (aqyq)builder.instance;
        aqyq9.b |= 0x20;
        aqyq9.h = (float)b;
        return (aqyq)builder.build();
    }
    
    public static void i(final ImageView imageView, final rbi rbi) {
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (rbi instanceof TrimVideoControllerView) {
            ((TrimVideoControllerView)rbi).f = null;
        }
    }
    
    public static void j(final wwv wwv, final wyb wyb, final boolean c, final long e, final boolean d) {
        if (wwv == null) {
            return;
        }
        final agza builder = ((agzi)algc.a).createBuilder();
        builder.copyOnWrite();
        final algc algc = (algc)builder.instance;
        algc.b |= 0x1;
        algc.c = c;
        builder.copyOnWrite();
        final algc algc2 = (algc)builder.instance;
        algc2.b |= 0x4;
        algc2.d = d;
        if (!c) {
            builder.copyOnWrite();
            final algc algc3 = (algc)builder.instance;
            algc3.b |= 0x200;
            algc3.e = e;
        }
        final agza builder2 = ((agzi)alff.a).createBuilder();
        final agza builder3 = ((agzi)algf.a).createBuilder();
        final algc c2 = (algc)builder.build();
        builder3.copyOnWrite();
        final algf algf = (algf)builder3.instance;
        c2.getClass();
        algf.c = c2;
        algf.b |= 0x2;
        final algf d2 = (algf)builder3.build();
        builder2.copyOnWrite();
        final alff alff = (alff)builder2.instance;
        d2.getClass();
        alff.D = d2;
        alff.c |= 0x40000;
        wwv.w((wxz)new wws(wyb), (alff)builder2.build());
    }
    
    public static void k(final aqyq aqyq, final String s, final Bundle bundle) {
        if (aqyq != null) {
            aeda.av(bundle, s, (MessageLite)aqyq);
        }
    }
    
    public static void l(final ImageView f, final rbi rbi, final boolean b, final boolean b2) {
        if (f != null && !b && b2) {
            f.setVisibility(0);
        }
        if (rbi instanceof TrimVideoControllerView) {
            ((TrimVideoControllerView)rbi).f = f;
        }
    }
    
    public static boolean m(final aqyq aqyq, final aqyq aqyq2) {
        return afqf.a((double)aqyq.e, (double)aqyq2.e, 1.0E-4) != 0 || afqf.a((double)aqyq.f, (double)aqyq2.f, 1.0E-4) != 0 || afqf.a((double)aqyq.h, (double)aqyq2.h, 1.0E-4) != 0 || afqf.a((double)aqyq.g, (double)aqyq2.g, 1.0E-4) != 0;
    }
    
    public static boolean n(final aqyq aqyq, final aqyq aqyq2) {
        return aqyq.c != aqyq2.c || aqyq.d != aqyq2.d;
    }
    
    public static boolean o(final rbi rbi, final ShortsVideoTrimView2 shortsVideoTrimView2, final boolean b, final boolean b2) {
        int n2;
        final int n = n2 = 0;
        if (!b) {
            n2 = n;
            if (!b2) {
                n2 = 1;
            }
        }
        boolean b3 = n2 != 0;
        if (rbi != null) {
            b3 = ((n2 & ((rbi.d ^ true) ? 1 : 0)) != 0x0);
        }
        if (shortsVideoTrimView2 != null) {
            return (shortsVideoTrimView2.D ^ true) & b3;
        }
        return b3;
    }
    
    public static long p(final uck uck) {
        return uck.g();
    }
    
    public static void q(final wwv wwv, final wyb wyb, final boolean c, final long e) {
        if (wwv == null) {
            return;
        }
        final agza builder = ((agzi)algc.a).createBuilder();
        builder.copyOnWrite();
        final algc algc = (algc)builder.instance;
        algc.b |= 0x1;
        algc.c = c;
        builder.copyOnWrite();
        final algc algc2 = (algc)builder.instance;
        algc2.b |= 0x4;
        algc2.d = true;
        if (!c) {
            builder.copyOnWrite();
            final algc algc3 = (algc)builder.instance;
            algc3.b |= 0x200;
            algc3.e = e;
        }
        final agza builder2 = ((agzi)alff.a).createBuilder();
        final agza builder3 = ((agzi)algf.a).createBuilder();
        final algc c2 = (algc)builder.build();
        builder3.copyOnWrite();
        final algf algf = (algf)builder3.instance;
        c2.getClass();
        algf.c = c2;
        algf.b |= 0x2;
        final algf d = (algf)builder3.build();
        builder2.copyOnWrite();
        final alff alff = (alff)builder2.instance;
        d.getClass();
        alff.D = d;
        alff.c |= 0x40000;
        wwv.w((wxz)new wws(wyb), (alff)builder2.build());
    }
    
    public static EditableVideo r(final lhz lhz, final Uri uri, final long n, final long n2, final aqyq aqyq) {
        final EditableVideo g = lhz.g(uri, TimeUnit.MILLISECONDS.toMicros(n), TimeUnit.MILLISECONDS.toMicros(n2));
        g.A((double)aqyq.h, (double)aqyq.g);
        g.B((double)aqyq.e, (double)aqyq.f);
        g.F(aqyq.l, aqyq.m);
        return g;
    }
    
    public static Bundle t(final aorm aorm) {
        final Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.youtube.ThumbnailData", (Parcelable)new ParcelableMessageLite((MessageLite)aorm));
        return bundle;
    }
    
    public static void u(final br br, final aagm aagm, final String s) {
        tcp.n((aum)br, aagm.c((aexg)gku.p, (Executor)afsl.a), (trb)new gzr(s, 10), (trb)hen.a);
    }
    
    public static rdc v(final maw maw, final lhz lhz) {
        if (maw != null) {
            final Object b = maw.b;
            if (lhz != null) {
                return lhz.d((urf)b);
            }
        }
        return null;
    }
    
    public static void w(final boolean b, final maw maw, final Activity activity, final boolean b2) {
        if (b) {
            activity.getWindow().addFlags(128);
            return;
        }
        activity.getWindow().clearFlags(128);
        if (b2 && maw != null) {
            maw.q();
        }
    }
    
    public static void x(final rbi rbi, final maw maw, final lhz lhz, final rbr rbr, final rbq rbq) {
        if (rbi != null && rbr != null && rbq != null) {
            rbi.q(rbr);
            rbi.p(rbq);
        }
        y(maw, lhz);
    }
    
    public static void y(final maw maw, final lhz lhz) {
        if (maw != null) {
            final Object b = maw.b;
            if (lhz != null) {
                lhz.f((urf)b);
            }
            maw.o();
        }
    }
    
    public static void z(final rbi rbi, final maw maw, final rbr rbr, final rbq rbq, final boolean b) {
        if (rbi != null && rbr != null && rbq != null) {
            rbi.i(rbr);
            rbi.h(rbq);
        }
        if (maw != null && !b) {
            maw.p();
        }
    }
}
