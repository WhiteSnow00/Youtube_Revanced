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

public class EditVideoActivity extends hug implements htz, roe, thj
{
    public String A;
    public gcd B;
    public hud C;
    public boolean D;
    public boolean E;
    public qrk F;
    public vbs G;
    public adre H;
    public kjk I;
    public adgg J;
    public slt K;
    public adhf L;
    public zkt M;
    private ViewAnimatorHelper al;
    private LoadingFrameLayout am;
    private ajnh an;
    private zik ao;
    private byte[] ap;
    private final aslm aq;
    public afxj g;
    public gbh h;
    public veh i;
    public zoa j;
    public vmx k;
    public zia l;
    public gca m;
    public askz n;
    public hub o;
    public zji p;
    public hts q;
    public acyg r;
    public Executor s;
    public atnb t;
    public glc u;
    public uxv v;
    public View w;
    public String x;
    public akvn y;
    public boolean z;
    
    public EditVideoActivity() {
        this.aq = new aslm();
        this.D = false;
        this.E = false;
    }
    
    private final void G() {
        final gcd b = this.B;
        if (b != null) {
            this.m.l((acxq)b);
            this.h.e(true);
        }
    }
    
    private final void H() {
        this.u();
        this.getWindow().setNavigationBarColor(tqf.cr((Context)this, 2130968777));
        ((fa)this).findViewById(2131428784).setVisibility(0);
    }
    
    public final void f(final ajnh an) {
        this.an = an;
        this.ao = this.o.b(an);
        ((fa)this).findViewById(2131428784).setVisibility(4);
    }
    
    protected final void g(final gla gla) {
        if (gla == gla.b) {
            ((fa)this).setTheme(2132084282);
        }
    }
    
    public final void h() {
    }
    
    public final void i() {
        final zik ao = this.ao;
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
        return 2131430801;
    }
    
    public final View l() {
        return (View)this.q.c;
    }
    
