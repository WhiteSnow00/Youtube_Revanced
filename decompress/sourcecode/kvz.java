import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.Iterator;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvz extends usm implements abnq
{
    public final vdo a;
    public final vax b;
    public aexq c;
    public aexq d;
    private final atjj e;
    private usx f;
    private final arhr g;
    private final abzk h;
    private final wwv i;
    private final uuc j;
    private final abns k;
    private final asib l;
    private final asho m;
    
    public kvz(final abzk h, final arhr g, final atjj e, final vbq vbq, final zki zki, final wwv i, final vup vup, final vax b, final abns k, final asho m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(i);
        final aewp a = aewp.a;
        this.c = (aexq)a;
        this.d = (aexq)a;
        this.e = e;
        this.g = g;
        this.a = (vdo)vbq.a(zki.c());
        this.h = h;
        this.i = i;
        this.j = vup.q(i);
        this.k = k;
        this.b = b;
        this.l = new asib();
        this.m = m;
    }
    
    public final View a() {
        return this.h.a();
    }
    
    public final usx b() {
        return this.f;
    }
    
    public final void c(final vdv vdv) {
        if (this.c.h()) {
            final Iterator iterator = ((aour)this.c.c()).getSegmentsData().iterator();
            while (iterator.hasNext()) {
                vdv.g(((aous)iterator.next()).b);
            }
        }
    }
    
    public final void e(final acik acik) {
    }
    
    public final void g(ajnl q, final alff alff) {
        if (q != null) {
            ajnj ajnj;
            if ((ajnj = q.g) == null) {
                ajnj = ajnj.a;
            }
            aotz a;
            if (ajnj.b == 154115041) {
                a = (aotz)ajnj.c;
            }
            else {
                a = aotz.a;
            }
            anss anss;
            if ((anss = a.b) == null) {
                anss = anss.a;
            }
            if (((agzd)anss).rs((agyr)ElementRendererOuterClass.elementRenderer)) {
                ajnk ajnk;
                if ((ajnk = q.f) == null) {
                    ajnk = ajnk.a;
                }
                if (ajnk.b == 138681548) {
                    super.g(q, alff);
                    ajnk ajnk2;
                    if ((ajnk2 = q.f) == null) {
                        ajnk2 = ajnk.a;
                    }
                    if (ajnk2.b == 138681548) {
                        final usx f = this.f;
                        if (f instanceof utz) {
                            ((utz)f).u((ajnn)ajnk2.c);
                        }
                        else {
                            final utz f2 = (utz)this.e.a();
                            ajnn a2;
                            if (ajnk2.b == 138681548) {
                                a2 = (ajnn)ajnk2.c;
                            }
                            else {
                                a2 = ajnn.a;
                            }
                            f2.u(a2);
                            f2.m = super.p;
                            this.f = (usx)f2;
                        }
                    }
                    ajnj ajnj2;
                    if ((ajnj2 = q.g) == null) {
                        ajnj2 = ajnj.a;
                    }
                    aotz a3;
                    if (ajnj2.b == 154115041) {
                        a3 = (aotz)ajnj2.c;
                    }
                    else {
                        a3 = aotz.a;
                    }
                    anss anss2;
                    if ((anss2 = a3.b) == null) {
                        anss2 = anss.a;
                    }
                    if (((agzd)anss2).rs((agyr)ElementRendererOuterClass.elementRenderer)) {
                        final acae acae = (acae)this.g.a();
                        aotz a4;
                        if (ajnj2.b == 154115041) {
                            a4 = (aotz)ajnj2.c;
                        }
                        else {
                            a4 = aotz.a;
                        }
                        anss anss3;
                        if ((anss3 = a4.b) == null) {
                            anss3 = anss.a;
                        }
                        final abzh d = acae.d((ajkj)((agzd)anss3).rr((agyr)ElementRendererOuterClass.elementRenderer));
                        final acij acij = new acij();
                        acij.a(this.i);
                        this.h.b(acij, d);
                    }
                    this.j.f(q, alff);
                    q = super.q;
                    if (q != null) {
                        ajnj ajnj3;
                        if ((ajnj3 = q.g) == null) {
                            ajnj3 = ajnj.a;
                        }
                        aotz a5;
                        if (ajnj3.b == 154115041) {
                            a5 = (aotz)ajnj3.c;
                        }
                        else {
                            a5 = aotz.a;
                        }
                        aoty aoty;
                        if ((aoty = a5.c) == null) {
                            aoty = aoty.a;
                        }
                        if ((aoty.b & 0x8) != 0x0) {
                            this.l.c(this.a.i(aoty.f).J((asjd)kbz.m).W((asjc)kus.k).k((Class)aour.class).aB((asix)new kuc(this, 19)));
                        }
                    }
                }
            }
        }
    }
    
    public final void j() {
    }
    
    public final void k(final aioe aioe) {
        this.j.a();
        this.l.f(this.lX(this.k));
    }
    
    public final void l() {
        this.l.b();
        final ajnl q = super.q;
        if (q != null) {
            final vdv c = this.a.c();
            ajnj ajnj;
            if ((ajnj = q.g) == null) {
                ajnj = ajnj.a;
            }
            aotz a;
            if (ajnj.b == 154115041) {
                a = (aotz)ajnj.c;
            }
            else {
                a = aotz.a;
            }
            aoty aoty;
            if ((aoty = a.c) == null) {
                aoty = aoty.a;
            }
            if ((aoty.b & 0x1) != 0x0) {
                c.g(aoty.c);
            }
            if ((aoty.b & 0x2) != 0x0) {
                c.g(aoty.d);
            }
            if ((aoty.b & 0x4) != 0x0) {
                c.g(aoty.e);
            }
            if ((aoty.b & 0x8) != 0x0) {
                c.g(aoty.f);
            }
            if ((aoty.b & 0x10) != 0x0) {
                c.g(aoty.g);
            }
            this.c(c);
            c.b().X();
        }
        this.j.b();
        this.h.c((acir)null);
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().e).R().P(this.m).am((asix)new kuc(this, 17), (asix)kul.g), ((asgt)abns.q().i).am((asix)new kuc(this, 18), (asix)kul.g) };
    }
    
    public final void m() {
        this.j.c();
    }
    
    public final void n(final aioe aioe) {
        this.j.d(aioe);
    }
    
    public final void q(final usz usz) {
    }
}
