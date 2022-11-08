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
public abstract class acye extends bi
{
    private ahsb ae;
    private Future af;
    private vax ag;
    public PackageManager ah;
    public wwv ai;
    public RecyclerView aj;
    public tdz ak;
    public ExecutorService al;
    public uyf am;
    private View an;
    private TextView ao;
    private TextView ap;
    private View aq;
    private TopPeekingScrollView ar;
    private adbo as;
    
    private final int aK() {
        final Resources nz = ((br)this).nZ();
        int n;
        if (nz.getConfiguration().orientation == 1) {
            n = nz.getInteger(2131493080);
        }
        else {
            n = nz.getInteger(2131493079);
        }
        return n;
    }
    
    private static List aL(final List list, final Map map, final PackageManager packageManager, final aioe aioe) {
        final ArrayList list2 = new ArrayList();
        for (final aoal aoal : list) {
            aoaj aoaj;
            if ((aoaj = aoal.c) == null) {
                aoaj = aoaj.a;
            }
            aioe aioe2;
            if ((aioe2 = aoaj.b) == null) {
                aioe2 = aioe.a;
            }
            final Iterator iterator2 = tmy.P(map, (Object)adbl.a(aioe2)).iterator();
            while (iterator2.hasNext()) {
                final ResolveInfo resolveInfo = (ResolveInfo)iterator2.next();
                aoaj aoaj2;
                if ((aoaj2 = aoal.c) == null) {
                    aoaj2 = aoaj.a;
                }
                list2.add(new adbl(packageManager, resolveInfo, aioe, aoaj2.c.I()));
                iterator2.remove();
            }
        }
        return list2;
    }
    
    public static aoap aP(final akhc akhc) {
        aixg aixg;
        if ((aixg = akhc.c) == null) {
            aixg = aixg.a;
        }
        if ((aixg.b & 0x1) != 0x0) {
            aixg aixg2;
            if ((aixg2 = akhc.c) == null) {
                aixg2 = aixg.a;
            }
            aoap aoap;
            if ((aoap = aixg2.c) == null) {
                aoap = aoap.a;
            }
            return aoap;
        }
        return null;
    }
    
