import com.google.protos.youtube.api.innertube.RefreshCommandOuterClass$RefreshCommand;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import java.util.UUID;
import android.graphics.Rect;
import com.google.common.util.concurrent.ListenableFuture;
import android.os.Bundle;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.text.Spanned;
import android.util.SparseIntArray;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Map$_EL;
import java.io.File;
import java.io.OutputStream;
import java.util.Comparator;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Iterator;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.io.FileOutputStream;
import android.view.View$OnClickListener;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import android.net.Uri;
import java.util.Collection;
import java.util.ArrayList;
import j$.util.Optional;
import java.util.concurrent.Callable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.content.SharedPreferences;
import android.content.Context;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzw
{
    public final Object a;
    public final Object b;
    
    public fzw() {
        this("");
    }
    
    public fzw(final acmr b, final byte[] array) {
        this.b = b;
        this.a = new HashSet();
    }
    
    public fzw(final acwb a, final vcy b) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final adaj b) {
        this.b = b;
        this.a = amzq.k;
    }
    
    public fzw(final ajps b, final alsa a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final Context b, final aabo a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final Context b, final adkb a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final Context b, final afvt a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final Context b, final atke a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final Context b, final fmr a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final Context b, final fzw a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final Context b, final gbu a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final Context b, final hkh a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final SharedPreferences sharedPreferences) {
        this.a = aezp.j((Object)sharedPreferences);
        this.b = aeyo.a;
    }
    
    public fzw(final SharedPreferences a, final oby b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public fzw(final View view) {
        this.a = view.findViewById(2131431953);
        this.b = view.findViewById(2131429270);
    }
    
    public fzw(final View a, final Iterable b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public fzw(final FrameLayout a, final elx b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final arwh b, final addt a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final atke a, final atke b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public fzw(final atke b, final atke a, final byte[] array) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fzw(final atke a, final atke b, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public fzw(final atke b, final atke a, final byte[] array, final byte[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fzw(final atke a, final atke b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public fzw(final atke b, final atke a, final byte[] array, final byte[] array2, final char[] array3) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fzw(final atke b, final atke a, final byte[] array, final char[] array2) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fzw(final atke b, final atke a, final byte[] array, final int[] array2) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fzw(final atke a, final atke b, final byte[] array, final short[] array2) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public fzw(final atke a, final atke b, final char[] array) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public fzw(final atke b, final atke a, final char[] array, final byte[] array2) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fzw(final atke b, final atke a, final char[] array, final char[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final atke a, final atke b, final int[] array) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public fzw(final atke a, final atke b, final short[] array) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public fzw(final atke b, final atke a, final short[] array, final byte[] array2) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fzw(final atke a, final oby b) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final bu bu, final atke atke, final atke atke2, final arkg b, final vaf vaf, final arkg a, final atke atke3, final asid asid, final atke atke4, final zmf zmf, final msr msr, final vai vai, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        if (vai.f(45378555L)) {
            msr.Q((Callable)new exu(this, a, asid, bu, b, atke2, atke, atke3, atke4, zmf, (byte[])null, (byte[])null, (byte[])null));
        }
        if (!fbu.X(vaf)) {
            atke.a();
            atke2.a();
            b.a();
            a.a();
            atke3.a();
        }
    }
    
    public fzw(final bu a, final htk b, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final eqy a, final esu b) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final fln b, final fln a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final flv b, final vai a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final gdh b, final wyv a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final geo b, final fjv a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final hzn a, final cyb b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final Optional a, final gdd b) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final CharSequence charSequence) {
        this(charSequence, new ArrayList());
    }
    
    public fzw(final CharSequence a, final Collection collection) {
        this.a = a;
        ((Collection<Object>)(this.b = new ArrayList())).addAll(collection);
    }
    
    public fzw(final Class b, final Class a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final Integer a, final String s, final fui fui) {
        this.a = a;
        this.b = new hft(s, fui);
    }
    
    public fzw(final String a, final Uri b) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final String b, final htd a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final ZipFile a, final ZipEntry b) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final oby b, final xao a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final qqr a, final Executor b) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final rqj a, final ets b) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final sqq sqq, final byte[] array, final byte[] array2) {
        this.a = aeyo.a;
        this.b = aezp.j((Object)sqq);
    }
    
    public fzw(final tcq b, final vaf a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final tgd b, final arwh a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final tgd b, final toj a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final ueu a) {
        this.a = a;
        this.b = new ConcurrentHashMap();
    }
    
    public fzw(final vaf b, final atke atke) {
        this.b = b;
        this.a = atke.a();
    }
    
    public fzw(final vai b, final vai a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final vcy b, final Set a) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final vdr a, final zmf b) {
        this.a = a;
        this.b = b;
    }
    
    private fzw(final vfn a, final iiw b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public fzw(final xbd a, final tgd b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public fzw(final zlv b, final zmf a) {
        this.b = b;
        this.a = a;
    }
    
    public fzw(final zmf a, final man b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
    }
    
    public fzw(final byte[] array) {
        this.b = ativ.aE();
        this.a = ativ.aE();
    }
    
    public fzw(final byte[] array, final byte[] array2) {
        this.b = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.a = new HashSet();
    }
    
    public fzw(final byte[] array, final char[] array2) {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }
    
    public fzw(final byte[] array, final short[] array2) {
        this.b = new HashMap();
        this.a = new WeakHashMap();
    }
    
    public fzw(final char[] array) {
        this.b = new HashMap();
        this.a = new ekp();
        this.F(new ekf());
        this.F(new ekh());
        this.F(new eki());
        this.F(new ekk());
        this.F(new ekn());
        this.F(new eko());
        this.F(new ekq());
    }
    
    public fzw(final char[] array, final byte[] array2) {
        this.b = new ArrayList();
        this.a = new ArrayList();
    }
    
    public fzw(final short[] array) {
        this.b = new HashMap();
        this.a = new HashMap();
    }
    
    public static final View$OnClickListener E(final bu bu, final zlv zlv, final zmf zmf) {
        return (View$OnClickListener)new gbw(bu, zlv, zmf, 1);
    }
    
    public static final boolean I(final rdz rdz, final FileOutputStream fileOutputStream) {
        try {
            rdz.d((WritableByteChannel)fileOutputStream.getChannel());
            return true;
        }
        catch (final IOException ex) {
            zlm.c(zll.b, zlk.x, "Failed to remux the media file", (Throwable)ex);
            return false;
        }
    }
    
    public static final String Z(final akbo akbo) {
        return "hint_last_shown".concat(String.valueOf(akbo.c));
    }
    
    public static fzw aC(final vfn vfn) {
        return new fzw(vfn, null);
    }
    
    public static fzw aD(final vfn vfn, final iiw iiw) {
        iiw.getClass();
        return new fzw(vfn, iiw);
    }
    
    private final void aE() {
        this.k();
        final Iterator<Object> iterator = ((Set<Object>)this.b).iterator();
        while (iterator.hasNext()) {
            iterator.next().F();
        }
    }
    
    private final asht aF(final vfp vfp, final String s, final ajhp ajhp) {
        return vfp.f(s).j((Class)alyt.class).C((asjr)flq.a).W((asjr)new fdo(this, ajhp, 5, (byte[])null, (byte[])null, (byte[])null));
    }
    
    private final asht aG(final vfp vfp, final String s, final ajhp ajhp) {
        final asht z = this.aF(vfp, s, ajhp).ay((ashw)((flv)this.b).d().k(), (asji)exl.e).K((asjs)new exh(14)).Z((asjr)flq.h).ay((ashw)((flv)this.b).c().k(), (asji)exl.e).K((asjs)new exh(15)).Z((asjr)flq.h).Z((asjr)flq.j);
        vfp.getClass();
        return z.u((asjr)new fdg(vfp, 8));
    }
    
    private final ajut aH(final int n) {
        return acak.g(new String[] { ((Context)this.b).getString(n) });
    }
    
    private final akhz aI(final anyy... array) {
        final ahaz builder = ((ahbh)anyv.a).createBuilder();
        builder.bA((Iterable)Arrays.asList(array));
        final anyv c = (anyv)builder.build();
        final ahaz builder2 = ((ahbh)aorj.a).createBuilder();
        builder2.copyOnWrite();
        final aorj aorj = (aorj)builder2.instance;
        aorj.b |= 0x8;
        aorj.f = true;
        builder2.copyOnWrite();
        final aorj aorj2 = (aorj)builder2.instance;
        aorj2.b |= 0x4;
        aorj2.e = "FElibrary";
        final ahaz builder3 = ((ahbh)aorf.a).createBuilder();
        builder3.copyOnWrite();
        final aorf aorf = (aorf)builder3.instance;
        c.getClass();
        aorf.c = c;
        aorf.b |= 0x1;
        builder2.copyOnWrite();
        final aorj aorj3 = (aorj)builder2.instance;
        final aorf k = (aorf)builder3.build();
        k.getClass();
        aorj3.k = k;
        aorj3.b |= 0x2000;
        final aorj c2 = (aorj)builder2.build();
        final ahaz builder4 = ((ahbh)akii.a).createBuilder();
        builder4.copyOnWrite();
        final akii akii = (akii)builder4.instance;
        akii.b |= 0x1;
        akii.d = true;
        builder4.copyOnWrite();
        final akii akii2 = (akii)builder4.instance;
        akii2.b |= 0x2;
        akii2.e = true;
        final ahaz builder5 = ((ahbh)akic.a).createBuilder();
        builder5.copyOnWrite();
        final akic akic = (akic)builder5.instance;
        c2.getClass();
        akic.c = c2;
        akic.b = 58174010;
        builder4.aR(builder5);
        final akii c3 = (akii)builder4.build();
        final ahaz builder6 = ((ahbh)ajsp.a).createBuilder();
        final ajut g = acak.g(new String[] { ((Context)this.b).getString(2132018830) });
        builder6.copyOnWrite();
        final ajsp ajsp = (ajsp)builder6.instance;
        g.getClass();
        ajsp.c = g;
        ajsp.b |= 0x1;
        final ajsp c4 = (ajsp)builder6.build();
        final ahbb ahbb = (ahbb)((ahbh)akhz.a).createBuilder();
        final akli a = akli.a;
        ((ahaz)ahbb).copyOnWrite();
        final akhz akhz = (akhz)ahbb.instance;
        a.getClass();
        akhz.c = a;
        akhz.b |= 0x1;
        final ahaz builder7 = ((ahbh)akhu.a).createBuilder();
        builder7.copyOnWrite();
        final akhu akhu = (akhu)builder7.instance;
        c4.getClass();
        akhu.c = c4;
        akhu.b = 50236216;
        ((ahaz)ahbb).copyOnWrite();
        final akhz akhz2 = (akhz)ahbb.instance;
        final akhu d = (akhu)builder7.build();
        d.getClass();
        akhz2.d = d;
        akhz2.b |= 0x2;
        final ahaz builder8 = ((ahbh)akia.a).createBuilder();
        builder8.copyOnWrite();
        final akia akia = (akia)builder8.instance;
        c3.getClass();
        akia.c = c3;
        akia.b = 58173949;
        ((ahaz)ahbb).copyOnWrite();
        final akhz akhz3 = (akhz)ahbb.instance;
        final akia f = (akia)builder8.build();
        f.getClass();
        akhz3.f = f;
        akhz3.b |= 0x40;
        return (akhz)((ahaz)ahbb).build();
    }
    
    private static ahyj aJ(final int n, final ajut i, final aiqj o) {
        final ahaz builder = ((ahbh)ahyj.a).createBuilder();
        final ahbb ahbb = (ahbb)((ahbh)aicz.a).createBuilder();
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz = (aicz)ahbb.instance;
        aicz.d = n - 1;
        aicz.c = 1;
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz2 = (aicz)ahbb.instance;
        aicz2.e = 3;
        aicz2.b |= 0x8;
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz3 = (aicz)ahbb.instance;
        i.getClass();
        aicz3.i = i;
        aicz3.b |= 0x200;
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz4 = (aicz)ahbb.instance;
        o.getClass();
        aicz4.o = o;
        aicz4.b |= 0x8000;
        builder.copyOnWrite();
        final ahyj ahyj = (ahyj)builder.instance;
        final aicz c = (aicz)((ahaz)ahbb).build();
        c.getClass();
        ahyj.c = c;
        ahyj.b = 65153809;
        return (ahyj)builder.build();
    }
    
    private final long aK() {
        return TimeUnit.MICROSECONDS.convert(((oby)this.b).e(), TimeUnit.NANOSECONDS);
    }
    
    private static almm aL(final String c, final long n) {
        final ahaz builder = ((ahbh)almm.a).createBuilder();
        builder.copyOnWrite();
        final almm almm = (almm)builder.instance;
        almm.b |= 0x1;
        almm.c = c;
        final long abs = Math.abs(n);
        builder.copyOnWrite();
        final almm almm2 = (almm)builder.instance;
        almm2.b |= 0x4;
        almm2.e = abs;
        final ahaz builder2 = ((ahbh)almu.a).createBuilder();
        builder2.copyOnWrite();
        final almu almu = (almu)builder2.instance;
        int n2;
        if (n >= 0L) {
            n2 = 2;
        }
        else {
            n2 = 3;
        }
        almu.l = n2 - 1;
        almu.b |= 0x800;
        final almu g = (almu)builder2.build();
        builder.copyOnWrite();
        final almm almm3 = (almm)builder.instance;
        g.getClass();
        almm3.g = g;
        almm3.b |= 0x10;
        return (almm)builder.build();
    }
    
    private static boolean aM(final aiqj aiqj) {
        return as(aiqj, "FEhistory");
    }
    
    public static final String aa(final akbo akbo) {
        return "hint_id_prefix".concat(String.valueOf(akbo.c));
    }
    
    public static final int ah(final hyx hyx, final ejz ejz, final eka eka) {
        final eka a = ejz.a(hyx, (List)Collections.singletonList(eka));
        if (a instanceof ejt) {
            return epf.p((double)a.h());
        }
        return -1;
    }
    
    public static boolean as(final aiqj aiqj, final String s) {
        return ((aicj)((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c.equals(s);
    }
    
    public static boolean ay(final aiqj aiqj) {
        return as(aiqj, "FElibrary");
    }
    
    public static Long q(final vfn vfn) {
        final Long value = -1L;
        Long n;
        if (vfn instanceof apys) {
            n = ((apys)vfn).getAddedTimestampMillis();
        }
        else if (vfn instanceof apyn) {
            n = ((apyn)vfn).getAddedTimestampMillis();
        }
        else if (vfn instanceof amar) {
            final amam c = ((amar)vfn).c();
            if (c != null) {
                return c.getAddedTimestampMillis();
            }
            n = value;
        }
        else {
            n = value;
            if (vfn instanceof alzj) {
                final alze c2 = ((alzj)vfn).c();
                if (c2 != null) {
                    return c2.getAddedTimestampMillis();
                }
                n = value;
            }
        }
        return n;
    }
    
    public static final asie r(final asht asht, final int n, final flk flk) {
        asie asie;
        if (flk == flk.a) {
            asie = asht.aF().J((asjr)new oqn((Comparator)aar.q, 7));
        }
        else {
            asie = asht.aF();
        }
        return asie.J((asjr)flq.b).J((asjr)new flp(n, 0));
    }
    
    public static final boolean s(final int n, final String s, final afft afft) {
        return (n != 156 && n != 306) || !afft.contains((Object)s);
    }
    
    public static final boolean t(final int n, final String s, final afft afft) {
        return (n != 155 && n != 261) || !afft.contains((Object)s);
    }
    
    public static final asht u(final List list, final ajhp ajhp) {
        return asht.U((Iterable)list).K((asjs)new fdp(ajhp, 4)).Z((asjr)new flq(2)).Z((asjr)flq.c);
    }
    
    public static final akhz y(final akhz akhz) {
        akhz.getClass();
        akia akia;
        if ((akia = akhz.f) == null) {
            akia = akia.a;
        }
        akii a;
        if (akia.b == 58173949) {
            a = (akii)akia.c;
        }
        else {
            a = akii.a;
        }
        if (a.c.size() == 0) {
            return null;
        }
        final ahbb ahbb = (ahbb)((ahbh)akhz).toBuilder();
        final ahaz builder = ((ahbh)aorf.a).createBuilder();
        final anyv a2 = anyv.a;
        builder.copyOnWrite();
        final aorf aorf = (aorf)builder.instance;
        a2.getClass();
        aorf.c = a2;
        aorf.b |= 0x1;
        final aorf k = (aorf)builder.build();
        final ArrayList o = agpi.O();
        akia akia2;
        if ((akia2 = ((akhz)ahbb.instance).f) == null) {
            akia2 = akia.a;
        }
        akii a3;
        if (akia2.b == 58173949) {
            a3 = (akii)akia2.c;
        }
        else {
            a3 = akii.a;
        }
        final ahbx c = a3.c;
        for (int i = 0; i < ((List)c).size(); ++i) {
            final akic akic = (akic)((List)c).get(i);
            aorj a4;
            if (akic.b == 58174010) {
                a4 = (aorj)akic.c;
            }
            else {
                a4 = aorj.a;
            }
            final boolean f = i == 0;
            final ahaz builder2 = ((ahbh)a4).toBuilder();
            builder2.copyOnWrite();
            final aorj aorj = (aorj)builder2.instance;
            aorj.b |= 0x8;
            aorj.f = f;
            aorj a5;
            if (akic.b == 58174010) {
                a5 = (aorj)akic.c;
            }
            else {
                a5 = aorj.a;
            }
            aorf aorf2;
            if ((aorf2 = a5.k) == null) {
                aorf2 = aorf.a;
            }
            anyv anyv;
            if ((anyv = aorf2.c) == null) {
                anyv = anyv.a;
            }
            Label_0565: {
                if (anyv.d.size() != 0) {
                    aorf aorf3;
                    if ((aorf3 = a5.k) == null) {
                        aorf3 = aorf.a;
                    }
                    anyv anyv2;
                    if ((anyv2 = aorf3.c) == null) {
                        anyv2 = anyv.a;
                    }
                    for (final anyy anyy : anyv2.d) {
                        if ((anyy.c & 0x10000) != 0x0) {
                            break Label_0565;
                        }
                        if ((anyy.e & 0x20) == 0x0) {
                            continue;
                        }
                        aimu aimu;
                        if ((aimu = anyy.bc) == null) {
                            aimu = aimu.a;
                        }
                        aimp aimp;
                        if ((aimp = aimu.c) == null) {
                            aimp = aimp.a;
                        }
                        final int av = aeuz.av(aimp.c);
                        if (av != 0 && av == 2) {
                            break Label_0565;
                        }
                    }
                }
                builder2.copyOnWrite();
                final aorj aorj2 = (aorj)builder2.instance;
                k.getClass();
                aorj2.k = k;
                aorj2.b |= 0x2000;
            }
            final ahaz builder3 = ((ahbh)akic).toBuilder();
            builder3.copyOnWrite();
            final akic akic2 = (akic)builder3.instance;
            final aorj c2 = (aorj)builder2.build();
            c2.getClass();
            akic2.c = c2;
            akic2.b = 58174010;
            o.add(builder3.build());
        }
        akia akia3;
        if ((akia3 = ((akhz)ahbb.instance).f) == null) {
            akia3 = akia.a;
        }
        akii a6;
        if (akia3.b == 58173949) {
            a6 = (akii)akia3.c;
        }
        else {
            a6 = akii.a;
        }
        final ahaz builder4 = ((ahbh)a6).toBuilder();
        builder4.copyOnWrite();
        ((akii)builder4.instance).c = akii.emptyProtobufList();
        builder4.copyOnWrite();
        final akii akii = (akii)builder4.instance;
        akii.a();
        agzk.addAll((Iterable)o, (List)akii.c);
        final akii c3 = (akii)builder4.build();
        akia akia4;
        if ((akia4 = ((akhz)ahbb.instance).f) == null) {
            akia4 = akia.a;
        }
        final ahaz builder5 = ((ahbh)akia4).toBuilder();
        builder5.copyOnWrite();
        final akia akia5 = (akia)builder5.instance;
        c3.getClass();
        akia5.c = c3;
        akia5.b = 58173949;
        ((ahaz)ahbb).copyOnWrite();
        final akhz akhz2 = (akhz)ahbb.instance;
        final akia f2 = (akia)builder5.build();
        f2.getClass();
        akhz2.f = f2;
        akhz2.b |= 0x40;
        return (akhz)((ahaz)ahbb).build();
    }
    
    public final ashi A() {
        return ((abpu)this.a).v();
    }
    
    public final ashi B() {
        return (ashi)((abpu)this.a).p().e;
    }
    
    public final Boolean C() {
        aiqw aiqw;
        if ((aiqw = ((vaf)this.b).b().v) == null) {
            aiqw = aiqw.a;
        }
        final boolean d = aiqw.d;
        final boolean b = false;
        if (!d) {
            aiqw aiqw2;
            if ((aiqw2 = ((vaf)this.b).b().v) == null) {
                aiqw2 = aiqw.a;
            }
            if (!aiqw2.h) {
                return false;
            }
        }
        boolean b2 = b;
        if (((abpu)this.a).n() != null) {
            b2 = b;
            if (((abpu)this.a).n().V()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final Long D() {
        final abpq n = ((abpu)this.a).n();
        abvx q;
        if (n != null) {
            q = n.q();
        }
        else {
            q = null;
        }
        if (q != null) {
            return q.c();
        }
        return null;
    }
    
    final void F(final ekg ekg) {
        final Iterator iterator = ekg.a.iterator();
        while (iterator.hasNext()) {
            ((Map<String, ekg>)this.b).put(((ekr)iterator.next()).toString(), ekg);
        }
    }
    
    public final FileOutputStream G(final Uri uri) {
        final OutputStream d = qle.d((Context)this.b, uri, qld.a);
        if (d instanceof FileOutputStream) {
            return (FileOutputStream)d;
        }
        throw new IOException("OutputStream instance is not FileOutputStream cls:".concat(String.valueOf(((FileOutputStream)d).getClass().getName())));
    }
    
    public final boolean H(final File file, final long n, final long n2, final FileOutputStream fileOutputStream) {
        fileOutputStream.getClass();
        return I(rdz.i((Context)this.b, Uri.fromFile(file), n, n2), fileOutputStream);
    }
    
    public final lja J() {
        final bu bu = (bu)((atke)this.b).a();
        bu.getClass();
        final aujg aujg = (aujg)((atke)this.a).a();
        aujg.getClass();
        return new lja(bu, aujg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void K(final apht apht) {
        this.L(apht, 1);
    }
    
    public final void L(final apht apht, final int n) {
        final int intValue = (int)Map$_EL.getOrDefault((Map)this.b, (Object)apht, (Object)0);
        if (intValue >= n) {
            return;
        }
        ((ueu)this.a).l(apht);
        ((Map<apht, Integer>)this.b).put(apht, Integer.valueOf(intValue + 1));
    }
    
    public final void M() {
        this.K(apht.aL);
    }
    
    public final void N(final aiqj aiqj) {
        if (!((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return;
        }
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x10) != 0x0) {
            this.W(reelWatchEndpointOuterClass$ReelWatchEndpoint.f).a = true;
        }
    }
    
    public final boolean O(final ReelWatchEndpointOuterClass$ReelWatchEndpoint c) {
        if ((c.b & 0x10) != 0x0) {
            this.W(c.f).c = c;
            return true;
        }
        return false;
    }
    
    public final aiqj P(final aiqj aiqj) {
        aiqj.getClass();
        aiqj aiqj2 = aiqj;
        if (((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            Object c2 = null;
            Label_0619: {
                if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x10) != 0x0) {
                    final String f = reelWatchEndpointOuterClass$ReelWatchEndpoint.f;
                    Object c = this.b;
                    synchronized (c) {
                        c2 = ((Map<K, abdo>)this.b).get(f);
                        monitorexit(c);
                        final String s = null;
                        if (c2 == null) {
                            c2 = null;
                        }
                        else {
                            c2 = ((abdo)c2).c;
                        }
                        if (c2 != null) {
                            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)c2;
                            c = s;
                            if (reelWatchEndpointOuterClass$ReelWatchEndpoint2.h.isEmpty()) {
                                c = s;
                                if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x40) != 0x0) {
                                    c = ((ahbh)c2).toBuilder();
                                    final String h = reelWatchEndpointOuterClass$ReelWatchEndpoint.h;
                                    ((ahaz)c).copyOnWrite();
                                    final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint3 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahaz)c).instance;
                                    h.getClass();
                                    reelWatchEndpointOuterClass$ReelWatchEndpoint3.b |= 0x40;
                                    reelWatchEndpointOuterClass$ReelWatchEndpoint3.h = h;
                                }
                            }
                            int ca;
                            if ((ca = aqsx.ca(reelWatchEndpointOuterClass$ReelWatchEndpoint2.n)) == 0) {
                                ca = 1;
                            }
                            int ca2;
                            if ((ca2 = aqsx.ca(reelWatchEndpointOuterClass$ReelWatchEndpoint.n)) == 0) {
                                ca2 = 1;
                            }
                            if (ca != ca2 || !reelWatchEndpointOuterClass$ReelWatchEndpoint2.o.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint.o)) {
                                final ahaz ahaz;
                                if ((ahaz = (ahaz)c) == null) {
                                    ((ahbh)c2).toBuilder();
                                }
                                int ca3;
                                if ((ca3 = aqsx.ca(reelWatchEndpointOuterClass$ReelWatchEndpoint.n)) == 0) {
                                    ca3 = 1;
                                }
                                ((ahaz)c).copyOnWrite();
                                c = ((ahaz)c).instance;
                                ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)c).n = ca3 - 1;
                                ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)c).b |= 0x1000;
                                final String o = reelWatchEndpointOuterClass$ReelWatchEndpoint.o;
                                ((ahaz)c).copyOnWrite();
                                c = ((ahaz)c).instance;
                                o.getClass();
                                ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)c).b |= 0x2000;
                                ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)c).o = o;
                            }
                            int cc;
                            if ((cc = aqsx.cc(reelWatchEndpointOuterClass$ReelWatchEndpoint2.y)) == 0) {
                                cc = 1;
                            }
                            int cc2;
                            if ((cc2 = aqsx.cc(reelWatchEndpointOuterClass$ReelWatchEndpoint.y)) == 0) {
                                cc2 = 1;
                            }
                            c = c;
                            if (cc != cc2) {
                                if ((c = c) == null) {
                                    c = ((ahbh)c2).toBuilder();
                                }
                                int cc3;
                                if ((cc3 = aqsx.cc(reelWatchEndpointOuterClass$ReelWatchEndpoint.y)) == 0) {
                                    cc3 = 1;
                                }
                                ((ahaz)c).copyOnWrite();
                                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint4 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahaz)c).instance;
                                reelWatchEndpointOuterClass$ReelWatchEndpoint4.y = cc3 - 1;
                                reelWatchEndpointOuterClass$ReelWatchEndpoint4.b |= 0x2000000;
                            }
                            if (!reelWatchEndpointOuterClass$ReelWatchEndpoint2.C.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint.C)) {
                                if (c == null) {
                                    ((ahbh)c2).toBuilder();
                                }
                                c = reelWatchEndpointOuterClass$ReelWatchEndpoint.C;
                                ((ahaz)c).copyOnWrite();
                                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint5 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahaz)c).instance;
                                c.getClass();
                                reelWatchEndpointOuterClass$ReelWatchEndpoint5.b |= 0x20000000;
                                reelWatchEndpointOuterClass$ReelWatchEndpoint5.C = (String)c;
                            }
                            if (c != null) {
                                c2 = ((ahaz)c).build();
                            }
                            break Label_0619;
                        }
                    }
                }
                c2 = reelWatchEndpointOuterClass$ReelWatchEndpoint;
            }
            aiqj2 = aiqj;
            if (c2 != reelWatchEndpointOuterClass$ReelWatchEndpoint) {
                final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                ahbb.e((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, c2);
                if ((aiqj.b & 0x1) != 0x0) {
                    final ahab c3 = aiqj.c;
                    ((ahaz)ahbb).copyOnWrite();
                    final aiqj aiqj3 = (aiqj)ahbb.instance;
                    c3.getClass();
                    aiqj3.b |= 0x1;
                    aiqj3.c = c3;
                }
                if (((ahbc)aiqj).ry((ahaq)amqf.b)) {
                    ahbb.e((ahaq)amqf.b, (Object)((ahbc)aiqj).rx((ahaq)amqf.b));
                }
                aiqj2 = (aiqj)((ahaz)ahbb).build();
            }
        }
        return aiqj2;
    }
    
    public final void Q(final Object o, final Runnable runnable) {
        ((WeakHashMap)this.a).put(o, runnable);
    }
    
    public final void R(final int n, final aiqj aiqj, final boolean a) {
        aiqj.getClass();
        if (!((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return;
        }
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint c = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        if ((c.b & 0x10) != 0x0) {
            synchronized (this.b) {
                abdo abdo;
                if ((abdo = ((Map<K, abdo>)this.b).get(c.f)) == null) {
                    abdo = new abdo((short[])null);
                    ((Map<String, abdo>)this.b).put(c.f, abdo);
                }
                final int hashCode = c.hashCode();
                final int value = ((SparseIntArray)abdo.b).get(n);
                int n3;
                final int n2 = n3 = 0;
                if (value != 0) {
                    n3 = n2;
                    if (value != hashCode) {
                        n3 = 1;
                    }
                }
                if (n3 != 0) {
                    abdo.c = c;
                }
                if (value == 0 || n3 != 0) {
                    ((SparseIntArray)abdo.b).put(n, hashCode);
                    abdo.a = a;
                }
            }
        }
    }
    
    public final void S(final Object o) {
        ((WeakHashMap)this.a).remove(o);
    }
    
    public final void T(final aiqj aiqj) {
        aiqj.getClass();
        if (!((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return;
        }
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint c = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        if ((c.b & 0x10) != 0x0) {
            synchronized (this.b) {
                abdo abdo;
                if ((abdo = ((Map<K, abdo>)this.b).get(c.f)) == null) {
                    abdo = new abdo((short[])null);
                    ((Map<String, abdo>)this.b).put(c.f, abdo);
                }
                abdo.c = c;
            }
        }
    }
    
    public final boolean U(final aiqj aiqj) {
        aiqj.getClass();
        final boolean ry = ((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        final boolean b = false;
        if (ry) {
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x10) != 0x0) {
                synchronized (this.b) {
                    final abdo abdo = ((Map<K, abdo>)this.b).get(reelWatchEndpointOuterClass$ReelWatchEndpoint.f);
                    boolean b2 = b;
                    if (abdo != null) {
                        b2 = b;
                        if (abdo.a) {
                            b2 = true;
                        }
                    }
                    return b2;
                }
            }
        }
        return false;
    }
    
    public final void V(final aiqj aiqj) {
        aiqj.getClass();
        if (!((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return;
        }
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint c = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        if ((c.b & 0x10) != 0x0) {
            synchronized (this.b) {
                abdo abdo;
                if ((abdo = ((Map<K, abdo>)this.b).get(c.f)) == null) {
                    abdo = new abdo((short[])null);
                    ((Map<String, abdo>)this.b).put(c.f, abdo);
                }
                abdo.c = c;
                abdo.a = true;
            }
        }
    }
    
    public final kmi W(final String s) {
        kmi kmi;
        if ((kmi = ((Map<K, kmi>)this.a).get(s)) == null) {
            kmi = new kmi();
            ((Map<String, kmi>)this.a).put(s, kmi);
        }
        return kmi;
    }
    
    public final boolean X() {
        final ahaz builder = ((ahbh)amzr.a).createBuilder();
        final Object a = this.a;
        builder.copyOnWrite();
        final amzr amzr = (amzr)builder.instance;
        amzr.c = ((amzq)a).m;
        amzr.b |= 0x1;
        return ((adaj)this.b).d((amzr)builder.build());
    }
    
    public final void Y(final aiqj aiqj, final Map map, final alem alem) {
        final HashMap hashMap = new HashMap(map);
        hashMap.put("triggered_on_ui_ready", true);
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            if (iterator.next().j(aiqj, hashMap, alem)) {
                return;
            }
        }
        ((vcy)this.b).c(aiqj, (Map)hashMap);
    }
    
    public final gbv a(final amrl amrl, final Map map) {
        final gbv gbv = (gbv)((acwb)this.a).j();
        final int b = amrl.b;
        final View$OnClickListener view$OnClickListener = null;
        ajut ajut;
        if ((b & 0x1) != 0x0) {
            if ((ajut = amrl.c) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        gbv.k((CharSequence)acak.b(ajut));
        aida aida;
        if ((aida = amrl.d) == null) {
            aida = aida.a;
        }
        aicz aicz2;
        if ((aida.b & 0x1) != 0x0) {
            aida aida2;
            if ((aida2 = amrl.d) == null) {
                aida2 = aida.a;
            }
            aicz aicz;
            if ((aicz = aida2.c) == null) {
                aicz = aicz.a;
            }
            aicz2 = aicz;
        }
        else {
            aicz2 = null;
        }
        if (aicz2 != null) {
            ajut ajut2;
            if ((aicz2.b & 0x200) != 0x0) {
                if ((ajut2 = aicz2.i) == null) {
                    ajut2 = ajut.a;
                }
            }
            else {
                ajut2 = null;
            }
            final Spanned b2 = acak.b(ajut2);
            final int b3 = aicz2.b;
            Object o = null;
            Label_0251: {
                if ((0x8000 & b3) == 0x0) {
                    if ((b3 & 0x4000) == 0x0 && (b3 & 0x10000) == 0x0) {
                        o = view$OnClickListener;
                        break Label_0251;
                    }
                }
                o = new ezp(this, map, amrl, aicz2, 3, (byte[])null, (byte[])null);
            }
            ((acwc)gbv).m((CharSequence)b2, (View$OnClickListener)o);
        }
        return gbv;
    }
    
    public final boolean aA(final PaneDescriptor paneDescriptor) {
        return paneDescriptor != null && this.at(paneDescriptor) && ger.l(paneDescriptor.f());
    }
    
    public final hyi aB(final msr msr, final ViewGroup viewGroup, final int n, final int n2, final int n3, final hyg hyg, final afaq afaq, final Optional optional, final Optional optional2) {
        final Context context = (Context)((atke)this.b).a();
        context.getClass();
        final hzn hzn = (hzn)((atke)this.a).a();
        hzn.getClass();
        msr.getClass();
        viewGroup.getClass();
        hyg.getClass();
        afaq.getClass();
        return new hyi(context, hzn, msr, viewGroup, n, n2, n3, hyg, afaq, optional, optional2, null, null, null);
    }
    
    public final gja ab(final FloatingActionButton floatingActionButton) {
        final vcy vcy = (vcy)((atke)this.a).a();
        vcy.getClass();
        final acpk acpk = (acpk)((atke)this.b).a();
        acpk.getClass();
        floatingActionButton.getClass();
        return new gja(vcy, acpk, floatingActionButton);
    }
    
    public final adhi ac(final String s, final long n, final TimeUnit timeUnit) {
        final SharedPreferences sharedPreferences = (SharedPreferences)((atke)this.a).a();
        sharedPreferences.getClass();
        final oby oby = (oby)((atke)this.b).a();
        oby.getClass();
        timeUnit.getClass();
        return new adhi(sharedPreferences, oby, s, n, timeUnit);
    }
    
    public final boolean ad() {
        return ((fjv)this.a).j() != fkr.j;
    }
    
    public final int ae(final gdz gdz) {
        return ((List)this.b).indexOf(gdz);
    }
    
    public final boolean af(final gdz gdz) {
        return this.ae(gdz) != -1;
    }
    
    public final eka ag(final hyx hyx, final eka eka) {
        epf.af(hyx);
        if (eka instanceof ekb) {
            final ekb ekb = (ekb)eka;
            final ArrayList b = ekb.b;
            final String a = ekb.a;
            Object a2;
            if (((Map)this.b).containsKey(a)) {
                a2 = ((Map<K, ekg>)this.b).get(a);
            }
            else {
                a2 = this.a;
            }
            return ((ekg)a2).a(a, hyx, (List)b);
        }
        return eka;
    }
    
    public final aacn ai(final String s) {
        return (aacn)new ikm((Context)this.b, ((aabo)this.a).a(), s);
    }
    
    public final Optional aj(final Callable callable, final Runnable runnable) {
        final long ak = this.aK();
        runnable.run();
        final long n = this.aK() - ak;
        final long ak2 = this.aK();
        try {
            final Object call = callable.call();
            final long n2 = this.aK() - ak2;
            return Optional.of((Object)new ikb(call, n2 - n, n2, n));
        }
        catch (final Exception ex) {
            ttr.d("Failed to execute Offline Store data access call ", (Throwable)ex);
            return Optional.empty();
        }
    }
    
    public final void ak(final long n, final long n2, final long n3) {
        ((xao)this.a).v(almx.bW, "Offline data access latency diff", aL("offline_data_access_latency_diff", n));
        ((xao)this.a).v(almx.bW, "Offline Store access latency", aL("offline_store_access_latency", n2));
        ((xao)this.a).v(almx.bW, "Entity Store access latency", aL("entity_store_access_latency", n3));
    }
    
    public final ijf al() {
        return new ijf((atke)this.b);
    }
    
    public final iit am(final int n, final Class clazz, final aezf aezf) {
        final vdr vdr = (vdr)((atke)this.b).a();
        vdr.getClass();
        final hzn hzn = (hzn)((atke)this.a).a();
        hzn.getClass();
        aezf.getClass();
        return new iit(vdr, hzn, n, clazz, aezf, null, null, null);
    }
    
    public final iis an() {
        final asid asid = (asid)((atke)this.b).a();
        asid.getClass();
        final bhv bhv = (bhv)((atke)this.a).a();
        bhv.getClass();
        return new iis(asid, bhv, null, null, null);
    }
    
    public final aqfl ao() {
        final ahaz builder = ((ahbh)aqjf.a).createBuilder();
        if (((vai)this.b).ah()) {
            final boolean ah = ((vai)this.b).ah();
            builder.copyOnWrite();
            final aqjf aqjf = (aqjf)builder.instance;
            aqjf.b |= 0x20;
            aqjf.d = ah;
        }
        if (((vai)this.b).au()) {
            final boolean au = ((vai)this.b).au();
            builder.copyOnWrite();
            final aqjf aqjf2 = (aqjf)builder.instance;
            aqjf2.b |= 0x100;
            aqjf2.e = au;
        }
        if (((vai)this.a).aO()) {
            final boolean ao = ((vai)this.a).aO();
            builder.copyOnWrite();
            final aqjf aqjf3 = (aqjf)builder.instance;
            aqjf3.b |= 0x10;
            aqjf3.c = ao;
        }
        final ahbb ahbb = (ahbb)((ahbh)aqfl.a).createBuilder();
        final ahbf b = aqje.b;
        final ahaz builder2 = ((ahbh)aqje.a).createBuilder();
        builder2.copyOnWrite();
        final aqje aqje = (aqje)builder2.instance;
        final aqjf d = (aqjf)builder.build();
        d.getClass();
        aqje.d = d;
        aqje.c |= 0x2;
        ahbb.e((ahaq)b, (Object)builder2.build());
        return (aqfl)((ahaz)ahbb).build();
    }
    
    public final PaneDescriptor ap(final aiqj aiqj) {
        aiqj.getClass();
        adkp.H(((ahbc)aiqj).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint));
        return this.aq(aiqj, ger.l(aiqj));
    }
    
    public final PaneDescriptor aq(final aiqj aiqj, final boolean b) {
        return this.ar(aiqj, b, false, false);
    }
    
    public final PaneDescriptor ar(final aiqj aiqj, final boolean b, final boolean b2, final boolean b3) {
        aiqj.getClass();
        final Bundle a = PaneDescriptor.a();
        a.putBoolean("home_pane", b);
        a.putBoolean("detail_pane", b2);
        a.putBoolean("selection_panel_selection_changed", b3);
        a.putInt("network_connectivity_requirement", 2);
        PaneDescriptor paneDescriptor;
        if (b) {
            paneDescriptor = PaneDescriptor.c((Class)this.a, aiqj, a);
        }
        else {
            paneDescriptor = PaneDescriptor.c((Class)this.b, aiqj, a);
        }
        return paneDescriptor;
    }
    
    public final boolean at(final PaneDescriptor paneDescriptor) {
        return ((Class)this.b).isAssignableFrom(paneDescriptor.a);
    }
    
    public final boolean au(final PaneDescriptor paneDescriptor) {
        return this.at(paneDescriptor) && aM(paneDescriptor.f());
    }
    
    public final boolean av(final PaneDescriptor paneDescriptor) {
        if (this.at(paneDescriptor)) {
            final aiqj f = paneDescriptor.f();
            if (aM(f) && !((aicj)((ahbc)f).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).e.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean aw(final PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.a;
    }
    
    public final boolean ax(final PaneDescriptor paneDescriptor) {
        return paneDescriptor != null && this.at(paneDescriptor) && as(paneDescriptor.f(), "FEwhat_to_watch");
    }
    
    public final boolean az(final PaneDescriptor paneDescriptor) {
        return this.at(paneDescriptor) && ay(paneDescriptor.f());
    }
    
    public final ListenableFuture b(final boolean b) {
        return ((tmx)((atke)this.a).a()).b((aezf)new exf(b, 6));
    }
    
    public final void c() {
        ((elx)this.b).D((View)this.a);
    }
    
    public final int d(final String s, final int n) {
        final aezp aezp = (aezp)this.a;
        if (aezp.h()) {
            return ((SharedPreferences)aezp.c()).getInt(s, n);
        }
        final aezp aezp2 = (aezp)this.b;
        if (aezp2.h()) {
            return ((sqq)aezp2.c()).v(s, n);
        }
        return n;
    }
    
    public final boolean e(final String s) {
        final aezp aezp = (aezp)this.a;
        if (aezp.h()) {
            return ((SharedPreferences)aezp.c()).contains(s);
        }
        final aezp aezp2 = (aezp)this.b;
        return aezp2.h() && ((sqq)aezp2.c()).A(s);
    }
    
    public final boolean f(final String s) {
        final aezp aezp = (aezp)this.a;
        if (aezp.h()) {
            return ((SharedPreferences)aezp.c()).getBoolean(s, false);
        }
        final aezp aezp2 = (aezp)this.b;
        return aezp2.h() && ((sqq)aezp2.c()).B(s, false);
    }
    
    public final void g(final Rect rect) {
        ((ativ)this.b).tu((Object)rect);
    }
    
    public final void h(final Rect rect) {
        ((ativ)this.a).tu((Object)rect);
    }
    
    public final String i() {
        final boolean k = this.k();
        final String string = UUID.randomUUID().toString();
        ((Set<String>)this.a).add(string);
        if (!k) {
            this.aE();
        }
        return string;
    }
    
    public final void j(final String s) {
        final boolean k = this.k();
        ((Set)this.a).remove(s);
        if (this.k() != k) {
            this.aE();
        }
    }
    
    public final boolean k() {
        return !((Set)this.a).isEmpty();
    }
    
    public final ashn l(final vfp vfp, final String s, final String s2) {
        return this.aF(vfp, s, ajhp.b).R((asjr)new flo(this, vfp, s2, 3, null, null, null)).K((asjs)exh.o).Z((asjr)flq.k).j().w((asjr)new flo(this, vfp, s2, 0, null, null, null));
    }
    
    public final ashn m(final vfp vfp, final fls fls, final aezf aezf) {
        return ((flv)this.b).c().h((asjr)new flo(fls, vfp, aezf, 2));
    }
    
    public final asht n(final vfp vfp, final String s, final ajhp ajhp, final int n, final flk flk) {
        return asht.p((ashw)vfp.h(s, true).Z((asjr)new flq(9)).Z((asjr)new fdo(this, ajhp, 7, (byte[])null, (byte[])null, (byte[])null)), (ashw)((flv)this.b).b().ao((Object)afiq.a), (ashw)((flv)this.b).a().ao((Object)afiq.a), (asjn)new flr(vfp, 0)).Z((asjr)new vcc(n, flk, 1)).L((asjr)flq.i).A();
    }
    
    public final asie o(final vfp vfp, final String s) {
        return this.aG(vfp, s, ajhp.b).L((asjr)new fdg(vfp, 7)).aF().J((asjr)flq.b);
    }
    
    public final asie p(final vfp vfp, final String s, final ajhp ajhp, final int n, final flk flk) {
        return r(this.aG(vfp, s, ajhp), n, flk);
    }
    
    public final void v(final akei akei) {
        if (((Set<akei>)this.a).add(akei)) {
            ((acmr)this.b).d(new wye(akei.q, 7), ajtz.g);
        }
    }
    
    public final akhz w() {
        alke j;
        if (((fmr)this.a).i()) {
            final ahaz builder = akdk.a.createBuilder();
            final ahbb ahbb = (ahbb)((ahbh)akdi.a).createBuilder();
            final akdh l = akdh.l;
            ((ahaz)ahbb).copyOnWrite();
            final akdi akdi = (akdi)ahbb.instance;
            akdi.c = l.sy;
            akdi.b |= 0x1;
            builder.copyOnWrite();
            final akdk akdk = (akdk)builder.instance;
            final akdi c = (akdi)((ahaz)ahbb).build();
            c.getClass();
            akdk.c = c;
            akdk.b |= 0x1;
            final akdk f = (akdk)builder.build();
            final ahaz builder2 = ((ahbh)aivh.a).createBuilder();
            final ajut g = acak.g(new String[] { ((Context)this.b).getString(2132018040) });
            builder2.copyOnWrite();
            final aivh aivh = (aivh)builder2.instance;
            g.getClass();
            aivh.g = g;
            aivh.b |= 0x1;
            final ahaz builder3 = ((ahbh)aivj.a).createBuilder();
            builder3.copyOnWrite();
            final aivj aivj = (aivj)builder3.instance;
            f.getClass();
            aivj.f = f;
            aivj.b |= 0x80;
            builder2.copyOnWrite();
            final aivh aivh2 = (aivh)builder2.instance;
            final aivj i = (aivj)builder3.build();
            i.getClass();
            aivh2.i = i;
            aivh2.b |= 0x20;
            final ahaz builder4 = anhx.a.createBuilder();
            builder4.copyOnWrite();
            final anhx anhx = (anhx)builder4.instance;
            anhx.b |= 0x1;
            anhx.c = "PPSV";
            final anhx c2 = (anhx)builder4.build();
            final ahaz builder5 = ((ahbh)aive.a).createBuilder();
            builder5.copyOnWrite();
            final aive aive = (aive)builder5.instance;
            c2.getClass();
            aive.c = c2;
            aive.b = 135739232;
            builder2.copyOnWrite();
            final aivh aivh3 = (aivh)builder2.instance;
            final aive k = (aive)builder5.build();
            k.getClass();
            aivh3.k = k;
            aivh3.b |= 0x8000;
            final aiqj a = flh.a;
            builder2.copyOnWrite();
            final aivh aivh4 = (aivh)builder2.instance;
            a.getClass();
            aivh4.d = a;
            aivh4.c = 4;
            final ahbb ahbb2 = (ahbb)((ahbh)alke.a).createBuilder();
            final ahaz builder6 = ((ahbh)alkh.a).createBuilder();
            builder6.copyOnWrite();
            final alkh alkh = (alkh)builder6.instance;
            final aivh w = (aivh)builder2.build();
            w.getClass();
            alkh.w = w;
            alkh.b |= 0x1000;
            ahbb2.v(builder6);
            j = (alke)((ahaz)ahbb2).build();
        }
        else {
            j = null;
        }
        final ahaz builder7 = ((ahbh)aims.a).createBuilder();
        final ajut g2 = acak.g(new String[] { ((Context)this.b).getString(2132018039) });
        builder7.copyOnWrite();
        final aims aims = (aims)builder7.instance;
        g2.getClass();
        aims.c = g2;
        aims.b |= 0x1;
        final ahaz builder8 = ((ahbh)aimq.a).createBuilder();
        builder8.copyOnWrite();
        final aimq aimq = (aimq)builder8.instance;
        aimq.b |= 0x8;
        aimq.f = false;
        builder8.copyOnWrite();
        final aimq aimq2 = (aimq)builder8.instance;
        aimq2.b |= 0x2;
        aimq2.d = true;
        final ahaz builder9 = ((ahbh)aimv.a).createBuilder();
        builder9.copyOnWrite();
        final aimv aimv = (aimv)builder9.instance;
        aimv.c = 1;
        aimv.b |= 0x1;
        builder8.copyOnWrite();
        final aimq aimq3 = (aimq)builder8.instance;
        final aimv e = (aimv)builder9.build();
        e.getClass();
        aimq3.e = e;
        aimq3.b |= 0x4;
        builder7.copyOnWrite();
        final aims aims2 = (aims)builder7.instance;
        final aimq aimq4 = (aimq)builder8.build();
        aimq4.getClass();
        final ahbx d = aims2.d;
        if (!d.c()) {
            aims2.d = ahbh.mutableCopy(d);
        }
        aims2.d.add((Object)aimq4);
        final aims c3 = (aims)builder7.build();
        final ahaz builder10 = ((ahbh)aimu.a).createBuilder();
        final ahaz builder11 = ((ahbh)aimt.a).createBuilder();
        builder11.copyOnWrite();
        final aimt aimt = (aimt)builder11.instance;
        c3.getClass();
        aimt.c = c3;
        aimt.b = 140080728;
        builder10.copyOnWrite();
        final aimu aimu = (aimu)builder10.instance;
        final aimt d2 = (aimt)builder11.build();
        d2.getClass();
        aimu.d = d2;
        aimu.b |= 0x2;
        final ahaz builder12 = ((ahbh)aimp.a).createBuilder();
        builder12.copyOnWrite();
        final aimp aimp = (aimp)builder12.instance;
        aimp.c = 1;
        aimp.b |= 0x1;
        builder10.copyOnWrite();
        final aimu aimu2 = (aimu)builder10.instance;
        final aimp c4 = (aimp)builder12.build();
        c4.getClass();
        aimu2.c = c4;
        aimu2.b |= 0x1;
        builder10.copyOnWrite();
        final aimu aimu3 = (aimu)builder10.instance;
        final ahbx g3 = aimu3.g;
        if (!g3.c()) {
            aimu3.g = ahbh.mutableCopy(g3);
        }
        aimu3.g.add((Object)"PPSV");
        final aimu bc = (aimu)builder10.build();
        final ahaz builder13 = ((ahbh)anyy.a).createBuilder();
        builder13.copyOnWrite();
        final anyy anyy = (anyy)builder13.instance;
        bc.getClass();
        anyy.bc = bc;
        anyy.e |= 0x20;
        final anyy anyy2 = (anyy)builder13.build();
        if (j != null) {
            final ahaz builder14 = ((ahbh)anyy.a).createBuilder();
            builder14.copyOnWrite();
            final anyy anyy3 = (anyy)builder14.instance;
            anyy3.j = j;
            anyy3.b |= 0x10;
            return this.aI((anyy)builder14.build(), anyy2);
        }
        return this.aI(anyy2);
    }
    
    public final akhz x(final akhz akhz) {
        akhz.getClass();
        akia akia;
        if ((akia = akhz.f) == null) {
            akia = akia.a;
        }
        akii a;
        if (akia.b == 58173949) {
            a = (akii)akia.c;
        }
        else {
            a = akii.a;
        }
        if (a.c.size() == 0) {
            return null;
        }
        final ahbb ahbb = (ahbb)((ahbh)akhz).toBuilder();
        final ahbb ahbb2 = (ahbb)((ahbh)alke.a).createBuilder();
        final boolean i = ((fmr)this.a).i();
        final boolean s = akhz.s;
        final ahaz builder = ((ahbh)ahyk.a).createBuilder();
        final ahaz builder2 = ((ahbh)ahyl.a).createBuilder();
        final ahyi b = ahyi.b;
        builder2.copyOnWrite();
        final ahyl ahyl = (ahyl)builder2.instance;
        ahyl.c = b.g;
        ahyl.b |= 0x1;
        builder.copyOnWrite();
        final ahyk ahyk = (ahyk)builder.instance;
        final ahyl j = (ahyl)builder2.build();
        j.getClass();
        ahyk.j = j;
        ahyk.b |= 0x100;
        final ahaz builder3 = ((ahbh)ahym.a).createBuilder();
        akdh akdh;
        if (!s && !i) {
            akdh = akdh.x;
        }
        else {
            akdh = akdh.w;
        }
        builder3.copyOnWrite();
        final ahym ahym = (ahym)builder3.instance;
        ahym.c = akdh.sy;
        ahym.b |= 0x1;
        builder.copyOnWrite();
        final ahyk ahyk2 = (ahyk)builder.instance;
        final ahym d = (ahym)builder3.build();
        d.getClass();
        ahyk2.d = d;
        ahyk2.c = 3;
        if (i) {
            final ajut ah = this.aH(2132018877);
            builder.copyOnWrite();
            final ahyk ahyk3 = (ahyk)builder.instance;
            ah.getClass();
            ahyk3.e = ah;
            ahyk3.b |= 0x1;
            final ahbb ahbb3 = (ahbb)((ahbh)aiqj.a).createBuilder();
            ahbb3.e((ahaq)DownloadsPageEndpointOuterClass.downloadsPageEndpoint, (Object)ajhq.a);
            final aiqj aiqj = (aiqj)((ahaz)ahbb3).build();
            if (((fmr)this.a).o()) {
                final ajut ah2 = this.aH(2132018875);
                builder.copyOnWrite();
                final ahyk ahyk4 = (ahyk)builder.instance;
                ah2.getClass();
                ahyk4.e = ah2;
                ahyk4.b |= 0x1;
                final ajut ah3 = this.aH(2132018869);
                builder.copyOnWrite();
                final ahyk ahyk5 = (ahyk)builder.instance;
                ah3.getClass();
                ahyk5.f = ah3;
                ahyk5.b |= 0x2;
                final ahyj aj = aJ(3, this.aH(2132018873), aiqj);
                builder.copyOnWrite();
                final ahyk ahyk6 = (ahyk)builder.instance;
                aj.getClass();
                ahyk6.h = aj;
                ahyk6.b |= 0x40;
            }
            else if (((fmr)this.a).g()) {
                final ajut ah4 = this.aH(2132018868);
                builder.copyOnWrite();
                final ahyk ahyk7 = (ahyk)builder.instance;
                ah4.getClass();
                ahyk7.f = ah4;
                ahyk7.b |= 0x2;
                final ahyj aj2 = aJ(3, this.aH(2132018873), aiqj);
                builder.copyOnWrite();
                final ahyk ahyk8 = (ahyk)builder.instance;
                aj2.getClass();
                ahyk8.h = aj2;
                ahyk8.b |= 0x40;
            }
            else {
                final ajut ah5 = this.aH(2132018871);
                builder.copyOnWrite();
                final ahyk ahyk9 = (ahyk)builder.instance;
                ah5.getClass();
                ahyk9.f = ah5;
                ahyk9.b |= 0x2;
                final ahyj aj3 = aJ(3, this.aH(2132018874), aiqj);
                builder.copyOnWrite();
                final ahyk ahyk10 = (ahyk)builder.instance;
                aj3.getClass();
                ahyk10.h = aj3;
                ahyk10.b |= 0x40;
            }
        }
        else if (s) {
            final ajut ah6 = this.aH(2132018878);
            builder.copyOnWrite();
            final ahyk ahyk11 = (ahyk)builder.instance;
            ah6.getClass();
            ahyk11.e = ah6;
            ahyk11.b |= 0x1;
            final ajut ah7 = this.aH(2132018872);
            builder.copyOnWrite();
            final ahyk ahyk12 = (ahyk)builder.instance;
            ah7.getClass();
            ahyk12.f = ah7;
            ahyk12.b |= 0x2;
        }
        else {
            final ajut ah8 = this.aH(2132018876);
            builder.copyOnWrite();
            final ahyk ahyk13 = (ahyk)builder.instance;
            ah8.getClass();
            ahyk13.e = ah8;
            ahyk13.b |= 0x1;
            final ajut ah9 = this.aH(2132018870);
            builder.copyOnWrite();
            final ahyk ahyk14 = (ahyk)builder.instance;
            ah9.getClass();
            ahyk14.f = ah9;
            ahyk14.b |= 0x2;
        }
        final ahaz builder4 = RefreshCommandOuterClass$RefreshCommand.a.createBuilder();
        builder4.copyOnWrite();
        final RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = (RefreshCommandOuterClass$RefreshCommand)builder4.instance;
        refreshCommandOuterClass$RefreshCommand.c = 1;
        refreshCommandOuterClass$RefreshCommand.b |= 0x1;
        final RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand2 = (RefreshCommandOuterClass$RefreshCommand)builder4.build();
        final ahbb ahbb4 = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb4.e((ahaq)RefreshCommandOuterClass$RefreshCommand.refreshCommand, (Object)refreshCommandOuterClass$RefreshCommand2);
        final ahyj aj4 = aJ(14, this.aH(2132018890), (aiqj)((ahaz)ahbb4).build());
        builder.copyOnWrite();
        final ahyk ahyk15 = (ahyk)builder.instance;
        aj4.getClass();
        ahyk15.i = aj4;
        ahyk15.b |= 0x80;
        final ahyk u = (ahyk)builder.build();
        final ahaz builder5 = ((ahbh)alkh.a).createBuilder();
        builder5.copyOnWrite();
        final alkh alkh = (alkh)builder5.instance;
        u.getClass();
        alkh.U = u;
        alkh.f |= 0x2000;
        ahbb2.l((alkh)builder5.build());
        final alke k = (alke)((ahaz)ahbb2).build();
        final ahaz builder6 = ((ahbh)anyv.a).createBuilder();
        final ahaz builder7 = ((ahbh)anyy.a).createBuilder();
        builder7.copyOnWrite();
        final anyy anyy = (anyy)builder7.instance;
        k.getClass();
        anyy.j = k;
        anyy.b |= 0x10;
        builder6.bC(builder7);
        final anyv c = (anyv)builder6.build();
        final ahaz builder8 = ((ahbh)aorf.a).createBuilder();
        builder8.copyOnWrite();
        final aorf aorf = (aorf)builder8.instance;
        c.getClass();
        aorf.c = c;
        aorf.b |= 0x1;
        final aorf l = (aorf)builder8.build();
        akia akia2;
        if ((akia2 = akhz.f) == null) {
            akia2 = akia.a;
        }
        akii a2;
        if (akia2.b == 58173949) {
            a2 = (akii)akia2.c;
        }
        else {
            a2 = akii.a;
        }
        final ahaz builder9 = ((ahbh)a2).toBuilder();
        builder9.copyOnWrite();
        ((akii)builder9.instance).c = akii.emptyProtobufList();
        final ahaz builder10 = ((ahbh)akic.a).createBuilder();
        final akic akic = (akic)a2.c.get(0);
        aorj a3;
        if (akic.b == 58174010) {
            a3 = (aorj)akic.c;
        }
        else {
            a3 = aorj.a;
        }
        final ahaz builder11 = ((ahbh)a3).toBuilder();
        builder11.copyOnWrite();
        final aorj aorj = (aorj)builder11.instance;
        l.getClass();
        aorj.k = l;
        aorj.b |= 0x2000;
        builder11.copyOnWrite();
        final aorj aorj2 = (aorj)builder11.instance;
        aorj2.b |= 0x8;
        aorj2.f = true;
        final String string = ((Context)this.b).getString(2132018830);
        builder11.copyOnWrite();
        final aorj aorj3 = (aorj)builder11.instance;
        string.getClass();
        aorj3.b |= 0x4;
        aorj3.e = string;
        builder10.copyOnWrite();
        final akic akic2 = (akic)builder10.instance;
        final aorj c2 = (aorj)builder11.build();
        c2.getClass();
        akic2.c = c2;
        akic2.b = 58174010;
        builder9.aR(builder10);
        final akii c3 = (akii)builder9.build();
        akia akia3;
        if ((akia3 = ((akhz)ahbb.instance).f) == null) {
            akia3 = akia.a;
        }
        final ahaz builder12 = ((ahbh)akia3).toBuilder();
        builder12.copyOnWrite();
        final akia akia4 = (akia)builder12.instance;
        c3.getClass();
        akia4.c = c3;
        akia4.b = 58173949;
        ((ahaz)ahbb).copyOnWrite();
        final akhz akhz2 = (akhz)ahbb.instance;
        final akia f = (akia)builder12.build();
        f.getClass();
        akhz2.f = f;
        akhz2.b |= 0x40;
        return (akhz)((ahaz)ahbb).build();
    }
    
    public final eyz z(final fcm fcm) {
        final bu bu = (bu)((atke)this.b).a();
        bu.getClass();
        final hof hof = (hof)((atke)this.a).a();
        hof.getClass();
        fcm.getClass();
        return new eyz(bu, hof, fcm, 4);
    }
}
