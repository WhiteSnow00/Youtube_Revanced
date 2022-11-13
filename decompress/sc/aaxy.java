import j$.util.function.Consumer$_CC;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.atomic.AtomicReference;
import j$.util.Optional;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import android.widget.LinearLayout;
import android.app.AlertDialog$Builder;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaxy implements Consumer
{
    public final Object a;
    private final int b;
    
    public aaxy(final aaxj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final aayd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final abri a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final abve a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final acdg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final aczy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final adgk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final ahaz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final AlertDialog$Builder a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final LinearLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final asir a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final atiw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final tvi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final vcy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaxy(final vqo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final String j = (String)o;
                final ahaz ahaz = (ahaz)a;
                ahaz.copyOnWrite();
                final atxn atxn = (atxn)ahaz.instance;
                final atxn a2 = atxn.a;
                j.getClass();
                atxn.b |= 0x20;
                atxn.j = j;
                return;
            }
            case 19: {
                final Object a3 = this.a;
                final atke atke = (atke)o;
                final Object f = ((adiz)((adgj)((adgk)a3).d).j).f;
                final int e = tnz.e;
                final tnz tnz = (tnz)f;
                tnz.e(e, 2);
                ((Executor)tnz.g.a()).execute((Runnable)new tei(tnz, atke, 4));
                return;
            }
            case 18: {
                ((ViewGroup)this.a).addView((View)o);
                return;
            }
            case 17: {
                ((AlertDialog$Builder)this.a).setTitle((CharSequence)o);
                return;
            }
            case 16: {
                final Object a4 = this.a;
                final ackz ackz = (ackz)o;
                final aona a5 = ((aczy)a4).d.a;
                int size;
                if (a5 == null) {
                    size = 0;
                }
                else {
                    size = a5.c.size();
                }
                ((nq)ackz).l(0, size);
                return;
            }
            case 15: {
                ((vcy)this.a).a((aiqj)o);
                return;
            }
            case 14: {
                ((vqo)this.a).e = (ajtu)o;
                return;
            }
            case 13: {
                ((vqo)this.a).c = (String)o;
                return;
            }
            case 12: {
                ((otq)this.a).y((oph)o);
                return;
            }
            case 11: {
                ((otq)this.a).d((otu)o);
                return;
            }
            case 10: {
                ((otq)this.a).H((oub)o);
                return;
            }
            case 9: {
                final Object a6 = this.a;
                final Optional optional = (Optional)o;
                asjv.b((AtomicReference)a6);
                return;
            }
            case 8: {
                final Object a7 = this.a;
                final String s = (String)o;
                final abve abve = (abve)a7;
                final abvu abvu = abve.m.get(s);
                if (abvu != null) {
                    if (abvu.a.a() == 1 && abve.j == abvu) {
                        abve.c();
                        return;
                    }
                    abve.X(s);
                }
                return;
            }
            case 7: {
                ((abve)this.a).aC((boolean)o);
                return;
            }
            case 6: {
                final Object a8 = this.a;
                final String u = (String)o;
                final ahaz f2 = ((abri)a8).F;
                f2.copyOnWrite();
                final aptc aptc = (aptc)f2.instance;
                final aptc a9 = aptc.a;
                u.getClass();
                aptc.b |= 0x40000;
                aptc.u = u;
                return;
            }
            case 5: {
                ((tvi)this.a).h("au_d", (String)o);
                return;
            }
            case 4: {
                final Object a10 = this.a;
                final anvq f3 = (anvq)o;
                final ahaz ahaz2 = (ahaz)a10;
                ahaz2.copyOnWrite();
                final lrf lrf = (lrf)ahaz2.instance;
                final lrf a11 = lrf.a;
                f3.getClass();
                lrf.F = f3;
                lrf.c |= 0x1;
                return;
            }
            case 3: {
                final Object a12 = this.a;
                final ahab e2 = (ahab)o;
                final ahaz ahaz3 = (ahaz)a12;
                ahaz3.copyOnWrite();
                final lrf lrf2 = (lrf)ahaz3.instance;
                final lrf a13 = lrf.a;
                e2.getClass();
                lrf2.b |= Integer.MIN_VALUE;
                lrf2.E = e2;
                return;
            }
            case 2: {
                ((aukf)this.a).tu((Object)o);
                return;
            }
            case 1: {
                final Object a14 = this.a;
                final xag xag = (xag)o;
                final aaxj aaxj = (aaxj)a14;
                aaxj.a.n(xag, aaxj.b.c(), null);
                return;
            }
            case 0: {
                ((aayd)this.a).a((PlayerResponseModel)o);
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
