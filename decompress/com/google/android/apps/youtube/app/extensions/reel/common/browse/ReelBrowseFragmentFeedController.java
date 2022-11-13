// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.common.browse;

import android.view.View;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import java.util.Iterator;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;

public class ReelBrowseFragmentFeedController implements aua, tgg
{
    public final wyv a;
    public final tgd b;
    public final SfvAudioItemPlaybackController c;
    public DefaultTabsBar d;
    public final fzf e;
    public gac f;
    public kty g;
    public final e h;
    private final vnu i;
    private final tqd j;
    private final ashi k;
    private final acps l;
    private final acqg m;
    private final acrr n;
    private final oug o;
    private final ipd p;
    private final arwh q;
    private final aeea r;
    private final aeea s;
    
    public ReelBrowseFragmentFeedController(final wyv a, final aeea r, final tgd b, final vnu i, final tqd j, final arwh q, final ashi k, final acps l, final acrr n, final acqg m, final e h, final SfvAudioItemPlaybackController c, final ipd p21, final aeea s, final oug o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.e = (fzf)new kxo(1);
        this.a = a;
        this.r = r;
        this.b = b;
        this.i = i;
        this.j = j;
        this.q = q;
        this.k = k;
        this.l = l;
        this.n = n;
        this.m = m;
        this.h = h;
        this.c = c;
        this.p = p21;
        this.s = s;
        this.o = o;
    }
    
    public final adqs g() {
        if (this.g != null && this.f != null) {
            final afes h = afev.h();
            final afel d = afeq.d();
            for (final e e : this.g.j()) {
                final hhg hhg = new hhg();
                final Object a = e.a;
                if (a != null) {
                    hhg.a = ((acov)a).qA();
                    hhg.b = ((acqv)e.a).N.n.Q();
                }
                final zxn zxn = new zxn((aorj)e.c);
                h.g(zxn, hhg);
                d.h((Object)zxn);
            }
            final adqs adqs = new adqs();
            adqs.c = h.c();
            adqs.b = d.g();
            adqs.a = this.g.a();
            return adqs;
        }
        return null;
    }
    
    public final void h(final Context context, final List list, final adqs adqs) {
        this.f.d();
        ((toy)this.d).mu();
        this.g.k();
        final acrq a = this.n.a((vmj)this.i, this.a.pF());
        final ArrayList list2 = new ArrayList();
        int i = 0;
        int n = 0;
        while (i < list.size()) {
            final zxn zxn = list.get(i);
            if (((aorj)zxn.b).f) {
                n = i;
            }
            final zxn zxn2 = list.get(i);
            hhg hhg;
            if (adqs != null) {
                hhg = (hhg)((afev)adqs.c).get(zxn);
            }
            else {
                hhg = null;
            }
            final View inflate = LayoutInflater.from(context).inflate(2131625273, (ViewGroup)null);
            final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(2131431331);
            recyclerView.af((nw)linearLayoutManager);
            aoex aoex;
            if ((aoex = this.q.f().z) == null) {
                aoex = aoex.a;
            }
            acqv a3;
            if (aoex.o) {
                final ipd p3 = this.p;
                Object a2;
                if (hhg != null) {
                    a2 = hhg.a;
                }
                else {
                    a2 = null;
                }
                a3 = p3.a((acrm)a2, this.s, recyclerView, (vmj)this.i, (acpu)a, this.a.pF(), (acku)this.l.a(), acrj.Zc, acqx.d, acdy.i, this.o, context);
            }
            else {
                Object a4;
                if (hhg != null) {
                    a4 = hhg.a;
                }
                else {
                    a4 = null;
                }
                a3 = new acqv((acrm)a4, recyclerView, this.r, this.m, (vmj)this.i, this.b, (acpu)a, this.j, this.a.pF(), (acku)this.l.a(), acrj.Zc, acqx.d, this.q, this.k, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            final acle acle = new acle();
            final aorj aorj = (aorj)zxn2.b;
            if ((aorj.b & 0x800) != 0x0) {
                aorh aorh;
                if ((aorh = aorj.i) == null) {
                    aorh = aorh.a;
                }
                acle.add((Object)aorh);
            }
            ((acns)a3).M((acjn)acle);
            if (hhg != null) {
                recyclerView.n.Z((Parcelable)hhg.b);
                ((acns)a3).d();
            }
            else {
                ((acns)a3).P(zxn2.e());
            }
            list2.add(new e(aorj, inflate, a3, (jwd)null));
            ++i;
        }
        int n2 = n;
        if (adqs != null) {
            final int a5 = adqs.a;
            n2 = n;
            if (a5 != -1) {
                n2 = a5;
            }
        }
        this.g.m(this.f, (List)list2, n2);
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        final kty g = this.g;
        if (g != null) {
            g.sa();
        }
        this.b.m((Object)this);
    }
    
    public final void mq(final aun aun) {
    }
    
    public final Class[] ms(final Class clazz, final Object o, int a) {
        Class[] array;
        if (a != -1) {
            if (a != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
            }
            final vqh vqh = (vqh)o;
            for (final e e : this.g.j()) {
                if (e.a != null && aevy.d((CharSequence)"SFV_AUDIO_PICKER_SAVED_TAB", (CharSequence)((aorj)e.c).c)) {
                    ((acns)e.a).m();
                }
            }
            a = this.g.a();
            array = null;
            if (a >= 0) {
                if (aevy.d((CharSequence)"SFV_AUDIO_PICKER_SAVED_TAB", (CharSequence)((aorj)this.g.j().get(this.g.a()).c).c)) {
                    this.c.k();
                    return null;
                }
            }
        }
        else {
            array = new Class[] { vqh.class };
        }
        return array;
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
