import android.view.View$OnClickListener;
import android.util.Pair;
import android.content.DialogInterface$OnShowListener;
import java.util.Collection;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ListAdapter;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import android.app.ProgressDialog;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.widget.ListView;
import android.view.View;
import android.widget.CheckBox;
import android.app.AlertDialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifr implements aain, aaii
{
    private AlertDialog A;
    private AlertDialog B;
    private AlertDialog C;
    private AlertDialog D;
    private AlertDialog E;
    private AlertDialog F;
    private AlertDialog G;
    private AlertDialog H;
    private final ziy I;
    public final bu a;
    public final aaec b;
    public final acwt c;
    public AlertDialog d;
    public AlertDialog e;
    public CheckBox f;
    View g;
    public ListView h;
    public aaik i;
    public aais j;
    public aaiq k;
    public aaiq l;
    public aaiq m;
    public aaip n;
    public aair o;
    public aair p;
    public aaiq q;
    public final vai r;
    public final aln s;
    public acxl t;
    private final vcy u;
    private final atke v;
    private final atke w;
    private final aaig x;
    private final fmr y;
    private final wyv z;
    
    public ifr(final bu a, final ziy i, final aaec b, final vcy u, final aln s, final atke v, final atke w, final aaig x, final acwt c, final fmr y, final wyv z, final vai r, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.I = i;
        this.b = b;
        this.u = u;
        this.s = s;
        this.v = v;
        this.w = w;
        this.x = x;
        this.c = c;
        this.y = y;
        this.z = z;
        this.r = r;
    }
    
    public static void a(final Throwable t) {
        ttr.d("Failed to update offline has shown 1080p option.", t);
    }
    
    public static void b(final Throwable t) {
        ttr.d("Failed to update offline stream selection dialog remember settings checked.", t);
    }
    
    public static final void t(final amxe amxe, final wyw wyw) {
        if (wyw == null) {
            return;
        }
        wyw.l((wzz)new wyt(xaa.c(71610)));
        aakr.u(amxe, wyw);
    }
    
    private final AlertDialog v(final int title, final int message, final aaiq aaiq, final Integer n, final int n2) {
        final AlertDialog$Builder setPositiveButton = new AlertDialog$Builder((Context)this.a).setTitle(title).setMessage(message).setCancelable(true).setPositiveButton(n2, (DialogInterface$OnClickListener)new ceh(aaiq, 19, (byte[])null));
        setPositiveButton.setNegativeButton((int)n, (DialogInterface$OnClickListener)null);
        return setPositiveButton.create();
    }
    
    private final void w(final String s, final amxe amxe, final wyw wyw, final aais j, final int n) {
        j.getClass();
        this.j = j;
        final ziy i = this.I;
        final Map d = aaan.d(amxe);
        final afeq s2 = ((aaec)i.a).s();
        final ArrayList list = new ArrayList();
        for (final amwz amwz : d.keySet()) {
            if (s2.contains((Object)amwz)) {
                list.add(d.get(amwz));
            }
        }
        Collections.sort((List<Object>)list, ((aaec)i.a).f());
        final boolean n2 = this.b.n();
        if (!list.isEmpty()) {
            if (!aezr.f(s) && n2) {
                final aabf e = ((aabo)this.v.a()).a().l().e(s);
                final boolean b = e != null && e.q();
                final boolean p5 = this.y.p(s);
                if ((b || p5) && !((tjm)this.w.a()).o()) {
                    this.c(n, list);
                    this.g(amxe);
                    t(amxe, wyw);
                    return;
                }
                final ziy k = this.I;
                final bu a = this.a;
                final ifp ifp = new ifp(this, n, amxe, wyw, list);
                amue amue;
                if ((amue = ((arwh)k.d).f().g) == null) {
                    amue = amue.a;
                }
                if (amue.E) {
                    k.j((Context)a, amxe, s, (List)aaan.a((List)list), (tcc)new aavo((tcc)ifp, 1));
                    return;
                }
                tbi.f();
                final ProgressDialog progressDialog = new ProgressDialog((Context)a);
                progressDialog.setMessage((CharSequence)((Context)a).getString(2132018899));
                progressDialog.setCancelable(false);
                progressDialog.setIndeterminate(true);
                progressDialog.show();
                Collections.sort((List<Object>)list, aaiz.c);
                final aujg aujg = new aujg(amxe.i.I(), s, (List)list, (byte[])null);
                teu.l(((afvs)k.c).rz((Callable)new veu(k, (Context)a, aujg, 10, (byte[])null, (byte[])null, (byte[])null)), (Executor)k.b, (tes)new fwr(progressDialog, (tcc)ifp, aujg, 9, (byte[])null, (byte[])null), (tet)new vcd(progressDialog, (tcc)ifp, aujg, 14, (byte[])null, (byte[])null), (Runnable)new ztq(progressDialog, (tcc)ifp, aujg, 10, (byte[])null, (byte[])null));
            }
            else {
                this.c(n, list);
                this.g(amxe);
                t(amxe, wyw);
            }
        }
    }
    
    private final AlertDialog x(final jwr[] array, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return new AlertDialog$Builder((Context)this.a).setTitle(2132018861).setCancelable(true).setAdapter((ListAdapter)new ifn(this, (Context)this.a, array, array, null), dialogInterface$OnClickListener).create();
    }
    
    public final void c(int i, final List list) {
        final AlertDialog e = this.e;
        final int n = 0;
        if (e == null) {
            final LayoutInflater from = LayoutInflater.from((Context)this.a);
            final View inflate = from.inflate(2131624952, (ViewGroup)null, false);
            final ListView h = (ListView)inflate.findViewById(2131430135);
            this.h = h;
            final View inflate2 = from.inflate(2131624953, (ViewGroup)h, false);
            this.h.addFooterView(inflate2);
            final aaik aaik = new aaik((Context)this.a, this.h);
            this.i = aaik;
            this.h.setAdapter((ListAdapter)aaik);
            this.g = inflate2.findViewById(2131430134);
            this.f = (CheckBox)inflate2.findViewById(2131431140);
            this.e = new AlertDialog$Builder((Context)this.a).setPositiveButton(2132018939, (DialogInterface$OnClickListener)null).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setView(inflate).create();
        }
        this.e.getClass();
        this.f.getClass();
        this.g.getClass();
        this.h.getClass();
        this.i.getClass();
        if (!list.isEmpty()) {
            final aaik j = this.i;
            j.setNotifyOnChange(false);
            j.clear();
            j.addAll((Collection)list);
            j.notifyDataSetChanged();
            final ListView b = j.b;
            if (b != null) {
                b.clearChoices();
            }
        }
        final Iterator iterator = list.iterator();
        while (true) {
            while (iterator.hasNext()) {
                if (((aaan)iterator.next()).a == amwz.h) {
                    if (!((fnc)((tmx)this.s.a).c()).e) {
                        this.e.setOnShowListener((DialogInterface$OnShowListener)new eyk(this, 8));
                        this.f.setVisibility(0);
                        this.g.setVisibility(0);
                        this.e.setTitle(i);
                        final aaik k = this.i;
                        final amwz a = list.get(0).a;
                        if (k.b != null) {
                            int count;
                            aaan aaan;
                            for (count = k.getCount(), i = n; i < count; ++i) {
                                aaan = (aaan)k.getItem(i);
                                if (aaan != null && aaan.a == a) {
                                    k.b.setItemChecked(i, true);
                                    break;
                                }
                            }
                        }
                        teu.n((aun)this.a, this.s.t(), (ttg)new hui(this, 8), (ttg)new hui(this, 9));
                        return;
                    }
                    break;
                }
            }
            this.e.setOnShowListener((DialogInterface$OnShowListener)null);
            continue;
        }
    }
    
    public final void d(final aaip n) {
        if (this.D == null) {
            this.D = this.x(new jwr[] { new jwr(2132017508, 2131231833, (byte[])null) }, (DialogInterface$OnClickListener)new ceh(this, 20, (byte[])null));
        }
        this.n = n;
        this.D.show();
    }
    
    public final void e(final amvk amvk, final wyw wyw) {
        final int b = amvk.b;
        Object o;
        ahab ahab;
        if (b == 88122887) {
            o = amvk.c;
            ahab = ((apip)o).i;
        }
        else if (b == 53345347) {
            o = amvk.c;
            ahab = ((ajfd)o).h;
        }
        else if (b == 64099105) {
            o = amvk.c;
            ahab = ((aixf)o).o;
        }
        else {
            o = null;
            ahab = null;
        }
        ahab.getClass();
        wyw.D((wzz)new wyt(ahab));
        this.x.a(o, wyw, (Pair)null, (aaiq)null);
    }
    
    public final void f(final amxe amxe, final wyw wyw, final aais aais, final String s) {
        this.w(null, amxe, wyw, aais, 2132017457);
    }
    
    public final void g(final amxe amxe) {
        final AlertDialog e = this.e;
        e.getClass();
        this.j.getClass();
        e.show();
        this.e.getButton(-1).setOnClickListener((View$OnClickListener)new ibb(this, 13));
        vdh.c(this.u, (List)amxe.h, (Object)amxe);
    }
    
    public final void h(final aaiq q) {
        this.q = q;
        if (this.H == null) {
            this.H = this.v(2132018847, 2132018846, (aaiq)new ifq(this, 1), 2132017611, 2132018852);
        }
        this.H.show();
    }
    
    public final void i(final String s, final amxe amxe, final wyw wyw, final aais aais) {
        this.w(s, amxe, wyw, aais, 2132017465);
    }
    
    public final void j(final aaiq aaiq) {
        if (this.b.Q()) {
            if (this.d == null) {
                this.d = new AlertDialog$Builder((Context)this.a).setPositiveButton(2132018939, (DialogInterface$OnClickListener)null).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setTitle(2132020014).setMessage(2132020013).setView(LayoutInflater.from((Context)this.a).inflate(2131624950, (ViewGroup)null, false)).create();
            }
            final AlertDialog d = this.d;
            d.getClass();
            d.show();
            final CheckBox checkBox = (CheckBox)this.d.findViewById(2131428707);
            checkBox.setChecked(false);
            this.d.getButton(-1).setOnClickListener((View$OnClickListener)new gbw(this, checkBox, aaiq, 11));
            return;
        }
        aaiq.b();
    }
    
    public final void k(final aaiq m, final aahz aahz) {
        this.m = m;
        if (this.B == null) {
            this.B = this.v(2132019499, 2132019498, (aaiq)new ifq(this, 3), 2132017611, 2132019496);
        }
        this.B.show();
    }
    
    public final void l(final aaiq l) {
        this.l = l;
        if (this.A == null) {
            this.A = this.v(2132019501, 2132019500, (aaiq)new ifq(this, 0), 2132017611, 2132019496);
        }
        this.A.show();
    }
    
    public final void m(final aaiq aaiq, final String s, final String message) {
        new AlertDialog$Builder((Context)this.a).setTitle((CharSequence)aezr.e(s)).setMessage((CharSequence)message).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setPositiveButton(2132019496, (DialogInterface$OnClickListener)new ceh(aaiq, 18)).create().show();
    }
    
    public final void n(final aair aair) {
        new AlertDialog$Builder((Context)this.a).setMessage(2132018891).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setPositiveButton(2132018939, (DialogInterface$OnClickListener)new jjm(aair, 1)).show();
    }
    
    public final void o(final aair o) {
        final wyw pf = this.z.pF();
        final wyt wyt = new wyt(xaa.c(144234));
        final wyt wyt2 = new wyt(xaa.c(144235));
        final wyt wyt3 = new wyt(xaa.c(144236));
        if (this.E == null) {
            this.E = new AlertDialog$Builder((Context)this.a).setTitle(2132019319).setNegativeButton(2132017611, (DialogInterface$OnClickListener)new giw(this, pf, (wzz)wyt3, 9)).setPositiveButton(2132019317, (DialogInterface$OnClickListener)new giw(this, pf, (wzz)wyt2, 10, (byte[])null)).create();
        }
        this.o = o;
        this.E.show();
        if (this.r.bY()) {
            pf.l((wzz)wyt);
            pf.m((wzz)wyt2, (wzz)wyt);
            pf.m((wzz)wyt3, (wzz)wyt);
        }
    }
    
    public final void p(final aair aair, final String message) {
        new AlertDialog$Builder((Context)this.a).setTitle(2132019319).setMessage((CharSequence)message).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setPositiveButton(2132019317, (DialogInterface$OnClickListener)new ceh(aair, 17)).create().show();
    }
    
    public final void q(final aair p) {
        if (this.G == null) {
            this.G = new AlertDialog$Builder((Context)this.a).setTitle(2132019319).setMessage(2132018860).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setPositiveButton(2132019530, (DialogInterface$OnClickListener)new ceh(this, 15)).create();
        }
        this.p = p;
        this.G.show();
    }
    
    public final void r(final aaiq aaiq, final aahz aahz) {
        this.k(aaiq, aahz);
    }
    
    public final void s(final aaiq k) {
        this.k = k;
        if (this.C == null) {
            this.C = this.v(2132019869, 2132019868, (aaiq)new ifq(this, 2), 2132019867, 2132019866);
        }
        this.C.show();
    }
    
    public final void u(final acxl t) {
        if (this.F == null) {
            this.F = this.x(new jwr[] { new jwr(2132019922, 2131231833, (byte[])null), new jwr(2132019497, 2131231832, (byte[])null) }, (DialogInterface$OnClickListener)new ceh(this, 16));
        }
        this.t = t;
        this.F.show();
    }
}
