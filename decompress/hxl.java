import android.content.res.ColorStateList;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b;
import android.widget.ImageView;
import java.util.Collection;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import android.text.TextUtils;
import android.graphics.PorterDuff$Mode;
import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.List;
import android.graphics.Bitmap;
import java.io.IOException;
import android.graphics.BitmapRegionDecoder;
import android.net.Uri;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.h;
import com.google.android.apps.youtube.app.ui.keyboardshortcuts.KeyboardShortcutsController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxl implements tcc
{
    final Object a;
    private final int b;
    
    public hxl(final abby a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final abdm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final abij a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final KeyboardShortcutsController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final h a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final a a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final d a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final hxm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final jhn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final sja a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final sjf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final xgm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxl(final xsj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(final Object o, final Object o2) {
        final int b = this.b;
        final PlayerResponseModel playerResponseModel = null;
        int visibility = 0;
        switch (b) {
            default: {
                final Uri uri = (Uri)o;
                final byte[] array = (byte[])o2;
                try {
                    final xan o3 = ((abij)this.a).o;
                    if (o3 != null) {
                        o3.c("thsb0_nr");
                    }
                    ((abij)this.a).d.put((Object)uri, (Object)BitmapRegionDecoder.newInstance(array, 0, array.length, true));
                    return;
                }
                catch (final IOException ex) {
                    return;
                }
                break;
            }
            case 12: {
                final Uri uri2 = (Uri)o;
                final Bitmap b2 = (Bitmap)o2;
                final abdm abdm = (abdm)this.a;
                abdm.b = b2;
                abdm.a.p(abdm.b);
                return;
            }
            case 11: {
                final Void void1 = (Void)o;
                ((abby)this.a).b.q((List)o2);
                return;
            }
            case 10: {
                final Void void2 = (Void)o;
                PlayerResponseModel b3 = (PlayerResponseModel)o2;
                xsj.k((xsj)this.a);
                if (b3.K().isEmpty()) {
                    ttr.m(xsj.a, "Video id for auto play player response is empty.");
                    b3 = playerResponseModel;
                }
                final xsj xsj = (xsj)this.a;
                final xse b4 = xsj.f.b();
                final xsc a = ((xsj)this.a).f.k.a();
                a.b = b3;
                b4.e = a.a();
                xsj.j(b4);
                ((xsj)this.a).b(7);
                return;
            }
            case 9: {
                final xjr xjr = (xjr)o;
                final xjf xjf = (xjf)o2;
                ((xgm)this.a).g.M();
                ((xgm)this.a).g.k(2131232265);
                final xgm xgm = (xgm)this.a;
                xgm.g.m(tpe.ct((Context)xgm.a, 2130970852));
                if (((xgm)this.a).l.aP()) {
                    ((xgm)this.a).f(false);
                    ((xgm)this.a).k.setTag(2131428654, (Object)((xjr)xjf.h()).b);
                    return;
                }
                ((xgm)this.a).j.getBackground().setColorFilter(tpe.cr((Context)((xgm)this.a).a, 2130970852), PorterDuff$Mode.MULTIPLY);
                final xgm xgm2 = (xgm)this.a;
                xgm2.j.setTextColor(tpe.cr((Context)xgm2.a, 2130970925));
                ((xgm)this.a).j.setEnabled(true);
                ((xgm)this.a).j.setTag(2131428654, (Object)((xjr)xjf.h()).b);
                return;
            }
            case 8: {
                final Uri uri3 = (Uri)o;
                final Bitmap imageBitmap = (Bitmap)o2;
                final jat jat = (jat)((sjf)this.a).a;
                jat.e.setImageBitmap(imageBitmap);
                final ImageView e = jat.e;
                if (imageBitmap == null) {
                    visibility = 4;
                }
                e.setVisibility(visibility);
                if (!TextUtils.isEmpty(jat.s)) {
                    jat.e.setContentDescription(jat.s);
                }
                return;
            }
            case 7: {
                final Uri uri4 = (Uri)o;
                final Bitmap b5 = (Bitmap)o2;
                final sja sja = (sja)this.a;
                sja.b = b5;
                sja.a.p(sja.b);
                return;
            }
            case 6: {
                final BitmapKey bitmapKey = (BitmapKey)o;
                final Bitmap imageBitmap2 = (Bitmap)o2;
                if (bitmapKey != null) {
                    if (bitmapKey.equals(((d)this.a).t)) {
                        ((d)this.a).x.setImageBitmap(imageBitmap2);
                        ((d)this.a).A = 3;
                    }
                }
                return;
            }
            case 5: {
                final Uri uri5 = (Uri)o;
                final Bitmap bitmap = (Bitmap)o2;
                final b a2 = ((a)this.a).a;
                if (a2 == null) {
                    return;
                }
                a2.p(bitmap);
                return;
            }
            case 4: {
                final Uri uri6 = (Uri)o;
                ((h)this.a).a.q((Bitmap)o2);
                return;
            }
            case 3: {
                final Void void3 = (Void)o;
                ((SubtitleButtonController)((KeyboardShortcutsController)this.a).f.a()).C((List)o2);
                return;
            }
            case 2: {
                final Void void4 = (Void)o;
                final List list = (List)o2;
                ((jhn)this.a).H.G(xaa.b(122502), wzr.a, (aiqj)null);
                if (list.isEmpty()) {
                    final jhn jhn = (jhn)this.a;
                    final acle b6 = jhn.b;
                    final ahaz builder = ((ahbh)ahyk.a).createBuilder();
                    final ahaz builder2 = ((ahbh)ahyl.a).createBuilder();
                    final ahyi b7 = ahyi.b;
                    builder2.copyOnWrite();
                    final ahyl ahyl = (ahyl)builder2.instance;
                    ahyl.c = b7.g;
                    ahyl.b |= 0x1;
                    builder.copyOnWrite();
                    final ahyk ahyk = (ahyk)builder.instance;
                    final ahyl j = (ahyl)builder2.build();
                    j.getClass();
                    ahyk.j = j;
                    ahyk.b |= 0x100;
                    final ahaz builder3 = ((ahbh)ahym.a).createBuilder();
                    final akdh ky = akdh.ky;
                    builder3.copyOnWrite();
                    final ahym ahym = (ahym)builder3.instance;
                    ahym.c = ky.sy;
                    ahym.b |= 0x1;
                    builder.copyOnWrite();
                    final ahyk ahyk2 = (ahyk)builder.instance;
                    final ahym d = (ahym)builder3.build();
                    d.getClass();
                    ahyk2.d = d;
                    ahyk2.c = 3;
                    final ajut g = acak.g(new String[] { jhn.F.getString(2132018804) });
                    builder.copyOnWrite();
                    final ahyk ahyk3 = (ahyk)builder.instance;
                    g.getClass();
                    ahyk3.e = g;
                    ahyk3.b |= 0x1;
                    b6.add((Object)builder.build());
                }
                else {
                    ((tfz)((jhn)this.a).b).addAll((Collection)list);
                }
                ((jhn)this.a).G.a();
                return;
            }
            case 1: {
                final Void void5 = (Void)o;
                final PlayerResponseModel az = (PlayerResponseModel)o2;
                final hxm hxm = (hxm)this.a;
                hxm.az = az;
                if (hxm.az != null) {
                    hxm.aT();
                }
                return;
            }
            case 0: {
                final Void void6 = (Void)o;
                ((hxm)this.a).aO((PlayerResponseModel)o2);
            }
        }
    }
    
    public final void sd(final Object o, final Exception ex) {
        switch (this.b) {
            default: {
                final Uri uri = (Uri)o;
                final xan o2 = ((abij)this.a).o;
                if (o2 != null) {
                    o2.c("thsb0_ne");
                    ((abij)this.a).o = null;
                }
                ttr.n("Failed to load video storyboard mosaic at: ".concat(String.valueOf(String.valueOf(uri))), (Throwable)ex);
                return;
            }
            case 12: {
                final Uri uri2 = (Uri)o;
                ttr.n("Failed to load playerview thumbnail", (Throwable)ex);
                return;
            }
            case 11: {
                final Void void1 = (Void)o;
                ((abby)this.a).a.rl();
                return;
            }
            case 10: {
                final Void void2 = (Void)o;
                ttr.d("Failed to fetch player response", (Throwable)ex);
                xsj.k((xsj)this.a);
                return;
            }
            case 9: {
                final xjr xjr = (xjr)o;
                final int cr = tpe.cr((Context)((xgm)this.a).a, 2130970855);
                ((xgm)this.a).g.h(cr);
                ((xgm)this.a).g.v(ColorStateList.valueOf(cr));
                ((xgm)this.a).g.M();
                ((xgm)this.a).g.k(2131232696);
                final xgm xgm = (xgm)this.a;
                xgm.g.m(tpe.ct((Context)xgm.a, 2130970924));
                return;
            }
            case 8: {
                final String value = String.valueOf(o);
                final StringBuilder sb = new StringBuilder("Couldn't retrieve thumbnail from [uri=");
                sb.append(value);
                sb.append("]");
                ttr.d(sb.toString(), (Throwable)ex);
                return;
            }
            case 7: {
                final Uri uri3 = (Uri)o;
                ttr.n("Failed to load playerview thumbnail", (Throwable)ex);
                return;
            }
            case 6: {
                final BitmapKey bitmapKey = (BitmapKey)o;
                if (bitmapKey != null) {
                    if (bitmapKey.equals(((d)this.a).t)) {
                        ((d)this.a).x.setImageBitmap((Bitmap)null);
                        ((d)this.a).A = 3;
                    }
                }
                return;
            }
            case 5: {
                final Uri uri4 = (Uri)o;
                final b a = ((a)this.a).a;
                if (a == null) {
                    return;
                }
                a.p(null);
                return;
            }
            case 4: {
                final String value2 = String.valueOf(o);
                final StringBuilder sb2 = new StringBuilder("Couldn't retrieve thumbnail from [uri=");
                sb2.append(value2);
                sb2.append("]");
                ttr.d(sb2.toString(), (Throwable)ex);
                return;
            }
            case 3: {
                final Void void3 = (Void)o;
                ((ajb)((KeyboardShortcutsController)this.a).d.a()).o();
                return;
            }
            case 2: {
                final Void void4 = (Void)o;
                final ttl a2 = ((jhn)this.a).a.a((Throwable)ex);
                ((jhn)this.a).G.b((CharSequence)a2.b, true);
                hxw.a(((jhn)this.a).H, (String)a2.c);
                return;
            }
            case 1: {
                final Void void5 = (Void)o;
                final hxm hxm = (hxm)this.a;
                hxm.az = null;
                hxm.ae.setVisibility(8);
                hxm.af.setVisibility(0);
                hxm.ag.setVisibility(8);
                return;
            }
            case 0: {
                final Void void6 = (Void)o;
                final tqd aa = ((hxm)this.a).aA;
                aa.d(aa.b((Throwable)ex));
                ((hxm)this.a).an.m((Object)this);
            }
        }
    }
}
