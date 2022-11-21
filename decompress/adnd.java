import com.google.android.libraries.youtube.ads.model.VideoAd;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Handler;
import org.chromium.net.CronetEngine;
import java.util.Arrays;
import android.net.Uri$Builder;
import com.google.android.libraries.youtube.ads.model.SurveyQuestionRendererModel;
import android.net.Uri;
import java.net.MalformedURLException;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.ads.model.AdIntro;
import com.google.android.libraries.youtube.ads.model.MediaBreakAd;
import com.google.android.libraries.youtube.ads.model.ThrottledAd;
import java.util.function.Consumer;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.protos.youtube.api.innertube.AdEngagementPanelsRendererOuterClass;
import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
import android.text.Spanned;
import java.util.Collection;
import android.database.SQLException;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.util.Iterator;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import android.text.TextUtils;
import java.util.Map;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;
import j$.util.Optional;
import android.content.res.Resources;
import android.widget.ProgressBar;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.Executor;
import android.view.View;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.widget.CheckBox;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.SharedPreferences;
import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adnd
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    
    public adnd(final aabr c, final aapu b, final zkt f, final adnd g, final aaca aaca, final zxm d, final aaed e, final atmw a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        this.f = f;
        this.g = g;
        this.d = d;
        this.e = e;
        this.a = a;
        ((List<xsj>)b.c).add(new xsj(this, (byte[])null, (byte[])null));
        f.g((zyo)new zxk(this, 0, (byte[])null, (byte[])null));
        g.y((zxu)new zxj(this, 0, (byte[])null, (byte[])null));
        aaca.h((zyi)new zym(this, 1, (byte[])null, (byte[])null));
    }
    
    public adnd(final abls d, final abos e, final acbe a, final thg f, final Set c, final abrp g, final Set b) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.f = f;
        this.c = c;
        this.g = g;
        this.b = b;
    }
    
    public adnd(final Context b, final SharedPreferences a, final tkq e, final oqz oqz, final aefs d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        d.getClass();
        this.d = d;
        final String string = b.getString(2132020072);
        this.g = string;
        this.f = b.getString(2132020073);
        if (!a.contains("upload_policy")) {
            final String s = string;
            this.H(string);
        }
        final Context context = b;
        final View inflate = LayoutInflater.from(b).inflate(2131624133, (ViewGroup)null);
        final CheckBox checkBox = (CheckBox)inflate.findViewById(2131428706);
        final gja gja = new gja(this, checkBox, oqz, 12, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        final far far = new far(oqz, 8, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        final Context context2 = b;
        final ex ex = new ex(b);
        ex.n(2132017677);
        ex.p(inflate);
        ex.h(2132017673, (DialogInterface$OnClickListener)gja);
        ex.k(2132017674, (DialogInterface$OnClickListener)gja);
        ex.j((DialogInterface$OnCancelListener)far);
        final ey b2 = ex.b();
        final aefs aefs = d;
        if (d.Y()) {
            b2.setOnShowListener((DialogInterface$OnShowListener)new swu(b2, 3));
        }
        checkBox.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new cfp(b2, 17));
        this.c = b2;
    }
    
    public adnd(final Context a, final Executor b, final wza c, final adgg g, final zoa e, final SharedPreferences d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = g;
        this.d = d;
        this.e = e;
        final String string = a.getString(2132020073);
        twd.n(string);
        this.f = string;
    }
    
    public adnd(final Context c, final veh d, final sxl a, final tre b, final vxu f, final aefs e, final aefs g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        f.getClass();
        this.f = f;
        e.getClass();
        this.e = e;
        this.g = g;
    }
    
    public adnd(final Context c, final veh b, final xab d, final soy a, final sxl f, final aefs e, final aefs g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
        this.f = f;
        this.e = e;
        this.g = g;
    }
    
    public adnd(final View a) {
        this.f = a.findViewById(2131429586);
        this.d = a.findViewById(2131429582);
        this.g = a.findViewById(2131429587);
        this.b = a.findViewById(2131429588);
        this.c = a.findViewById(2131429584);
        this.e = a.findViewById(2131429677);
        this.a = a;
    }
    
    public adnd(final ViewGroup g, final Context b, final aaux d, final aaut f) {
        g.getClass();
        this.g = g;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        final Resources resources = b.getResources();
        resources.getClass();
        this.e = resources;
        f.getClass();
        this.f = f;
        this.c = f.a().a();
        this.a = new aawc(d, f);
    }
    
    public adnd(final arna c, final accx d, final ajvm ajvm, final achf g, final ache e, final Optional b, final xab f) {
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
        this.b = b;
        this.f = f;
        anxb a;
        if ((a = ajvm.d) == null) {
            a = anxb.a;
        }
        this.a = a;
    }
    
    public adnd(final atnb c, final atnb d, final atnb g, final atnb e, final atnb a, final atnb f, final atnb b) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        g.getClass();
        this.g = g;
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
        f.getClass();
        this.f = f;
        b.getClass();
        this.b = b;
    }
    
    public adnd(final atnb a, final atnb e, final atnb b, final atnb g, final atnb d, final atnb c, final atnb f, final byte[] array) {
        this.a = a;
        this.e = e;
        b.getClass();
        this.b = b;
        this.g = g;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
        f.getClass();
        this.f = f;
    }
    
    public adnd(final atnb b, final atnb e, final atnb f, final atnb c, final atnb a, final atnb d, final atnb g, final byte[] array, final byte[] array2) {
        b.getClass();
        this.b = b;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        g.getClass();
        this.g = g;
    }
    
    public adnd(final atnb g, final atnb a, final atnb c, final atnb d, final atnb e, final atnb f, final atnb b, final byte[] array, final byte[] array2, final byte[] array3) {
        g.getClass();
        this.g = g;
        a.getClass();
        this.a = a;
        this.c = c;
        d.getClass();
        this.d = d;
        this.e = e;
        this.f = f;
        b.getClass();
        this.b = b;
    }
    
    public adnd(final atnb b, final atnb e, final atnb a, final atnb d, final atnb f, final atnb c, final atnb g, final char[] array) {
        b.getClass();
        this.b = b;
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        f.getClass();
        this.f = f;
        c.getClass();
        this.c = c;
        this.g = g;
    }
    
    public adnd(final atnb a, final atnb e, final atnb g, final atnb f, final atnb c, final atnb d, final atnb b, final char[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        g.getClass();
        this.g = g;
        f.getClass();
        this.f = f;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.b = b;
    }
    
    public adnd(final ScheduledExecutorService f, final aefs e, final zoa g, final znt d, final adhh a, final adhh c, final mtf b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = f;
        this.e = e;
        this.g = g;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adnd(final mbb b, final sao a, final srr f, final eg g, final ggp e, final qep c, final arzb d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = b;
        this.a = a;
        this.f = f;
        this.g = g;
        this.e = e;
        this.c = c;
        this.d = d;
    }
    
    public adnd(final oco b, final aaks e, final atnb c, final vfn d, final zoa g, final atnb a, final aakt f) {
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        this.g = g;
        this.a = a;
        this.f = f;
    }
    
    public adnd(final rrb g, final rra b, final sjp c, final rlb f, final sil e, final sgv a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        this.b = b;
        this.c = c;
        this.f = f;
        this.e = e;
        this.a = a;
        this.d = new HashSet();
    }
    
    public adnd(final veh b, final zoa c, final vuw vuw, final Context a, final atnb g, final xab e, final Executor executor, final oco f) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new hlu(vuw, (atnb)null, executor, 11);
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    public adnd(final zxl g, final atnb a, final oco b, final aapu d, final zkt f, final aaks c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.d = d;
        this.f = f;
        this.c = c;
        this.e = new ArrayList();
    }
    
    public static final ahng aa(final MediaAd mediaAd) {
        alhu k;
        if (mediaAd != null) {
            k = mediaAd.k();
        }
        else {
            k = null;
        }
        if (k != null) {
            ahng ahng;
            if ((ahng = k.j) == null) {
                ahng = ahng.a;
            }
            return ahng;
        }
        return null;
    }
    
    private final sgv ad(final sil sil, final String s, final ahqt ahqt, final afbh afbh, final String s2, final InstreamAd instreamAd, final List list, final aisc aisc, final Map map, final String s3, final sdz sdz) {
        if (list.size() == 0) {
            return null;
        }
        final ArrayList list2 = new ArrayList();
        for (final ajrl ajrl : list) {
            final String y = this.Y(ajrl);
            if (TextUtils.isEmpty((CharSequence)y)) {
                qep.n(sil, "Missing panel ID for ads engagement panel.");
            }
            else {
                if (qey.D((arzb)this.d)) {
                    ajrp b;
                    if (ajrl.b == 138681066) {
                        b = (ajrp)ajrl.c;
                    }
                    else {
                        b = ajrp.b;
                    }
                    if ((b.c & 0x800000) != 0x0) {
                        continue;
                    }
                }
                list2.add(y);
            }
        }
        final ArrayList list3 = new ArrayList();
        list3.add(new seu(list));
        list3.add(new sfp((List)list2));
        if (aisc != null && map != null) {
            list3.add(new sgj(aisc));
            list3.add(new sgh(map));
        }
        final afgc d = afgh.d();
        d.h(shp.c(((eg)this.g).S(ahqy.r), s2, ahqw.b, ahqt.b));
        if (instreamAd instanceof InstreamAdImpl) {
            final PlayerAd b2 = ((InstreamAdImpl)instreamAd).b;
            if (b2 instanceof LocalVideoAd) {
                final LocalVideoAd localVideoAd = (LocalVideoAd)b2;
                if (localVideoAd.E() || localVideoAd.C() || localVideoAd.F()) {
                    d.h(six.c(((eg)this.g).S(ahqy.w), s));
                }
                if (localVideoAd.F()) {
                    d.h(siv.c(((eg)this.g).S(ahqy.x), s));
                }
            }
        }
        if (sdz.c > 1 && !qey.z((arzb)this.d)) {
            d.h(sgy.f(((eg)this.g).S(ahqy.u), s3, instreamAd.i(), new int[] { 0 }));
        }
        return sgv.e(s, ahqt, 1, d.g(), afgh.q(), afgh.q(), afbh, afbh.k(((ggp)this.e).d(sil, s, ahqt, 1, (ahng)afbh.f())), (afbh)afag.a, sek.a((List)list3));
    }
    
    public static ContentValues r(final aaco aaco, final oco oco) {
        final ContentValues contentValues = new ContentValues();
        final amxb k = aaco.k;
        final agr n = aaco.n;
        byte[] array;
        if (k != null) {
            array = ((ahbc)k).toByteArray();
        }
        else {
            array = ((ahbc)amxb.a).toByteArray();
        }
        contentValues.put("id", aaco.a);
        contentValues.put("offline_playlist_data_proto", array);
        contentValues.put("size", Integer.valueOf(aaco.e));
        contentValues.put("saved_timestamp", Long.valueOf(oco.c()));
        contentValues.put("placeholder", Boolean.valueOf(aaco.g));
        if (n != null) {
            contentValues.put("channel_id", (String)n.e);
        }
        return contentValues;
    }
    
    public final void A(final String s) {
        Object rawQuery = ((zxl)this.g).a().rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id IS NULL AND video_id =?", new String[] { s });
        try {
            if (((Cursor)rawQuery).getCount() > 0) {
                return;
            }
            ((Cursor)rawQuery).close();
            rawQuery = new ContentValues();
            ((ContentValues)rawQuery).putNull("playlist_id");
            ((ContentValues)rawQuery).put("video_id", s);
            ((ContentValues)rawQuery).put("saved_timestamp", Long.valueOf(((oco)this.b).c()));
            ((zxl)this.g).a().insertOrThrow("playlist_video", (String)null, (ContentValues)rawQuery);
        }
        finally {
            ((Cursor)rawQuery).close();
        }
    }
    
    public final boolean B(final String s) {
        return tgs.a(((zxl)this.g).a(), "playlist_video", "playlist_id IS NULL AND video_id = ?", new String[] { s }) > 0L;
    }
    
    public final boolean C(final String s) {
        return tgs.a(((zxl)this.g).a(), "playlist_video", "playlist_id IS NOT NULL AND video_id = ?", new String[] { s }) > 0L;
    }
    
    public final int D(final String s) {
        final SQLiteDatabase a = ((zxl)this.g).a();
        final int n = 1;
        int ci = 0;
        final Cursor query = a.query("playlistsV13", new String[] { "playlist_offline_request_source" }, "id = ?", new String[] { s }, (String)null, (String)null, (String)null);
        try {
            if (query.moveToNext()) {
                ci = aqvq.cI(query.getInt(0));
            }
            if (ci == 0) {
                ci = n;
            }
            return ci;
        }
        finally {
            query.close();
        }
    }
    
    public final void E(final String s) {
        Object o = ((zxl)((zkt)this.f).e).a().rawQuery("SELECT COUNT(*) FROM videosV2 WHERE channel_id=?", new String[] { s });
        try {
            ((Cursor)o).moveToFirst();
            final int int1 = ((Cursor)o).getInt(0);
            ((Cursor)o).close();
            if (int1 == 0) {
                o = ((zxl)((adnd)this.g).g).a().rawQuery("SELECT COUNT(*) FROM playlistsV13 WHERE channel_id=?", new String[] { s });
                try {
                    ((Cursor)o).moveToFirst();
                    final int int2 = ((Cursor)o).getInt(0);
                    ((Cursor)o).close();
                    if (int2 == 0) {
                        try {
                            o = this.b;
                            final long n = ((zxl)((aapu)o).a).a().delete("channelsV13", "id = ?", new String[] { s });
                            if (n == 1L) {
                                o = ((List<Object>)((aapu)o).c).iterator();
                                while (((Iterator)o).hasNext()) {
                                    aabr.w(((aabr)((adnd)((Iterator<xsj>)o).next().a).c).d(s));
                                }
                                return;
                            }
                            o = new StringBuilder("Delete channel affected ");
                            ((StringBuilder)o).append(n);
                            ((StringBuilder)o).append(" rows");
                            throw new SQLException(((StringBuilder)o).toString());
                        }
                        catch (final SQLException ex) {}
                    }
                }
                finally {
                    ((Cursor)o).close();
                }
            }
        }
        finally {
            ((Cursor)o).close();
            while (true) {}
        }
    }
    
    public final void F(final Collection collection) {
        final HashSet set = new HashSet();
        final ArrayList list = new ArrayList();
        for (final aacx aacx : collection) {
            final String f = aacx.f();
            if (set.add(f) && ((zxm)this.d).O(aacx)) {
                list.add(f);
            }
        }
        if (!list.isEmpty()) {
            ((atmw)this.a).tt((Object)new aaae((List)list));
        }
    }
    
    public final uww G(final vnq vnq, final xab xab, final uvl uvl) {
        final actc actc = (actc)((atnb)this.g).a();
        actc.getClass();
        final abrp abrp = (abrp)((atnb)this.a).a();
        abrp.getClass();
        final uvo uvo = (uvo)((atnb)this.c).a();
        final thg thg = (thg)((atnb)this.d).a();
        thg.getClass();
        final tre tre = (tre)((atnb)this.e).a();
        tre.getClass();
        final uxp uxp = (uxp)((atnb)this.f).a();
        uxp.getClass();
        final vbo vbo = (vbo)((atnb)this.b).a();
        vbo.getClass();
        xab.getClass();
        return new uww(actc, abrp, uvo, thg, tre, uxp, vbo, vnq, xab, uvl, (byte[])null);
    }
    
    public final void H(final String s) {
        ((SharedPreferences)this.a).edit().putString("upload_policy", s).apply();
    }
    
    public final boolean I() {
        return aexq.c(((SharedPreferences)this.a).getString("upload_policy", (String)null), this.f);
    }
    
    public final void J(final spg spg, final ajch ajch, final aisj aisj, final aisj aisj2, final boolean b) {
        final ajws ajws = null;
        if (spg == null) {
            if (ajch.b == 97806346) {
                final aiuf aiuf = (aiuf)ajch.c;
                final aclz b2 = ((sxl)this.f).b;
                spm spm;
                if (b2 != null) {
                    spm = (spm)b2.c("commentThreadMutator");
                }
                else {
                    spm = null;
                }
                ((soy)this.a).i(aiuf, spm, (aitx)null, b);
            }
            return;
        }
        final spm a = spg.a;
        final aitm c = ((sxl)this.f).c(spg.b, a.h());
        aizd aizd;
        if (c == aitm.b && (aisj.b & 0x1) != 0x0) {
            if ((aizd = aisj.c) == null) {
                aizd = aizd.a;
            }
        }
        else if (c == aitm.d && (aisj2.b & 0x1) != 0x0) {
            if ((aizd = aisj2.c) == null) {
                aizd = aizd.a;
            }
        }
        else {
            aizd = null;
        }
        if (aizd == null) {
            if (ajch.b == 97806346) {
                final aiuf aiuf2 = (aiuf)ajch.c;
                aibr aibr;
                if ((aibr = spg.b.B) == null) {
                    aibr = aibr.a;
                }
                if (aibr.b == 99391126) {
                    final Object a2 = this.a;
                    final aitx b3 = spg.b;
                    if ((aiuf2.b & 0x20) == 0x0) {
                        tut.b("No reply button specified for comment reply dialog.");
                        return;
                    }
                    aiet aiet;
                    if ((aiet = aiuf2.f) == null) {
                        aiet = aiet.a;
                    }
                    if ((aiet.b & 0x1) == 0x0) {
                        tut.b("No button renderer specified for comment reply dialog.");
                        return;
                    }
                    aiet aiet2;
                    if ((aiet2 = aiuf2.f) == null) {
                        aiet2 = aiet.a;
                    }
                    aies aies;
                    if ((aies = aiet2.c) == null) {
                        aies = aies.a;
                    }
                    if ((aies.b & 0x4000) == 0x0) {
                        tut.b("No service endpoint specified for comment reply dialog.");
                        return;
                    }
                    final soy soy = (soy)a2;
                    final aiuf c2 = soy.c(aiuf2);
                    if (soy.r(b3) == null) {
                        aitm aitm;
                        if ((aitm = aitm.b(b3.H)) == null) {
                            aitm = aitm.a;
                        }
                        if (aitm == aitm.c) {
                            soy.i(c2, a, b3, false);
                        }
                        return;
                    }
                    aowb aowb;
                    if ((aowb = c2.c) == null) {
                        aowb = aowb.a;
                    }
                    ajws ajws2;
                    if ((c2.b & 0x10) != 0x0) {
                        if ((ajws2 = c2.e) == null) {
                            ajws2 = ajws.a;
                        }
                    }
                    else {
                        ajws2 = null;
                    }
                    final Spanned b4 = acbu.b(ajws2);
                    aiet aiet3;
                    if ((aiet3 = c2.f) == null) {
                        aiet3 = aiet.a;
                    }
                    aies aies2;
                    if ((aies2 = aiet3.c) == null) {
                        aies2 = aies.a;
                    }
                    aies aies4;
                    if ((c2.b & 0x80) != 0x0) {
                        aiet aiet4;
                        if ((aiet4 = c2.g) == null) {
                            aiet4 = aiet.a;
                        }
                        aies aies3;
                        if ((aies3 = aiet4.c) == null) {
                            aies3 = aies.a;
                        }
                        aies4 = aies3;
                    }
                    else {
                        aies4 = null;
                    }
                    aiet aiet5;
                    if ((aiet5 = c2.i) == null) {
                        aiet5 = aiet.a;
                    }
                    aies aies5;
                    if ((aies5 = aiet5.c) == null) {
                        aies5 = aies.a;
                    }
                    anxb anxb;
                    if ((anxb = c2.j) == null) {
                        anxb = anxb.a;
                    }
                    final String k = c2.k;
                    ajws ajws3 = ajws;
                    if ((c2.b & 0x10) != 0x0 && (ajws3 = c2.e) == null) {
                        ajws3 = ajws.a;
                    }
                    soy.e(new spc(1, aowb, a, b3, (Spanned)null, b4, (aqcl)null, aies2, aies4, aies5, anxb, k, (ajws)null, ajws3, (aitl)null, c2), (acre)null, (CharSequence)null, (Long)null, false, false);
                }
                else {
                    ((soy)this.a).i(aiuf2, a, spg.b, false);
                }
            }
            return;
        }
        acch.h((Context)this.c, aizd, (veh)this.b, (xab)this.d, this.e, (aefs)this.g);
    }
    
    public final void K(final spm spm, final annj annj, final annh annh, final aitm aitm, final xab xab) {
        aisc aisc;
        if (annh.d) {
            if ((aisc = annh.j) == null) {
                aisc = aisc.a;
            }
        }
        else if ((aisc = annh.i) == null) {
            aisc = aisc.a;
        }
        aisc aisc2;
        if ((aisc2 = aisc) == null && (aisc2 = annh.e) == null) {
            aisc2 = aisc.a;
        }
        final ahcr builder = ((ahcz)UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.a).createBuilder();
        if ((annj.b & 0x40) != 0x0) {
            ajws d;
            if ((d = annj.h) == null) {
                d = ajws.a;
            }
            builder.copyOnWrite();
            final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction)builder.instance;
            d.getClass();
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction.d = d;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction.b |= 0x4;
        }
        builder.copyOnWrite();
        final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction2 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction)builder.instance;
        updateBackstagePollActionOuterClass$UpdateBackstagePollAction2.b |= 0x8;
        updateBackstagePollActionOuterClass$UpdateBackstagePollAction2.e = -1;
        for (int i = 0; i < annj.f.size(); ++i) {
            if (((annh)annj.f.get(i)).d) {
                builder.copyOnWrite();
                final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction3 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction)builder.instance;
                updateBackstagePollActionOuterClass$UpdateBackstagePollAction3.b |= 0x8;
                updateBackstagePollActionOuterClass$UpdateBackstagePollAction3.e = i;
                break;
            }
        }
        if (aitm != null) {
            builder.copyOnWrite();
            final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction4 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction)builder.instance;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction4.c = aitm.f;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction4.b |= 0x2;
        }
        final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction5 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction)builder.build();
        final abi abi = new abi(2);
        ((Map<String, spe>)abi).put("com.google.android.libraries.youtube.innertube.endpoint.tag", new spe(this, spm, updateBackstagePollActionOuterClass$UpdateBackstagePollAction5, annj, 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        ((Map<String, spe>)abi).put("com.google.android.libraries.youtube.comment.action_tag", (spe)new spf(this, spm, annj, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        if (xab != null && (annj.b & 0x20) != 0x0) {
            xab.J(3, (xbe)new wzy(annj.g.I()), (alji)null);
        }
        ((veh)this.d).c(aisc2, (Map)abi);
    }
    
    public final void L(final String s, final annj annj, final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction) {
        final ahcr builder = ((ahcz)annj).toBuilder();
        ajws h;
        if ((h = updateBackstagePollActionOuterClass$UpdateBackstagePollAction.d) == null) {
            h = ajws.a;
        }
        builder.copyOnWrite();
        final annj annj2 = (annj)builder.instance;
        h.getClass();
        annj2.h = h;
        annj2.b |= 0x40;
        for (int i = 0; i < annj.f.size(); ++i) {
            final ahcr builder2 = ((ahcz)annj.f.get(i)).toBuilder();
            Label_0544: {
                Label_0153: {
                    if (updateBackstagePollActionOuterClass$UpdateBackstagePollAction.e == 0) {
                        aitm aitm;
                        if ((aitm = aitm.b(updateBackstagePollActionOuterClass$UpdateBackstagePollAction.c)) == null) {
                            aitm = aitm.a;
                        }
                        if (aitm == aitm.b) {
                            break Label_0153;
                        }
                    }
                    final int e = updateBackstagePollActionOuterClass$UpdateBackstagePollAction.e;
                    if (e != -1) {
                        if (e == i) {
                            builder2.copyOnWrite();
                            final annh annh = (annh)builder2.instance;
                            annh.b |= 0x8;
                            annh.d = true;
                            final double k = annh.k;
                            builder2.copyOnWrite();
                            final annh annh2 = (annh)builder2.instance;
                            annh2.b |= 0x20;
                            annh2.f = k;
                            ajws g;
                            if ((g = annh2.l) == null) {
                                g = ajws.a;
                            }
                            builder2.copyOnWrite();
                            final annh annh3 = (annh)builder2.instance;
                            g.getClass();
                            annh3.g = g;
                            annh3.b |= 0x40;
                            break Label_0544;
                        }
                        builder2.copyOnWrite();
                        final annh annh4 = (annh)builder2.instance;
                        annh4.b |= 0x8;
                        annh4.d = false;
                        final double m = annh4.m;
                        builder2.copyOnWrite();
                        final annh annh5 = (annh)builder2.instance;
                        annh5.b |= 0x20;
                        annh5.f = m;
                        ajws g2;
                        if ((g2 = annh5.n) == null) {
                            g2 = ajws.a;
                        }
                        builder2.copyOnWrite();
                        final annh annh6 = (annh)builder2.instance;
                        g2.getClass();
                        annh6.g = g2;
                        annh6.b |= 0x40;
                        break Label_0544;
                    }
                }
                builder2.copyOnWrite();
                final annh annh7 = (annh)builder2.instance;
                annh7.b |= 0x8;
                annh7.d = false;
                builder2.copyOnWrite();
                final annh annh8 = (annh)builder2.instance;
                annh8.b |= 0x20;
                annh8.f = 0.0;
                builder2.copyOnWrite();
                final annh annh9 = (annh)builder2.instance;
                annh9.g = null;
                annh9.b &= 0xFFFFFFBF;
            }
            builder.copyOnWrite();
            final annj annj3 = (annj)builder.instance;
            final annh annh10 = (annh)builder2.build();
            annh10.getClass();
            final ahdp f = annj3.f;
            if (!f.c()) {
                annj3.f = ahcz.mutableCopy(f);
            }
            annj3.f.set(i, (Object)annh10);
        }
        ((sxl)this.a).j(s, (annj)builder.build());
        final Object a = this.a;
        final long j = annj.k;
        aitm aitm2;
        if ((aitm2 = aitm.b(updateBackstagePollActionOuterClass$UpdateBackstagePollAction.c)) == null) {
            aitm2 = aitm.a;
        }
        ((sxl)a).k(s, j, aitm2);
    }
    
    public final void M(final int n, final zrf... array) {
        this.ac(n, Integer.MAX_VALUE, false, null, array);
    }
    
    public final void N(final int n, final zrf... array) {
        this.ac(n, Integer.MAX_VALUE, true, null, array);
    }
    
    public final void O(final int n, final zrf... array) {
        this.ac(14, n, true, null, array);
    }
    
    public final sgv P(final sil sil, final String s, final InstreamAd instreamAd, final aidi aidi) {
        ahni ahni;
        if ((ahni = aidi.b) == null) {
            ahni = ahni.a;
        }
        ahqt ahqt;
        if ((ahni.b & 0x2) != 0x0) {
            if ((ahqt = ahqt.b(ahni.d)) == null) {
                ahqt = ahqt.a;
            }
        }
        else {
            ahqt = ahqt.aC;
        }
        String s2;
        if ((ahni.b & 0x1) != 0x0) {
            s2 = ahni.c;
        }
        else {
            s2 = ((eg)this.g).R(ahqt, sil.a);
        }
        ahni ahni2;
        if ((ahni2 = aidi.b) == null) {
            ahni2 = ahni.a;
        }
        ahng ahng;
        if ((ahng = ahni2.e) == null) {
            ahng = ahng.a;
        }
        final afbh k = afbh.k(ahng);
        anxb anxb;
        if ((anxb = aidi.c) == null) {
            anxb = anxb.a;
        }
        return this.Q(sil, s2, ahqt, k, s, instreamAd, (List)((ahmw)((ahcu)anxb).rx((ahci)AdEngagementPanelsRendererOuterClass.adEngagementPanelsRenderer)).b);
    }
    
    public final sgv Q(final sil sil, final String s, final ahqt ahqt, final afbh afbh, final String s2, final InstreamAd instreamAd, final List list) {
        if (list.size() == 0) {
            return null;
        }
        final ArrayList list2 = new ArrayList();
        for (final ajrl ajrl : list) {
            final String y = this.Y(ajrl);
            if (TextUtils.isEmpty((CharSequence)y)) {
                qep.n(sil, "Missing panel ID for ads engagement panel.");
            }
            else {
                if (qey.D((arzb)this.d)) {
                    ajrp b;
                    if (ajrl.b == 138681066) {
                        b = (ajrp)ajrl.c;
                    }
                    else {
                        b = ajrp.b;
                    }
                    if ((b.c & 0x800000) != 0x0) {
                        continue;
                    }
                }
                list2.add(y);
            }
        }
        final ArrayList list3 = new ArrayList();
        list3.add(new seu(list));
        list3.add(new sfp((List)list2));
        final afgc d = afgh.d();
        d.h(shp.c(((eg)this.g).S(ahqy.r), s2, ahqw.b, ahqt.b));
        if (instreamAd instanceof InstreamAdImpl) {
            final PlayerAd b2 = ((InstreamAdImpl)instreamAd).b;
            if (b2 instanceof LocalVideoAd) {
                final LocalVideoAd localVideoAd = (LocalVideoAd)b2;
                if (localVideoAd.E() || localVideoAd.F()) {
                    d.h(six.c(((eg)this.g).S(ahqy.w), s));
                }
                if (localVideoAd.F()) {
                    d.h(siv.c(((eg)this.g).S(ahqy.x), s));
                }
            }
        }
        return sgv.e(s, ahqt, 1, d.g(), afgh.q(), afgh.q(), afbh, afbh.k(((ggp)this.e).d(sil, s, ahqt, 1, (ahng)afbh.f())), (afbh)afag.a, sek.a((List)list3));
    }
    
    public final sgv R(String s, final InstreamAdBreak instreamAdBreak, final Optional optional, final ForecastingAd forecastingAd) {
        final ArrayList list = new ArrayList();
        if (forecastingAd == null) {
            s = ((eg)this.g).R(ahqt.e, s);
        }
        else {
            s = ((eg)this.g).R(ahqt.e, s);
        }
        if (forecastingAd != null) {
            list.add(new sfm(forecastingAd));
        }
        if (instreamAdBreak != null) {
            list.add(new sfq(instreamAdBreak));
        }
        optional.ifPresent((Consumer)new rds((List)list, 14));
        final ahqt e = ahqt.e;
        final afgh r = afgh.r(shq.c(((eg)this.g).S(ahqy.j), s));
        final afgh q = afgh.q();
        final afgh q2 = afgh.q();
        final afag a = afag.a;
        return sgv.d(s, e, 1, r, q, q2, (afbh)a, (afbh)a, sek.a((List)list));
    }
    
    public final sgv S(final sil sil, final String s, final InstreamAd instreamAd, final aidi aidi, final aisc aisc, final Map map, final String s2, final sdz sdz) {
        ahni ahni;
        if ((ahni = aidi.b) == null) {
            ahni = ahni.a;
        }
        final String c = ahni.c;
        ahni ahni2;
        if ((ahni2 = aidi.b) == null) {
            ahni2 = ahni.a;
        }
        ahqt ahqt;
        if ((ahqt = ahqt.b(ahni2.d)) == null) {
            ahqt = ahqt.a;
        }
        ahni ahni3;
        if ((ahni3 = aidi.b) == null) {
            ahni3 = ahni.a;
        }
        ahng ahng;
        if ((ahng = ahni3.e) == null) {
            ahng = ahng.a;
        }
        final afbh k = afbh.k(ahng);
        anxb anxb;
        if ((anxb = aidi.c) == null) {
            anxb = anxb.a;
        }
        return this.ad(sil, c, ahqt, k, s, instreamAd, (List)((ahmw)((ahcu)anxb).rx((ahci)AdEngagementPanelsRendererOuterClass.adEngagementPanelsRenderer)).b, aisc, map, s2, sdz);
    }
    
    @Deprecated
    public final sgv T(final sil sil, final String s, final InstreamAd instreamAd, final List list, final aisc aisc, final Map map, final String s2, final sdz sdz) {
        final boolean b = instreamAd instanceof InstreamAdImpl;
        Object o = null;
        if (b) {
            final PlayerAd b2 = ((InstreamAdImpl)instreamAd).b;
            o = o;
            if (b2 instanceof LocalVideoAd) {
                o = ((PlayerAd)b2).o();
            }
        }
        return this.ad(sil, ((eg)this.g).R(ahqt.o, sil.a), ahqt.o, afbh.j(o), s, instreamAd, list, aisc, map, s2, sdz);
    }
    
    public final sgv U(String r, final InstreamAdBreak instreamAdBreak, final Optional optional, final List list) {
        if (!list.isEmpty()) {
            if (list.get(0) instanceof ForecastingAd) {
                return this.R(r, instreamAdBreak, optional, list.get(0));
            }
            if (list.get(0) instanceof ThrottledAd) {
                final ThrottledAd throttledAd = list.get(0);
                final ArrayList list2 = new ArrayList();
                list2.add(new sgf(throttledAd));
                optional.ifPresent((Consumer)new rds((List)list2, 16));
                return sgv.b(((mbb)this.b).k(), ahqt.a, 1, sek.a((List)list2));
            }
        }
        final ArrayList list3 = new ArrayList();
        for (final PlayerAd playerAd : list) {
            if (playerAd instanceof MediaAd) {
                final Object g = this.g;
                final ahqt b = ahqt.b;
                final String n = playerAd.n;
                list3.add(((eg)g).R(b, r));
            }
            else {
                if (!(playerAd instanceof MediaBreakAd)) {
                    throw new IllegalStateException("Unexpected playerAd type: ".concat(String.valueOf(String.valueOf(playerAd))));
                }
                final Object g2 = this.g;
                final ahqt c = ahqt.c;
                final String n2 = playerAd.n;
                list3.add(((eg)g2).R(c, r));
            }
        }
        r = ((eg)this.g).R(ahqt.p, r);
        final List z = this.Z(instreamAdBreak, list, list3, r);
        if (z.isEmpty()) {
            return null;
        }
        final afgc d = afgh.d();
        final afgc d2 = afgh.d();
        final afgc d3 = afgh.d();
        for (final sgv sgv : z) {
            if (sgv.g((Class)sfv.class)) {
                final MediaAd mediaAd = (MediaAd)sgv.f((Class)sfv.class);
                if (((PlayerAd)mediaAd).D() && !PlayerAd.av(((PlayerAd)mediaAd).rP())) {
                    d2.h(sik.f(((eg)this.g).S(ahqy.k), sgv.a, ((PlayerAd)mediaAd).n));
                }
                if (!(mediaAd instanceof LocalVideoAd)) {
                    continue;
                }
                final LocalVideoAd localVideoAd = (LocalVideoAd)mediaAd;
                d3.h(sik.f(((eg)this.g).S(ahqy.k), sgv.a, ((PlayerAd)mediaAd).n));
                if (localVideoAd.E() || localVideoAd.F()) {
                    d2.h(six.c(((eg)this.g).S(ahqy.w), r));
                }
                if (localVideoAd.F()) {
                    d2.h(siv.c(((eg)this.g).S(ahqy.x), r));
                }
                if (!localVideoAd.b.q) {
                    continue;
                }
                d2.h(sgy.f(((eg)this.g).S(ahqy.u), sgv.a, ((PlayerAd)mediaAd).n, new int[] { 1 }));
            }
            else {
                if (!sgv.g((Class)sfw.class) || PlayerAd.av(((PlayerAd)sgv.f((Class)sfw.class)).rP())) {
                    continue;
                }
                d2.h(shq.c(((eg)this.g).S(ahqy.j), sgv.a));
            }
        }
        d.h(shq.c(((eg)this.g).S(ahqy.j), r));
        final ArrayList list4 = new ArrayList();
        list4.add(new sfq(instreamAdBreak));
        list4.add(new sge(z));
        optional.ifPresent((Consumer)new rds((List)list4, 15));
        final ahqt p4 = ahqt.p;
        final afgh g3 = d.g();
        final afgh g4 = d2.g();
        final afgh g5 = d3.g();
        final afag a = afag.a;
        return sgv.d(r, p4, 1, g3, g4, g5, (afbh)a, (afbh)a, sek.a((List)list4));
    }
    
    public final sgv V(final sil sil, final ahqw ahqw, final String s) {
        final ahqw a = ahqw.a;
        final int ordinal = ahqw.ordinal();
        ahqt ahqt;
        if (ordinal != 5) {
            if (ordinal != 9) {
                if (ordinal != 10) {
                    throw new IllegalArgumentException("Illegal slot type for building mdx layout: ".concat(String.valueOf(ahqw.name())));
                }
                ahqt = ahqt.k;
            }
            else {
                ahqt = ahqt.j;
            }
        }
        else if (sil.e((Class)sfs.class) && (boolean)sil.d((Class)sfs.class)) {
            ahqt = ahqt.q;
        }
        else {
            ahqt = ahqt.i;
        }
        final String r = ((eg)this.g).R(ahqt, sil.a);
        return sgv.d(r, ahqt, 1, afgh.r(shb.c(((eg)this.g).S(ahqy.h), s)), afgh.q(), afgh.q(), (afbh)afag.a, afbh.k(((ggp)this.e).d(sil, r, ahqt, 1, (ahng)null)), sek.b(new sew[0]));
    }
    
    public final sgv W(final sil sil, final ahpi ahpi) {
        final int b = ahpi.b;
        ahng ahng = null;
        ahni ahni;
        if ((b & 0x100) != 0x0) {
            if ((ahni = ahpi.j) == null) {
                ahni = ahni.a;
            }
        }
        else {
            ahni = null;
        }
        if (ahni != null && (ahni.b & 0x4) != 0x0) {
            if ((ahng = ahni.e) == null) {
                ahng = ahng.a;
            }
        }
        else if ((ahpi.b & 0x80) != 0x0 && (ahng = ahpi.i) == null) {
            ahng = ahng.a;
        }
        ahqt ahqt;
        if (ahni != null && (ahni.b & 0x2) != 0x0) {
            if ((ahqt = ahqt.b(ahni.d)) == null) {
                ahqt = ahqt.a;
            }
        }
        else {
            ahqt = ahqt.s;
        }
        String s;
        if (ahni != null && (ahni.b & 0x1) != 0x0) {
            s = ahni.c;
        }
        else {
            s = ((eg)this.g).R(ahqt, sil.a);
        }
        return sgv.d(s, ahqt, 3, afgh.q(), afgh.q(), afgh.q(), afbh.j(ahng), afbh.k(((ggp)this.e).d(sil, s, ahqt, 3, ahng)), sek.b(new sew[0]));
    }
    
    public final afgh X(final String s, final String s2, final String s3, final InstreamAd instreamAd, final sdz sdz) {
        final afgc d = afgh.d();
        d.h(shp.c(((eg)this.g).S(ahqy.r), s3, ahqw.b, ahqt.b));
        if (instreamAd instanceof InstreamAdImpl) {
            final PlayerAd b = ((InstreamAdImpl)instreamAd).b;
            if (b instanceof LocalVideoAd) {
                final LocalVideoAd localVideoAd = (LocalVideoAd)b;
                if (localVideoAd.E() || localVideoAd.C() || localVideoAd.F()) {
                    d.h(six.c(((eg)this.g).S(ahqy.w), s));
                }
                if (localVideoAd.F()) {
                    d.h(siv.c(((eg)this.g).S(ahqy.x), s));
                }
            }
        }
        final ahsn u = qey.u((arzb)this.d);
        if (u != null && u.R) {
            d.h(shb.c(((eg)this.g).S(ahqy.h), s2));
        }
        else if (sdz.c > 1) {
            d.h(sgy.f(((eg)this.g).S(ahqy.u), s2, instreamAd.i(), new int[] { 0 }));
        }
        return d.g();
    }
    
    public final String Y(final ajrl ajrl) {
        ajrp ajrp;
        if (ajrl.b == 138681066) {
            ajrp = (ajrp)ajrl.c;
        }
        else {
            ajrp = null;
        }
        if (ajrp == null) {
            return null;
        }
        String s;
        if (ajrp.d == 1) {
            s = (String)ajrp.e;
        }
        else {
            s = null;
        }
        if (s == null) {
            qep.o("Ad engagement panel has no panel ID.");
            return null;
        }
        return s;
    }
    
    public final List Z(final InstreamAdBreak instreamAdBreak, final List list, final List list2, final String s) {
        List list3 = list2;
        String s2 = s;
        final ArrayList list4 = new ArrayList();
        final Iterator iterator = list.iterator();
        int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            final PlayerAd playerAd = (PlayerAd)iterator.next();
            if (playerAd instanceof LocalVideoAd) {
                ++n2;
                n += ((LocalVideoAd)playerAd).c() * 1000;
            }
        }
        final int n3 = 0;
        int n4 = 0;
        final int n5 = n2;
        for (int i = n3; i < list.size(); ++i) {
            final PlayerAd playerAd2 = list.get(i);
            if (playerAd2 instanceof AdIntro) {
                list4.add(sgv.c((String)list3.get(i), ahqt.b, 2, afbh.j(playerAd2.o()), sek.b(new sew[] { (sew)new sfv((MediaAd)playerAd2), (sew)new sep(sdz.a), (sew)new sfq(instreamAdBreak), (sew)new sfd(s2) })));
            }
            else if (playerAd2 instanceof MediaAd) {
                sdz sdz = sdz.a;
                int n6;
                int n7;
                if (playerAd2 instanceof LocalVideoAd) {
                    final LocalVideoAd localVideoAd = (LocalVideoAd)playerAd2;
                    n6 = n - localVideoAd.c() * 1000;
                    n7 = n4 + 1;
                    final afbh j = afbh.j(((VideoAd)localVideoAd).ax());
                    final alhu k = localVideoAd.k();
                    Object o = null;
                    if (k != null) {
                        o = o;
                        if ((k.b & 0x80) != 0x0) {
                            anxb anxb;
                            if ((anxb = k.g) == null) {
                                anxb = anxb.a;
                            }
                            o = aamp.v(anxb, ahpe.a);
                        }
                    }
                    sdz = sdz.a(n7, n5, n6, j, afbh.j(o));
                }
                else {
                    n6 = n;
                    n7 = n4;
                    if (playerAd2 instanceof RemoteVideoAd) {
                        sdz = new sdz(0, 0, 0, afbh.j(((VideoAd)playerAd2).ax()), (afbh)afag.a);
                        n7 = n4;
                        n6 = n;
                    }
                }
                final String s3 = list3.get(i);
                final ahqt b = ahqt.b;
                final Object f = this.f;
                final MediaAd mediaAd = (MediaAd)playerAd2;
                final String s4 = list3.get(i);
                final srr srr = (srr)f;
                afgm b2;
                if (!qey.N((arzb)srr.a)) {
                    b2 = afkc.b;
                }
                else {
                    final afgj h = afgm.h();
                    if (!((PlayerAd)mediaAd).X().isEmpty() || !((PlayerAd)mediaAd).ae().isEmpty()) {
                        final shj shj = new shj(((eg)srr.b).S(ahqy.ah), ahqy.ah, false, ((PlayerAd)mediaAd).n);
                        final afgc d = afgh.d();
                        d.j(((PlayerAd)mediaAd).X());
                        d.j(((PlayerAd)mediaAd).ae());
                        h.g(shj, d.g());
                    }
                    if (!((PlayerAd)mediaAd).ao().isEmpty() || !((PlayerAd)mediaAd).at().isEmpty()) {
                        final shj shj2 = new shj(((eg)srr.b).S(ahqy.ah), ahqy.ah, true, ((PlayerAd)mediaAd).n);
                        final afgc d2 = afgh.d();
                        d2.j(((PlayerAd)mediaAd).ao());
                        d2.j(((PlayerAd)mediaAd).at());
                        h.g(shj2, d2.g());
                    }
                    if (!((PlayerAd)mediaAd).U().isEmpty()) {
                        h.g(new sei(((eg)srr.b).S(ahqy.O), ahqy.O, false, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).U());
                    }
                    if (!((PlayerAd)mediaAd).al().isEmpty()) {
                        h.g(new sei(((eg)srr.b).S(ahqy.O), ahqy.O, true, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).al());
                    }
                    if (!((PlayerAd)mediaAd).aa().isEmpty()) {
                        h.g(new shi(((eg)srr.b).S(ahqy.J), ahqy.J, false, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).aa());
                    }
                    if (!((PlayerAd)mediaAd).aq().isEmpty()) {
                        h.g(new shi(((eg)srr.b).S(ahqy.J), ahqy.J, true, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).aq());
                    }
                    if (!((PlayerAd)mediaAd).ac().isEmpty()) {
                        h.g(new shk(((eg)srr.b).S(ahqy.K), ahqy.K, false, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).ac());
                    }
                    if (!((PlayerAd)mediaAd).ar().isEmpty()) {
                        h.g(new shk(((eg)srr.b).S(ahqy.K), ahqy.K, true, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).ar());
                    }
                    if (!((PlayerAd)mediaAd).ad().isEmpty()) {
                        h.g(sik.f(((eg)srr.b).S(ahqy.k), s4, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).ad());
                    }
                    if (!((PlayerAd)mediaAd).as().isEmpty()) {
                        h.g(new sik(((eg)srr.b).S(ahqy.k), ahqy.k, true, s4, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).as());
                    }
                    if (!((PlayerAd)mediaAd).R().isEmpty()) {
                        h.g(new sgo(((eg)srr.b).S(ahqy.A), ahqy.A, false, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).R());
                    }
                    if (!((PlayerAd)mediaAd).ai().isEmpty()) {
                        h.g(new sgo(((eg)srr.b).S(ahqy.A), ahqy.A, true, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).ai());
                    }
                    if (!((PlayerAd)mediaAd).Q().isEmpty()) {
                        h.g(new sjh(((eg)srr.b).S(ahqy.P), ahqy.P, false, s4, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).Q());
                    }
                    if (!((PlayerAd)mediaAd).ah().isEmpty()) {
                        h.g(new sjh(((eg)srr.b).S(ahqy.P), ahqy.P, true, s4, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).ah());
                    }
                    if (!((PlayerAd)mediaAd).W().isEmpty()) {
                        h.g(new shf(((eg)srr.b).S(ahqy.Q), ahqy.Q, false, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).W());
                    }
                    if (!((PlayerAd)mediaAd).an().isEmpty()) {
                        h.g(new shf(((eg)srr.b).S(ahqy.Q), ahqy.Q, true, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).an());
                    }
                    if (!((PlayerAd)mediaAd).T().isEmpty()) {
                        h.g(new shg(((eg)srr.b).S(ahqy.R), ahqy.R, false, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).T());
                    }
                    if (!((PlayerAd)mediaAd).ak().isEmpty()) {
                        h.g(new shg(((eg)srr.b).S(ahqy.R), ahqy.R, true, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).ak());
                    }
                    if (!((PlayerAd)mediaAd).K().isEmpty()) {
                        h.g(new shh(((eg)srr.b).S(ahqy.S), ahqy.S, false, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).K());
                        h.g(sgy.f(((eg)srr.b).S(ahqy.u), s4, ((PlayerAd)mediaAd).n, new int[] { 4 }), ((PlayerAd)mediaAd).K());
                    }
                    if (!((PlayerAd)mediaAd).ag().isEmpty()) {
                        h.g(new shh(((eg)srr.b).S(ahqy.S), ahqy.S, true, ((PlayerAd)mediaAd).n), ((PlayerAd)mediaAd).ag());
                        h.g(sgy.f(((eg)srr.b).S(ahqy.u), s4, ((PlayerAd)mediaAd).n, new int[] { 4 }), ((PlayerAd)mediaAd).ag());
                    }
                    if (!((PlayerAd)mediaAd).P().isEmpty()) {
                        h.g(sdx.e(((eg)srr.b).S(ahqy.T), s4), ((PlayerAd)mediaAd).P());
                    }
                    if (!((PlayerAd)mediaAd).O().isEmpty()) {
                        h.g(sdt.e(((eg)srr.b).S(ahqy.U), s4), ((PlayerAd)mediaAd).O());
                    }
                    if (!((PlayerAd)mediaAd).N().isEmpty()) {
                        h.g(sds.e(((eg)srr.b).S(ahqy.V), s4), ((PlayerAd)mediaAd).N());
                    }
                    if (!((PlayerAd)mediaAd).L().isEmpty()) {
                        h.g(new sdq(((eg)srr.b).S(ahqy.W), ahqy.W, s4), ((PlayerAd)mediaAd).L());
                    }
                    if (!((PlayerAd)mediaAd).M().isEmpty()) {
                        h.g(new sdr(((eg)srr.b).S(ahqy.X), ahqy.X, s4), ((PlayerAd)mediaAd).M());
                    }
                    if (!((PlayerAd)mediaAd).V().isEmpty()) {
                        h.g(shm.e(((eg)srr.b).S(ahqy.c), ((PlayerAd)mediaAd).n, new sjb(srr.e(mediaAd, 1), 9223372036854775806L), true, false, true, true), ((PlayerAd)mediaAd).V());
                    }
                    if (!((PlayerAd)mediaAd).Z().isEmpty()) {
                        h.g(shm.e(((eg)srr.b).S(ahqy.c), ((PlayerAd)mediaAd).n, new sjb(srr.e(mediaAd, 2), 9223372036854775806L), true, false, true, true), ((PlayerAd)mediaAd).Z());
                    }
                    if (!((PlayerAd)mediaAd).af().isEmpty()) {
                        h.g(shm.e(((eg)srr.b).S(ahqy.c), ((PlayerAd)mediaAd).n, new sjb(srr.e(mediaAd, 3), 9223372036854775806L), true, false, true, true), ((PlayerAd)mediaAd).af());
                    }
                    if (!((PlayerAd)mediaAd).S().isEmpty()) {
                        h.g(sgy.f(((eg)srr.b).S(ahqy.u), s4, ((PlayerAd)mediaAd).n, new int[] { 0 }), ((PlayerAd)mediaAd).S());
                    }
                    if (!((PlayerAd)mediaAd).am().isEmpty()) {
                        h.g(shm.f(((eg)srr.b).S(ahqy.c), ((PlayerAd)mediaAd).n, new sjb(srr.e(mediaAd, 1), 9223372036854775806L)), ((PlayerAd)mediaAd).am());
                    }
                    if (!((PlayerAd)mediaAd).ap().isEmpty()) {
                        h.g(shm.f(((eg)srr.b).S(ahqy.c), ((PlayerAd)mediaAd).n, new sjb(srr.e(mediaAd, 2), 9223372036854775806L)), ((PlayerAd)mediaAd).ap());
                    }
                    if (!((PlayerAd)mediaAd).au().isEmpty()) {
                        h.g(shm.f(((eg)srr.b).S(ahqy.c), ((PlayerAd)mediaAd).n, new sjb(srr.e(mediaAd, 3), 9223372036854775806L)), ((PlayerAd)mediaAd).au());
                    }
                    if (!((PlayerAd)mediaAd).aj().isEmpty()) {
                        h.g(new sgy(((eg)srr.b).S(ahqy.u), ahqy.u, true, s4, ((PlayerAd)mediaAd).n, new afub(new int[] { 0 })), ((PlayerAd)mediaAd).aj());
                    }
                    if (!((PlayerAd)mediaAd).Y().isEmpty() && ((PlayerAd)mediaAd).i() == null) {
                        h.g(sgy.f(((eg)srr.b).S(ahqy.u), s4, ((PlayerAd)mediaAd).n, new int[] { 0 }), ((PlayerAd)mediaAd).Y());
                    }
                    final List ab = ((PlayerAd)mediaAd).ab();
                    final long millis = TimeUnit.SECONDS.toMillis(mediaAd.c());
                    final String n8 = ((PlayerAd)mediaAd).n;
                    afgm afgm;
                    afgj afgj;
                    sdz sdz2;
                    if (ab.isEmpty()) {
                        afgm = afkc.b;
                        afgj = h;
                        sdz2 = sdz;
                    }
                    else {
                        final PriorityQueue priorityQueue = new PriorityQueue<Object>(ab.size(), (Comparator<? super Object>)mch.n);
                        final ArrayList list5 = new ArrayList();
                        for (final ahon ahon : ab) {
                            if (ahon.d >= millis) {
                                list5.add(ahon);
                            }
                            else {
                                priorityQueue.add(ahon);
                            }
                        }
                        final afgj h2 = afgm.h();
                        afgj afgj2;
                        if (priorityQueue.isEmpty()) {
                            final sdz sdz3 = sdz;
                            afgj2 = h;
                            sdz2 = sdz3;
                        }
                        else {
                            int n9 = priorityQueue.peek().d;
                            afgc afgc = new afgc();
                            while (!priorityQueue.isEmpty()) {
                                if (priorityQueue.peek().d == n9) {
                                    afgc.h(priorityQueue.poll());
                                }
                                else {
                                    h2.g(shm.e(((eg)srr.b).S(ahqy.c), n8, new sjb((long)n9, 9223372036854775806L), true, true, true, false), afgc.g());
                                    n9 = priorityQueue.peek().d;
                                    afgc = new afgc();
                                }
                            }
                            final sdz sdz4 = sdz;
                            afgj2 = h;
                            h2.g(shm.e(((eg)srr.b).S(ahqy.c), n8, new sjb((long)n9, 9223372036854775806L), true, true, true, false), afgc.g());
                            sdz2 = sdz4;
                        }
                        if (!list5.isEmpty()) {
                            h2.g(sgy.f(((eg)srr.b).S(ahqy.u), s4, n8, new int[] { 0 }), list5);
                        }
                        afgm = h2.c();
                        afgj = afgj2;
                    }
                    afgj.k(afgm);
                    final afgm c = afgj.c();
                    sdz = sdz2;
                    b2 = c;
                }
                final afbh l = afbh.j(playerAd2.o());
                final sfv sfv = new sfv(mediaAd);
                final sep sep = new sep(sdz);
                final sfq sfq = new sfq(instreamAdBreak);
                s2 = s;
                final sek b3 = sek.b(new sew[] { (sew)sfv, (sew)sep, (sew)sfq, (sew)new sfd(s2), (sew)new sfl(Long.valueOf(playerAd2.o)) });
                final afgh q = afgh.q();
                final afgh q2 = afgh.q();
                final afgh q3 = afgh.q();
                final afgh q4 = afgh.q();
                final afag a = afag.a;
                list4.add(new sgv(s3, b, 2, q, q2, q3, q4, b2, l, (afbh)a, (afbh)a, b3));
                list3 = list2;
                n = n6;
                n4 = n7;
            }
            else {
                final ArrayList list6 = list4;
                if (!(playerAd2 instanceof MediaBreakAd)) {
                    throw new IllegalStateException("Unexpected playerAd type: ".concat(String.valueOf(String.valueOf(playerAd2))));
                }
                list3 = list2;
                list6.add(sgv.c((String)list3.get(i), ahqt.c, 2, afbh.j(playerAd2.o()), sek.b(new sew[] { (sew)new sfw((MediaBreakAd)playerAd2), (sew)new sep(sdz.a), (sew)new sfq(instreamAdBreak), (sew)new sfl(Long.valueOf(playerAd2.o)) })));
            }
        }
        return list4;
    }
    
    public final apjq a(String string) {
        final ahcr builder = apjq.a.createBuilder();
        builder.copyOnWrite();
        final apjq apjq = (apjq)builder.instance;
        string.getClass();
        apjq.b |= 0x1;
        apjq.c = string;
        final ConnectivityManager connectivityManager = (ConnectivityManager)((Context)this.a).getSystemService("connectivity");
        final int n = 2;
        int n2 = 0;
        Label_0333: {
            if (connectivityManager != null) {
                final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        final int type = activeNetworkInfo.getType();
                        n2 = 7;
                        if (type != 0) {
                            if (type == 1) {
                                n2 = 2;
                                break Label_0333;
                            }
                            if (type != 4) {
                                if (type == 9) {
                                    n2 = 22;
                                    break Label_0333;
                                }
                                if (type == 6) {
                                    n2 = 20;
                                    break Label_0333;
                                }
                                if (type != 7) {
                                    n2 = 3;
                                    break Label_0333;
                                }
                                n2 = 21;
                                break Label_0333;
                            }
                        }
                        switch (activeNetworkInfo.getSubtype()) {
                            default: {
                                n2 = 19;
                            }
                            case 4: {
                                break Label_0333;
                            }
                            case 15: {
                                n2 = 14;
                                break Label_0333;
                            }
                            case 14: {
                                n2 = 8;
                                break Label_0333;
                            }
                            case 13: {
                                n2 = 18;
                                break Label_0333;
                            }
                            case 12: {
                                n2 = 11;
                                break Label_0333;
                            }
                            case 11: {
                                n2 = 16;
                                break Label_0333;
                            }
                            case 10: {
                                n2 = 13;
                                break Label_0333;
                            }
                            case 9: {
                                n2 = 15;
                                break Label_0333;
                            }
                            case 8: {
                                n2 = 12;
                                break Label_0333;
                            }
                            case 7: {
                                n2 = 6;
                                break Label_0333;
                            }
                            case 6: {
                                n2 = 10;
                                break Label_0333;
                            }
                            case 5: {
                                n2 = 9;
                                break Label_0333;
                            }
                            case 3: {
                                n2 = 17;
                                break Label_0333;
                            }
                            case 2: {
                                n2 = 4;
                                break Label_0333;
                            }
                            case 1: {
                                n2 = 5;
                                break Label_0333;
                            }
                        }
                    }
                }
            }
            n2 = 1;
        }
        builder.copyOnWrite();
        final apjq apjq2 = (apjq)builder.instance;
        apjq2.e = n2 - 1;
        apjq2.b |= 0x8;
        string = ((SharedPreferences)this.d).getString("upload_policy", (String)null);
        int n3;
        if (!((String)this.f).equals(string)) {
            n3 = n;
        }
        else {
            n3 = 3;
        }
        builder.copyOnWrite();
        final apjq apjq3 = (apjq)builder.instance;
        apjq3.d = n3 - 1;
        apjq3.b |= 0x4;
        return (apjq)builder.build();
    }
    
    public final sgv ab(final sil sil, final aidh aidh, final InstreamAd instreamAd, final PlayerResponseModel playerResponseModel, final afgh afgh, final afgh afgh2, final afgh afgh3) {
        final ArrayList list = new ArrayList();
        list.add(new sfr(instreamAd));
        list.add(new sff(playerResponseModel));
        final ahcr builder = ((ahcz)aiym.a).createBuilder();
        anxb anxb;
        if ((anxb = aidh.c) == null) {
            anxb = anxb.a;
        }
        final ajon d = (ajon)((ahcu)anxb).rx((ahci)ElementRendererOuterClass.elementRenderer);
        builder.copyOnWrite();
        final aiym aiym = (aiym)builder.instance;
        d.getClass();
        aiym.d = d;
        aiym.b |= 0x20;
        list.add(new sfc((aiym)builder.build()));
        list.add(new sex(aidh));
        ahni ahni;
        if ((ahni = aidh.b) == null) {
            ahni = ahni.a;
        }
        final String c = ahni.c;
        ahni ahni2;
        if ((ahni2 = aidh.b) == null) {
            ahni2 = ahni.a;
        }
        ahqt ahqt;
        if ((ahqt = ahqt.b(ahni2.d)) == null) {
            ahqt = ahqt.a;
        }
        final Object e = this.e;
        ahni ahni3;
        if ((ahni3 = aidh.b) == null) {
            ahni3 = ahni.a;
        }
        ahng ahng;
        if ((ahng = ahni3.e) == null) {
            ahng = ahng.a;
        }
        final alin d2 = ((ggp)e).d(sil, c, ahqt, 1, ahng);
        ahni ahni4;
        if ((ahni4 = aidh.b) == null) {
            ahni4 = ahni.a;
        }
        ahng ahng2;
        if ((ahng2 = ahni4.e) == null) {
            ahng2 = ahng.a;
        }
        return sgv.d(c, ahqt, 1, afgh, afgh2, afgh3, afbh.k(ahng2), afbh.k(d2), sek.a((List)list));
    }
    
    public final void ac(int a, final int n, final boolean b, final wrf wrf, final zrf... array) {
        final List list = (List)((afgm)((rlb)this.f).a).get(a);
        ArrayList list2;
        if (list == null) {
            list2 = new ArrayList();
        }
        else {
            list2 = new ArrayList();
            for (final ahon ahon : list) {
                if (n >= ahon.d && (!b || !((Set)this.d).contains(ahon))) {
                    list2.add(ahon);
                }
            }
        }
        for (Object o : list2) {
            ((Set<ahon>)this.d).add((ahon)o);
            try {
                final Uri ck = tqf.cK(((ahon)o).c);
                Uri build;
                if (wrf != null) {
                    final Object c = wrf.c;
                    final Object b2 = wrf.b;
                    a = wrf.a;
                    final SurveyQuestionRendererModel u = ((rqn)c).k.u(a);
                    final Uri$Builder buildUpon = ck.buildUpon();
                    for (final Map.Entry<String, V> entry : ((siw)b2).a((vio)u, ck)) {
                        buildUpon.appendQueryParameter((String)entry.getKey(), (String)entry.getValue());
                    }
                    build = buildUpon.build();
                }
                else {
                    build = null;
                }
                try {
                    final Object b3 = this.b;
                    if (build == null) {
                        build = ck;
                    }
                    final Uri l = ((rra)b3).l(build, array);
                    try {
                        ((rrb)this.g).b((sjp)this.c, (ahon)o, l);
                        continue;
                    }
                    catch (final rzg rzg) {
                        final Object e = this.e;
                        o = this.a;
                        final String value = String.valueOf(rzg.getMessage());
                        o = o;
                        qep.m((sil)e, (sgv)o, "Failed to log the ping: ".concat(value));
                        continue;
                    }
                }
                catch (final rqs rqs) {
                    final Object e2 = this.e;
                    o = this.a;
                    final String value2 = String.valueOf(rqs.getMessage());
                    o = o;
                    qep.m((sil)e2, (sgv)o, "Failed to apply macro: ".concat(value2));
                }
            }
            catch (final MalformedURLException ex) {
                qep.m((sil)this.e, (sgv)this.a, String.format("Badly formed uri in ABR path: %s", ((ahon)o).c));
                continue;
            }
            break;
        }
    }
    
    public final void b(final String s, final akpu akpu) {
        ((Executor)this.b).execute(aewf.h((Runnable)new acdb(this, s, akpu, 17)));
    }
    
    public final void c(final String c, final String s, final long n, final long n2, final long n3, final long n4, final long n5) {
        final apjo a = apjp.a();
        final apkf j = apkf.J;
        a.copyOnWrite();
        apjp.d((apjp)a.instance, j);
        final ahcr builder = apjq.a.createBuilder();
        builder.copyOnWrite();
        final apjq apjq = (apjq)builder.instance;
        c.getClass();
        apjq.b |= 0x1;
        apjq.c = c;
        a.copyOnWrite();
        apjp.c((apjp)a.instance, (apjq)builder.build());
        a.copyOnWrite();
        apjp.k((apjp)a.instance, n);
        a.copyOnWrite();
        apjp.n((apjp)a.instance, n2);
        a.copyOnWrite();
        apjp.o((apjp)a.instance, n3);
        a.copyOnWrite();
        apjp.p((apjp)a.instance, n4);
        a.copyOnWrite();
        apjp.q((apjp)a.instance, n5);
        final apjp apjp = (apjp)a.build();
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.ar((akpu)d.instance, apjp);
        this.b(s, (akpu)((ahcr)d).build());
    }
    
    public final void d(final String c, final String s, final apkf apkf, final apke apke) {
        final apjo a = apjp.a();
        a.copyOnWrite();
        apjp.d((apjp)a.instance, apkf);
        a.copyOnWrite();
        apjp.i((apjp)a.instance, apke);
        final ahcr builder = apjq.a.createBuilder();
        builder.copyOnWrite();
        final apjq apjq = (apjq)builder.instance;
        c.getClass();
        apjq.b |= 0x1;
        apjq.c = c;
        a.copyOnWrite();
        apjp.c((apjp)a.instance, (apjq)builder.build());
        final apjp apjp = (apjp)a.build();
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.ar((akpu)d.instance, apjp);
        this.b(s, (akpu)((ahcr)d).build());
    }
    
    public final void e(final String c, final String s, final apkf apkf) {
        final apjo a = apjp.a();
        a.copyOnWrite();
        apjp.d((apjp)a.instance, apkf);
        final ahcr builder = apjq.a.createBuilder();
        builder.copyOnWrite();
        final apjq apjq = (apjq)builder.instance;
        c.getClass();
        apjq.b |= 0x1;
        apjq.c = c;
        a.copyOnWrite();
        apjp.c((apjp)a.instance, (apjq)builder.build());
        final apjp apjp = (apjp)a.build();
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.ar((akpu)d.instance, apjp);
        this.b(s, (akpu)((ahcr)d).build());
    }
    
    public final void f(final String c, final String s, final apkg apkg) {
        final apjo a = apjp.a();
        final apkf d = apkf.D;
        a.copyOnWrite();
        apjp.d((apjp)a.instance, d);
        final ahcr builder = apjq.a.createBuilder();
        builder.copyOnWrite();
        final apjq apjq = (apjq)builder.instance;
        c.getClass();
        apjq.b |= 0x1;
        apjq.c = c;
        a.copyOnWrite();
        apjp.c((apjp)a.instance, (apjq)builder.build());
        a.copyOnWrite();
        apjp.m((apjp)a.instance, apkg);
        final apjp apjp = (apjp)a.build();
        final akps d2 = akpu.d();
        ((ahcr)d2).copyOnWrite();
        akpu.ar((akpu)d2.instance, apjp);
        this.b(s, (akpu)((ahcr)d2).build());
    }
    
    public final void g(final String s, final apka apka) {
        this.h(s, apka, Optional.empty());
    }
    
    public final void h(final String c, final apka apka, final Optional optional) {
        final apjo a = apjp.a();
        final apkf w = apkf.W;
        a.copyOnWrite();
        apjp.d((apjp)a.instance, w);
        final ahcr builder = apjq.a.createBuilder();
        builder.copyOnWrite();
        final apjq apjq = (apjq)builder.instance;
        c.getClass();
        apjq.b |= 0x1;
        apjq.c = c;
        a.copyOnWrite();
        apjp.c((apjp)a.instance, (apjq)builder.build());
        a.copyOnWrite();
        apjp.g((apjp)a.instance, apka);
        optional.ifPresent((Consumer)new achl(a, 9));
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.ar((akpu)d.instance, (apjp)a.build());
        ((Executor)this.b).execute(aewf.h(new adat(this, (akpu)((ahcr)d).build(), 11)));
    }
    
    public final void i(final String c, final String s, final apka apka) {
        final apjo a = apjp.a();
        final apkf e = apkf.E;
        a.copyOnWrite();
        apjp.d((apjp)a.instance, e);
        final ahcr builder = apjq.a.createBuilder();
        builder.copyOnWrite();
        final apjq apjq = (apjq)builder.instance;
        apjq.b |= 0x1;
        apjq.c = c;
        a.copyOnWrite();
        apjp.c((apjp)a.instance, (apjq)builder.build());
        a.copyOnWrite();
        apjp.g((apjp)a.instance, apka);
        final apjp apjp = (apjp)a.build();
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.ar((akpu)d.instance, apjp);
        this.b(s, (akpu)((ahcr)d).build());
    }
    
    public final void j(final String c, final apkf apkf, final int n, final boolean e) {
        final ahcr builder = apjx.a.createBuilder();
        final ahcr builder2 = apjn.a.createBuilder();
        builder2.copyOnWrite();
        final apjn apjn = (apjn)builder2.instance;
        apjn.d = n - 1;
        apjn.b |= 0x2;
        builder2.copyOnWrite();
        final apjn apjn2 = (apjn)builder2.instance;
        apjn2.b |= 0x4;
        apjn2.e = e;
        final apjn c2 = (apjn)builder2.build();
        builder.copyOnWrite();
        final apjx apjx = (apjx)builder.instance;
        c2.getClass();
        apjx.c = c2;
        apjx.b |= 0x1;
        final apjx apjx2 = (apjx)builder.build();
        final apjo a = apjp.a();
        a.copyOnWrite();
        apjp.d((apjp)a.instance, apkf);
        a.copyOnWrite();
        apjp.s((apjp)a.instance, apjx2);
        final ahcr builder3 = apjq.a.createBuilder();
        builder3.copyOnWrite();
        final apjq apjq = (apjq)builder3.instance;
        apjq.b |= 0x1;
        apjq.c = c;
        a.copyOnWrite();
        apjp.c((apjp)a.instance, (apjq)builder3.build());
        final apjp apjp = (apjp)a.build();
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.ar((akpu)d.instance, apjp);
        ((Executor)this.b).execute(aewf.h(new adat(this, (akpu)((ahcr)d).build(), 12)));
    }
    
    public final void k(final String c, final String s, final apke apke, final int n, final boolean e, final apkd[] array) {
        final apjo a = apjp.a();
        final apkf h = apkf.H;
        a.copyOnWrite();
        apjp.d((apjp)a.instance, h);
        final ahcr builder = apjq.a.createBuilder();
        builder.copyOnWrite();
        final apjq apjq = (apjq)builder.instance;
        apjq.b |= 0x1;
        apjq.c = c;
        a.copyOnWrite();
        apjp.c((apjp)a.instance, (apjq)builder.build());
        final ahcr builder2 = apjx.a.createBuilder();
        final ahcr builder3 = apjn.a.createBuilder();
        builder3.copyOnWrite();
        final apjn apjn = (apjn)builder3.instance;
        apjn.c = apke.k;
        apjn.b |= 0x1;
        builder3.copyOnWrite();
        final apjn apjn2 = (apjn)builder3.instance;
        apjn2.d = n - 1;
        apjn2.b |= 0x2;
        builder3.copyOnWrite();
        final apjn apjn3 = (apjn)builder3.instance;
        apjn3.b |= 0x4;
        apjn3.e = e;
        builder2.copyOnWrite();
        final apjx apjx = (apjx)builder2.instance;
        final apjn c2 = (apjn)builder3.build();
        c2.getClass();
        apjx.c = c2;
        apjx.b |= 0x1;
        final List<apkd> list = Arrays.asList(array);
        builder2.copyOnWrite();
        final apjx apjx2 = (apjx)builder2.instance;
        final ahdh d = apjx2.d;
        if (!d.c()) {
            apjx2.d = ahcz.mutableCopy(d);
        }
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            apjx2.d.g(iterator.next().i);
        }
        final apjx apjx3 = (apjx)builder2.build();
        a.copyOnWrite();
        apjp.s((apjp)a.instance, apjx3);
        final apjp apjp = (apjp)a.build();
        final akps d2 = akpu.d();
        ((ahcr)d2).copyOnWrite();
        akpu.ar((akpu)d2.instance, apjp);
        this.b(s, (akpu)((ahcr)d2).build());
    }
    
    public final adax l(final adav adav, final adau adau, final int n, final String s, final byte[] array, final int n2, final int n3, final int n4, final String s2, final String s3) {
        final CronetEngine cronetEngine = (CronetEngine)((atnb)this.c).a();
        cronetEngine.getClass();
        final riw riw = (riw)((atnb)this.d).a();
        riw.getClass();
        final aefs aefs = (aefs)((atnb)this.g).a();
        aefs.getClass();
        final zoa zoa = (zoa)((atnb)this.e).a();
        zoa.getClass();
        final Executor executor = (Executor)((atnb)this.a).a();
        executor.getClass();
        final Handler handler = (Handler)((atnb)this.f).a();
        handler.getClass();
        final String s4 = (String)((atnb)this.b).a();
        s4.getClass();
        adav.getClass();
        adau.getClass();
        s.getClass();
        array.getClass();
        return new adax(cronetEngine, riw, aefs, zoa, executor, handler, s4, adav, adau, n, s, array, n2, n3, n4, s2, s3, null, null, null, null, null, null);
    }
    
    public final PlayerResponseModel m(aozo aozo, final PlayerResponseModel playerResponseModel) {
        final String k = playerResponseModel.K();
        long millis = playerResponseModel.h();
        Object d = aozo.c().D();
        while (true) {
            while (((Iterator)d).hasNext()) {
                final amyq amyq = (amyq)((Iterator)d).next();
                if (vht.i(amyq.e()).equals(k)) {
                Label_0071_Outer:
                    while (true) {
                        if (amyq != null) {
                            final List streamsProgressModels = amyq.getStreamsProgressModels();
                            millis = TimeUnit.SECONDS.toMillis(millis);
                            d = null;
                            final int n = 0;
                            aozo = null;
                            break Label_0099;
                        }
                    Label_0363_Outer:
                        while (true) {
                            aozo = null;
                            Label_0392: {
                                break Label_0392;
                                Label_0369: {
                                    final List streamsProgressModels;
                                    int n = 0;
                                    if (n >= ((afjx)streamsProgressModels).c || (aozo != null && d != null)) {
                                        break Label_0369;
                                    }
                                    final aonx a = ((aonw)streamsProgressModels.get(n)).a;
                                    int au = aqvq.aU(a.e);
                                    if (au == 0) {
                                        au = 1;
                                    }
                                    while (true) {
                                        if ((a.b & 0x10) == 0x0 || au == 1) {
                                            break Label_0363;
                                        }
                                        try {
                                            final ajwl ajwl = (ajwl)ahcz.parseFrom((ahcz)ajwl.b, a.g, ExtensionRegistryLite.getGeneratedRegistry());
                                            final Uri e = aamn.E((abpf)((atnb)this.c).a(), k, ajwl.d, ajwl.q, ajwl.p, ajwl.o, ((oco)this.b).d() + 18000000L);
                                            final ahct ahct = (ahct)((ahcz)ajwl).toBuilder();
                                            String string;
                                            if (e == null) {
                                                string = "";
                                            }
                                            else {
                                                string = e.toString();
                                            }
                                            ((ahcr)ahct).copyOnWrite();
                                            final ajwl ajwl2 = (ajwl)ahct.instance;
                                            string.getClass();
                                            ajwl2.c |= 0x2;
                                            ajwl2.e = string;
                                            final Object o = new FormatStreamModel((ajwl)((ahcr)ahct).build(), k, millis);
                                            if (au == 2) {
                                                aozo = (aozo)o;
                                            }
                                            else {
                                                d = o;
                                            }
                                            ++n;
                                            continue Label_0071_Outer;
                                            iftrue(Label_0381:)(aozo != null || d != null);
                                            continue Label_0363_Outer;
                                            Label_0381: {
                                                aozo = (aozo)new Pair(d, (Object)aozo);
                                            }
                                            iftrue(Label_0447:)(aozo == null);
                                            return aamn.H(playerResponseModel, (vku)((atnb)this.a).a(), (FormatStreamModel)((Pair)aozo).first, (FormatStreamModel)((Pair)aozo).second, ((oco)this.b).d(), zxe.b, false, (aaks)this.e);
                                            Label_0447:
                                            return null;
                                        }
                                        catch (final ahds ahds) {
                                            continue;
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            final amyq amyq = null;
            continue;
        }
    }
    
    public final int n(final String s) {
        final Cursor query = ((zxl)this.g).a().query("playlistsV13", new String[] { "offline_source_ve_type" }, "id = ?", new String[] { s }, (String)null, (String)null, (String)null, (String)null);
        try {
            if (query.moveToNext()) {
                return query.getInt(0);
            }
            return -1;
        }
        finally {
            query.close();
        }
    }
    
    public final int o(String query) {
        query = (String)((zxl)this.g).a().query("playlistsV13", new String[] { "preferred_stream_quality" }, "id = ?", new String[] { query }, (String)null, (String)null, (String)null, (String)null);
        try {
            if (((Cursor)query).moveToNext()) {
                return ((Cursor)query).getInt(0);
            }
            return -1;
        }
        finally {
            ((Cursor)query).close();
        }
    }
    
    public final long p(String query) {
        query = (String)((zxl)this.g).a().query("playlistsV13", new String[] { "playlist_added_timestamp_millis" }, "id = ?", new String[] { query }, (String)null, (String)null, (String)null);
        try {
            if (((Cursor)query).moveToNext()) {
                return ((Cursor)query).getLong(0);
            }
            return 0L;
        }
        finally {
            ((Cursor)query).close();
        }
    }
    
    public final long q(final String s) {
        final Cursor rawQuery = ((zxl)this.g).a().rawQuery("SELECT saved_timestamp FROM playlistsV13 WHERE id=?", new String[] { s });
        try {
            if (rawQuery.moveToNext()) {
                return rawQuery.getLong(0);
            }
            return 0L;
        }
        finally {
            rawQuery.close();
        }
    }
    
    public final aaco s(String query) {
        query = (String)((zxl)this.g).a().query("playlistsV13", zxv.a, "id = ?", new String[] { query }, (String)null, (String)null, (String)null, (String)null);
        try {
            try {
                if (((Cursor)query).moveToNext()) {
                    final aaco r = zxd.r((Cursor)query, (aabr)((atnb)this.a).a(), (aapu)this.d, ((Cursor)query).getColumnIndexOrThrow("id"), ((Cursor)query).getColumnIndexOrThrow("offline_playlist_data_proto"), ((Cursor)query).getColumnIndexOrThrow("placeholder"), ((Cursor)query).getColumnIndexOrThrow("size"), ((Cursor)query).getColumnIndexOrThrow("channel_id"));
                    ((Cursor)query).close();
                    return r;
                }
                ((Cursor)query).close();
                return null;
            }
            finally {}
        }
        catch (final SQLiteException ex) {
            tut.d("Issue with playlists store", (Throwable)ex);
            znh.c(zng.b, znf.B, "Issue with playlists store", (Throwable)ex);
            ((Cursor)query).close();
            return null;
        }
        ((Cursor)query).close();
    }
    
    public final Collection t(final String s, final List list) {
        return zzc.h(this.x(s), list);
    }
    
    public final List u() {
        final Cursor query = ((zxl)this.g).a().query("playlistsV13", zxv.a, (String)null, (String[])null, (String)null, (String)null, "saved_timestamp DESC", (String)null);
        try {
            try {
                final List s = zxd.s(query, (aabr)((atnb)this.a).a(), (aapu)this.d, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_playlist_data_proto"), query.getColumnIndexOrThrow("placeholder"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("channel_id"));
                query.close();
                return s;
            }
            finally {}
        }
        catch (final SQLiteException ex) {
            tut.d("Issue with playlists store", (Throwable)ex);
            znh.c(zng.b, znf.B, "Issue with playlists store", (Throwable)ex);
            final afgh q = afgh.q();
            query.close();
            return q;
        }
        query.close();
    }
    
    public final List v() {
        final SQLiteDatabase a = ((zxl)this.g).a();
        final String c = tgs.c("videosV2", zyp.a);
        final StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(c);
        sb.append(" FROM videosV2 INNER JOIN playlist_video ON videosV2.id = playlist_video.video_id WHERE playlist_video.playlist_id IS NULL ORDER BY playlist_video.saved_timestamp DESC");
        final Cursor rawQuery = a.rawQuery(sb.toString(), (String[])null);
        try {
            final aabr aabr = (aabr)((atnb)this.a).a();
            final Object d = this.d;
            rawQuery.getClass();
            aabr.getClass();
            return zzc.z(rawQuery, aabr, (aapu)d, rawQuery.getColumnIndexOrThrow("id"), rawQuery.getColumnIndexOrThrow("offline_video_data_proto"), rawQuery.getColumnIndexOrThrow("deleted"), rawQuery.getColumnIndexOrThrow("channel_id"), rawQuery.getColumnIndex("video_id"));
        }
        finally {
            rawQuery.close();
        }
    }
    
    public final List w(String rawQuery) {
        rawQuery = (String)((zxl)this.g).a().rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id = ? ORDER BY index_in_playlist ASC", new String[] { rawQuery });
        try {
            final ArrayList list = new ArrayList();
            while (((Cursor)rawQuery).moveToNext()) {
                list.add(((Cursor)rawQuery).getString(0));
            }
            ((Cursor)rawQuery).close();
            return list;
        }
        finally {
            ((Cursor)rawQuery).close();
            while (true) {}
        }
    }
    
    public final List x(String rawQuery) {
        final SQLiteDatabase a = ((zxl)this.g).a();
        final String c = tgs.c("videosV2", zyp.a);
        final StringBuilder sb = new StringBuilder("SELECT playlist_video.video_id,");
        sb.append(c);
        sb.append(" FROM playlist_video LEFT OUTER JOIN videosV2 ON playlist_video.video_id = videosV2.id WHERE playlist_video.playlist_id = ? ORDER BY playlist_video.index_in_playlist ASC");
        rawQuery = (String)a.rawQuery(sb.toString(), new String[] { rawQuery });
        try {
            final aabr aabr = (aabr)((atnb)this.a).a();
            final Object d = this.d;
            rawQuery.getClass();
            aabr.getClass();
            return zzc.z((Cursor)rawQuery, aabr, (aapu)d, ((Cursor)rawQuery).getColumnIndexOrThrow("id"), ((Cursor)rawQuery).getColumnIndexOrThrow("offline_video_data_proto"), ((Cursor)rawQuery).getColumnIndexOrThrow("deleted"), ((Cursor)rawQuery).getColumnIndexOrThrow("channel_id"), ((Cursor)rawQuery).getColumnIndex("video_id"));
        }
        finally {
            ((Cursor)rawQuery).close();
        }
    }
    
    public final void y(final zxu zxu) {
        ((List<zxu>)this.e).add(zxu);
    }
    
    public final void z(final String s) {
        ((zxl)this.g).a().delete("playlist_video", "playlist_id IS NULL AND video_id = ?", new String[] { s });
    }
}
