// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.view.MenuItem;
import android.view.View$OnClickListener;
import android.os.Bundle;
import android.net.Uri;
import android.os.Parcelable;
import android.content.Intent;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import android.content.Context;
import java.util.concurrent.Executor;
import android.widget.Button;
import android.widget.ProgressBar;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

public class AudioSelectionActivity extends uki implements ukn, uke, uju, ujz, ukb
{
    public cl a;
    public ujx b;
    public ViewPager c;
    public AudioSwapTabsBar d;
    public View e;
    public ProgressBar f;
    public View g;
    public xab h;
    public vpb i;
    public veh j;
    rbi k;
    public boolean l;
    private ep n;
    private Button o;
    private uka p;
    private ujv q;
    
    public AudioSelectionActivity() {
        this.l = false;
    }
    
    private final void k(final boolean b) {
        if (b) {
            this.n.o(2132020042);
            return;
        }
        this.n.o(2132020041);
    }
    
    public final ujv a() {
        if (this.q == null) {
            Object f;
            if (!((f = this.a.f("audio_library_service_audio_selection")) instanceof ujv)) {
                f = new ujv();
                final ct i = this.a.i();
                i.s((br)f, "audio_library_service_audio_selection");
                i.i = 4097;
                i.a();
            }
            final ujv q = (ujv)f;
            this.q = q;
            q.a = new aefs(this.i);
        }
        return this.q;
    }
    
    public final uka b() {
        return this.p;
    }
    
    public final void d() {
        final aefs a = this.a().a;
        final xsj xsj = new xsj(this);
        final voz f = ((vpb)a.a).f();
        ((vls)f).i();
        f.w("FEaudio_tracks");
        tfx.n((aup)this, ((vpb)a.a).h(f, (Executor)afwd.a), (tui)new tti(xsj, 18, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (tui)new ujt((Context)this, xsj, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void e(final ahyg ahyg) {
        final ukc ukc = new ukc();
        aisc aisc;
        if ((aisc = ahyg.e) == null) {
            aisc = aisc.a;
        }
        final String d = ((aiec)((ahcu)aisc).rx((ahci)BrowseEndpointOuterClass.browseEndpoint)).d;
        d.getClass();
        ukc.af = d;
        ukc.ah = (ukb)this;
        final ct i = this.a.i();
        i.r(2131427662, (br)ukc, "category_contents_fragment_tag");
        i.t((String)null);
        i.i = 4097;
        i.a();
    }
    
    public final void f() {
        tqf.v((View)this.d, true);
        tqf.v((View)this.c, true);
        this.k(false);
    }
    
    public final void g() {
        this.k(true);
        tqf.v((View)this.d, false);
        tqf.v((View)this.c, false);
    }
    
    public final void h(final Track track) {
        final xab h = this.h;
        if (h != null && h.a() != null) {
            this.h.J(3, (xbe)new wzy(xbf.c(10716)), (alji)null);
        }
        track.getClass();
        final Uri d = track.d;
        final String scheme = d.getScheme();
        if ((scheme == null || scheme.equals("content")) && !rbi.b(this.k.c(d))) {
            tqf.x((Context)this, 2132020051, 0);
            return;
        }
        this.setResult(-1, new Intent().putExtra("audio_track", (Parcelable)track));
        this.finish();
    }
    
    public final void i() {
        this.e.setVisibility(0);
        this.f.setVisibility(0);
        this.g.setVisibility(8);
        this.c.setVisibility(8);
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((qu)this).setContentView(2131624044);
        this.a = ((bu)this).getSupportFragmentManager();
        final View viewById = ((fa)this).findViewById(2131427678);
        this.e = viewById;
        this.g = viewById.findViewById(2131427676);
        this.f = (ProgressBar)this.e.findViewById(2131427677);
        this.c = (ViewPager)((fa)this).findViewById(2131427664);
        final AudioSwapTabsBar d = (AudioSwapTabsBar)((fa)this).findViewById(2131427663);
        this.d = d;
        (d.c = this.c).q((cky)d);
        (this.o = (Button)this.e.findViewById(2131427679)).setOnClickListener((View$OnClickListener)new uha(this, 3));
        final ep supportActionBar = ((fa)this).getSupportActionBar();
        supportActionBar.getClass();
        (this.n = supportActionBar).C();
        this.n.j(true);
        this.n.A();
        this.k(false);
        final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
        final String stringExtra = this.getIntent().getStringExtra("parent_csn");
        final ahcr builder = ((ahcz)amsl.a).createBuilder();
        final int intExtra = this.getIntent().getIntExtra("parent_ve_type", 0);
        builder.copyOnWrite();
        final amsl amsl = (amsl)builder.instance;
        amsl.b |= 0x2;
        amsl.d = intExtra;
        if (stringExtra != null) {
            builder.copyOnWrite();
            final amsl amsl2 = (amsl)builder.instance;
            amsl2.b |= 0x1;
            amsl2.c = stringExtra;
        }
        ahct.e((ahci)amsk.b, (Object)builder.build());
        this.h.b(xbf.b(9729), (aisc)((ahcr)ahct).build(), (alji)null);
        this.h.l((xbe)new wzy(xbf.c(10716)));
        this.k = new rbi((Context)this);
        this.i();
        this.d();
        final Intent intent = this.getIntent();
        this.p = new uka((Context)this, this.h, intent.getBooleanExtra("extractor_sample_source", false));
        if (intent.getBooleanExtra("sunset_banner_enabled", false)) {
            ((fa)this).findViewById(2131427661).setVisibility(0);
            final wzy wzy = new wzy(xbf.c(88806));
            this.h.l((xbe)wzy);
            ((fa)this).findViewById(2131429510).setOnClickListener((View$OnClickListener)new svf(this, (xbe)wzy, 17));
        }
        final br f = this.a.f("category_contents_fragment_tag");
        if (f instanceof ukc) {
            ((ukc)f).ah = (ukb)this;
        }
    }
    
    protected final void onDestroy() {
        final uka p = this.p;
        final lso b = p.b;
        if (b != null) {
            b.g();
        }
        p.b = null;
        this.p = null;
        super.onDestroy();
        this.l = true;
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (this.a.a() > 0) {
                this.a.I();
            }
            else {
                this.finish();
            }
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
    
    protected final void onPause() {
        this.p.a(false);
        super.onPause();
    }
}