    private final List sy() {
        List<?> list = null;
        try {
            list = this.af.get();
            return list;
        }
        catch (final InterruptedException list) {}
        catch (final ExecutionException list) {}
        catch (final CancellationException ex) {}
        trn.d("Error retrieving share-capable activities.", (Throwable)list);
        return new ArrayList();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131625364, viewGroup, false);
        this.an = inflate;
        this.ao = (TextView)inflate.findViewById(2131432092);
        this.ap = (TextView)this.an.findViewById(2131428491);
        this.aq = this.an.findViewById(2131430218);
        this.ar = (TopPeekingScrollView)this.an.findViewById(2131428427);
        this.aj = (RecyclerView)this.an.findViewById(2131431404);
        ana.N(this.aq, (akv)new acyc(this));
        this.aq.setOnClickListener((View$OnClickListener)new acsj(this, 6));
        this.ar.f(((br)this).nZ().getDimensionPixelSize(2131169521));
        final TopPeekingScrollView ar = this.ar;
        ar.l = this.aq;
        ar.m = (View)this.aj;
        return this.an;
    }
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        this.ah = ((br)this).od().getPackageManager();
        amga amga;
        if ((amga = this.am.b().i) == null) {
            amga = amga.a;
        }
        ahsb ae;
        if ((ae = amga.m) == null) {
            ae = ahsb.a;
        }
        this.ae = ae;
        final aioe b = vba.b(((br)this).m.getByteArray("navigation_endpoint"));
        final wwv ao = this.aO();
        this.ai = ao;
        final wyb b2 = wya.b(10337);
        final aoap aoap = null;
        ao.b(b2, b, (alff)null);
        this.af = this.al.submit((Callable<Object>)new wzu(this, 20));
        final vax am = this.aM();
        am.getClass();
        this.ag = am;
        this.as = new adbo((Context)((br)this).od(), this.ag, this.ai, this, this.aK(), this.ak);
        this.aj.af((nw)new LinearLayoutManager());
        this.aj.ac((nq)this.as.b);
        this.aj.aC((hy)new acyd((Context)((br)this).od()));
        aoap aoap2 = aoap;
        if (((br)this).m.containsKey("share_panel")) {
            try {
                aoap2 = (aoap)aeda.aq(((br)this).m, "share_panel", (MessageLite)aoap.a, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahab ahab) {
                zjp.c(zjo.a, zjn.o, "Failed to parse old share panel from byte array", (Throwable)ahab);
                aoap2 = aoap;
            }
        }
        final ShareEndpointOuterClass$ShareEndpoint shareEndpointOuterClass$ShareEndpoint = (ShareEndpointOuterClass$ShareEndpoint)((agzd)b).rr((agyr)ShareEndpointOuterClass$ShareEndpoint.shareEndpoint);
        if (aoap2 != null) {
            this.aS(aoap2);
            return;
        }
        if (!shareEndpointOuterClass$ShareEndpoint.c.isEmpty()) {
            akhc a;
            if ((a = (akhc)vwh.n(shareEndpointOuterClass$ShareEndpoint.c, ((agzi)akhc.a).getParserForType())) == null) {
                a = akhc.a;
            }
            this.aS(aP(a));
            return;
        }
        if (!shareEndpointOuterClass$ShareEndpoint.b.isEmpty()) {
            final String b3 = shareEndpointOuterClass$ShareEndpoint.b;
            this.ak.d((Object)new ffj());
            final vmt an = this.aN();
            final List e = adbp.e(this.sy(), this.ae);
            final waj waj = new waj(this, 6);
            final vmx vmx = new vmx(an.c, an.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            vmx.a = b3;
            vmx.b = e;
            ((vkm)an).c((MessageLite)akhc.a, an.f, (tad)vmq.a, (tac)vlh.o).e((vjn)vmx, (znj)waj);
            return;
        }
        throw new IllegalArgumentException("Invalid share endpoint provided.");
    }
    
    protected abstract vax aM();
    
    protected abstract vmt aN();
    
    protected abstract wwv aO();
    
    public final void aQ(final String s) {
        final bu od = ((br)this).od();
        ((ClipboardManager)((Context)od).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text/plain", (CharSequence)s));
        tmy.x((Context)od, 2132019687, 0);
    }
    
    public final void aS(final aoap aoap) {
        final tdz ak = this.ak;
        aoap.d.size();
        aoap.e.size();
        ak.d((Object)new ffm());
        this.ai.D((wxz)new wws(aoap.k));
        final TextView ao = this.ao;
        ajsq ajsq;
        if ((aoap.b & 0x4) != 0x0) {
            if ((ajsq = aoap.f) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        ao.setText((CharSequence)abyh.b(ajsq));
        aoah aoah;
        if ((aoap.b & 0x10) != 0x0) {
            aoai aoai;
            if ((aoai = aoap.h) == null) {
                aoai = aoai.a;
            }
            if ((aoah = aoai.b) == null) {
                aoah = aoah.a;
            }
        }
        else {
            aoah = null;
        }
        if (aoah == null) {
            final TextView ap = this.ap;
            ajsq ajsq2;
            if ((aoap.b & 0x8) != 0x0) {
                if ((ajsq2 = aoap.g) == null) {
                    ajsq2 = ajsq.a;
                }
            }
            else {
                ajsq2 = null;
            }
            ap.setText((CharSequence)abyh.b(ajsq2));
            this.ap.setOnClickListener((View$OnClickListener)new aafm(this, aoap, 8));
        }
        else {
            final TextView ap2 = this.ap;
            ajsq ajsq3;
            if ((aoah.b & 0x1) != 0x0) {
                if ((ajsq3 = aoah.c) == null) {
                    ajsq3 = ajsq.a;
                }
            }
            else {
                ajsq3 = null;
            }
            ap2.setText((CharSequence)abyh.b(ajsq3));
            this.ap.setOnClickListener((View$OnClickListener)new aafm(this, aoah, 9));
        }
        this.ap.setVisibility(0);
        final HashMap hashMap = new HashMap();
        for (final ResolveInfo resolveInfo : this.sy()) {
            tmy.Q((Map)hashMap, (Object)resolveInfo.activityInfo.applicationInfo.packageName, (Object)resolveInfo);
        }
        aioe aioe;
        if ((aioe = aoap.i) == null) {
            aioe = aioe.a;
        }
        final List al = aL((List)aoap.d, hashMap, this.ah, aioe);
        final List al2 = aL((List)aoap.e, hashMap, this.ah, aioe);
        final ArrayList list = new ArrayList();
        final Iterator iterator2 = hashMap.values().iterator();
        while (iterator2.hasNext()) {
            final Iterator iterator3 = ((Set)iterator2.next()).iterator();
            while (iterator3.hasNext()) {
                list.add(new adbl(this.ah, (ResolveInfo)iterator3.next(), aioe, aoap.j.I()));
            }
        }
        Collections.sort((List<Object>)list, new lbi(Collator.getInstance(), 5));
        al2.addAll(list);
        final adbo as = this.as;
        ((List)as.d).clear();
        ((List<Object>)as.d).addAll(al);
        ((List)as.e).clear();
        ((List<Object>)as.e).addAll(al2);
        as.a();
        this.ai.t((wxz)new wws(aoap.k), (alff)null);
    }
    
    public final void no() {
        this.ak.d((Object)new ffl());
        super.no();
    }
    
    public final void np() {
        this.ak.d((Object)new ffk());
        super.np();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final adbo as = this.as;
        final int ak = this.aK();
        agot.u(ak > 0);
        if (as.a == ak) {
            return;
        }
        as.a = ak;
        as.a();
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.nc(2, 16973840);
    }
}
