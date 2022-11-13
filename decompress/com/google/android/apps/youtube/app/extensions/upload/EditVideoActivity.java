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

public class EditVideoActivity extends htx implements htq, rnc, tgg
{
    public String A;
    public gbx B;
    public htu C;
    public boolean D;
    public boolean E;
    public qqr F;
    public vai G;
    public adpp H;
    public kja I;
    public adet J;
    public skt K;
    public adfs L;
    public ziy M;
    private ViewAnimatorHelper al;
    private LoadingFrameLayout am;
    private ajli an;
    private zgm ao;
    private byte[] ap;
    private final asiq aq;
    public afvs g;
    public gbc h;
    public vcy i;
    public zmf j;
    public vlq k;
    public zgb l;
    public gbu m;
    public asid n;
    public hts o;
    public zhk p;
    public htk q;
    public acwt r;
    public Executor s;
    public atke t;
    public gkx u;
    public uwo v;
    public View w;
    public String x;
    public aktm y;
    public boolean z;
    
    public EditVideoActivity() {
        this.aq = new asiq();
        this.D = false;
        this.E = false;
    }
    
    private final void G() {
        final gbx b = this.B;
        if (b != null) {
            this.m.l((acwd)b);
            this.h.e(true);
        }
    }
    
    private final void H() {
        this.u();
        this.getWindow().setNavigationBarColor(tpe.cr((Context)this, 2130968777));
        ((fa)this).findViewById(2131428784).setVisibility(0);
    }
    
    public final void f(final ajli an) {
        this.an = an;
        this.ao = this.o.b(an);
        ((fa)this).findViewById(2131428784).setVisibility(4);
    }
    
    protected final void g(final gkv gkv) {
        if (gkv == gkv.b) {
            ((fa)this).setTheme(2132084278);
        }
    }
    
    public final void h() {
    }
    
