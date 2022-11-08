import android.app.Activity;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import android.graphics.Bitmap;
import android.view.ViewStub;
import java.util.function.Predicate;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.RatingBar;
import android.view.View;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjg
{
    public final Object a;
    public final Object b;
    
    public jjg(final aceo a, final Executor b) {
        this.a = a;
        this.b = b;
    }
    
    public jjg(final acnj b, final Context context) {
        this.b = b;
        this.a = new tnw(context);
    }
    
    public jjg(final Context context, final zjy zjy, final zki zki) {
        this.a = context;
        final jzf b = new jzf();
        this.b = b;
        aenz.e((br)b, zjy.a(zki.c()));
    }
    
    public jjg(final View view) {
        this.a = view.findViewById(2131430773);
        this.b = view.findViewById(2131430778);
    }
    
    public jjg(final View view, final vax vax, final arud a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = view.findViewById(2131431950);
        view.findViewById(2131429229).setOnClickListener((View$OnClickListener)new iue(this, vax, 17, (byte[])null));
    }
    
    public jjg(final appc a, final apoz b) {
        this.a = a;
        this.b = b;
    }
    
    public jjg(final arud a, final abno b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public jjg(final atjj b, final atjj a) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public jjg(final atjj b, final atjj a, final byte[] array) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public jjg(final atjj b, final atjj a, final byte[] array, final byte[] array2) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public jjg(final atjj b, final atjj a, final byte[] array, final char[] array2) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public jjg(final atjj b, final atjj a, final char[] array) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public jjg(final atjj b, final atjj a, final char[] array, final byte[] array2) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public jjg(final atjj b, final atjj a, final short[] array) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public jjg(final fpg a, final Predicate b) {
        this.a = a;
        this.b = b;
    }
    
    public jjg(final String b, final anyc a) {
        this.b = b;
        this.a = a;
    }
    
    public final jgc a(final ViewStub viewStub) {
        final acng acng = (acng)((atjj)this.b).a();
        acng.getClass();
        final Context context = (Context)((atjj)this.a).a();
        context.getClass();
        viewStub.getClass();
        return new jgc(acng, context, viewStub);
    }
    
    public final ListenableFuture b(final abgr abgr, final int n, final int n2, final Bitmap bitmap) {
        if (abgr == null) {
            return afva.l(new Exception("1"));
        }
        final szy c = szy.c();
        final int b = abgr.b(n2);
        final int d = abgr.d();
        Uri parse = null;
        if (b < d) {
            final String g = abgr.g(b);
            if (g != null) {
                parse = Uri.parse(g);
            }
        }
        if (parse == null) {
            return afva.l(new Exception("2"));
        }
        ((aceo)this.a).l(parse, (szx)c);
        return afrp.e((ListenableFuture)c, aesm.a((aexg)new jbi(bitmap, abgr, n, n2)), (Executor)this.b);
    }
    
    public final void c(final ajzq ag) {
        if (ag == null) {
            return;
        }
        final jzf jzf = (jzf)this.b;
        if (((agzi)ag).equals(jzf.ag)) {
            return;
        }
        jzf.ag = ag;
        jzf.aK();
    }
    
    public final void d() {
        ((RatingBar)this.a).setVisibility(8);
        ((RatingBar)this.b).setVisibility(8);
    }
    
    public final void e(final float n, final int n2) {
        this.d();
        if (Float.compare(n, 0.0f) <= 0) {
            return;
        }
        final int n3 = n2 - 1;
        if (n2 == 0) {
            throw null;
        }
        if (n3 == 0 || n3 == 1) {
            ((RatingBar)this.a).setRating(n);
            ((RatingBar)this.a).setVisibility(0);
            return;
        }
        if (n3 != 2) {
            return;
        }
        ((RatingBar)this.b).setRating(n);
        ((RatingBar)this.b).setVisibility(0);
    }
    
    public final jsr f(final ajxm ajxm, final acmc acmc) {
        final Activity activity = (Activity)((atjj)this.b).a();
        activity.getClass();
        final mrm mrm = (mrm)((atjj)this.a).a();
        mrm.getClass();
        ajxm.getClass();
        acmc.getClass();
        return new jsr(activity, mrm, ajxm, acmc, null, null, null);
    }
}
