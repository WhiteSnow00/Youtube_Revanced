// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.user.profile.photopicker.fragment.devicephotos;

import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.os.Parcelable;
import android.content.Intent;
import android.util.Log;
import android.view.View$OnClickListener;
import android.support.v7.widget.GridLayoutManager;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v7.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import android.view.View;
import com.google.android.material.textview.MaterialTextView;

public class DevicePhotosFragment extends qwb
{
    public qup a;
    public que ae;
    public atke af;
    public aezp ag;
    public rf ah;
    public rf ai;
    public qwa aj;
    public ey ak;
    public aezp al;
    public pja am;
    public nns an;
    public piz ao;
    public ziy ap;
    private rf ar;
    private rf as;
    private MaterialTextView at;
    private View au;
    private MaterialButton av;
    private RecyclerView aw;
    private boolean ax;
    public qxx b;
    public pbg c;
    public pba d;
    public qvb e;
    
    public DevicePhotosFragment() {
        this.ax = false;
    }
    
    private final void aK(final boolean b) {
        if (td.c(((br)this).nT(), "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            this.p();
            this.q(0);
            return;
        }
        if (((br)this).ax("android.permission.READ_EXTERNAL_STORAGE")) {
            this.q(1);
            this.n((aezp)aeyo.a);
            return;
        }
        if (!b) {
            this.q(2);
            this.n((aezp)aeyo.a);
            return;
        }
        this.d();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        int n;
        if (!arrm.e()) {
            n = 2131624992;
        }
        else {
            n = 2131624993;
        }
        final View inflate = layoutInflater.inflate(n, viewGroup, false);
        ((pbg)this.am.b).a(110513).a(inflate);
        return inflate;
    }
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        this.aw = (RecyclerView)((br)this).O.findViewById(2131430322);
        ((pbg)this.am.b).a(89737).a((View)this.aw);
        ((br)this).nT();
        this.aw.af((nw)new GridLayoutManager(this.aw.getResources().getInteger(2131493045)));
        final ziy ap = this.ap;
        final tan tan = new tan(this);
        final qsw qsw = (qsw)((atke)ap.d).a();
        qsw.getClass();
        final pba pba = (pba)((atke)ap.a).a();
        pba.getClass();
        final pja pja = (pja)((atke)ap.b).a();
        pja.getClass();
        final qwa aj = new qwa(qsw, pba, pja, (qvb)((atke)ap.c).a(), (piz)((atke)ap.e).a(), tan, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.aj = aj;
        this.aw.ac((nq)aj);
        this.aj.b(afeq.q());
        this.at = (MaterialTextView)((br)this).O.findViewById(2131430325);
        this.au = ((br)this).O.findViewById(2131430324);
        (this.av = (MaterialButton)((br)this).O.findViewById(2131430323)).setOnClickListener((View$OnClickListener)new qvd(this, 4));
        ((pbg)this.am.b).a(89728).a((View)this.av);
        this.al = aezp.j((Object)this.an.k("camera_image.jpg"));
        final afam afam = (afam)this.af.a();
        afam.e();
        afam.f();
        this.ag = aezp.k((Object)afam);
        final que ae = this.ae;
        final ahaz builder = ((ahbh)agsw.a).createBuilder();
        builder.copyOnWrite();
        final agsw agsw = (agsw)builder.instance;
        agsw.c = 22;
        agsw.b |= 0x1;
        ae.e((agsw)builder.build());
        this.a.a.g(((br)this).mK(), (auz)new nqs(this, adzi.n(((br)this).O, 2132019046, -2), 2));
    }
    
    public final void a() {
        Object o;
        if (!this.al.h()) {
            if (Log.isLoggable("DevicePhotosFragment", 5)) {
                Log.w("DevicePhotosFragment", "Uri for camera photo camera_image.jpg is not present");
            }
            o = aeyo.a;
        }
        else {
            final Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", (Parcelable)this.al.c());
            o = aezp.k((Object)intent);
        }
        if (((aezp)o).h()) {
            this.as.b((Object)((aezp)o).c());
        }
    }
    
    public final void aa() {
        super.aa();
        final boolean ax = this.ax;
        this.ax = false;
        this.aK(ax);
    }
    
    public final void d() {
        this.ar.b((Object)"android.permission.READ_EXTERNAL_STORAGE");
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        if (!super.aq) {
            aqsy.l((br)this);
        }
    }
    
    public final void n(final aezp aezp) {
        if (this.ag.h()) {
            final ahaz builder = ((ahbh)agsx.a).createBuilder();
            builder.copyOnWrite();
            final agsx agsx = (agsx)builder.instance;
            agsx.c = 22;
            agsx.b |= 0x1;
            final long a = ((afam)this.ag.c()).a(TimeUnit.MICROSECONDS);
            builder.copyOnWrite();
            final agsx agsx2 = (agsx)builder.instance;
            agsx2.b |= 0x2;
            agsx2.d = a;
            final ahaz builder2 = ((ahbh)agsv.a).createBuilder();
            if (aezp.h()) {
                final quo quo = (quo)aezp.c();
                if (quo.c.h()) {
                    final ahaz builder3 = ((ahbh)agsr.a).createBuilder();
                    builder3.copyOnWrite();
                    final agsr agsr = (agsr)builder3.instance;
                    agsr.d = 0;
                    agsr.b |= 0x2;
                    builder.copyOnWrite();
                    final agsx agsx3 = (agsx)builder.instance;
                    final agsr e = (agsr)builder3.build();
                    e.getClass();
                    agsx3.e = e;
                    agsx3.b |= 0x4;
                }
                builder2.ao(quo.b);
            }
            builder2.copyOnWrite();
            final agsv agsv = (agsv)builder2.instance;
            final agsx d = (agsx)builder.build();
            d.getClass();
            agsv.d = d;
            agsv.b |= 0x1;
            this.ae.c((agsv)builder2.build());
            ((afam)this.ag.c()).e();
        }
    }
    
    public final void o() {
        if (((br)this).au()) {
            this.aK(true);
            return;
        }
        this.ax = true;
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        final aduk aduk = new aduk(((br)this).nT());
        aduk.r(2132018947);
        aduk.s(2132018984);
        this.ak = ((ex)aduk).b();
        this.ar = ((br)this).registerForActivityResult((rl)new rn(), (rd)new gtz(this, 9));
        this.ah = ((br)this).registerForActivityResult((rl)new rn(), (rd)new gtz(this, 7));
        this.ai = ((br)this).registerForActivityResult((rl)new ro(), (rd)new gtz(this, 6));
        this.as = ((br)this).registerForActivityResult((rl)new ro(), (rd)new gtz(this, 8));
    }
    
    public final void p() {
        this.a.c();
    }
    
    public final void q(final int n) {
        if (n == 0) {
            this.at.setVisibility(8);
            this.au.setVisibility(8);
            this.av.setVisibility(8);
            this.aw.setVisibility(0);
            return;
        }
        if (n == 1) {
            this.c.c((View)this.at, this.am.g(118676));
            this.at.setVisibility(0);
            this.au.setVisibility(0);
            this.at.setText(2132018948);
            this.av.setVisibility(0);
            return;
        }
        this.c.c((View)this.at, this.am.g(118677));
        this.av.setVisibility(8);
        if (rhl.a(((br)this).nT(), "android.permission.READ_EXTERNAL_STORAGE")) {
            this.at.setVisibility(0);
            this.au.setVisibility(0);
            this.at.setText(2132018949);
            return;
        }
        this.at.setVisibility(8);
        this.au.setVisibility(8);
    }
}
