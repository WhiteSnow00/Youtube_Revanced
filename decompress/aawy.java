import android.graphics.Bitmap;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawy extends aass implements aatk, aaun
{
    public final acig a;
    public final aaue b;
    public final aaut c;
    public final aauj e;
    public final aark f;
    private final aasy g;
    
    public aawy(final Context context, final aaux aaux, final aaut c, final acig a, final ViewGroup viewGroup, final aawz aawz) {
        aaux.getClass();
        c.getClass();
        this.c = c;
        this.a = a;
        this.g = new aasy(aaux.c.a(), 40.0f, 30.0f);
        final aavf a2 = c.a().a();
        final Resources resources = context.getResources();
        final Bitmap d = aavd.d(resources, 2131951730);
        final aave a3 = aave.a(80.0f, 45.0f, aave.c);
        final atnb b = aaux.a.b();
        final aaue b2 = new aaue(d, a3, a2.a(), b);
        (this.b = b2).k(0.0f, 7.0f, 0.0f);
        b2.k = 0.3f;
        this.m((aatp)b2);
        final aauj e = new aauj(a2.a(), c.m, null, null);
        this.e = e;
        final String string = resources.getString(2132020023);
        if (TextUtils.isEmpty((CharSequence)string)) {
            e.a.y("");
            ((aatr)e.a).rS(true);
        }
        else {
            e.a.y(string);
            ((aatr)e.a).rS(false);
        }
        e.k(0.0f, 14.0f, 0.0f);
        this.m((aatp)e);
        final aatz aatz = new aatz(c, a2.a(), b);
        final aaue a4 = aatz.a(aavd.d(resources, 2131951721), aatz.b(1.0f, false), aatz);
        final aaue a5 = aatz.a(aavd.d(resources, 2131951723), aatz.b(2.0f, false), aatz);
        final aaue a6 = aatz.a(aavd.d(resources, 2131951723), aatz.b(2.0f, true), aatz);
        ((aarn)aatz).j((aarg)new aato((aatn)a5, aato.b(1.0f), aato.b(1.1f)));
        ((aarn)aatz).j((aarg)new aato((aatn)a6, aato.b(1.0f), aato.b(1.1f)));
        ((aarn)aatz).j((aarg)(aatz.f = new aato((aatn)a4, aato.b(1.0f), aato.b(1.1f))));
        final float[] array2;
        final float[] array = array2 = new float[3];
        array2[0] = 0.0f;
        array2[2] = (array2[1] = 0.0f);
        aatz.g = new aaug((aatp)a5, array, array);
        aatz.h = new aaug((aatp)a6, array, array);
        ((aarn)aatz).j((aarg)aatz.g);
        ((aarn)aatz).j((aarg)aatz.h);
        aatz.e.g((aauc)new aaty(a4, aatz, a5, a6));
        ((aass)aatz).m((aatp)a5);
        ((aass)aatz).m((aatp)a4);
        ((aass)aatz).m((aatp)a6);
        ((aass)aatz).m((aatp)aatz.e);
        aatz.e.y(context.getString(2132017611));
        ((aass)aatz).k(0.0f, -aavd.a(30.0f), 0.0f);
        final Handler handler = new Handler(Looper.getMainLooper());
        ((aarn)aatz).c = (aaro)new aaww(handler, aawz, c, 1);
        this.m((aatp)aatz);
        final aarn aarn = new aarn(a2.a(), b, aavd.d(resources, 2131951715), 9.2f, aavd.d(resources, 2131951719));
        aarn.c = (aaro)new aaww(handler, aawz, c, 0);
        aarn.k(0.0f, 7.0f, 0.0f);
        this.m((aatp)aarn);
        final aark f = new aark(viewGroup, context, handler, a2.a(), aaux.a.c(), 9.2f, false);
        ((aarh)(this.f = f)).k(0.0f, 7.0f, 0.0f);
        this.m((aatp)f);
        ((aatr)this).l = true;
    }
    
    public final boolean f(final foq foq) {
        return !((aatr)this).v() && this.g.b(foq).c();
    }
    
    public final boolean g(final foq foq) {
        return false;
    }
    
    public final boolean h(final foq foq) {
        return !this.s();
    }
}
