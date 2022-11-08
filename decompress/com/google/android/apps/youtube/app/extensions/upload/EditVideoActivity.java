// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.upload;

import java.util.List;
import java.util.Collection;
import android.support.v7.widget.Toolbar;
import android.content.Intent;
import java.util.Iterator;
import android.net.Uri;
import com.google.android.libraries.youtube.engagementpanel.size.EngagementPanelSizeBehavior;
import android.view.View$OnTouchListener;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.UUID;
import android.text.TextUtils;
import com.google.protobuf.MessageLite;
import android.app.Activity;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;

public class EditVideoActivity extends htb implements hst, rky, tec
{
    public gbq A;
    public hsx B;
    public boolean C;
    public boolean D;
    public uyi E;
    public woj F;
    public adno G;
    public khz H;
    public adcr I;
    public aagm J;
    public zhb K;
    public sin L;
    public addr M;
    private ViewAnimatorHelper al;
    private LoadingFrameLayout am;
    private ajje an;
    private zer ao;
    private byte[] ap;
    private final asib aq;
    public aftr g;
    public gau h;
    public vax i;
    public zki j;
    public vjl k;
    public zei l;
    public gbn m;
    public asho n;
    public hsv o;
    public zfs p;
    public hsn q;
    public acup r;
    public Executor s;
    public atjj t;
    public gko u;
    public View v;
    public String w;
    public akrj x;
    public boolean y;
    public String z;
    
    public EditVideoActivity() {
        this.aq = new asib();
        this.C = false;
        this.D = false;
    }
    
    private final void G() {
        final gbq a = this.A;
        if (a != null) {
            this.m.l((actz)a);
            this.h.e(true);
        }
    }
    
    private final void H() {
        this.u();
        this.getWindow().setNavigationBarColor(tmy.cn((Context)this, 2130968777));
        ((fa)this).findViewById(2131428784).setVisibility(0);
    }
    
    public final void f(final ajje an) {
        this.an = an;
        this.ao = this.o.b(an);
        ((fa)this).findViewById(2131428784).setVisibility(4);
    }
    
    protected final void g(final gkm gkm) {
        if (gkm == gkm.b) {
            ((fa)this).setTheme(2132084278);
        }
    }
    
    public final void h() {
    }
    
    public final void i() {
        final zer ao = this.ao;
        if (ao != null && ao.ar()) {
            this.o.d();
            ((fa)this).findViewById(2131428784).setVisibility(0);
            return;
        }
        super.onBackPressed();
    }
    
    public final void j() {
        this.H();
    }
    
    public final int k() {
        return 2131430798;
    }
    
    public final View l() {
        return (View)this.q.b;
    }
    
