import android.content.res.Configuration;
import java.util.Comparator;
import java.util.Collections;
import java.text.Collator;
import java.util.Set;
import java.util.HashMap;
import android.content.ClipData;
import android.content.ClipboardManager;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEndpoint;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import android.support.v7.widget.LinearLayoutManager;
import android.content.Context;
import java.util.concurrent.Callable;
import android.view.View$OnClickListener;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import android.content.res.Resources;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import android.widget.TextView;
import android.view.View;
import java.util.concurrent.ExecutorService;
import android.support.v7.widget.RecyclerView;
import android.content.pm.PackageManager;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public abstract class adbu extends bi
{
    private ahvs ae;
    private Future af;
    private veh ag;
    public PackageManager ah;
    public xab ai;
    public RecyclerView aj;
    public thg ak;
    public ExecutorService al;
    public vbo am;
    private View an;
    private TextView ao;
    private TextView ap;
    private View aq;
    private TopPeekingScrollView ar;
    private adfd as;
    
    private final int aK() {
        final Resources nw = ((br)this).nW();
        int n;
        if (nw.getConfiguration().orientation == 1) {
            n = nw.getInteger(2131493084);
        }
        else {
            n = nw.getInteger(2131493083);
        }
        return n;
    }
    
    private static List aL(final List list, final Map map, final PackageManager packageManager, final aisc aisc) {
        final ArrayList list2 = new ArrayList();
        for (final aoeu aoeu : list) {
            aoes aoes;
            if ((aoes = aoeu.c) == null) {
                aoes = aoes.a;
            }
            aisc aisc2;
            if ((aisc2 = aoes.b) == null) {
                aisc2 = aisc.a;
            }
            final Iterator iterator2 = tqf.P(map, (Object)adfa.a(aisc2)).iterator();
            while (iterator2.hasNext()) {
                final ResolveInfo resolveInfo = (ResolveInfo)iterator2.next();
                aoes aoes2;
                if ((aoes2 = aoeu.c) == null) {
                    aoes2 = aoes.a;
                }
                list2.add(new adfa(packageManager, resolveInfo, aisc, aoes2.c.I()));
                iterator2.remove();
            }
        }
        return list2;
    }
    
    public static aoey aP(final aklg aklg) {
        ajbj ajbj;
        if ((ajbj = aklg.c) == null) {
            ajbj = ajbj.a;
        }
        if ((ajbj.b & 0x1) != 0x0) {
            ajbj ajbj2;
            if ((ajbj2 = aklg.c) == null) {
                ajbj2 = ajbj.a;
            }
            aoey aoey;
            if ((aoey = ajbj2.c) == null) {
                aoey = aoey.a;
            }
            return aoey;
        }
        return null;
    }
    
    private final List sE() {
        List<?> list = null;
        try {
            list = this.af.get();
            return list;
        }
        catch (final InterruptedException list) {}
        catch (final ExecutionException list) {}
        catch (final CancellationException ex) {}
        tut.d("Error retrieving share-capable activities.", (Throwable)list);
        return new ArrayList();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131625371, viewGroup, false);
        this.an = inflate;
        this.ao = (TextView)inflate.findViewById(2131432096);
        this.ap = (TextView)this.an.findViewById(2131428491);
        this.aq = this.an.findViewById(2131430218);
        this.ar = (TopPeekingScrollView)this.an.findViewById(2131428427);
        this.aj = (RecyclerView)this.an.findViewById(2131431408);
        anc.N(this.aq, (akx)new adbs(this));
        this.aq.setOnClickListener((View$OnClickListener)new acvy(this, 6));
        this.ar.f(((br)this).nW().getDimensionPixelSize(2131169559));
        final TopPeekingScrollView ar = this.ar;
        ar.l = this.aq;
        ar.m = (View)this.aj;
        return this.an;
    }
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        this.ah = ((br)this).oa().getPackageManager();
        amkj amkj;
        if ((amkj = this.am.b().i) == null) {
            amkj = amkj.a;
        }
        ahvs ae;
        if ((ae = amkj.m) == null) {
            ae = ahvs.a;
        }
        this.ae = ae;
        final aisc b = vek.b(((br)this).m.getByteArray("navigation_endpoint"));
        final xab ao = this.aO();
        this.ai = ao;
        final xbg b2 = xbf.b(10337);
        final aoey aoey = null;
        ao.b(b2, b, (alji)null);
        this.af = this.al.submit((Callable<Object>)new zms(this, 11));
        final veh am = this.aM();
        am.getClass();
        this.ag = am;
        this.as = new adfd((Context)((br)this).oa(), this.ag, this.ai, (bi)this, this.aK(), this.ak);
        this.aj.af((nx)new LinearLayoutManager());
        this.aj.ac((nr)this.as.b);
        this.aj.aC((hy)new adbt((Context)((br)this).oa()));
        aoey aoey2 = aoey;
        if (((br)this).m.containsKey("share_panel")) {
            try {
                aoey2 = (aoey)adzw.az(((br)this).m, "share_panel", (MessageLite)aoey.a, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahds ahds) {
                znh.c(zng.a, znf.o, "Failed to parse old share panel from byte array", (Throwable)ahds);
                aoey2 = aoey;
            }
        }
        final ShareEndpointOuterClass$ShareEndpoint shareEndpointOuterClass$ShareEndpoint = (ShareEndpointOuterClass$ShareEndpoint)((ahcu)b).rx((ahci)ShareEndpointOuterClass$ShareEndpoint.shareEndpoint);
        if (aoey2 != null) {
            this.aS(aoey2);
            return;
        }
        if (!shareEndpointOuterClass$ShareEndpoint.c.isEmpty()) {
            aklg a;
            if ((a = (aklg)wbe.y(shareEndpointOuterClass$ShareEndpoint.c, ((ahcz)aklg.a).getParserForType())) == null) {
                a = aklg.a;
            }
            this.aS(aP(a));
            return;
        }
        if (!shareEndpointOuterClass$ShareEndpoint.b.isEmpty()) {
            final String b3 = shareEndpointOuterClass$ShareEndpoint.b;
            this.ak.d((Object)new ffs());
            final vqe an = this.aN();
            final List b4 = adfe.b((Collection)this.sE(), this.ae);
            final wdr wdr = new wdr(this, 8);
            final vqj vqj = new vqj(an.c, an.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            vqj.a = b3;
            vqj.b = b4;
            ((vny)an).c((MessageLite)aklg.a, an.f, (tdm)vqb.a, (tdl)vot.o).e((vmz)vqj, (zrb)wdr);
            return;
        }
        throw new IllegalArgumentException("Invalid share endpoint provided.");
    }
    
    protected abstract veh aM();
    
    protected abstract vqe aN();
    
    protected abstract xab aO();
    
    public final void aQ(final String s) {
        final bu oa = ((br)this).oa();
        ((ClipboardManager)((Context)oa).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text/plain", (CharSequence)s));
        tqf.x((Context)oa, 2132019690, 0);
    }
    
    public final void aS(final aoey aoey) {
        final thg ak = this.ak;
        aoey.d.size();
        aoey.e.size();
        ak.d((Object)new ffv());
        this.ai.D((xbe)new wzy(aoey.k));
        final TextView ao = this.ao;
        ajws ajws;
        if ((aoey.b & 0x4) != 0x0) {
            if ((ajws = aoey.f) == null) {
                ajws = ajws.a;
            }
        }
        else {
            ajws = null;
        }
        ao.setText((CharSequence)acbu.b(ajws));
        aoeq aoeq;
        if ((aoey.b & 0x10) != 0x0) {
            aoer aoer;
            if ((aoer = aoey.h) == null) {
                aoer = aoer.a;
            }
            if ((aoeq = aoer.b) == null) {
                aoeq = aoeq.a;
            }
        }
        else {
            aoeq = null;
        }
        if (aoeq == null) {
            final TextView ap = this.ap;
            ajws ajws2;
            if ((aoey.b & 0x8) != 0x0) {
                if ((ajws2 = aoey.g) == null) {
                    ajws2 = ajws.a;
                }
            }
            else {
                ajws2 = null;
            }
            ap.setText((CharSequence)acbu.b(ajws2));
            this.ap.setOnClickListener((View$OnClickListener)new zig(this, aoey, 9));
        }
        else {
            final TextView ap2 = this.ap;
            ajws ajws3;
            if ((aoeq.b & 0x1) != 0x0) {
                if ((ajws3 = aoeq.c) == null) {
                    ajws3 = ajws.a;
                }
            }
            else {
                ajws3 = null;
            }
            ap2.setText((CharSequence)acbu.b(ajws3));
            this.ap.setOnClickListener((View$OnClickListener)new zig(this, aoeq, 10));
        }
        this.ap.setVisibility(0);
        final HashMap hashMap = new HashMap();
        for (final ResolveInfo resolveInfo : this.sE()) {
            tqf.Q((Map)hashMap, (Object)resolveInfo.activityInfo.applicationInfo.packageName, (Object)resolveInfo);
        }
        aisc aisc;
        if ((aisc = aoey.i) == null) {
            aisc = aisc.a;
        }
        final List al = aL((List)aoey.d, hashMap, this.ah, aisc);
        final List al2 = aL((List)aoey.e, hashMap, this.ah, aisc);
        final ArrayList list = new ArrayList();
        final Iterator iterator2 = hashMap.values().iterator();
        while (iterator2.hasNext()) {
            final Iterator iterator3 = ((Set)iterator2.next()).iterator();
            while (iterator3.hasNext()) {
                list.add(new adfa(this.ah, (ResolveInfo)iterator3.next(), aisc, aoey.j.I()));
            }
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new lcs(Collator.getInstance(), 5));
        al2.addAll(list);
        final adfd as = this.as;
        ((List)as.d).clear();
        ((List<Object>)as.d).addAll(al);
        ((List)as.e).clear();
        ((List<Object>)as.e).addAll(al2);
        as.a();
        this.ai.t((xbe)new wzy(aoey.k), (alji)null);
    }
    
    public final void nl() {
        this.ak.d((Object)new ffu());
        super.nl();
    }
    
    public final void nm() {
        this.ak.d((Object)new fft());
        super.nm();
    }
    
    public final void ol(final Bundle bundle) {
        super.ol(bundle);
        this.mZ(2, 16973840);
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final adfd as = this.as;
        final int ak = this.aK();
        adme.K(ak > 0);
        if (as.a == ak) {
            return;
        }
        as.a = ak;
        as.a();
    }
}
