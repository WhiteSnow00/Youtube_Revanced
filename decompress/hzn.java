import android.util.StateSet;
import android.graphics.drawable.StateListDrawable;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.ArrayList;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.LinkedList;
import android.content.Context;
import android.app.Activity;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzn
{
    public final Object a;
    
    public hzn() {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public hzn(final aacg a) {
        this.a = a;
    }
    
    public hzn(final ajsk a) {
        this.a = a;
        ajsl ajsl;
        if ((ajsl = a.h) == null) {
            ajsl = ajsl.a;
        }
        adkp.Q((ajsl.b & 0x10) != 0x0);
    }
    
    public hzn(final Activity a) {
        this.a = a;
    }
    
    public hzn(final Context a) {
        this.a = a;
    }
    
    public hzn(final atke a) {
        a.getClass();
        this.a = a;
    }
    
    public hzn(final atke a, final byte[] array) {
        this.a = a;
    }
    
    public hzn(final atke a, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public hzn(final atke a, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
    }
    
    public hzn(final atke a, final char[] array) {
        a.getClass();
        this.a = a;
    }
    
    public hzn(final atke a, final char[] array, final byte[] array2) {
        this.a = a;
    }
    
    public hzn(final ghb a) {
        this.a = a;
    }
    
    public hzn(final hzn a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public hzn(final ich ich) {
        this.a = ich.a();
    }
    
    public hzn(final ilm a) {
        this.a = a;
    }
    
    public hzn(final Class a) {
        this.a = a;
    }
    
    public hzn(final Map a) {
        this.a = a;
    }
    
    public hzn(final lmp a) {
        this.a = a;
    }
    
    public hzn(final trt trt, final ashi ashi, final arwh arwh, final byte[] array, final byte[] array2) {
        this.a = asht.n((ashw)arwh.h().af(asil.a()).Z((asjr)huy.p).aq((asjr)new hvs(trt, 5)).Z((asjr)huy.q), (ashw)ashi.ai(), (asji)exl.n).ao((Object)0);
    }
    
    public hzn(final wyw a) {
        this.a = a;
    }
    
    public hzn(final xnt a) {
        this.a = a;
    }
    
    public hzn(final byte[] array) {
        this.a = new LinkedList();
    }
    
    public hzn(final byte[] array, final byte[] array2) {
        this.a = new HashMap();
    }
    
    public hzn(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new HashMap();
    }
    
    public hzn(final char[] array) {
        this.a = new HashMap();
    }
    
    public hzn(final int[] array) {
        this.a = afwm.m((Object)false);
    }
    
    public hzn(final short[] array) {
        this.a = Collections.synchronizedSet(new LinkedHashSet<Object>());
    }
    
    public static String A(final Class clazz, final Class clazz2) {
        return String.format(Locale.ROOT, "(%s, %s)", clazz.getSimpleName(), clazz2.getSimpleName());
    }
    
    private static Drawable K(final Resources resources, final Drawable drawable, int i) {
        final int intrinsicWidth = drawable.getIntrinsicWidth();
        final int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        int n;
        if (i == 0) {
            n = intrinsicWidth;
        }
        else {
            n = i;
        }
        int n2 = i;
        if (i == 0) {
            n2 = intrinsicHeight;
        }
        final Bitmap bitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap$Config.ARGB_8888);
        drawable.draw(new Canvas(bitmap));
        Bitmap scaledBitmap = null;
        Label_0105: {
            if (n == intrinsicWidth) {
                scaledBitmap = bitmap;
                if (n2 == intrinsicHeight) {
                    break Label_0105;
                }
            }
            scaledBitmap = Bitmap.createScaledBitmap(bitmap, n, n2, true);
            bitmap.recycle();
        }
        i = Math.max(2, resources.getInteger(2131493065));
        final float n3 = (float)resources.getInteger(2131493066);
        final float n4 = (float)resources.getInteger(2131493067);
        final Bitmap bitmap2 = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint(1);
        paint.setColor(12 / (i / 2) << 24 | 0xFFFFFF);
        paint.setColorFilter((ColorFilter)new LightingColorFilter(0, 0));
        while (i > 0) {
            final float n5 = (float)i;
            final float n6 = n3 - n5;
            final float n7 = n4 - n5;
            canvas.drawBitmap(scaledBitmap, n6, n7, paint);
            final float n8 = n4 + 0.0f;
            canvas.drawBitmap(scaledBitmap, n6, n8, paint);
            final float n9 = n4 + n5;
            canvas.drawBitmap(scaledBitmap, n6, n9, paint);
            final float n10 = 0.0f + n3;
            canvas.drawBitmap(scaledBitmap, n10, n7, paint);
            canvas.drawBitmap(scaledBitmap, n10, n9, paint);
            final float n11 = n5 + n3;
            canvas.drawBitmap(scaledBitmap, n11, n7, paint);
            canvas.drawBitmap(scaledBitmap, n11, n8, paint);
            canvas.drawBitmap(scaledBitmap, n11, n9, paint);
            i -= 2;
        }
        canvas.drawBitmap(scaledBitmap, 0.0f, 0.0f, (Paint)null);
        scaledBitmap.recycle();
        final BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap2);
        ((Drawable)bitmapDrawable).setBounds(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        return (Drawable)bitmapDrawable;
    }
    
    private static void L(final View view, final Drawable imageDrawable) {
        if (view instanceof ImageView) {
            ((ImageView)view).setImageDrawable(imageDrawable);
            return;
        }
        if (view instanceof TextView) {
            final TextView textView = (TextView)view;
            final Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative.length == 4) {
                int i = 0;
                boolean b = false;
                while (i < compoundDrawablesRelative.length) {
                    if (compoundDrawablesRelative[i] != null) {
                        compoundDrawablesRelative[i] = imageDrawable;
                        b = true;
                    }
                    ++i;
                }
                if (b) {
                    textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                }
            }
            return;
        }
        view.getContext();
    }
    
    public static aome q(final ante ante) {
        anuv anuv;
        if ((anuv = ante.s) == null) {
            anuv = anuv.a;
        }
        if (((ahbc)anuv).ry((ahaq)SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
            anuv anuv2;
            if ((anuv2 = ante.s) == null) {
                anuv2 = anuv.a;
            }
            return (aome)((ahbc)anuv2).rx((ahaq)SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
        }
        return null;
    }
    
    public static String r(final aome aome) {
        if (aome != null) {
            return aome.f;
        }
        return null;
    }
    
    public static aloa v(aloa aloa, final alog alog) {
        aloa aloa2 = aloa;
        if (alog != null) {
            if ((aloa.b & 0x2) != 0x0) {
                alog alog2;
                if ((alog2 = alog.b(aloa.d)) == null) {
                    alog2 = alog.a;
                }
                aloa2 = aloa;
                if (alog.equals(alog2)) {
                    return aloa2;
                }
            }
            final ahbb ahbb = (ahbb)((ahbh)aloa).toBuilder();
            ((ahaz)ahbb).copyOnWrite();
            final aloa aloa3 = (aloa)ahbb.instance;
            aloa3.d = alog.e;
            aloa3.b |= 0x2;
            if (alog == alog.a) {
                final int b = aloa.b;
                if ((b & 0x10) != 0x0 && (b & 0x8) != 0x0) {
                    ajut f;
                    if ((f = aloa.g) == null) {
                        f = ajut.a;
                    }
                    ((ahaz)ahbb).copyOnWrite();
                    final aloa aloa4 = (aloa)ahbb.instance;
                    f.getClass();
                    aloa4.f = f;
                    aloa4.b |= 0x8;
                    ajut h;
                    if ((h = aloa.f) == null) {
                        h = ajut.a;
                    }
                    ((ahaz)ahbb).copyOnWrite();
                    final aloa aloa5 = (aloa)ahbb.instance;
                    h.getClass();
                    aloa5.h = h;
                    aloa5.b |= 0x20;
                    ((ahaz)ahbb).copyOnWrite();
                    final aloa aloa6 = (aloa)ahbb.instance;
                    aloa6.g = null;
                    aloa6.b &= 0xFFFFFFEF;
                }
                w(ahbb, aloa);
            }
            else if (alog == alog.c) {
                x(ahbb, aloa);
                w(ahbb, aloa);
            }
            else if (alog == alog.b) {
                x(ahbb, aloa);
                final int b2 = aloa.b;
                if ((b2 & 0x200) != 0x0 && (b2 & 0x100) != 0x0) {
                    ajut j;
                    if ((j = aloa.k) == null) {
                        j = ajut.a;
                    }
                    ((ahaz)ahbb).copyOnWrite();
                    final aloa aloa7 = (aloa)ahbb.instance;
                    j.getClass();
                    aloa7.j = j;
                    aloa7.b |= 0x100;
                    ajut m;
                    if ((m = aloa.j) == null) {
                        m = ajut.a;
                    }
                    ((ahaz)ahbb).copyOnWrite();
                    final aloa aloa8 = (aloa)ahbb.instance;
                    m.getClass();
                    aloa8.m = m;
                    aloa8.b |= 0x400;
                    ((ahaz)ahbb).copyOnWrite();
                    aloa = (aloa)ahbb.instance;
                    aloa.k = null;
                    aloa.b &= 0xFFFFFDFF;
                }
            }
            aloa2 = (aloa)((ahaz)ahbb).build();
        }
        return aloa2;
    }
    
    public static void w(final ahbb ahbb, final aloa aloa) {
        final int b = aloa.b;
        if ((b & 0x400) != 0x0 && (b & 0x100) != 0x0) {
            ajut j;
            if ((j = aloa.m) == null) {
                j = ajut.a;
            }
            ((ahaz)ahbb).copyOnWrite();
            final aloa aloa2 = (aloa)ahbb.instance;
            j.getClass();
            aloa2.j = j;
            aloa2.b |= 0x100;
            ajut k;
            if ((k = aloa.j) == null) {
                k = ajut.a;
            }
            ((ahaz)ahbb).copyOnWrite();
            final aloa aloa3 = (aloa)ahbb.instance;
            k.getClass();
            aloa3.k = k;
            aloa3.b |= 0x200;
            ((ahaz)ahbb).copyOnWrite();
            final aloa aloa4 = (aloa)ahbb.instance;
            aloa4.m = null;
            aloa4.b &= 0xFFFFFBFF;
        }
    }
    
    public static void x(final ahbb ahbb, final aloa aloa) {
        final int b = aloa.b;
        if ((b & 0x20) != 0x0 && (b & 0x8) != 0x0) {
            ajut f;
            if ((f = aloa.h) == null) {
                f = ajut.a;
            }
            ((ahaz)ahbb).copyOnWrite();
            final aloa aloa2 = (aloa)ahbb.instance;
            f.getClass();
            aloa2.f = f;
            aloa2.b |= 0x8;
            ajut g;
            if ((g = aloa.f) == null) {
                g = ajut.a;
            }
            ((ahaz)ahbb).copyOnWrite();
            final aloa aloa3 = (aloa)ahbb.instance;
            g.getClass();
            aloa3.g = g;
            aloa3.b |= 0x10;
            ((ahaz)ahbb).copyOnWrite();
            final aloa aloa4 = (aloa)ahbb.instance;
            aloa4.h = null;
            aloa4.b &= 0xFFFFFFDF;
        }
    }
    
    public static aida z(final String s) {
        final ahaz builder = ((ahbh)aida.a).createBuilder();
        final ahbb ahbb = (ahbb)((ahbh)aicz.a).createBuilder();
        final ajut g = acak.g(new String[] { s });
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz = (aicz)ahbb.instance;
        g.getClass();
        aicz.i = g;
        aicz.b |= 0x200;
        final aicz c = (aicz)((ahaz)ahbb).build();
        builder.copyOnWrite();
        final aida aida = (aida)builder.instance;
        c.getClass();
        aida.c = c;
        aida.b |= 0x1;
        return (aida)builder.build();
    }
    
    public final amgu B(final aaba aaba, final String s) {
        aaba.getClass();
        afev m;
        if (aezr.f(s)) {
            m = null;
        }
        else {
            tvb.n(s);
            m = afev.m("downloaded_video_playlist_id", s);
        }
        return (amgu)this.E(aaba.class, amgu.class, aaba, m);
    }
    
    public final amgu C(final aabf aabf, final String s) {
        aabf.getClass();
        afev m;
        if (aezr.f(s)) {
            m = null;
        }
        else {
            tvb.n(s);
            m = afev.m("downloaded_video_playlist_id", s);
        }
        return (amgu)this.E(aabf.class, amgu.class, aabf, m);
    }
    
    public final Optional D(final idz idz, final String s, final int n, final ahab ahab) {
        idz.getClass();
        return Optional.ofNullable((Object)this.E(idz.class, alem.class, idz, afev.o("downloaded_video_playlist_id", s, "downloaded_video_list_index", n, "watch_command_click_tracking_params", ahab)));
    }
    
    public final Object E(final Class clazz, final Class clazz2, final Object o, final afev afev) {
        adkp.I(o != null || clazz == Void.class, "Passed in a null model.");
        final Object a = this.a;
        final ilr ilr = new ilr(clazz, clazz2);
        final hzn hzn = (hzn)a;
        imb imb2 = null;
        Label_0180: {
            if (((Map)hzn.a).containsKey(ilr)) {
                final imb imb = ((Map<K, imb>)hzn.a).get(ilr);
                if (clazz.equals(imb.c())) {
                    imb2 = imb;
                    if (clazz2.equals(imb.d())) {
                        break Label_0180;
                    }
                }
                ttr.b(String.format(Locale.ROOT, "Type mismatch for OfflineModelToRendererGenerator object. Expected=%s, Actual=%s", A(clazz, clazz2), A(imb.c(), imb.d())));
            }
            imb2 = null;
        }
        if (imb2 != null) {
            return imb2.b(o, afev);
        }
        return null;
    }
    
    public final void F() {
        final Object a = this.a;
        final ahaz builder = ((ahbh)amul.a).createBuilder();
        builder.copyOnWrite();
        final amul amul = (amul)builder.instance;
        amul.c = 3;
        amul.b |= 0x1;
        final String z = glb.z();
        builder.copyOnWrite();
        final amul amul2 = (amul)builder.instance;
        z.getClass();
        amul2.b |= 0x2;
        amul2.d = z;
        ((aacg)a).a((amul)builder.build());
    }
    
    public final PaneDescriptor G(final String s, final boolean b, final String s2) {
        tvb.n(s);
        final Object a = this.a;
        final Bundle a2 = PaneDescriptor.a();
        a2.putString("playlist_id", s);
        a2.putInt("network_connectivity_requirement", 1);
        a2.putBoolean("detail_pane", b);
        if (!aezr.f(s2)) {
            a2.putString("offline_playlist_top_level_tab_id", s2);
        }
        return new PaneDescriptor((Class)a, a2, true);
    }
    
    public final ijh H(final String s) {
        final vef vef = (vef)((atke)this.a).a();
        vef.getClass();
        s.getClass();
        return new ijh(vef, s);
    }
    
    public final ijg I() {
        final fmj fmj = (fmj)((atke)this.a).a();
        fmj.getClass();
        return new ijg(fmj);
    }
    
    public final iiy J(final String s) {
        final vdr vdr = (vdr)((atke)this.a).a();
        vdr.getClass();
        s.getClass();
        return new iiy(vdr, s);
    }
    
    public final aogt a() {
        ajsl ajsl;
        if ((ajsl = ((ajsk)this.a).h) == null) {
            ajsl = ajsl.a;
        }
        aogt aogt;
        if ((aogt = ajsl.d) == null) {
            aogt = aogt.a;
        }
        return aogt;
    }
    
    public final boolean b() {
        final xnm g = ((xnt)this.a).g();
        return g != null && g.a() == 1;
    }
    
    public final boolean c(final PaneDescriptor paneDescriptor) {
        return ((Class)this.a).isAssignableFrom(paneDescriptor.a);
    }
    
    public final PaneDescriptor d(final aiqj aiqj) {
        aiqj.getClass();
        return PaneDescriptor.d((Class)this.a, aiqj, PaneDescriptor.a(), true);
    }
    
    public final boolean e(final PaneDescriptor paneDescriptor) {
        return ((Class)this.a).isAssignableFrom(paneDescriptor.a);
    }
    
    public final int f() {
        final Intent intent = ((Activity)this.a).getIntent();
        if (intent == null) {
            return 0;
        }
        return intent.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_height", 0);
    }
    
    public final int g() {
        final Intent intent = ((Activity)this.a).getIntent();
        if (intent == null) {
            return 0;
        }
        return intent.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_width", 0);
    }
    
    public final long h() {
        final Intent intent = ((Activity)this.a).getIntent();
        if (intent == null) {
            return 0L;
        }
        return intent.getLongExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_duration_ms", 0L);
    }
    
    public final Uri i() {
        final Intent intent = ((Activity)this.a).getIntent();
        if (intent == null) {
            return null;
        }
        return (Uri)intent.getParcelableExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_edited_video_uri");
    }
    
    public final String j() {
        final Intent intent = ((Activity)this.a).getIntent();
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id");
    }
    
    public final hsl k() {
        final hzn hzn = (hzn)((atke)this.a).a();
        hzn.getClass();
        return new hsl(hzn, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final ArrayList l() {
        synchronized (this) {
            return new ArrayList((Collection<? extends E>)this.a);
        }
    }
    
    public final void m(final hsa hsa) {
        synchronized (this) {
            ((Set<hsa>)this.a).add(hsa);
        }
    }
    
    public final void n(final aiqj aiqj, final akxi akxi, final int n) {
        final ArrayList l = this.l();
        for (int size = l.size(), i = 0; i < size; ++i) {
            ((hsa)l.get(i)).bn(aiqj, akxi, n);
        }
    }
    
    public final void o(final hsa hsa) {
        synchronized (this) {
            ((Set)this.a).remove(hsa);
        }
    }
    
    public final void p(final hrq hrq) {
        ((LinkedList<WeakReference>)this.a).add(new WeakReference(hrq));
    }
    
    public final void s(final View view, int dimensionPixelSize, final int n) {
        if (view == null) {
            return;
        }
        final Resources resources = view.getContext().getResources();
        final Drawable drawable = resources.getDrawable(n);
        if (drawable == null) {
            return;
        }
        dimensionPixelSize = resources.getDimensionPixelSize(dimensionPixelSize);
        final String format = String.format(Locale.US, "%d.%d", dimensionPixelSize, n);
        Drawable k;
        if ((k = ((Map<K, Drawable>)this.a).get(format)) == null) {
            k = K(resources, drawable, dimensionPixelSize);
            ((Map<String, Drawable>)this.a).put(format, k);
        }
        L(view, k);
    }
    
    public final void t(final View view, final int n, final int n2, final boolean b) {
        if (view == null) {
            return;
        }
        final Resources resources = view.getContext().getResources();
        final Drawable drawable = resources.getDrawable(n);
        final Drawable drawable2 = resources.getDrawable(n2);
        if (drawable != null) {
            if (drawable2 != null) {
                final int dimensionPixelSize = resources.getDimensionPixelSize(2131169161);
                final Locale us = Locale.US;
                final Integer value = dimensionPixelSize;
                final Boolean value2 = b;
                final String format = String.format(us, "%d.%d.%B", value, n2, value2);
                final String format2 = String.format(Locale.US, "%d.%d.%B", value, n, value2);
                Drawable k;
                if ((k = ((Map<K, Drawable>)this.a).get(format)) == null) {
                    k = K(resources, drawable2, dimensionPixelSize);
                    ((Map<String, Drawable>)this.a).put(format, k);
                }
                Drawable i;
                if ((i = ((Map<K, Drawable>)this.a).get(format2)) == null) {
                    i = K(resources, drawable, dimensionPixelSize);
                    ((Map<String, Drawable>)this.a).put(format2, i);
                }
                final StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[] { 16842913 }, k);
                stateListDrawable.addState(StateSet.WILD_CARD, i);
                stateListDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                L(view, (Drawable)stateListDrawable);
            }
        }
    }
    
    public final aloa u(final aloa aloa) {
        aloa v = aloa;
        if (aloa != null) {
            v = aloa;
            if ((aloa.b & 0x1) != 0x0) {
                aloh aloh;
                if ((aloh = aloa.c) == null) {
                    aloh = aloh.a;
                }
                v = aloa;
                if ((aloh.b & 0x1) != 0x0) {
                    v = v(aloa, (alog)((Map<Object, Object>)this.a).get(aloh.c));
                }
            }
        }
        return v;
    }
    
    public final hox y(final acqb acqb, final hrz hrz, final arwh arwh, final hko hko, final hng hng) {
        final hlq hlq = (hlq)((atke)this.a).a();
        hlq.getClass();
        acqb.getClass();
        hrz.getClass();
        arwh.getClass();
        hko.getClass();
        hng.getClass();
        return new hox(hlq, acqb, hrz, arwh, hng, null, null, null, null);
    }
}
