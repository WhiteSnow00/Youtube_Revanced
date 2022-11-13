import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import android.view.View;
import j$.util.Optional;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import com.google.android.libraries.youtube.metadataeditor.thumbnail.ShortsEditThumbnailController;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class huc extends faq implements zeh, htp
{
    public otk O;
    public tqd P;
    public tgd Q;
    public ashi R;
    public acps S;
    public atke T;
    public wyw U;
    public acqg V;
    public acuq W;
    public acrr X;
    public zfw Y;
    acuu Z;
    public final hud aa;
    public ShortsEditThumbnailController ab;
    public boolean ac;
    public boolean ad;
    acqv ae;
    final wqg af;
    public arwh ag;
    public ziy ah;
    public aujg ai;
    public aeea aj;
    public aeea ak;
    private final asiu g;
    
    public huc() {
        this.aa = new hud((bu)this);
        this.ac = false;
        this.ad = false;
        this.af = new wqg(this, 1);
        this.g = new asiu();
    }
    
    public final ashc A(final alvk alvk) {
        ashc ashc;
        if (this.F() && !acuq.g((Context)this) && !this.ah.ak()) {
            ashc = ashc.j(new hua(this, alvk, 0));
        }
        else {
            ashc = this.B(alvk);
        }
        return ashc;
    }
    
    public final ashc B(final alvk alvk) {
        return ashc.j(new hua(this, alvk, 1));
    }
    
    public void C() {
        this.aa.a();
        if (this.isTaskRoot()) {
            this.finishAndRemoveTask();
            return;
        }
        this.finish();
    }
    
    protected final void D(final vgu vgu, final akug akug) {
        tbi.f();
        if (this.ae == null) {
            final RecyclerView recyclerView = (RecyclerView)((fa)this).findViewById(2131430801);
            final LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.ac(1);
            recyclerView.af((nw)linearLayoutManager);
            final acrq a = this.X.a(vmj.e, this.pF());
            final Object a2 = this.S.a();
            ((acku)a2).f(amco.class, (acks)new ackw(this.T, 0));
            ((acns)(this.ae = new acqv((acrm)null, recyclerView, this.aj, this.V, vmj.e, this.Q, (acpu)a, this.P, this.pF(), (acku)a2, acrj.Zc, acqx.d, this.ag, this.R, (byte[])null, (byte[])null, (byte[])null, (byte[])null))).d();
        }
        ((acns)this.ae).i();
        ((acns)this.ae).N(vgu);
        if ((akug.b & 0x2) != 0x0) {
            final aezp o = this.o();
            if (o.h()) {
                final ahaz builder = ((ahbh)aoso.a).createBuilder();
                final String d = akug.d;
                builder.copyOnWrite();
                final aoso aoso = (aoso)builder.instance;
                d.getClass();
                aoso.b |= 0x1;
                aoso.c = d;
                final ahaz builder2 = ((ahbh)aqgk.a).createBuilder();
                final String d2 = (String)Optional.ofNullable((Object)this.ab.g).orElse((Object)((hub)o.c()).a.toString());
                builder2.copyOnWrite();
                final aqgk aqgk = (aqgk)builder2.instance;
                d2.getClass();
                aqgk.c = 1;
                aqgk.d = d2;
                builder.copyOnWrite();
                final aoso aoso2 = (aoso)builder.instance;
                final aqgk d3 = (aqgk)builder2.build();
                d3.getClass();
                aoso2.d = d3;
                aoso2.b |= 0x2;
                final String b = ((hub)o.c()).b;
                builder.copyOnWrite();
                final aoso aoso3 = (aoso)builder.instance;
                aoso3.b |= 0x4;
                aoso3.e = b;
                this.O.b(akug.d, ((agzk)builder.build()).toByteArray());
            }
        }
        if ((akug.b & 0x1) != 0x0) {
            this.g.a(this.O.a(akug.c).K((asjs)fma.p).Z((asjr)hsb.d).L((asjr)hsb.e).af(asil.a()).aH(new hsf(this, 5)));
        }
    }
    
    public final void E() {
        this.l().setVisibility(0);
        this.m().b(this.k());
    }
    
    protected final boolean F() {
        final arwh ag = this.ag;
        if (ag != null) {
            alut alut;
            if ((alut = ag.f().c) == null) {
                alut = alut.a;
            }
            if (alut.k) {
                return true;
            }
        }
        return false;
    }
    
    public abstract int k();
    
    public abstract View l();
    
    public abstract ViewAnimatorHelper m();
    
    public abstract aezp o();
    
    public void onBackPressed() {
        if (this.m().a() == 2131429690) {
            final zfw y = this.Y;
            if (y != null) {
                ((zfv)y.c).b();
            }
            return;
        }
        if (this.aa.e()) {
            this.aa.b();
            return;
        }
        if (this.x()) {
            ((AlertDialog$Builder)this.ak.al((Context)this)).setTitle(2132019875).setMessage(2132019872).setPositiveButton(2132019874, (DialogInterface$OnClickListener)new ceh(this, 10)).setNegativeButton(2132019873, (DialogInterface$OnClickListener)gyl.d).setOnCancelListener((DialogInterface$OnCancelListener)sot.a).show();
            return;
        }
        this.C();
    }
    
    protected void onDestroy() {
        super.onDestroy();
        if (!this.g.tA()) {
            this.g.dispose();
        }
    }
    
    protected void onPause() {
        final RecyclerView recyclerView = (RecyclerView)((fa)this).findViewById(2131430801);
        if (recyclerView != null && recyclerView.hasFocus()) {
            recyclerView.clearFocus();
        }
        super.onPause();
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final acuu z = this.Z;
        if (z != null && z.b(n, array, array2)) {
            return;
        }
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    public wyw pF() {
        return this.U;
    }
    
    public abstract void r();
    
    protected boolean x() {
        throw null;
    }
    
    public abstract void y(final ahaz p0);
}