    public final ViewAnimatorHelper m() {
        return this.al;
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zop zop = (zop)o;
            this.finish();
            array = null;
        }
        else {
            array = new Class[] { zop.class };
        }
        return array;
    }
    
    public final afbh o() {
        return afag.a;
    }
    
    public final void onBackPressed() {
        final zik ao = this.ao;
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
        if (this.G.aX()) {
            int theme;
            if (this.u.a() == gla.b) {
                theme = 2132084283;
            }
            else {
                theme = 2132084284;
            }
            ((fa)this).setTheme(theme);
        }
        ((dh)this).getLifecycle().b((auo)this.t.a());
        ((qu)this).setContentView(this.w);
        this.q.a((Activity)this);
        this.u();
        if (bundle != null) {
            this.A = bundle.getString("edit_video_activity_instance_uuid_key");
            if (!this.ai.aj()) {
                final byte[] byteArray = bundle.getByteArray("get_metadata_editor_response_key");
                if (byteArray != null) {
                    final vmx k = this.k;
                    final akvn a = akvn.a;
                    a.getClass();
                    if ((this.y = (akvn)k.a(byteArray, (MessageLite)a)) == null) {
                        throw new RuntimeException("Failed to parse a known parcelable proto");
                    }
                }
            }
            this.ao = (zik)((bu)this).getSupportFragmentManager().g(bundle, "thumbnailFragmentTag");
            if (this.o.h()) {
                final byte[] byteArray2 = bundle.getByteArray("edit_thumbnail_command_key");
                if (byteArray2 != null) {
                    this.an = (ajnh)this.k.a(byteArray2, (MessageLite)ajnh.a);
                }
                this.o.f(bundle, this.an, this.ao, (zit)null);
            }
            this.p.j(bundle);
        }
        if (TextUtils.isEmpty((CharSequence)this.A)) {
            this.A = UUID.randomUUID().toString();
        }
        if (this.ai.aj()) {
            final hou hou = new hou(this, 11);
            tfx.n((aup)this, this.F.a(), (tui)new hlw((Runnable)hou, 14), (tui)new fdf(this, (Runnable)hou, 18));
        }
        this.r.h(((fa)this).findViewById(16908290));
        this.al = (ViewAnimatorHelper)((fa)this).findViewById(2131432363);
        this.am = (LoadingFrameLayout)((fa)this).findViewById(2131428783);
        this.h.f((BottomUiContainer)((fa)this).findViewById(2131427886));
        this.v.a();
        ((fat)this).pE().b(xbf.b(49953), (aisc)null, (alji)null);
        if (this.G.aX()) {
            ((fa)this).findViewById(2131429690).setBackgroundResource(0);
        }
    }
    
    protected final void onDestroy() {
        super.onDestroy();
        this.z = true;
        final hub o = this.o;
        o.d.dispose();
        final zct h = o.h;
        final Iterator<Object> iterator = ((List<Object>)h.b).iterator();
        while (iterator.hasNext()) {
            try {
                ((Context)h.a).getContentResolver().releasePersistableUriPermission((Uri)iterator.next(), 1);
                iterator.remove();
            }
            catch (final SecurityException ex) {}
        }
        this.aq.dispose();
        this.I.b();
        if (this.isFinishing()) {
            tfx.m(this.F.b((afax)glh.t, (Executor)this.g), (tfv)new fci(this.J, 20, (byte[])null, (byte[])null, (byte[])null));
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
        if (this.ai.aj()) {
            final String a = this.A;
            a.getClass();
            bundle.putString("edit_video_activity_instance_uuid_key", a);
            tfx.n((aup)this, this.F.b((afax)new ggu(this, 18), (Executor)afwd.a), (tui)new hlw(this, 13), (tui)him.r);
        }
        else {
            final akvn y = this.y;
            if (y != null) {
                bundle.putByteArray("get_metadata_editor_response_key", ((ahbc)y).toByteArray());
            }
        }
        if (this.o.h()) {
            final ajnh an = this.an;
            if (an != null) {
                bundle.putByteArray("edit_thumbnail_command_key", an.toByteArray());
            }
            final cl supportFragmentManager = ((bu)this).getSupportFragmentManager();
            final zik ao = this.ao;
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
            tut.b("Unsupported action: ".concat(String.valueOf(intent.getAction())));
            this.finish();
            return;
        }
        if ((this.x = intent.getStringExtra("video_id")) == null) {
            tut.b("VideoId not provided.");
            this.finish();
            return;
        }
        this.ap = intent.getByteArrayExtra("click_tracking_params");
        if (this.ai.aj()) {
            this.E = true;
            if (this.D) {
                this.w();
                this.E = false;
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
        if (this.z) {
            return;
        }
        tqf.x((Context)this, 2132017974, 0);
        final Intent intent = new Intent();
        intent.putExtra("refresh_my_videos", true);
        this.setResult(-1, intent);
        this.finish();
    }
    
    public final void q(final alxj e) {
        final ahcr builder = ((ahcz)akvm.a).createBuilder();
        final String x = this.x;
        builder.copyOnWrite();
        final akvm akvm = (akvm)builder.instance;
        x.getClass();
        akvm.b |= 0x2;
        akvm.d = x;
        if (e != null) {
            builder.copyOnWrite();
            final akvm akvm2 = (akvm)builder.instance;
            akvm2.e = e;
            akvm2.b |= 0x4;
        }
        tfx.n((aup)this, this.L.e(builder, this.s, this.ap), (tui)new hlw(this, 16), (tui)new hlw(this, 17));
    }
    
    public final void r() {
        final hud c = this.C;
        if (c != null) {
            final boolean ad = ((hul)this).ad;
            boolean b = false;
            Label_0045: {
                if (!ad) {
                    if (!((hul)this).ac) {
                        b = b;
                        if (!this.K.a) {
                            break Label_0045;
                        }
                    }
                    b = true;
                }
            }
            c.b(b);
        }
    }
    
    public final void s() {
        this.H();
    }
    
    public final void t() {
        final zik zik = (zik)((bu)this).getSupportFragmentManager().f("edit_thumbnails_fragment");
        if (zik != null) {
            zik.af = true;
            zik.d();
            return;
        }
        this.H();
    }
    
    final void u() {
        ((fa)this).setSupportActionBar((Toolbar)this.q.c);
        this.C = new hud(this);
        ((fat)this).oi().c((Collection)afgh.r(this.C));
        final ep supportActionBar = ((fa)this).getSupportActionBar();
        supportActionBar.o(2132017978);
        supportActionBar.j(true);
        supportActionBar.m(agy.a((Context)this, 2131233639));
        supportActionBar.A();
        ((hul)this).aa.d((View)this.q.c, ((fa)this).findViewById(2131430801), ((fa)this).findViewById(2131428812));
        this.aq.c(((askp)this.K.b).af(this.n).aH((asmi)new hsn(this, 6)));
    }
    
    public final void v() {
        tcl.l();
        final akvn y = this.y;
        y.getClass();
        if ((y.b & 0x200) != 0x0) {
            ((fat)this).pE().D((xbe)new wzy(y.g));
        }
        final akvn y2 = this.y;
        tcl.l();
        for (final akwh akwh : y2.f) {
            aotq aotq;
            if ((aotq = akwh.b) == null) {
                aotq = aotq.a;
            }
            aotr aotr;
            if ((aotr = aotq.b) == null) {
                aotr = aotr.a;
            }
            if ((aotr.b & 0x1) != 0x0) {
                aotq aotq2;
                if ((aotq2 = akwh.b) == null) {
                    aotq2 = aotq.a;
                }
                aotr aotr2;
                if ((aotr2 = aotq2.b) == null) {
                    aotr2 = aotr.a;
                }
                aobc aobc;
                if ((aobc = aotr2.c) == null) {
                    aobc = aobc.a;
                }
                final vic vic = new vic(aobc);
                amjt amjt;
                if ((amjt = y2.e) == null) {
                    amjt = amjt.a;
                }
                ((hul)this).D(vic, amjt);
                this.al.b(2131430801);
                break;
            }
        }
        this.am.a();
    }
    
    public final void w() {
        tcl.l();
        if (this.y != null) {
            this.v();
            return;
        }
        twd.n(this.x);
        this.am.a();
        this.am.c();
        if (((hul)this).F() && acwc.g((Context)this) && !this.ai.ai()) {
            this.l.b((zhz)new zhr(this, 1));
            return;
        }
        this.q(null);
    }
    
    protected final boolean x() {
        return ((hul)this).ac || this.K.a;
    }
    
    public final void y(final ahcr ahcr) {
        this.C.b(false);
        this.G();
        if (this.p.r()) {
            this.p.u(ahcr);
        }
        tfx.n((aup)this, this.L.f(ahcr, this.s, (byte[])null), (tui)new hlw(this, 15), (tui)new huc(this, ahcr));
    }
}
