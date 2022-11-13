import android.database.sqlite.SQLiteException;
import android.database.Cursor;
import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.os.Handler;
import org.chromium.net.CronetEngine;
import java.util.Arrays;
import java.util.function.Consumer;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import java.util.Map;
import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
import android.text.Spanned;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.Collection;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.ArrayList;
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

public final class adlp
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    
    public adlp(final abkl d, final abnl e, final abzv a, final tgd f, final Set c, final abqg g, final Set b) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.f = f;
        this.c = c;
        this.g = g;
        this.b = b;
    }
    
    public adlp(final Context b, final SharedPreferences a, final tjm e, final pvh pvh, final aeea d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        d.getClass();
        this.d = d;
        final String string = b.getString(2132020069);
        this.g = string;
        this.f = b.getString(2132020070);
        if (!a.contains("upload_policy")) {
            final String s = string;
            this.H(string);
        }
        final Context context = b;
        final View inflate = LayoutInflater.from(b).inflate(2131624133, (ViewGroup)null);
        final CheckBox checkBox = (CheckBox)inflate.findViewById(2131428706);
        final giw giw = new giw(this, checkBox, pvh, 12, null, null, null, null, null);
        final fao fao = new fao(pvh, 8, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        final Context context2 = b;
        final ex ex = new ex(b);
        ex.n(2132017677);
        ex.p(inflate);
        ex.h(2132017673, (DialogInterface$OnClickListener)giw);
        ex.k(2132017674, (DialogInterface$OnClickListener)giw);
        ex.j((DialogInterface$OnCancelListener)fao);
        final ey b2 = ex.b();
        final aeea aeea = d;
        if (d.ao()) {
            b2.setOnShowListener((DialogInterface$OnShowListener)new svs(b2, 3));
        }
        checkBox.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new cfm(b2, 17));
        this.c = b2;
    }
    
    public adlp(final Context a, final Executor b, final wxx c, final adet g, final zmf e, final SharedPreferences d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = g;
        this.d = d;
        this.e = e;
        final String string = a.getString(2132020070);
        tvb.n(string);
        this.f = string;
    }
    
    public adlp(final Context c, final vcy d, final agmx a, final tqd b, final vwa f, final aeea e, final aeea g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
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
    
    public adlp(final Context c, final vcy b, final wyw d, final sny a, final agmx f, final aeea e, final aeea g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
        this.f = f;
        this.e = e;
        this.g = g;
    }
    
    public adlp(final View a) {
        this.f = a.findViewById(2131429586);
        this.d = a.findViewById(2131429582);
        this.g = a.findViewById(2131429587);
        this.b = a.findViewById(2131429588);
        this.c = a.findViewById(2131429584);
        this.e = a.findViewById(2131429677);
        this.a = a;
    }
    
    public adlp(final ViewGroup g, final Context b, final aatn d, final aatj f) {
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
        this.a = new aaus(d, f);
    }
    
    public adlp(final arkg c, final acbm d, final ajtn ajtn, final acfu g, final acft e, final Optional b, final wyw f) {
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
        this.b = b;
        this.f = f;
        anuv a;
        if ((a = ajtn.d) == null) {
            a = anuv.a;
        }
        this.a = a;
    }
    
    public adlp(final atke c, final atke d, final atke g, final atke e, final atke a, final atke f, final atke b) {
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
    
    public adlp(final atke a, final atke e, final atke b, final atke g, final atke d, final atke c, final atke f, final byte[] array) {
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
    
    public adlp(final atke b, final atke e, final atke a, final atke d, final atke f, final atke c, final atke g, final byte[] array, final byte[] array2) {
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
    
    public adlp(final atke g, final atke a, final atke c, final atke d, final atke e, final atke f, final atke b, final byte[] array, final byte[] array2, final byte[] array3) {
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
    
    public adlp(final atke b, final atke e, final atke f, final atke c, final atke a, final atke d, final atke g, final char[] array) {
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
    
    public adlp(final atke a, final atke e, final atke g, final atke f, final atke c, final atke d, final atke b, final char[] array, final byte[] array2) {
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
    
    public adlp(final ScheduledExecutorService f, final aeea e, final zmf g, final zly d, final adfu a, final adfu c, final mdp b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.f = f;
        this.e = e;
        this.g = g;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlp(final oby b, final aait e, final atke c, final vef d, final zmf g, final atke a, final aaiv f) {
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        this.g = g;
        this.a = a;
        this.f = f;
    }
    
    public adlp(final vcy b, final zmf c, final vtn vtn, final Context a, final atke g, final wyw e, final Executor executor, final oby f) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new hln(vtn, (atke)null, executor, 12);
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    public adlp(final zvn g, final atke a, final oby b, final aujg d, final ziy f, final aait c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.d = d;
        this.f = f;
        this.c = c;
        this.e = new ArrayList();
    }
    
    public adlp(final zzu c, final aujg b, final ziy f, final adlp g, final aaad aaad, final zvo d, final aacg e, final atjz a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.b = b;
        this.f = f;
        this.g = g;
        this.d = d;
        this.e = e;
        this.a = a;
        ((List<xra>)b.b).add(new xra(this, (byte[])null, (byte[])null, (byte[])null));
        f.p((zwq)new zvm(this, 0, (byte[])null, (byte[])null, (byte[])null));
        g.y((zvw)new zvl(this, 0, (byte[])null, (byte[])null, (byte[])null));
        aaad.h((zwk)new zwo(this, 1, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public static ContentValues r(final aaar aaar, final oby oby) {
        final ContentValues contentValues = new ContentValues();
        final amuw k = aaar.k;
        final agq n = aaar.n;
        byte[] array;
        if (k != null) {
            array = ((agzk)k).toByteArray();
        }
        else {
            array = ((agzk)amuw.a).toByteArray();
        }
        contentValues.put("id", aaar.a);
        contentValues.put("offline_playlist_data_proto", array);
        contentValues.put("size", Integer.valueOf(aaar.e));
        contentValues.put("saved_timestamp", Long.valueOf(oby.c()));
        contentValues.put("placeholder", Boolean.valueOf(aaar.g));
        if (n != null) {
            contentValues.put("channel_id", (String)n.e);
        }
        return contentValues;
    }
    
    public final void A(final String s) {
        Object rawQuery = ((zvn)this.g).a().rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id IS NULL AND video_id =?", new String[] { s });
        try {
            if (((Cursor)rawQuery).getCount() > 0) {
                return;
            }
            ((Cursor)rawQuery).close();
            rawQuery = new ContentValues();
            ((ContentValues)rawQuery).putNull("playlist_id");
            ((ContentValues)rawQuery).put("video_id", s);
            ((ContentValues)rawQuery).put("saved_timestamp", Long.valueOf(((oby)this.b).c()));
            ((zvn)this.g).a().insertOrThrow("playlist_video", (String)null, (ContentValues)rawQuery);
        }
        finally {
            ((Cursor)rawQuery).close();
        }
    }
    
    public final boolean B(final String s) {
        return tfp.a(((zvn)this.g).a(), "playlist_video", "playlist_id IS NULL AND video_id = ?", new String[] { s }) > 0L;
    }
    
    public final boolean C(final String s) {
        return tfp.a(((zvn)this.g).a(), "playlist_video", "playlist_id IS NOT NULL AND video_id = ?", new String[] { s }) > 0L;
    }
    
    public final int D(String query) {
        final SQLiteDatabase a = ((zvn)this.g).a();
        final int n = 1;
        int cq = 0;
        query = (String)a.query("playlistsV13", new String[] { "playlist_offline_request_source" }, "id = ?", new String[] { query }, (String)null, (String)null, (String)null);
        try {
            if (((Cursor)query).moveToNext()) {
                cq = aqsx.cQ(((Cursor)query).getInt(0));
            }
            if (cq == 0) {
                cq = n;
            }
            return cq;
        }
        finally {
            ((Cursor)query).close();
        }
    }
    
    public final void E(final String s) {
        Object o = ((zvn)((ziy)this.f).e).a().rawQuery("SELECT COUNT(*) FROM videosV2 WHERE channel_id=?", new String[] { s });
        try {
            ((Cursor)o).moveToFirst();
            final int int1 = ((Cursor)o).getInt(0);
            ((Cursor)o).close();
            if (int1 == 0) {
                o = ((zvn)((adlp)this.g).g).a().rawQuery("SELECT COUNT(*) FROM playlistsV13 WHERE channel_id=?", new String[] { s });
                try {
                    ((Cursor)o).moveToFirst();
                    final int int2 = ((Cursor)o).getInt(0);
                    ((Cursor)o).close();
                    if (int2 == 0) {
                        try {
                            o = this.b;
                            final long n = ((zvn)((aujg)o).a).a().delete("channelsV13", "id = ?", new String[] { s });
                            if (n == 1L) {
                                o = ((List<Object>)((aujg)o).b).iterator();
                                while (((Iterator)o).hasNext()) {
                                    zzu.w(((zzu)((adlp)((Iterator<xra>)o).next().a).c).d(s));
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
        for (final aaba aaba : collection) {
            final String f = aaba.f();
            if (set.add(f) && ((zvo)this.d).O(aaba)) {
                list.add(f);
            }
        }
        if (!list.isEmpty()) {
            ((atjz)this.a).tu((Object)new zyf((List)list));
        }
    }
    
    public final uvr G(final vmj vmj, final wyw wyw, final uui uui) {
        final acrr acrr = (acrr)((atke)this.g).a();
        acrr.getClass();
        final abqg abqg = (abqg)((atke)this.a).a();
        abqg.getClass();
        final uuk uuk = (uuk)((atke)this.c).a();
        final tgd tgd = (tgd)((atke)this.d).a();
        tgd.getClass();
        final tqd tqd = (tqd)((atke)this.e).a();
        tqd.getClass();
        final uwj uwj = (uwj)((atke)this.f).a();
        uwj.getClass();
        final vaf vaf = (vaf)((atke)this.b).a();
        vaf.getClass();
        wyw.getClass();
        return new uvr(acrr, abqg, uuk, tgd, tqd, uwj, vaf, vmj, wyw, uui, (byte[])null);
    }
    
    public final void H(final String s) {
        ((SharedPreferences)this.a).edit().putString("upload_policy", s).apply();
    }
    
    public final boolean I() {
        return adkp.ae(((SharedPreferences)this.a).getString("upload_policy", (String)null), this.f);
    }
    
    public final void J(final sog sog, final ajaj ajaj, final aiqp aiqp, final aiqp aiqp2, final boolean b) {
        final ajut ajut = null;
        if (sog == null) {
            if (ajaj.b == 97806346) {
                final aish aish = (aish)ajaj.c;
                final Object c = ((agmx)this.f).c;
                som som;
                if (c != null) {
                    som = (som)((ackm)c).c("commentThreadMutator");
                }
                else {
                    som = null;
                }
                ((sny)this.a).i(aish, som, (airz)null, b);
            }
            return;
        }
        final som a = sog.a;
        final airo b2 = ((agmx)this.f).B(sog.b, a.h());
        aixf aixf;
        if (b2 == airo.b && (aiqp.b & 0x1) != 0x0) {
            if ((aixf = aiqp.c) == null) {
                aixf = aixf.a;
            }
        }
        else if (b2 == airo.d && (aiqp2.b & 0x1) != 0x0) {
            if ((aixf = aiqp2.c) == null) {
                aixf = aixf.a;
            }
        }
        else {
            aixf = null;
        }
        if (aixf == null) {
            if (ajaj.b == 97806346) {
                final aish aish2 = (aish)ajaj.c;
                ahzy ahzy;
                if ((ahzy = sog.b.B) == null) {
                    ahzy = ahzy.a;
                }
                if (ahzy.b == 99391126) {
                    final Object a2 = this.a;
                    final airz b3 = sog.b;
                    if ((aish2.b & 0x20) == 0x0) {
                        ttr.b("No reply button specified for comment reply dialog.");
                        return;
                    }
                    aida aida;
                    if ((aida = aish2.f) == null) {
                        aida = aida.a;
                    }
                    if ((aida.b & 0x1) == 0x0) {
                        ttr.b("No button renderer specified for comment reply dialog.");
                        return;
                    }
                    aida aida2;
                    if ((aida2 = aish2.f) == null) {
                        aida2 = aida.a;
                    }
                    aicz aicz;
                    if ((aicz = aida2.c) == null) {
                        aicz = aicz.a;
                    }
                    if ((aicz.b & 0x4000) == 0x0) {
                        ttr.b("No service endpoint specified for comment reply dialog.");
                        return;
                    }
                    final sny sny = (sny)a2;
                    final aish c2 = sny.c(aish2);
                    if (sny.r(b3) == null) {
                        airo airo;
                        if ((airo = airo.b(b3.H)) == null) {
                            airo = airo.a;
                        }
                        if (airo == airo.c) {
                            sny.i(c2, a, b3, false);
                        }
                        return;
                    }
                    aotp aotp;
                    if ((aotp = c2.c) == null) {
                        aotp = aotp.a;
                    }
                    ajut ajut2;
                    if ((c2.b & 0x10) != 0x0) {
                        if ((ajut2 = c2.e) == null) {
                            ajut2 = ajut.a;
                        }
                    }
                    else {
                        ajut2 = null;
                    }
                    final Spanned b4 = acak.b(ajut2);
                    aida aida3;
                    if ((aida3 = c2.f) == null) {
                        aida3 = aida.a;
                    }
                    aicz aicz2;
                    if ((aicz2 = aida3.c) == null) {
                        aicz2 = aicz.a;
                    }
                    aicz aicz4;
                    if ((c2.b & 0x80) != 0x0) {
                        aida aida4;
                        if ((aida4 = c2.g) == null) {
                            aida4 = aida.a;
                        }
                        aicz aicz3;
                        if ((aicz3 = aida4.c) == null) {
                            aicz3 = aicz.a;
                        }
                        aicz4 = aicz3;
                    }
                    else {
                        aicz4 = null;
                    }
                    aida aida5;
                    if ((aida5 = c2.i) == null) {
                        aida5 = aida.a;
                    }
                    aicz aicz5;
                    if ((aicz5 = aida5.c) == null) {
                        aicz5 = aicz.a;
                    }
                    anuv anuv;
                    if ((anuv = c2.j) == null) {
                        anuv = anuv.a;
                    }
                    final String k = c2.k;
                    ajut ajut3 = ajut;
                    if ((c2.b & 0x10) != 0x0 && (ajut3 = c2.e) == null) {
                        ajut3 = ajut.a;
                    }
                    sny.e(new soc(1, aotp, a, b3, (Spanned)null, b4, (apzx)null, aicz2, aicz4, aicz5, anuv, k, (ajut)null, ajut3, (airn)null, c2), (acpt)null, (CharSequence)null, (Long)null, false, false);
                }
                else {
                    ((sny)this.a).i(aish2, a, sog.b, false);
                }
            }
            return;
        }
        acax.h((Context)this.c, aixf, (vcy)this.b, (wyw)this.d, this.e, (aeea)this.g);
    }
    
    public final void K(final som som, final anlc anlc, final anla anla, final airo airo, final wyw wyw) {
        aiqj aiqj;
        if (anla.d) {
            if ((aiqj = anla.j) == null) {
                aiqj = aiqj.a;
            }
        }
        else if ((aiqj = anla.i) == null) {
            aiqj = aiqj.a;
        }
        aiqj aiqj2;
        if ((aiqj2 = aiqj) == null && (aiqj2 = anla.e) == null) {
            aiqj2 = aiqj.a;
        }
        final ahaz builder = ((ahbh)UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.a).createBuilder();
        if ((anlc.b & 0x40) != 0x0) {
            ajut d;
            if ((d = anlc.h) == null) {
                d = ajut.a;
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
        for (int i = 0; i < anlc.f.size(); ++i) {
            if (((anla)anlc.f.get(i)).d) {
                builder.copyOnWrite();
                final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction3 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction)builder.instance;
                updateBackstagePollActionOuterClass$UpdateBackstagePollAction3.b |= 0x8;
                updateBackstagePollActionOuterClass$UpdateBackstagePollAction3.e = i;
                break;
            }
        }
        if (airo != null) {
            builder.copyOnWrite();
            final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction4 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction)builder.instance;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction4.c = airo.f;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction4.b |= 0x2;
        }
        final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction5 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction)builder.build();
        final abh abh = new abh(2);
        ((Map<String, soe>)abh).put("com.google.android.libraries.youtube.innertube.endpoint.tag", new soe(this, som, updateBackstagePollActionOuterClass$UpdateBackstagePollAction5, anlc, 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        ((Map<String, soe>)abh).put("com.google.android.libraries.youtube.comment.action_tag", (soe)new sof(this, som, anlc, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        if (wyw != null && (anlc.b & 0x20) != 0x0) {
            wyw.J(3, (wzz)new wyt(anlc.g.I()), (alhi)null);
        }
        ((vcy)this.d).c(aiqj2, (Map)abh);
    }
    
    public final void L(final String s, final anlc anlc, final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction) {
        final ahaz builder = ((ahbh)anlc).toBuilder();
        ajut h;
        if ((h = updateBackstagePollActionOuterClass$UpdateBackstagePollAction.d) == null) {
            h = ajut.a;
        }
        builder.copyOnWrite();
        final anlc anlc2 = (anlc)builder.instance;
        h.getClass();
        anlc2.h = h;
        anlc2.b |= 0x40;
        for (int i = 0; i < anlc.f.size(); ++i) {
            final ahaz builder2 = ((ahbh)anlc.f.get(i)).toBuilder();
            Label_0544: {
                Label_0153: {
                    if (updateBackstagePollActionOuterClass$UpdateBackstagePollAction.e == 0) {
                        airo airo;
                        if ((airo = airo.b(updateBackstagePollActionOuterClass$UpdateBackstagePollAction.c)) == null) {
                            airo = airo.a;
                        }
                        if (airo == airo.b) {
                            break Label_0153;
                        }
                    }
                    final int e = updateBackstagePollActionOuterClass$UpdateBackstagePollAction.e;
                    if (e != -1) {
                        if (e == i) {
                            builder2.copyOnWrite();
                            final anla anla = (anla)builder2.instance;
                            anla.b |= 0x8;
                            anla.d = true;
                            final double k = anla.k;
                            builder2.copyOnWrite();
                            final anla anla2 = (anla)builder2.instance;
                            anla2.b |= 0x20;
                            anla2.f = k;
                            ajut g;
                            if ((g = anla2.l) == null) {
                                g = ajut.a;
                            }
                            builder2.copyOnWrite();
                            final anla anla3 = (anla)builder2.instance;
                            g.getClass();
                            anla3.g = g;
                            anla3.b |= 0x40;
                            break Label_0544;
                        }
                        builder2.copyOnWrite();
                        final anla anla4 = (anla)builder2.instance;
                        anla4.b |= 0x8;
                        anla4.d = false;
                        final double m = anla4.m;
                        builder2.copyOnWrite();
                        final anla anla5 = (anla)builder2.instance;
                        anla5.b |= 0x20;
                        anla5.f = m;
                        ajut g2;
                        if ((g2 = anla5.n) == null) {
                            g2 = ajut.a;
                        }
                        builder2.copyOnWrite();
                        final anla anla6 = (anla)builder2.instance;
                        g2.getClass();
                        anla6.g = g2;
                        anla6.b |= 0x40;
                        break Label_0544;
                    }
                }
                builder2.copyOnWrite();
                final anla anla7 = (anla)builder2.instance;
                anla7.b |= 0x8;
                anla7.d = false;
                builder2.copyOnWrite();
                final anla anla8 = (anla)builder2.instance;
                anla8.b |= 0x20;
                anla8.f = 0.0;
                builder2.copyOnWrite();
                final anla anla9 = (anla)builder2.instance;
                anla9.g = null;
                anla9.b &= 0xFFFFFFBF;
            }
            builder.copyOnWrite();
            final anlc anlc3 = (anlc)builder.instance;
            final anla anla10 = (anla)builder2.build();
            anla10.getClass();
            final ahbx f = anlc3.f;
            if (!f.c()) {
                anlc3.f = ahbh.mutableCopy(f);
            }
            anlc3.f.set(i, (Object)anla10);
        }
        ((agmx)this.a).I(s, (anlc)builder.build());
        final Object a = this.a;
        final long j = anlc.k;
        airo airo2;
        if ((airo2 = airo.b(updateBackstagePollActionOuterClass$UpdateBackstagePollAction.c)) == null) {
            airo2 = airo.a;
        }
        ((agmx)a).J(s, j, airo2);
    }
    
    public final aphe a(String string) {
        final ahaz builder = ((ahbh)aphe.a).createBuilder();
        builder.copyOnWrite();
        final aphe aphe = (aphe)builder.instance;
        string.getClass();
        aphe.b |= 0x1;
        aphe.c = string;
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
        final aphe aphe2 = (aphe)builder.instance;
        aphe2.e = n2 - 1;
        aphe2.b |= 0x8;
        string = ((SharedPreferences)this.d).getString("upload_policy", (String)null);
        int n3;
        if (!((String)this.f).equals(string)) {
            n3 = n;
        }
        else {
            n3 = 3;
        }
        builder.copyOnWrite();
        final aphe aphe3 = (aphe)builder.instance;
        aphe3.d = n3 - 1;
        aphe3.b |= 0x4;
        return (aphe)builder.build();
    }
    
    public final void b(final String s, final aknt aknt) {
        ((Executor)this.b).execute(aeun.h((Runnable)new adlo(this, s, aknt, 0)));
    }
    
    public final void c(final String c, final String s, final long n, final long n2, final long n3, final long n4, final long n5) {
        final aphc a = aphd.a();
        final apht j = apht.J;
        ((ahaz)a).copyOnWrite();
        aphd.d((aphd)a.instance, j);
        final ahaz builder = ((ahbh)aphe.a).createBuilder();
        builder.copyOnWrite();
        final aphe aphe = (aphe)builder.instance;
        c.getClass();
        aphe.b |= 0x1;
        aphe.c = c;
        ((ahaz)a).copyOnWrite();
        aphd.c((aphd)a.instance, (aphe)builder.build());
        ((ahaz)a).copyOnWrite();
        aphd.k((aphd)a.instance, n);
        ((ahaz)a).copyOnWrite();
        aphd.n((aphd)a.instance, n2);
        ((ahaz)a).copyOnWrite();
        aphd.o((aphd)a.instance, n3);
        ((ahaz)a).copyOnWrite();
        aphd.p((aphd)a.instance, n4);
        ((ahaz)a).copyOnWrite();
        aphd.q((aphd)a.instance, n5);
        final aphd aphd = (aphd)((ahaz)a).build();
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.ar((aknt)d.instance, aphd);
        this.b(s, (aknt)((ahaz)d).build());
    }
    
    public final void d(final String c, final String s, final apht apht, final aphs aphs) {
        final aphc a = aphd.a();
        ((ahaz)a).copyOnWrite();
        aphd.d((aphd)a.instance, apht);
        ((ahaz)a).copyOnWrite();
        aphd.i((aphd)a.instance, aphs);
        final ahaz builder = ((ahbh)aphe.a).createBuilder();
        builder.copyOnWrite();
        final aphe aphe = (aphe)builder.instance;
        c.getClass();
        aphe.b |= 0x1;
        aphe.c = c;
        ((ahaz)a).copyOnWrite();
        aphd.c((aphd)a.instance, (aphe)builder.build());
        final aphd aphd = (aphd)((ahaz)a).build();
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.ar((aknt)d.instance, aphd);
        this.b(s, (aknt)((ahaz)d).build());
    }
    
    public final void e(final String c, final String s, final apht apht) {
        final aphc a = aphd.a();
        ((ahaz)a).copyOnWrite();
        aphd.d((aphd)a.instance, apht);
        final ahaz builder = ((ahbh)aphe.a).createBuilder();
        builder.copyOnWrite();
        final aphe aphe = (aphe)builder.instance;
        c.getClass();
        aphe.b |= 0x1;
        aphe.c = c;
        ((ahaz)a).copyOnWrite();
        aphd.c((aphd)a.instance, (aphe)builder.build());
        final aphd aphd = (aphd)((ahaz)a).build();
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.ar((aknt)d.instance, aphd);
        this.b(s, (aknt)((ahaz)d).build());
    }
    
    public final void f(final String c, final String s, final aphu aphu) {
        final aphc a = aphd.a();
        final apht d = apht.D;
        ((ahaz)a).copyOnWrite();
        aphd.d((aphd)a.instance, d);
        final ahaz builder = ((ahbh)aphe.a).createBuilder();
        builder.copyOnWrite();
        final aphe aphe = (aphe)builder.instance;
        c.getClass();
        aphe.b |= 0x1;
        aphe.c = c;
        ((ahaz)a).copyOnWrite();
        aphd.c((aphd)a.instance, (aphe)builder.build());
        ((ahaz)a).copyOnWrite();
        aphd.m((aphd)a.instance, aphu);
        final aphd aphd = (aphd)((ahaz)a).build();
        final aknr d2 = aknt.d();
        ((ahaz)d2).copyOnWrite();
        aknt.ar((aknt)d2.instance, aphd);
        this.b(s, (aknt)((ahaz)d2).build());
    }
    
    public final void g(final String s, final apho apho) {
        this.h(s, apho, Optional.empty());
    }
    
    public final void h(final String c, final apho apho, final Optional optional) {
        final aphc a = aphd.a();
        final apht w = apht.W;
        ((ahaz)a).copyOnWrite();
        aphd.d((aphd)a.instance, w);
        final ahaz builder = ((ahbh)aphe.a).createBuilder();
        builder.copyOnWrite();
        final aphe aphe = (aphe)builder.instance;
        c.getClass();
        aphe.b |= 0x1;
        aphe.c = c;
        ((ahaz)a).copyOnWrite();
        aphd.c((aphd)a.instance, (aphe)builder.build());
        ((ahaz)a).copyOnWrite();
        aphd.g((aphd)a.instance, apho);
        optional.ifPresent((Consumer)new adjk(a, 2));
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.ar((aknt)d.instance, (aphd)((ahaz)a).build());
        ((Executor)this.b).execute(aeun.h((Runnable)new adfy(this, (aknt)((ahaz)d).build(), 9)));
    }
    
    public final void i(final String c, final String s, final apho apho) {
        final aphc a = aphd.a();
        final apht e = apht.E;
        ((ahaz)a).copyOnWrite();
        aphd.d((aphd)a.instance, e);
        final ahaz builder = ((ahbh)aphe.a).createBuilder();
        builder.copyOnWrite();
        final aphe aphe = (aphe)builder.instance;
        aphe.b |= 0x1;
        aphe.c = c;
        ((ahaz)a).copyOnWrite();
        aphd.c((aphd)a.instance, (aphe)builder.build());
        ((ahaz)a).copyOnWrite();
        aphd.g((aphd)a.instance, apho);
        final aphd aphd = (aphd)((ahaz)a).build();
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.ar((aknt)d.instance, aphd);
        this.b(s, (aknt)((ahaz)d).build());
    }
    
    public final void j(final String c, final apht apht, final int n, final boolean e) {
        final ahaz builder = ((ahbh)aphl.a).createBuilder();
        final ahaz builder2 = ((ahbh)aphb.a).createBuilder();
        builder2.copyOnWrite();
        final aphb aphb = (aphb)builder2.instance;
        aphb.d = n - 1;
        aphb.b |= 0x2;
        builder2.copyOnWrite();
        final aphb aphb2 = (aphb)builder2.instance;
        aphb2.b |= 0x4;
        aphb2.e = e;
        final aphb c2 = (aphb)builder2.build();
        builder.copyOnWrite();
        final aphl aphl = (aphl)builder.instance;
        c2.getClass();
        aphl.c = c2;
        aphl.b |= 0x1;
        final aphl aphl2 = (aphl)builder.build();
        final aphc a = aphd.a();
        ((ahaz)a).copyOnWrite();
        aphd.d((aphd)a.instance, apht);
        ((ahaz)a).copyOnWrite();
        aphd.s((aphd)a.instance, aphl2);
        final ahaz builder3 = ((ahbh)aphe.a).createBuilder();
        builder3.copyOnWrite();
        final aphe aphe = (aphe)builder3.instance;
        aphe.b |= 0x1;
        aphe.c = c;
        ((ahaz)a).copyOnWrite();
        aphd.c((aphd)a.instance, (aphe)builder3.build());
        final aphd aphd = (aphd)((ahaz)a).build();
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.ar((aknt)d.instance, aphd);
        ((Executor)this.b).execute(aeun.h((Runnable)new adfy(this, (aknt)((ahaz)d).build(), 10)));
    }
    
    public final void k(final String c, final String s, final aphs aphs, final int n, final boolean e, final aphq[] array) {
        final aphc a = aphd.a();
        final apht h = apht.H;
        ((ahaz)a).copyOnWrite();
        aphd.d((aphd)a.instance, h);
        final ahaz builder = ((ahbh)aphe.a).createBuilder();
        builder.copyOnWrite();
        final aphe aphe = (aphe)builder.instance;
        aphe.b |= 0x1;
        aphe.c = c;
        ((ahaz)a).copyOnWrite();
        aphd.c((aphd)a.instance, (aphe)builder.build());
        final ahaz builder2 = ((ahbh)aphl.a).createBuilder();
        final ahaz builder3 = ((ahbh)aphb.a).createBuilder();
        builder3.copyOnWrite();
        final aphb aphb = (aphb)builder3.instance;
        aphb.c = aphs.k;
        aphb.b |= 0x1;
        builder3.copyOnWrite();
        final aphb aphb2 = (aphb)builder3.instance;
        aphb2.d = n - 1;
        aphb2.b |= 0x2;
        builder3.copyOnWrite();
        final aphb aphb3 = (aphb)builder3.instance;
        aphb3.b |= 0x4;
        aphb3.e = e;
        builder2.copyOnWrite();
        final aphl aphl = (aphl)builder2.instance;
        final aphb c2 = (aphb)builder3.build();
        c2.getClass();
        aphl.c = c2;
        aphl.b |= 0x1;
        final List<aphq> list = Arrays.asList(array);
        builder2.copyOnWrite();
        final aphl aphl2 = (aphl)builder2.instance;
        final ahbp d = aphl2.d;
        if (!d.c()) {
            aphl2.d = ahbh.mutableCopy(d);
        }
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            aphl2.d.g(iterator.next().i);
        }
        final aphl aphl3 = (aphl)builder2.build();
        ((ahaz)a).copyOnWrite();
        aphd.s((aphd)a.instance, aphl3);
        final aphd aphd = (aphd)((ahaz)a).build();
        final aknr d2 = aknt.d();
        ((ahaz)d2).copyOnWrite();
        aknt.ar((aknt)d2.instance, aphd);
        this.b(s, (aknt)((ahaz)d2).build());
    }
    
    public final aczj l(final aczh aczh, final aczg aczg, final int n, final String s, final byte[] array, final int n2, final int n3, final int n4, final String s2, final String s3) {
        final CronetEngine cronetEngine = (CronetEngine)((atke)this.c).a();
        cronetEngine.getClass();
        final rhx rhx = (rhx)((atke)this.d).a();
        rhx.getClass();
        final aeea aeea = (aeea)((atke)this.g).a();
        aeea.getClass();
        final zmf zmf = (zmf)((atke)this.e).a();
        zmf.getClass();
        final Executor executor = (Executor)((atke)this.a).a();
        executor.getClass();
        final Handler handler = (Handler)((atke)this.f).a();
        handler.getClass();
        final String s4 = (String)((atke)this.b).a();
        s4.getClass();
        aczh.getClass();
        aczg.getClass();
        s.getClass();
        array.getClass();
        return new aczj(cronetEngine, rhx, aeea, zmf, executor, handler, s4, aczh, aczg, n, s, (byte[])array, n2, n3, n4, s2, s3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final PlayerResponseModel m(aoxc aoxc, final PlayerResponseModel playerResponseModel) {
        final String k = playerResponseModel.K();
        long millis = playerResponseModel.h();
        Object d = aoxc.c().D();
        while (true) {
            while (((Iterator)d).hasNext()) {
                final amwl amwl = (amwl)((Iterator)d).next();
                if (vgl.i(amwl.e()).equals(k)) {
                Label_0071_Outer:
                    while (true) {
                        if (amwl != null) {
                            final List streamsProgressModels = amwl.getStreamsProgressModels();
                            millis = TimeUnit.SECONDS.toMillis(millis);
                            d = null;
                            final int n = 0;
                            aoxc = null;
                            break Label_0099;
                        }
                    Label_0392_Outer:
                        while (true) {
                            aoxc = null;
                        Label_0363_Outer:
                            while (true) {
                                break Label_0392;
                                Label_0369: {
                                    final List streamsProgressModels;
                                    int n = 0;
                                    if (n >= ((afih)streamsProgressModels).c || (aoxc != null && d != null)) {
                                        break Label_0369;
                                    }
                                    final aoln a = ((aolm)streamsProgressModels.get(n)).a;
                                    int bc = aqsx.bc(a.e);
                                    if (bc == 0) {
                                        bc = 1;
                                    }
                                    while (true) {
                                        if ((a.b & 0x10) == 0x0 || bc == 1) {
                                            break Label_0363;
                                        }
                                        try {
                                            final ajum ajum = (ajum)ahbh.parseFrom((ahbh)ajum.b, a.g, ExtensionRegistryLite.getGeneratedRegistry());
                                            final Uri e = aakr.E((abny)((atke)this.c).a(), k, ajum.d, ajum.q, ajum.p, ajum.o, ((oby)this.b).d() + 18000000L);
                                            final ahbb ahbb = (ahbb)((ahbh)ajum).toBuilder();
                                            String string;
                                            if (e == null) {
                                                string = "";
                                            }
                                            else {
                                                string = e.toString();
                                            }
                                            ((ahaz)ahbb).copyOnWrite();
                                            final ajum ajum2 = (ajum)ahbb.instance;
                                            string.getClass();
                                            ajum2.c |= 0x2;
                                            ajum2.e = string;
                                            final Object o = new FormatStreamModel((ajum)((ahaz)ahbb).build(), k, millis);
                                            if (bc == 2) {
                                                aoxc = (aoxc)o;
                                            }
                                            else {
                                                d = o;
                                            }
                                            ++n;
                                            continue Label_0071_Outer;
                                            iftrue(Label_0447:)(aoxc == null);
                                            return aakr.H(playerResponseModel, (vjm)((atke)this.a).a(), (FormatStreamModel)((Pair)aoxc).first, (FormatStreamModel)((Pair)aoxc).second, ((oby)this.b).d(), zvg.b, false, (aait)this.e);
                                            Label_0447: {
                                                return null;
                                            }
                                            while (true) {
                                                continue Label_0392_Outer;
                                                iftrue(Label_0381:)(aoxc != null || d != null);
                                                continue;
                                            }
                                            Label_0381:
                                            aoxc = (aoxc)new Pair(d, (Object)aoxc);
                                            continue Label_0363_Outer;
                                        }
                                        catch (final ahca ahca) {
                                            continue;
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            final amwl amwl = null;
            continue;
        }
    }
    
    public final int n(final String s) {
        final Cursor query = ((zvn)this.g).a().query("playlistsV13", new String[] { "offline_source_ve_type" }, "id = ?", new String[] { s }, (String)null, (String)null, (String)null, (String)null);
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
    
    public final int o(final String s) {
        final Cursor query = ((zvn)this.g).a().query("playlistsV13", new String[] { "preferred_stream_quality" }, "id = ?", new String[] { s }, (String)null, (String)null, (String)null, (String)null);
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
    
    public final long p(String query) {
        query = (String)((zvn)this.g).a().query("playlistsV13", new String[] { "playlist_added_timestamp_millis" }, "id = ?", new String[] { query }, (String)null, (String)null, (String)null);
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
    
    public final long q(String rawQuery) {
        rawQuery = (String)((zvn)this.g).a().rawQuery("SELECT saved_timestamp FROM playlistsV13 WHERE id=?", new String[] { rawQuery });
        try {
            if (((Cursor)rawQuery).moveToNext()) {
                return ((Cursor)rawQuery).getLong(0);
            }
            return 0L;
        }
        finally {
            ((Cursor)rawQuery).close();
        }
    }
    
    public final aaar s(String query) {
        query = (String)((zvn)this.g).a().query("playlistsV13", zvx.a, "id = ?", new String[] { query }, (String)null, (String)null, (String)null, (String)null);
        try {
            try {
                if (((Cursor)query).moveToNext()) {
                    final aaar q = zvf.q((Cursor)query, (zzu)((atke)this.a).a(), (aujg)this.d, ((Cursor)query).getColumnIndexOrThrow("id"), ((Cursor)query).getColumnIndexOrThrow("offline_playlist_data_proto"), ((Cursor)query).getColumnIndexOrThrow("placeholder"), ((Cursor)query).getColumnIndexOrThrow("size"), ((Cursor)query).getColumnIndexOrThrow("channel_id"));
                    ((Cursor)query).close();
                    return q;
                }
                ((Cursor)query).close();
                return null;
            }
            finally {}
        }
        catch (final SQLiteException ex) {
            ttr.d("Issue with playlists store", (Throwable)ex);
            zlm.c(zll.b, zlk.B, "Issue with playlists store", (Throwable)ex);
            ((Cursor)query).close();
            return null;
        }
        ((Cursor)query).close();
    }
    
    public final Collection t(final String s, final List list) {
        return zxf.e(this.x(s), list);
    }
    
    public final List u() {
        final Cursor query = ((zvn)this.g).a().query("playlistsV13", zvx.a, (String)null, (String[])null, (String)null, (String)null, "saved_timestamp DESC", (String)null);
        try {
            try {
                final List r = zvf.r(query, (zzu)((atke)this.a).a(), (aujg)this.d, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_playlist_data_proto"), query.getColumnIndexOrThrow("placeholder"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("channel_id"));
                query.close();
                return r;
            }
            finally {}
        }
        catch (final SQLiteException ex) {
            ttr.d("Issue with playlists store", (Throwable)ex);
            zlm.c(zll.b, zlk.B, "Issue with playlists store", (Throwable)ex);
            final afeq q = afeq.q();
            query.close();
            return (List)q;
        }
        query.close();
    }
    
    public final List v() {
        final SQLiteDatabase a = ((zvn)this.g).a();
        final String c = tfp.c("videosV2", zwr.a);
        final StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(c);
        sb.append(" FROM videosV2 INNER JOIN playlist_video ON videosV2.id = playlist_video.video_id WHERE playlist_video.playlist_id IS NULL ORDER BY playlist_video.saved_timestamp DESC");
        final Cursor rawQuery = a.rawQuery(sb.toString(), (String[])null);
        try {
            final zzu zzu = (zzu)((atke)this.a).a();
            final Object d = this.d;
            rawQuery.getClass();
            zzu.getClass();
            return zxf.z(rawQuery, zzu, (aujg)d, rawQuery.getColumnIndexOrThrow("id"), rawQuery.getColumnIndexOrThrow("offline_video_data_proto"), rawQuery.getColumnIndexOrThrow("deleted"), rawQuery.getColumnIndexOrThrow("channel_id"), rawQuery.getColumnIndex("video_id"));
        }
        finally {
            rawQuery.close();
        }
    }
    
    public final List w(String rawQuery) {
        rawQuery = (String)((zvn)this.g).a().rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id = ? ORDER BY index_in_playlist ASC", new String[] { rawQuery });
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
        final SQLiteDatabase a = ((zvn)this.g).a();
        final String c = tfp.c("videosV2", zwr.a);
        final StringBuilder sb = new StringBuilder("SELECT playlist_video.video_id,");
        sb.append(c);
        sb.append(" FROM playlist_video LEFT OUTER JOIN videosV2 ON playlist_video.video_id = videosV2.id WHERE playlist_video.playlist_id = ? ORDER BY playlist_video.index_in_playlist ASC");
        rawQuery = (String)a.rawQuery(sb.toString(), new String[] { rawQuery });
        try {
            final zzu zzu = (zzu)((atke)this.a).a();
            final Object d = this.d;
            rawQuery.getClass();
            zzu.getClass();
            return zxf.z((Cursor)rawQuery, zzu, (aujg)d, ((Cursor)rawQuery).getColumnIndexOrThrow("id"), ((Cursor)rawQuery).getColumnIndexOrThrow("offline_video_data_proto"), ((Cursor)rawQuery).getColumnIndexOrThrow("deleted"), ((Cursor)rawQuery).getColumnIndexOrThrow("channel_id"), ((Cursor)rawQuery).getColumnIndex("video_id"));
        }
        finally {
            ((Cursor)rawQuery).close();
        }
    }
    
    public final void y(final zvw zvw) {
        ((List<zvw>)this.e).add(zvw);
    }
    
    public final void z(final String s) {
        ((zvn)this.g).a().delete("playlist_video", "playlist_id IS NULL AND video_id = ?", new String[] { s });
    }
}
