import j$.util.function.Consumer$_CC;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.atomic.AtomicReference;
import j$.util.Optional;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaqr implements Consumer
{
    public final Object a;
    private final int b;
    
    public aaqr(final aays a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final aazk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final abmo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final abqv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final absu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final abwp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final acet a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final ahcr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final aqdg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final asln a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final atlt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final twk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaqr(final vrx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        switch (this.b) {
            default: {
                ((vrx)this.a).c = (String)o;
                return;
            }
            case 19: {
                ((oui)this.a).y((opx)o);
                return;
            }
            case 18: {
                ((oui)this.a).d((oum)o);
                return;
            }
            case 17: {
                ((oui)this.a).H((out)o);
                return;
            }
            case 16: {
                final Object a = this.a;
                final Optional optional = (Optional)o;
                asmr.b((AtomicReference)a);
                return;
            }
            case 15: {
                final Object a2 = this.a;
                final String s = (String)o;
                final abwp abwp = (abwp)a2;
                final abxd abxd = abwp.m.get(s);
                if (abxd != null) {
                    if (abxd.a.a() == 1 && abwp.j == abxd) {
                        abwp.c();
                        return;
                    }
                    abwp.X(s);
                }
                return;
            }
            case 14: {
                ((abwp)this.a).aC((boolean)o);
                return;
            }
            case 13: {
                final Object a3 = this.a;
                final String u = (String)o;
                final ahcr f = ((absu)a3).F;
                f.copyOnWrite();
                final apvp apvp = (apvp)f.instance;
                final apvp a4 = apvp.a;
                u.getClass();
                apvp.b |= 0x40000;
                apvp.u = u;
                return;
            }
            case 12: {
                ((twk)this.a).h("au_d", (String)o);
                return;
            }
            case 11: {
                ((asla)o).L(((abmo)this.a).c).ab((asmi)abgj.j, (asmi)abgj.k);
                return;
            }
            case 10: {
                ((asla)o).L(((abmo)this.a).c).ab((asmi)abgj.j, (asmi)abgj.k);
                return;
            }
            case 9: {
                final Object a5 = this.a;
                final anxw f2 = (anxw)o;
                final ahcr ahcr = (ahcr)a5;
                ahcr.copyOnWrite();
                final lrt lrt = (lrt)ahcr.instance;
                final lrt a6 = lrt.a;
                f2.getClass();
                lrt.F = f2;
                lrt.c |= 0x1;
                return;
            }
            case 8: {
                final Object a7 = this.a;
                final ahbt e = (ahbt)o;
                final ahcr ahcr2 = (ahcr)a7;
                ahcr2.copyOnWrite();
                final lrt lrt2 = (lrt)ahcr2.instance;
                final lrt a8 = lrt.a;
                e.getClass();
                lrt2.b |= Integer.MIN_VALUE;
                lrt2.E = e;
                return;
            }
            case 7: {
                ((auna)this.a).tt(o);
                return;
            }
            case 6: {
                ((aazk)this.a).a((PlayerResponseModel)o);
                return;
            }
            case 5: {
                final Object a9 = this.a;
                final xbm xbm = (xbm)o;
                final aays aays = (aays)a9;
                aays.a.n(xbm, aays.b.c(), (aisc)null);
                return;
            }
            case 4: {
                ((abqv)this.a).M((SubtitleTrack)o);
                return;
            }
            case 3: {
                final Object a10 = this.a;
                final ahyd ahyd = (ahyd)o;
                ((ahcr)a10).copyOnWrite();
                aqdh.d((aqdh)((aqdg)a10).instance, ahyd);
                return;
            }
            case 2: {
                final Object a11 = this.a;
                final aigf aigf = (aigf)o;
                final ahcr ahcr3 = (ahcr)a11;
                ahcr3.copyOnWrite();
                final aqdy aqdy = (aqdy)ahcr3.instance;
                final aqdy a12 = aqdy.a;
                aigf.getClass();
                final ahdp e2 = aqdy.e;
                if (!e2.c()) {
                    aqdy.e = ahcz.mutableCopy(e2);
                }
                aqdy.e.add((Object)aigf);
                return;
            }
            case 1: {
                final Object a13 = this.a;
                final aigf aigf2 = (aigf)o;
                final ahcr ahcr4 = (ahcr)a13;
                ahcr4.copyOnWrite();
                final aqdy aqdy2 = (aqdy)ahcr4.instance;
                final aqdy a14 = aqdy.a;
                aigf2.getClass();
                final ahdp c = aqdy2.c;
                if (!c.c()) {
                    aqdy2.c = ahcz.mutableCopy(c);
                }
                aqdy2.c.add((Object)aigf2);
                return;
            }
            case 0: {
                final Object a15 = this.a;
                final aigf aigf3 = (aigf)o;
                final ahcr ahcr5 = (ahcr)a15;
                ahcr5.copyOnWrite();
                final aqdy aqdy3 = (aqdy)ahcr5.instance;
                final aqdy a16 = aqdy.a;
                aigf3.getClass();
                final ahdp d = aqdy3.d;
                if (!d.c()) {
                    aqdy3.d = ahcz.mutableCopy(d);
                }
                aqdy3.d.add((Object)aigf3);
            }
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        switch (this.b) {
            default: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 19: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 18: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 17: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 16: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 15: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 14: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 13: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 12: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 11: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 10: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 9: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 8: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 7: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 6: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 5: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 4: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 3: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 2: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 1: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 0: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
        }
    }
}
