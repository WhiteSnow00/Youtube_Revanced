import j$.util.function.Consumer$_CC;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import android.widget.LinearLayout;
import android.app.AlertDialog$Builder;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achl implements Consumer
{
    public final Object a;
    private final int b;
    
    public achl(final adbm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public achl(final adhx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public achl(final adte a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public achl(final ahcr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public achl(final aheu a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
    }
    
    public achl(final AlertDialog$Builder a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public achl(final LinearLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public achl(final apjo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public achl(final veh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public achl(final vrx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        switch (this.b) {
            default: {
                fkl.c((adte)this.a, o);
                return;
            }
            case 10: {
                adtd.a((aheu)this.a, o);
                return;
            }
            case 9: {
                final Object a = this.a;
                final String s = (String)o;
                ((ahcr)a).copyOnWrite();
                apjp.h((apjp)((apjo)a).instance, s);
                return;
            }
            case 8: {
                final Object a2 = this.a;
                final boolean booleanValue = (boolean)o;
                final ahcr ahcr = (ahcr)a2;
                ahcr.copyOnWrite();
                final adoj adoj = (adoj)ahcr.instance;
                final adoj a3 = adoj.a;
                adoj.b |= 0x10000;
                adoj.s = booleanValue;
                return;
            }
            case 7: {
                final Object a4 = this.a;
                final long longValue = (long)o;
                final ahcr ahcr2 = (ahcr)a4;
                ahcr2.copyOnWrite();
                final adoj adoj2 = (adoj)ahcr2.instance;
                final adoj a5 = adoj.a;
                adoj2.b |= 0x8000;
                adoj2.r = longValue;
                return;
            }
            case 6: {
                final Object a6 = this.a;
                final String j = (String)o;
                final ahcr ahcr3 = (ahcr)a6;
                ahcr3.copyOnWrite();
                final auaj auaj = (auaj)ahcr3.instance;
                final auaj a7 = auaj.a;
                j.getClass();
                auaj.b |= 0x20;
                auaj.j = j;
                return;
            }
            case 5: {
                final Object a8 = this.a;
                final atnb atnb = (atnb)o;
                final Object f = ((adkp)((adhw)((adhx)a8).d).j).f;
                final int e = toz.e;
                final toz toz = (toz)f;
                toz.e(e, 2);
                ((Executor)toz.g.a()).execute((Runnable)new swa(toz, atnb, 8));
                return;
            }
            case 4: {
                ((ViewGroup)this.a).addView((View)o);
                return;
            }
            case 3: {
                ((AlertDialog$Builder)this.a).setTitle((CharSequence)o);
                return;
            }
            case 2: {
                final Object a9 = this.a;
                final acmm acmm = (acmm)o;
                final aopk a10 = ((adbm)a9).d.a;
                int size;
                if (a10 == null) {
                    size = 0;
                }
                else {
                    size = a10.c.size();
                }
                ((nr)acmm).l(0, size);
                return;
            }
            case 1: {
                ((vrx)this.a).e = (ajvt)o;
                return;
            }
            case 0: {
                ((veh)this.a).a((aisc)o);
            }
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        switch (this.b) {
            default: {
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
