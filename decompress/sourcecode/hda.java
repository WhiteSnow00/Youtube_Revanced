import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import com.google.protos.youtube.api.innertube.SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand;
import android.widget.LinearLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.view.View$OnClickListener;
import android.widget.EditText;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchSuggestionsController;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchResultsController;
import android.widget.TextView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hda extends hdh implements hdb
{
    public Context a;
    public acwn ae;
    public TextView af;
    public boolean ag;
    public cdn ah;
    public auip ai;
    public MusicSearchResultsController b;
    public SfvAudioItemPlaybackController c;
    public wwu d;
    public MusicSearchSuggestionsController e;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return LayoutInflater.from(this.a).inflate(2131624891, viewGroup, false);
    }
    
    public final void a(final String text) {
        final cdn ah = this.ah;
        ((EditText)ah.a).setText((CharSequence)text);
        tmy.q((EditText)ah.a);
        tmy.w((View)ah.a);
    }
    
    public final void ab(final View view, Bundle m) {
        m = ((br)this).m;
        if (m == null) {
            trn.b("No args found for MusicSearchFragment, pass the command in the args.");
            return;
        }
        final byte[] byteArray = m.getByteArray("SfvMusicSearchFragmentCommandKey");
        if (byteArray == null) {
            trn.b("No search command found.");
            return;
        }
        final aioe c = vba.c(byteArray);
        this.d.n().c(wya.b(100355), wxr.a, c, xkm.as(c, algq.b), xkm.as(c, algq.a));
        this.d.n().l((wxz)new wws(wya.c(22156)));
        this.c.k();
        ((auh)((br)this).X).b((aul)this.c);
        view.findViewById(2131429996).setOnClickListener((View$OnClickListener)new gxu(this, 18));
        ((LoadingFrameLayout)view.findViewById(2131429997)).h((CharSequence)"");
        final MusicSearchResultsController b = this.b;
        final FrameLayout frameLayout = (FrameLayout)view.findViewById(2131429995);
        b.p = (LoadingFrameLayout)frameLayout.findViewById(2131429997);
        final RecyclerView s = (RecyclerView)frameLayout.findViewById(2131429994);
        b.s = s;
        b.t = (RecyclerView)frameLayout.findViewById(2131429999);
        agot.u(s != null);
        final Context q = b.q;
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ac(1);
        s.af((nw)linearLayoutManager);
        final acpm a = b.c.a((vke)b.h, b.e.n());
        aocv aocv;
        if ((aocv = b.y.f().z) == null) {
            aocv = aocv.a;
        }
        Object a2;
        if (aocv.o) {
            a2 = b.x.a((acpi)null, b.A, s, (vke)b.h, (acnq)a, b.e.n(), (acir)b.f.a(), acpf.Zc, acot.d, acbx.i, b.l, b.q);
        }
        else {
            a2 = new acor(null, s, b.z, b.a, (vke)b.h, b.b, (acnq)a, b.d, b.e.n(), (acir)b.f.a(), acpf.Zc, acot.d, b.y, b.g, null, null, null, null);
        }
        b.o = (acor)a2;
        this.b.u = (FrameLayout)((LinearLayout)view.findViewById(2131429998)).findViewById(2131427660);
        this.b.r = c;
        aocv aocv2;
        if ((aocv2 = ((arud)this.ai.a).f().z) == null) {
            aocv2 = aocv.a;
        }
        final boolean n = aocv2.n;
        this.ag = n;
        if (n) {
            final MusicSearchSuggestionsController e = this.e;
            final FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131429995);
            e.l = (LoadingFrameLayout)frameLayout2.findViewById(2131429997);
            e.m = (RecyclerView)frameLayout2.findViewById(2131429999);
            e.n = (RecyclerView)frameLayout2.findViewById(2131429994);
            agot.u(e.m != null);
            final Activity i = e.i;
            final LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
            linearLayoutManager2.ac(1);
            e.m.af((nw)linearLayoutManager2);
            e.m.aE(e.o);
            e.j = new acor(null, e.m, e.s, e.a, vke.e, e.b, (acnq)e.c.a(vke.e, e.e.n()), e.d, e.e.n(), (acir)e.f.a(), acpf.Zc, acot.d, e.q, e.g, null, null, null, null);
            e.p = e.r.t((adee)e.h);
            e.k = e.p.b().aB((asix)new gxt(e, 19));
            final MusicSearchSuggestionsController e2 = this.e;
            if (((agzd)c).rs((agyr)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand) && (((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand)((agzd)c).rr((agyr)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).b & 0x2) != 0x0) {
                e2.h.f = ((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand)((agzd)c).rr((agyr)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).d;
            }
            this.b.w = this.ag;
        }
        final cdn ah = new cdn(this.a, (ViewGroup)view.findViewById(2131431292));
        this.ah = ah;
        ah.c = new qpt(this);
        this.ae.h();
        this.ae.d();
        final cdn ah2 = this.ah;
        ((EditText)ah2.a).requestFocus();
        final InputMethodManager inputMethodManager = (InputMethodManager)((Context)ah2.b).getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput((View)ah2.a, 1);
        }
        this.af = (TextView)view.findViewById(2131431293);
    }
    
    public final void d(final boolean b) {
        final cl supportFragmentManager = ((br)this).od().getSupportFragmentManager();
        supportFragmentManager.I();
        this.d.n().J(3, (wxz)new wws(wya.c(22156)), (alff)null);
        this.d.n().s();
        if (b && supportFragmentManager.f("ReelBrowseFragmentTag") != null) {
            supportFragmentManager.I();
        }
        supportFragmentManager.ab();
    }
    
    public final void n(final String s, final akwm e) {
        this.c.k();
        if (this.ag) {
            this.e.g();
        }
        final MusicSearchResultsController b = this.b;
        final LoadingFrameLayout p2 = b.p;
        if (p2 != null) {
            p2.c();
        }
        final RecyclerView t = b.t;
        if (t != null) {
            t.setVisibility(8);
        }
        final vtp d = b.h.d();
        d.a = vtp.g(s);
        final aioe r = b.r;
        if (r != null) {
            ((vii)d).j(r.c);
        }
        else {
            ((vii)d).j(agyc.b);
        }
        if (b.w) {
            d.d = b.k.a("youtube-sfv");
        }
        final aioe r2 = b.r;
        Object o;
        if (r2 != null && ((agzd)r2).rs((agyr)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand) && !((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand)((agzd)r2).rr((agyr)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).c.isEmpty()) {
            o = aexq.k(((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand)((agzd)r2).rr((agyr)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).c);
        }
        else {
            o = aewp.a;
        }
        if (((aexq)o).h()) {
            d.c = (String)((aexq)o).c();
        }
        if (e != null) {
            d.e = e;
        }
        b.g();
        tcp.k(b.h.d.g((vjn)d, b.i), b.j, (tcn)new fcb(b, 18), (tco)new erz(b, 19));
    }
    
    public final void nm() {
        if (((br)this).od() != null) {
            tmy.o((Activity)((br)this).od());
        }
        super.nm();
        this.ah.c = null;
    }
}
