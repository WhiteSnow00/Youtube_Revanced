import java.util.concurrent.Executor;
import android.view.ViewGroup;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyw implements acks
{
    private final int a;
    private final Object b;
    private final Object c;
    private final Object d;
    private final Object e;
    
    public gyw(final Activity c, final acgs b, final ziy e, final vcy d, final int a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    public gyw(final Context c, final acgs e, final wyw b, final rlf d, final int a) {
        this.a = a;
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
        b.getClass();
        this.b = b;
        this.d = d;
    }
    
    public gyw(final Context c, final arkg e, final acbm b, final wyw d, final int a) {
        this.a = a;
        this.c = c;
        this.e = e;
        this.b = b;
        this.d = d;
    }
    
    public gyw(final atke c, final atke d, final atke b, final atke e, final int a) {
        this.a = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        e.getClass();
        this.e = e;
    }
    
    public gyw(final atke b, final atke d, final atke c, final atke e, final int a, final byte[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
    }
    
    public gyw(final atke b, final atke d, final atke e, final atke c, final int a, final char[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        this.e = e;
        c.getClass();
        this.c = c;
    }
    
    public gyw(final uho b, final gzs c, final tyv d, final asid e, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public gyw(final vcy b, final wyw e, final bi c, final tgd d, final int a) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final acko a(final ViewGroup viewGroup) {
        switch (this.a) {
            default: {
                return (acko)new addp((vcy)this.b, (wyw)this.e, (bi)this.c, (tgd)this.d);
            }
            case 6: {
                final Context context = (Context)((arlt)this.b).a;
                context.getClass();
                final vcy vcy = (vcy)((atke)this.d).a();
                vcy.getClass();
                final acgs acgs = (acgs)((atke)this.e).a();
                acgs.getClass();
                final ziy ziy = (ziy)((atke)this.c).a();
                ziy.getClass();
                viewGroup.getClass();
                return (acko)new tat(context, vcy, acgs, ziy, viewGroup, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 5: {
                return (acko)new rkw((Context)this.c, (acgs)this.e, (wyw)this.b, (rlf)this.d);
            }
            case 4: {
                final Context context2 = (Context)((arlt)this.b).a;
                context2.getClass();
                final vcy vcy2 = (vcy)((atke)this.d).a();
                vcy2.getClass();
                final oby oby = (oby)((atke)this.c).a();
                oby.getClass();
                final Executor executor = (Executor)((atke)this.e).a();
                executor.getClass();
                viewGroup.getClass();
                return (acko)new knb(context2, vcy2, oby, executor, viewGroup);
            }
            case 3: {
                final Activity activity = (Activity)((atke)this.c).a();
                activity.getClass();
                return (acko)new jjx(activity, (jka)((atke)this.d).a(), (atke)this.b, (jkp)((atke)this.e).a(), viewGroup);
            }
            case 2: {
                return (acko)new ken((Context)this.c, (arkg)this.e, (acbm)this.b, (wyw)this.d, viewGroup, 1);
            }
            case 1: {
                return (acko)new fxn((Activity)this.c, (acgs)this.b, (vcy)this.d, (ziy)this.e, viewGroup, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 0: {
                return new khd((uho)this.b, (gzs)this.c, (tyv)this.d, (asid)this.e, viewGroup, 1);
            }
        }
    }
}