    public final void i() {
        final zgm ao = this.ao;
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
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zmu zmu = (zmu)o;
            this.finish();
            array = null;
        }
        else {
            array = new Class[] { zmu.class };
        }
        return array;
    }
    
    public final aezp o() {
        return (aezp)aeyo.a;
    }
    
    public final void onBackPressed() {
        final zgm ao = this.ao;
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
        if (this.G.aU()) {
            int theme;
            if (this.u.a() == gkv.b) {
                theme = 2132084279;
            }
            else {
                theme = 2132084280;
            }
            ((fa)this).setTheme(theme);
        }
        ((dh)this).getLifecycle().b((aum)this.t.a());
        ((qt)this).setContentView(this.w);
        this.q.a((Activity)this);
        this.u();
        if (bundle != null) {
            this.A = bundle.getString("edit_video_activity_instance_uuid_key");
            if (!this.ah.al()) {
                final byte[] byteArray = bundle.getByteArray("get_metadata_editor_response_key");
                if (byteArray != null) {
                    final vlq k = this.k;
                    final aktm a = aktm.a;
                    a.getClass();
                    if ((this.y = (aktm)k.a(byteArray, (MessageLite)a)) == null) {
                        throw new RuntimeException("Failed to parse a known parcelable proto");
                    }
                }
            }
            this.ao = (zgm)((bu)this).getSupportFragmentManager().g(bundle, "thumbnailFragmentTag");
            if (this.o.h()) {
                final byte[] byteArray2 = bundle.getByteArray("edit_thumbnail_command_key");
                if (byteArray2 != null) {
                    this.an = (ajli)this.k.a(byteArray2, (MessageLite)ajli.a);
                }
                this.o.f(bundle, this.an, this.ao, (zgu)null);
            }
            this.p.j(bundle);
        }
        if (TextUtils.isEmpty((CharSequence)this.A)) {
            this.A = UUID.randomUUID().toString();
        }
        if (this.ah.al()) {
            final hol hol = new hol(this, 12);
            teu.n((aun)this, this.F.a(), (ttg)new hlo((Runnable)hol, 12), (ttg)new fdc(this, (Runnable)hol, 17));
        }
        this.r.h(((fa)this).findViewById(16908290));
        this.al = (ViewAnimatorHelper)((fa)this).findViewById(2131432362);
        this.am = (LoadingFrameLayout)((fa)this).findViewById(2131428783);
        this.h.f((BottomUiContainer)((fa)this).findViewById(2131427886));
        this.v.a();
        ((faq)this).pF().b(xaa.b(49953), (aiqj)null, (alhi)null);
        if (this.G.aU()) {
            ((fa)this).findViewById(2131429690).setBackgroundResource(0);
        }
    }
    
    protected final void onDestroy() {
        super.onDestroy();
        this.z = true;
        final hts o = this.o;
        o.d.dispose();
        final zaz h = o.h;
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
            teu.m(this.F.b((aezf)glc.t, (Executor)this.g), (tes)new hug(this.J, 1, (byte[])null, (byte[])null, (byte[])null));
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
        if (this.ah.al()) {
            final String a = this.A;
            a.getClass();
            bundle.putString("edit_video_activity_instance_uuid_key", a);
            teu.n((aun)this, this.F.b((aezf)new ggp(this, 18), (Executor)afum.a), (ttg)new hlo(this, 11), (ttg)hid.r);
        }
        else {
            final aktm y = this.y;
            if (y != null) {
                bundle.putByteArray("get_metadata_editor_response_key", ((agzk)y).toByteArray());
            }
        }
        if (this.o.h()) {
            final ajli an = this.an;
            if (an != null) {
                bundle.putByteArray("edit_thumbnail_command_key", ((agzk)an).toByteArray());
            }
            final cl supportFragmentManager = ((bu)this).getSupportFragmentManager();
            final zgm ao = this.ao;
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
            ttr.b("Unsupported action: ".concat(String.valueOf(intent.getAction())));
            this.finish();
            return;
        }
        if ((this.x = intent.getStringExtra("video_id")) == null) {
            ttr.b("VideoId not provided.");
            this.finish();
            return;
        }
        this.ap = intent.getByteArrayExtra("click_tracking_params");
        if (this.ah.al()) {
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
        tpe.x((Context)this, 2132017974, 0);
        final Intent intent = new Intent();
        intent.putExtra("refresh_my_videos", true);
        this.setResult(-1, intent);
        this.finish();
    }
    
    public final void q(final alvj e) {
        final ahaz builder = aktl.a.createBuilder();
        final String x = this.x;
        builder.copyOnWrite();
        final aktl aktl = (aktl)builder.instance;
        x.getClass();
        aktl.b |= 0x2;
        aktl.d = x;
        if (e != null) {
            builder.copyOnWrite();
            final aktl aktl2 = (aktl)builder.instance;
            aktl2.e = e;
            aktl2.b |= 0x4;
        }
        teu.n((aun)this, this.L.e(builder, this.s, this.ap), (ttg)new hlo(this, 14), (ttg)new hlo(this, 15));
    }
    
    public final void r() {
        final htu c = this.C;
        if (c != null) {
            final boolean ad = ((huc)this).ad;
            boolean b = false;
            Label_0045: {
                if (!ad) {
                    if (!((huc)this).ac) {
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
        final zgm zgm = (zgm)((bu)this).getSupportFragmentManager().f("edit_thumbnails_fragment");
        if (zgm != null) {
            zgm.af = true;
            zgm.d();
            return;
        }
        this.H();
    }
    
    final void u() {
        ((fa)this).setSupportActionBar((Toolbar)this.q.c);
        this.C = new htu(this);
        ((faq)this).ol().c((Collection)afeq.r((Object)this.C));
        final ep supportActionBar = ((fa)this).getSupportActionBar();
        supportActionBar.o(2132017978);
        supportActionBar.j(true);
        supportActionBar.m(agx.a((Context)this, 2131233638));
        supportActionBar.A();
        ((huc)this).aa.d((View)this.q.c, ((fa)this).findViewById(2131430801), ((fa)this).findViewById(2131428812));
        this.aq.c(((asht)this.K.b).af(this.n).aH((asjm)new hsf(this, 4)));
    }
    
    public final void v() {
        tbi.f();
        final aktm y = this.y;
        y.getClass();
        if ((y.b & 0x200) != 0x0) {
            ((faq)this).pF().D((wzz)new wyt(y.g));
        }
        final aktm y2 = this.y;
        tbi.f();
        for (final akuh akuh : y2.f) {
            aore aore;
            if ((aore = akuh.b) == null) {
                aore = aore.a;
            }
            aorf aorf;
            if ((aorf = aore.b) == null) {
                aorf = aorf.a;
            }
            if ((aorf.b & 0x1) != 0x0) {
                aore aore2;
                if ((aore2 = akuh.b) == null) {
                    aore2 = aore.a;
                }
                aorf aorf2;
                if ((aorf2 = aore2.b) == null) {
                    aorf2 = aorf.a;
                }
                anyv anyv;
                if ((anyv = aorf2.c) == null) {
                    anyv = anyv.a;
                }
                final vgu vgu = new vgu(anyv);
                akug akug;
                if ((akug = y2.e) == null) {
                    akug = akug.a;
                }
                ((huc)this).D(vgu, akug);
                this.al.b(2131430801);
                break;
            }
        }
        this.am.a();
    }
    
    public final void w() {
        tbi.f();
        if (this.y != null) {
            this.v();
            return;
        }
        tvb.n(this.x);
        this.am.a();
        this.am.c();
        if (((huc)this).F() && acuq.g((Context)this) && !this.ah.ak()) {
            this.l.b((zga)new zfs(this, 1));
            return;
        }
        this.q(null);
    }
    
    protected final boolean x() {
        return ((huc)this).ac || this.K.a;
    }
    
    public final void y(final ahaz ahaz) {
        this.C.b(false);
        this.G();
        if (this.p.r()) {
            this.p.u(ahaz);
        }
        teu.n((aun)this, this.L.f(ahaz, this.s, (byte[])null), (ttg)new hlo(this, 13), (ttg)new htt(this, ahaz));
    }
}
