import android.content.SharedPreferences$Editor;
import android.view.View$AccessibilityDelegate;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import android.os.Bundle;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.content.Context;
import java.util.ArrayList;
import android.content.Intent;
import java.util.List;
import android.view.View;
import android.app.Activity;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gki implements Runnable
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public gki(final aaxc c, final int a, final wzz d, final alhi b, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public gki(final abem d, final pyf c, final int a, final String b, final int e, final byte[] array) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gki(final acsn b, final Dialog c, final Activity d, final int a, final int e) {
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public gki(final gkp b, final View c, final int a, final nw d, final int e) {
        this.e = e;
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public gki(final gq d, final List b, final List c, final int a, final int e) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public gki(final how d, final int a, final aiqj c, final akxi b, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public gki(final nhm d, final int a, final Exception c, final byte[] b, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public gki(final nns b, final int a, final nfx c, final Intent d, final int e, final byte[] array, final byte[] array2) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public gki(final wjg c, final String b, final int a, final ttn d, final int e) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public gki(final wlm d, final int a, final String b, final aixf c, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public gki(final wln d, final int a, final String b, final aixf c, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public gki(final wlr d, final int a, final aixf c, final alub b, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public gki(final wsc c, final String b, final int a, final ttn d, final int e) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public gki(final xzq c, final int a, final xvk d, final String b, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public final void run() {
        switch (this.e) {
            default: {
                ((acsn)this.b).ba((Dialog)this.c, (Activity)this.d, this.a, -1);
                return;
            }
            case 12: {
                ((aaxc)this.c).a.J(this.a, (wzz)this.d, (alhi)this.b);
                return;
            }
            case 11: {
                final Object c = this.c;
                final int a = this.a;
                final Object d = this.d;
                final Object b = this.b;
                final zvn p = ((xzq)c).p;
                final ahaz builder = ((ahbh)xxo.a).createBuilder();
                builder.copyOnWrite();
                final xxo xxo = (xxo)builder.instance;
                xxo.b |= 0x1;
                xxo.c = a;
                builder.copyOnWrite();
                final xxo xxo2 = (xxo)builder.instance;
                d.getClass();
                xxo2.e = (xvk)d;
                xxo2.b |= 0x4;
                builder.copyOnWrite();
                final xxo xxo3 = (xxo)builder.instance;
                b.getClass();
                xxo3.b |= 0x2;
                xxo3.d = (String)b;
                p.f((xxo)builder.build());
                return;
            }
            case 10: {
                ((wsc)this.c).d.p((String)this.b, this.a - 1, (ttn)this.d);
                return;
            }
            case 9: {
                ((wlr)this.d).b(this.a, (aixf)this.c, (alub)this.b);
                return;
            }
            case 8: {
                ((wln)this.d).a(this.a, (String)this.b, (aixf)this.c);
                return;
            }
            case 7: {
                ((wlm)this.d).a(wme.w(this.a), (String)this.b, (aixf)this.c);
                return;
            }
            case 6: {
                ((wjh)((wjg)this.c).d).b((String)this.b, this.a - 1, (ttn)this.d);
                return;
            }
            case 5: {
                final Object d2 = this.d;
                final Object c2 = this.c;
                final int a2 = this.a;
                final Object b2 = this.b;
                final abem abem = (abem)d2;
                final Object b3 = abem.b;
                final puy puy = new puy(abem, (String)b2, (byte[])null);
                final puw puw = (puw)c2;
                final qbx a3 = puw.a;
                final nnv b4 = puw.b;
                final pyg a4 = pyg.a(b3);
                adkp.I(true, "Size must be bigger or equal to 0");
                adkp.I(qbx.e(a4), "handles(key) must be true");
                final ArrayList list = new ArrayList();
                final String b5 = a4.b;
                if (b5 != null) {
                    list.add(b5);
                }
                int n;
                if ((n = a2) == 0) {
                    n = 120;
                }
                list.add(a4.a);
                final String[] array = new String[list.size()];
                list.toArray(array);
                final qsk qsk = new qsk(new qsl(((Context)a3.a).getApplicationContext(), afwm.e()));
                final int[] a5 = qsj.a;
                final qsk qsk2 = new qsk((qsi)qsk);
                final qlk a6 = qsm.a;
                qsk2.b((tan)null);
                qsk.a((String)null);
                final Bitmap bitmap = Bitmap.createBitmap(n, n, Bitmap$Config.ARGB_8888);
                final int a7 = qsk.a(a4.a);
                final CharSequence b6 = qsk2.b(new tan(array));
                final Canvas canvas = new Canvas(bitmap);
                final int height = bitmap.getHeight();
                final int width = bitmap.getWidth();
                final Paint paint = (Paint)qsm.a.a();
                Object o = qsm.a;
                synchronized (o) {
                    paint.setColor(a7);
                    final int height2 = canvas.getHeight();
                    final int width2 = canvas.getWidth();
                    canvas.drawCircle((float)(width2 / 2), (float)(height2 / 2), (float)(Math.min(width2, height2) / 2), paint);
                    if (b6 != null) {
                        paint.setColor(-1);
                        paint.setTextSize(Math.min(height, width) * 0.47f);
                        paint.getTextBounds(b6.toString(), 0, b6.length(), qsm.b);
                        canvas.drawText(b6, 0, b6.length(), (float)(width / 2), height / 2 - qsm.b.exactCenterY(), paint);
                    }
                    monitorexit(o);
                    o = puy.b;
                    final String a8 = puy.a;
                    final BitmapDrawable bitmapDrawable = new BitmapDrawable(((abem)o).b(bitmap));
                    pvb.b.put(a8, bitmapDrawable);
                    ((abem)o).e((Drawable)bitmapDrawable, true);
                }
            }
            case 4: {
                final Object b7 = this.b;
                final int a9 = this.a;
                final Object c3 = this.c;
                final Object d3 = this.d;
                final nns nns = (nns)b7;
                if (((nib)nns.a).b(a9)) {
                    ((nfx)c3).k.b("Local AppMeasurementService processed last upload request. StartId", (Object)a9);
                    nns.e().k.a("Completed wakeful intent.");
                    ((nib)nns.a).a((Intent)d3);
                }
                return;
            }
            case 3: {
                final Object d4 = this.d;
                final int a10 = this.a;
                final Object c4 = this.c;
                final Object b8 = this.b;
                final Object a11 = ((nhm)d4).b.a;
                int n2 = a10;
                Label_1763: {
                    if (a10 != 200 && (n2 = a10) != 204) {
                        if ((n2 = a10) != 304) {
                            break Label_1763;
                        }
                        n2 = 304;
                    }
                    if (c4 == null) {
                        final ngt ngt = (ngt)a11;
                        ngt.g().r.a(true);
                        if (b8 != null) {
                            final byte[] array2 = (byte[])b8;
                            if (array2.length != 0) {
                                final String s = new String(array2);
                                try {
                                    final JSONObject jsonObject = new JSONObject(s);
                                    final String optString = jsonObject.optString("deeplink", "");
                                    final String optString2 = jsonObject.optString("gclid", "");
                                    final double optDouble = jsonObject.optDouble("timestamp", 0.0);
                                    if (TextUtils.isEmpty((CharSequence)optString)) {
                                        ((ngt)a11).aA().j.a("Deferred Deep Link is empty.");
                                        return;
                                    }
                                    final nir p2 = ((ngt)a11).p();
                                    if (!TextUtils.isEmpty((CharSequence)optString)) {
                                        final List queryIntentActivities = ((ngy)p2).K().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                                        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                                            final Bundle bundle = new Bundle();
                                            bundle.putString("gclid", optString2);
                                            bundle.putString("_cis", "ddp");
                                            ((ngt)a11).l.v("auto", "_cmp", bundle);
                                            final nir p3 = ((ngt)a11).p();
                                            if (TextUtils.isEmpty((CharSequence)optString)) {
                                                return;
                                            }
                                            try {
                                                final SharedPreferences$Editor edit = ((ngy)p3).K().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                                edit.putString("deeplink", optString);
                                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                                if (edit.commit()) {
                                                    ((ngy)p3).K().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                                }
                                                return;
                                            }
                                            catch (final RuntimeException ex) {
                                                ((ngy)p3).aA().c.b("Failed to persist Deferred Deep Link. exception", (Object)ex);
                                                return;
                                            }
                                        }
                                    }
                                    ((ngt)a11).aA().f.c("Deferred Deep Link validation failed. gclid, deep link", (Object)optString2, (Object)optString);
                                    return;
                                }
                                catch (final JSONException ex2) {
                                    ngt.aA().c.b("Failed to parse the Deferred Deep Link response. exception", (Object)ex2);
                                    return;
                                }
                            }
                        }
                        ngt.aA().j.a("Deferred Deep Link response empty.");
                        return;
                    }
                }
                ((ngt)a11).aA().f.c("Network Request for Deferred Deep Link failed. response, exception", (Object)n2, c4);
                return;
            }
            case 2: {
                final Object d5 = this.d;
                final int a12 = this.a;
                final Object c5 = this.c;
                final Object b9 = this.b;
                if (a12 == 2 || a12 == 3) {
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    final how how = (how)d5;
                    asjv.b((AtomicReference)how.bS.l(45374694L).aH((asjm)new hom(atomicBoolean, 3)));
                    if (atomicBoolean.get()) {
                        how.ap.g((aiqj)c5, (akxi)b9);
                    }
                }
                return;
            }
            case 1: {
                ((gq)this.d).b.execute(new da(this, hc.a(new gp(this, null)), 4, null));
                return;
            }
            case 0: {
                final Object b10 = this.b;
                final Object c6 = this.c;
                final int a13 = this.a;
                final Object d6 = this.d;
                final gkp gkp = (gkp)b10;
                gkp.k = false;
                if (!fal.q(gkp.d.j())) {
                    gkp.f();
                    return;
                }
                if (c6 != null) {
                    gkp.c.removeView((View)c6);
                }
                final nq b11 = gkp.b;
                final on ms = b11.mS(gkp.c, b11.d(a13));
                gkp.i = ms.a;
                b11.q(ms, a13);
                gkp.j = gkp.d.n();
                gkp.c.addView(gkp.i);
                gkp.i.setFocusable(true);
                gkp.i.setAccessibilityDelegate((View$AccessibilityDelegate)new gkm(gkp));
                if (c6 == null && gkp.d.n() != Long.MAX_VALUE) {
                    final View t = ((nw)d6).T(a13);
                    if (t != null) {
                        gkp.e.c(t, gkp.i);
                    }
                }
            }
        }
    }
}