    public final ViewAnimatorHelper m() {
        return this.al;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zkx zkx = (zkx)o;
            this.finish();
            array = null;
        }
        else {
            array = new Class[] { zkx.class };
        }
        return array;
    }
    
    public final aexq o() {
        return (aexq)aewp.a;
    }
    
    public final void onBackPressed() {
        final zer ao = this.ao;
        if (ao != null && ao.ar()) {
            this.o.d();
            ((fa)this).findViewById(2131428784).setVisibility(0);
            return;
        }
        super.onBackPressed();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o.i();
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (this.E.aT()) {
            int theme;
            if (this.u.a() == gkm.b) {
                theme = 2132084279;
            }
            else {
                theme = 2132084280;
            }
            ((fa)this).setTheme(theme);
        }
        ((dh)this).getLifecycle().b((aul)this.t.a());
        ((qt)this).setContentView(this.v);
        this.q.a((Activity)this);
        this.u();
        if (bundle != null) {
            this.z = bundle.getString("edit_video_activity_instance_uuid_key");
            if (!this.ah.an()) {
                final byte[] byteArray = bundle.getByteArray("get_metadata_editor_response_key");
                if (byteArray != null) {
                    final vjl k = this.k;
                    final akrj a = akrj.a;
                    a.getClass();
                    if ((this.x = (akrj)k.a(byteArray, (MessageLite)a)) == null) {
                        throw new RuntimeException("Failed to parse a known parcelable proto");
                    }
                }
            }
            this.ao = (zer)((bu)this).getSupportFragmentManager().g(bundle, "thumbnailFragmentTag");
            if (this.o.h()) {
                final byte[] byteArray2 = bundle.getByteArray("edit_thumbnail_command_key");
                if (byteArray2 != null) {
                    this.an = (ajje)this.k.a(byteArray2, (MessageLite)ajje.a);
                }
                this.o.f(bundle, this.an, this.ao, (zfb)null);
            }
            this.p.j(bundle);
        }
        if (TextUtils.isEmpty((CharSequence)this.z)) {
            this.z = UUID.randomUUID().toString();
        }
        if (this.ah.an()) {
            final hmi hmi = new hmi(this, 14);
            tcp.n((aum)this, this.J.b(), (trb)new hks((Runnable)hmi, 12), (trb)new fcy(this, (Runnable)hmi, 16));
        }
        this.r.g(((fa)this).findViewById(16908290));
        this.al = (ViewAnimatorHelper)((fa)this).findViewById(2131432359);
        this.am = (LoadingFrameLayout)((fa)this).findViewById(2131428783);
        this.h.f((BottomUiContainer)((fa)this).findViewById(2131427886));
        final woj f = this.F;
        final AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout)f.a.findViewById(f.d);
        accessibilityLayerLayout.b(f.a.findViewById(2131428812));
        final View viewById = accessibilityLayerLayout.findViewById(2131427617);
        final RelativeLayout relativeLayout = (RelativeLayout)viewById.findViewById(2131427616);
        relativeLayout.getClass();
        f.b.i(relativeLayout, (RelativeLayout)null);
        relativeLayout.setOnTouchListener((View$OnTouchListener)gmg.d);
        final EngagementPanelSizeBehavior b = f.b.g().b;
        b.w(f.b.g(), (View)relativeLayout);
        tmy.aF((View)relativeLayout, tmy.ar((aeh)b), (Class)aej.class);
        f.c.c(f.b.g().o.al((asix)new hrk(relativeLayout, 6)));
        (f.e = f.b.D()).g((tpf)f);
        f.c.c(((asgt)f.b.E().a).al((asix)new gna(f, accessibilityLayerLayout, viewById, 5, (byte[])null)));
        ((fam)this).n().b(wya.b(49953), (aioe)null, (alff)null);
        if (this.E.aT()) {
            ((fa)this).findViewById(2131429690).setBackgroundResource(0);
        }
    }
    
    protected final void onDestroy() {
        super.onDestroy();
        this.y = true;
        final hsv o = this.o;
        o.d.dispose();
        final yzf i = o.i;
        final Iterator<Object> iterator = ((List<Object>)i.b).iterator();
        while (iterator.hasNext()) {
            try {
                ((Context)i.a).getContentResolver().releasePersistableUriPermission((Uri)iterator.next(), 1);
                iterator.remove();
            }
            catch (final SecurityException ex) {}
        }
        this.aq.dispose();
        this.H.b();
        if (this.isFinishing()) {
            tcp.m(this.J.c((aexg)gku.t, (Executor)this.g), (tcn)new htl(this.I, 1, (byte[])null));
        }
    }
    
    protected final void onPause() {
        super.onPause();
        this.Q.m((Object)this);
    }
    
    protected final void onResume() {
        super.onResume();
        if (!this.j.t()) {
            this.finish();
            return;
        }
        this.Q.g((Object)this);
    }
    
    protected final void onResumeFragments() {
        super.onResumeFragments();
        this.o.c();
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.ah.an()) {
            final String z = this.z;
            z.getClass();
            bundle.putString("edit_video_activity_instance_uuid_key", z);
            tcp.n((aum)this, this.J.c((aexg)new gkq(this, 17), (Executor)afsl.a), (trb)new hks(this, 11), (trb)hen.s);
        }
        else {
            final akrj x = this.x;
            if (x != null) {
                bundle.putByteArray("get_metadata_editor_response_key", ((agxl)x).toByteArray());
            }
        }
        if (this.o.h()) {
            final ajje an = this.an;
            if (an != null) {
                bundle.putByteArray("edit_thumbnail_command_key", ((agxl)an).toByteArray());
            }
            final cl supportFragmentManager = ((bu)this).getSupportFragmentManager();
            final zer ao = this.ao;
            ao.getClass();
            supportFragmentManager.J(bundle, "thumbnailFragmentTag", (br)ao);
        }
        if (this.p.r()) {
            this.p.l(bundle);
        }
    }
    
    protected final void onStart() {
        super.onStart();
        if (!this.j.t()) {
            this.finish();
            return;
        }
        final Intent intent = this.getIntent();
        if (!"android.intent.action.EDIT".equals(intent.getAction())) {
            trn.b("Unsupported action: ".concat(String.valueOf(intent.getAction())));
            this.finish();
            return;
        }
        if ((this.w = intent.getStringExtra("video_id")) == null) {
            trn.b("VideoId not provided.");
            this.finish();
            return;
        }
        this.ap = intent.getByteArrayExtra("click_tracking_params");
        if (this.ah.an()) {
            this.D = true;
            if (this.C) {
                this.w();
                this.D = false;
            }
            return;
        }
        this.w();
    }
    
    protected final void onStop() {
        super.onStop();
        this.G();
    }
    
    public final void p() {
        if (this.y) {
            return;
        }
        tmy.x((Context)this, 2132017973, 0);
        final Intent intent = new Intent();
        intent.putExtra("refresh_my_videos", true);
        this.setResult(-1, intent);
        this.finish();
    }
    
    public final void q(final altf e) {
        final agza builder = ((agzi)akri.a).createBuilder();
        final String w = this.w;
        builder.copyOnWrite();
        final akri akri = (akri)builder.instance;
        w.getClass();
        akri.b |= 0x2;
        akri.d = w;
        if (e != null) {
            builder.copyOnWrite();
            final akri akri2 = (akri)builder.instance;
            akri2.e = e;
            akri2.b |= 0x4;
        }
        tcp.n((aum)this, this.M.e(builder, this.s, this.ap), (trb)new hks(this, 14), (trb)new hks(this, 15));
    }
    
    public final void r() {
        final hsx b = this.B;
        if (b != null) {
            final boolean ad = ((hth)this).ad;
            boolean b2 = false;
            Label_0046: {
                if (!ad) {
                    if (!((hth)this).ac) {
                        b2 = b2;
                        if (!this.L.a) {
                            break Label_0046;
                        }
                    }
                    b2 = true;
                }
            }
            b.b(b2);
        }
    }
    
    public final void s() {
        this.H();
    }
    
    public final void t() {
        final zer zer = (zer)((bu)this).getSupportFragmentManager().f("edit_thumbnails_fragment");
        if (zer != null) {
            zer.af = true;
            zer.d();
            return;
        }
        this.H();
    }
    
    final void u() {
        ((fa)this).setSupportActionBar((Toolbar)this.q.b);
        this.B = new hsx(this);
        ((fam)this).ol().c((Collection)afcr.r((Object)this.B));
        final ep supportActionBar = ((fa)this).getSupportActionBar();
        supportActionBar.o(2132017977);
        supportActionBar.j(true);
        supportActionBar.m(agw.a((Context)this, 2131233636));
        supportActionBar.A();
        ((hth)this).aa.d((View)this.q.b, ((fa)this).findViewById(2131430798), ((fa)this).findViewById(2131428812));
        this.aq.c(((ashe)this.L.b).aa(this.n).aB((asix)new hrk(this, 4)));
    }
    
    public final void v() {
        szc.f();
        final akrj x = this.x;
        x.getClass();
        if ((x.b & 0x200) != 0x0) {
            ((fam)this).n().D((wxz)new wws(x.g));
        }
        final akrj x2 = this.x;
        szc.f();
        for (final akse akse : x2.f) {
            aopb aopb;
            if ((aopb = akse.b) == null) {
                aopb = aopb.a;
            }
            aopc aopc;
            if ((aopc = aopb.b) == null) {
                aopc = aopc.a;
            }
            if ((aopc.b & 0x1) != 0x0) {
                aopb aopb2;
                if ((aopb2 = akse.b) == null) {
                    aopb2 = aopb.a;
                }
                aopc aopc2;
                if ((aopc2 = aopb2.b) == null) {
                    aopc2 = aopc.a;
                }
                anws anws;
                if ((anws = aopc2.c) == null) {
                    anws = anws.a;
                }
                final veu veu = new veu(anws);
                aksd aksd;
                if ((aksd = x2.e) == null) {
                    aksd = aksd.a;
                }
                ((hth)this).D(veu, aksd);
                this.al.b(2131430798);
                break;
            }
        }
        this.am.a();
    }
    
    public final void w() {
        szc.f();
        if (this.x != null) {
            this.v();
            return;
        }
        tsx.n(this.w);
        this.am.a();
        this.am.c();
        if (((hth)this).F() && acsm.g((Context)this) && !this.ah.am()) {
            this.l.b((zeh)new zdz(this, 1));
            return;
        }
        this.q(null);
    }
    
    protected final boolean x() {
        return ((hth)this).ac || this.L.a;
    }
    
    public final void y(final agza agza) {
        this.B.b(false);
        this.G();
        if (this.p.r()) {
            this.p.u(agza);
        }
        tcp.n((aum)this, this.M.f(agza, this.s, null), (trb)new hks(this, 13), (trb)new hsw(this, agza));
    }
}
