import android.content.SharedPreferences;
import android.app.Activity;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbo implements acks
{
    private final int a;
    private final Object b;
    private final Object c;
    private final Object d;
    private final Object e;
    private final Object f;
    
    public jbo(final Context b, final acgs e, final vcy f, final acpk c, final adda d, final int a) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.f = f;
        this.c = c;
        this.d = d;
    }
    
    public jbo(final Context b, final arkg c, final atke d, final wyw e, final vai f, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public jbo(final Context b, final gjh f, final acgs c, final vcy e, final ziy d, final int a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    public jbo(final atke b, final atke e, final atke f, final atke c, final atke d, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
        this.e = e;
        f.getClass();
        this.f = f;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    public jbo(final atke b, final atke e, final atke f, final atke c, final atke d, final int a, final byte[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
        this.e = e;
        f.getClass();
        this.f = f;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    public jbo(final atke f, final atke b, final atke d, final atke c, final atke e, final int a, final char[] array) {
        this.a = a;
        f.getClass();
        this.f = f;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
    }
    
    public jbo(final atke f, final atke d, final atke e, final atke b, final atke c, final int a, final int[] array) {
        this.a = a;
        f.getClass();
        this.f = f;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public jbo(final atke e, final atke f, final atke c, final atke b, final atke d, final int a, final short[] array) {
        this.a = a;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
    }
    
    public jbo(final atke b, final atke d, final atke f, final atke e, final atke c, final int a, final boolean[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        f.getClass();
        this.f = f;
        this.e = e;
        this.c = c;
    }
    
    @Override
    public final acko a(final ViewGroup viewGroup) {
        switch (this.a) {
            default: {
                return (acko)new addb((Context)this.b, (acgs)this.e, (vcy)this.f, (acpk)this.c, (adda)this.d);
            }
            case 7: {
                final bu bu = (bu)((atke)this.b).a();
                bu.getClass();
                final ziy ziy = (ziy)((atke)this.d).a();
                ziy.getClass();
                final vcy vcy = (vcy)((atke)this.f).a();
                vcy.getClass();
                final acpk acpk = (acpk)((atke)this.e).a();
                acpk.getClass();
                final acgs acgs = (acgs)((atke)this.c).a();
                acgs.getClass();
                viewGroup.getClass();
                return (acko)new szq(bu, ziy, vcy, acpk, acgs, viewGroup, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 6: {
                final vcy vcy2 = (vcy)((atke)this.f).a();
                vcy2.getClass();
                final wyw wyw = (wyw)((atke)this.d).a();
                wyw.getClass();
                final Context context = (Context)((arlt)this.e).a;
                context.getClass();
                final ewy ewy = (ewy)((atke)this.b).a();
                ewy.getClass();
                final tmx tmx = (tmx)((atke)this.c).a();
                tmx.getClass();
                return (acko)new lnr(vcy2, wyw, context, ewy, tmx, viewGroup);
            }
            case 5: {
                final Context context2 = (Context)((arlt)this.e).a;
                context2.getClass();
                final aclf aclf = (aclf)((atke)this.f).a();
                aclf.getClass();
                final acpk acpk2 = (acpk)((atke)this.c).a();
                acpk2.getClass();
                final hmw hmw = (hmw)((atke)this.b).a();
                hmw.getClass();
                return (acko)new kgs(context2, aclf, acpk2, hmw, (aezp)((atke)this.d).a(), viewGroup, (byte[])null, (byte[])null);
            }
            case 4: {
                final Context context3 = (Context)((atke)this.f).a();
                context3.getClass();
                final gjh gjh = (gjh)((atke)this.b).a();
                gjh.getClass();
                final lnu lnu = (lnu)((atke)this.d).a();
                lnu.getClass();
                final asid asid = (asid)((atke)this.c).a();
                asid.getClass();
                final aeea aeea = (aeea)((atke)this.e).a();
                aeea.getClass();
                return (acko)new jrv(context3, gjh, lnu, asid, aeea, viewGroup, (byte[])null, (byte[])null, (byte[])null);
            }
            case 3: {
                final Activity activity = (Activity)((atke)this.b).a();
                activity.getClass();
                final acgs acgs2 = (acgs)((atke)this.e).a();
                acgs2.getClass();
                final vcy vcy3 = (vcy)((atke)this.f).a();
                vcy3.getClass();
                final SharedPreferences sharedPreferences = (SharedPreferences)((atke)this.c).a();
                sharedPreferences.getClass();
                final aeea aeea2 = (aeea)((atke)this.d).a();
                aeea2.getClass();
                return (acko)new jkc(activity, acgs2, vcy3, sharedPreferences, aeea2, viewGroup, (byte[])null);
            }
            case 2: {
                final Activity activity2 = (Activity)((atke)this.b).a();
                activity2.getClass();
                final acgs acgs3 = (acgs)((atke)this.e).a();
                acgs3.getClass();
                final vcy vcy4 = (vcy)((atke)this.f).a();
                vcy4.getClass();
                final aeea aeea3 = (aeea)((atke)this.c).a();
                aeea3.getClass();
                final vai vai = (vai)((atke)this.d).a();
                vai.getClass();
                return (acko)new jix(activity2, acgs3, vcy4, aeea3, vai, viewGroup, (byte[])null);
            }
            case 1: {
                return (acko)new fxl((Context)this.b, viewGroup, (gjh)this.f, (acgs)this.c, (vcy)this.e, (ziy)this.d, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 0: {
                return (acko)new jbp((Context)this.b, (arkg)this.c, (acbm)((atke)this.d).a(), (wyw)this.e, (vai)this.f, viewGroup, 0);
            }
        }
    }
}
