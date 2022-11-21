import java.util.Iterator;
import android.text.TextUtils;
import com.google.protobuf.MessageLite;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class acrl extends acqk implements acpg, acsj, acsk, acpq, acqu, thj
{
    private boolean a;
    private String b;
    private final List c;
    public final aheu e;
    public final aheu f;
    
    public acrl(final vnq vnq, final acrd acrd, final thg thg, final tre tre, final xab xab, final acsx acsx) {
        this(vnq, acrd, thg, tre, xab, acsx, new acmr());
    }
    
    public acrl(final vnq vnq, final acrd acrd, final thg thg, final tre tre, final xab xab, final acsx acsx, final acmr acmr) {
        this(vnq, acrd, thg, tre, xab, acsx, acmr, afag.a);
    }
    
    public acrl(final vnq vnq, final acrd acrd, final thg thg, final tre tre, final xab xab, final acsx acsx, final acmr acmr, final afbh afbh) {
        acrd.a();
        super(vnq, thg, tre, xab, acsx.a(acsx), acmr);
        this.c = new ArrayList();
        acrd.b(vhz.class);
        thg.getClass();
        if (acsx instanceof acrj) {
            final acrj acrj = (acrj)acsx;
            this.a = acrj.a;
            this.b = acrj.b;
        }
        thg.g((Object)this);
        acmr.nf((acma)new kgp((acre)this, 7));
        acmr.nf((acma)new kgp((acpq)this, 9));
        this.e = new aheu((byte[])null, (short[])null);
        this.f = new aheu((byte[])null, (short[])null);
        this.P((acsq)new acri(afbh));
    }
    
    @Override
    public final void D(final Object o) {
        this.E(o);
    }
    
    public final void K(final afbk afbk) {
        super.K(afbk);
    }
    
    public final void O(final acrk acrk) {
        this.c.add(acrk);
    }
    
    protected final void P(final acsq acsq) {
        this.e.Q(acsq);
    }
    
    public final void Q(final acrg acrg) {
        super.J(acrg.a());
    }
    
    public final void R(final vrt vrt) {
        super.J(((voa)vrt).b());
    }
    
    public final void S(final Object o, final Object o2) {
        this.L(o, o2);
    }
    
    public void j(final vhz vhz) {
        this.qK();
        almc almc;
        if ((almc = vhz.a.d) == null) {
            almc = almc.a;
        }
        this.a = false;
        if (almc != null) {
            final int b = almc.b;
            if ((b & 0x1) != 0x0) {
                this.q(almc);
            }
            else if ((b & 0x2) != 0x0) {
                almd almd;
                if ((almd = almc.d) == null) {
                    almd = almd.a;
                }
                almf almf;
                if ((almf = almd.d) == null) {
                    almf = almf.a;
                }
                if ((almf.b & 0x1) != 0x0) {
                    almd almd2;
                    if ((almd2 = almc.d) == null) {
                        almd2 = almd.a;
                    }
                    this.E(almd2);
                    this.a = true;
                }
            }
            else {
                final MessageLite k = vqf.k(almc);
                if (k != null) {
                    if (k instanceof ajon) {
                        final aheu f = this.f;
                        almc almc2;
                        if ((almc2 = vhz.a.d) == null) {
                            almc2 = almc.a;
                        }
                        this.G(f.P((List)afgh.r(almc2)));
                    }
                    else {
                        this.E(k);
                    }
                    this.a = true;
                }
            }
        }
        this.qR(vhz);
        this.b = vhz.a.i;
    }
    
    protected final /* bridge */ Object lE(final anxa anxa) {
        if (anxa != null && ((ahcu)anxa).ry((ahci)alme.b)) {
            return new vhz((alme)((ahcu)anxa).rx((ahci)alme.b));
        }
        return null;
    }
    
    public String lF() {
        return this.b;
    }
    
    @Override
    public void lG(final Object o, final int n) {
        if (this.a) {
            this.F(o, n + 1);
            return;
        }
        this.F(o, n);
    }
    
    public void lH(final anwr anwr, final aisc aisc) {
        this.qK();
        this.mB(aamp.x(anwr));
    }
    
    protected void mL(final vhz vhz, final acbk acbk) {
        super.my(vhz, acbk);
        if (vhz == null) {
            return;
        }
        this.s(vhz, acbk.a());
    }
    
    @Override
    public Class[] mr(final Class clazz, final Object o, final int n) {
        if (clazz == acrl.class) {
            Class[] array;
            if (n != -1) {
                array = null;
                if (n != 0) {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                                sb.append(n);
                                throw new IllegalStateException(sb.toString());
                            }
                            this.Q((acrg)o);
                        }
                        else {
                            this.R((vrt)o);
                        }
                    }
                    else {
                        this.n((vav)o);
                    }
                }
                else {
                    this.qS((vau)o);
                }
            }
            else {
                array = new Class[] { vau.class, vav.class, vrt.class, acrg.class };
            }
            return array;
        }
        return aamz.x(this, o, n);
    }
    
    protected /* bridge */ void my(final Object o, final acbk acbk) {
        this.mL((vhz)o, acbk);
    }
    
    public final void mz(final anwr anwr, final tui tui, final acqm acqm, final aisc aisc) {
        throw null;
    }
    
    public void n(final vav vav) {
        if (vav.c() != null) {
            super.K(vav.c());
            return;
        }
        super.J(vav.d());
    }
    
    protected void q(final almc almc) {
        almb almb;
        if ((almb = almc.c) == null) {
            almb = almb.a;
        }
        ajws ajws;
        if ((ajws = almb.c) == null) {
            ajws = ajws.a;
        }
        if (!TextUtils.isEmpty((CharSequence)acbu.b(ajws))) {
            almb almb2;
            if ((almb2 = almc.c) == null) {
                almb2 = almb.a;
            }
            this.E(almb2);
            this.a = true;
            return;
        }
        if ((almc.b & 0x40) != 0x0) {
            ajon ajon;
            if ((ajon = almc.i) == null) {
                ajon = ajon.a;
            }
            this.E(ajon);
        }
    }
    
    protected void qR(final vhz vhz) {
        if (vhz == null) {
            return;
        }
        this.lM(vhz.a());
        this.G(this.e.P((List)vhz.a.e));
    }
    
    public void qS(final vau vau) {
        super.J(vau.b());
    }
    
    @Override
    public acsx qz() {
        return new acrj(super.qz(), this.a, this.b);
    }
    
    protected void s(final vhz vhz, final acbj acbj) {
        if (acbj == acbj.d) {
            this.j(vhz);
            return;
        }
        this.qR(vhz);
    }
    
    @Override
    public void sa() {
        final acla a = this.a();
        if (a != null) {
            for (int i = 0; i < a.a(); ++i) {
                accu.c(a.c(i));
            }
        }
        super.sa();
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((acrk)iterator.next()).a();
        }
        this.c.clear();
    }
}
