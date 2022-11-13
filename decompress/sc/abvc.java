import j$.util.Optional;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abvc implements arls
{
    private final atke a;
    private final atke b;
    private final atke c;
    private final atke d;
    private final atke e;
    private final atke f;
    private final int g;
    
    public abvc(final atke a, final atke b, final atke c, final atke d, final atke e, final atke f, final int g) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public abvc(final atke e, final atke b, final atke c, final atke a, final atke d, final atke f, final int g, final byte[] array) {
        this.g = g;
        this.e = e;
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
        this.f = f;
    }
    
    public abvc(final atke f, final atke b, final atke c, final atke e, final atke d, final atke a, final int g, final char[] array) {
        this.g = g;
        this.f = f;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
        this.a = a;
    }
    
    public abvc(final atke c, final atke a, final atke d, final atke e, final atke f, final atke b, final int g, final int[] array) {
        this.g = g;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = b;
    }
    
    public abvc(final atke a, final atke e, final atke d, final atke b, final atke f, final atke c, final int g, final short[] array) {
        this.g = g;
        this.a = a;
        this.e = e;
        this.d = d;
        this.b = b;
        this.f = f;
        this.c = c;
    }
    
    public abvc(final atke a, final atke d, final atke f, final atke c, final atke b, final atke e, final int g, final boolean[] array) {
        this.g = g;
        this.a = a;
        this.d = d;
        this.f = f;
        this.c = c;
        this.b = b;
        this.e = e;
    }
    
    public static abvc b(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6) {
        return new abvc(atke, atke2, atke3, atke4, atke5, atke6, 0);
    }
    
    public static abux c(final Context context, final Handler handler, final atke atke, final abul abul, final atke atke2, final atke atke3, final abuy abuy) {
        return new abux(context, handler, atke, abul, atke2, atke3, abuy);
    }
    
    public static adgz d(final atke atke, final atke atke2, final atke atke3, final oby oby, final atke atke4) {
        return new adgz(atke, atke2, atke3, oby, atke4);
    }
    
    public static abvc e(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6) {
        return new abvc(atke, atke2, atke3, atke4, atke5, atke6, 1, (byte[])null);
    }
    
    public static abvc f(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6) {
        return new abvc(atke, atke2, atke3, atke4, atke5, atke6, 2, (char[])null);
    }
    
    public static abvc g(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6) {
        return new abvc(atke, atke2, atke3, atke4, atke5, atke6, 3, (short[])null);
    }
    
    public static abvc h(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6) {
        return new abvc(atke, atke2, atke3, atke4, atke5, atke6, 4, (int[])null);
    }
    
    public static abvc i(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6) {
        return new abvc(atke, atke2, atke3, atke4, atke5, atke6, 5, (boolean[])null);
    }
    
    public static abyu j(final addo addo, final Executor executor, final atke atke, final atke atke2, final wxx wxx, final abrj abrj) {
        return new abyu(addo, executor, atke, atke2, wxx, abrj, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Object a() {
        final int g = this.g;
        if (g == 0) {
            return new agkz((tgd)this.a.a(), ((arlx)this.b).c(), (aukf)this.c.a(), (aukf)this.d.a(), (aukf)this.e.a(), (aukf)this.f.a());
        }
        if (g == 1) {
            return c((Context)((arlt)this.e).a, (Handler)this.b.a(), this.c, (abul)this.a.a(), this.d, this.f, (abuy)abpb.r());
        }
        if (g == 2) {
            return j(((aajs)this.f).c(), (Executor)this.b.a(), this.c, this.e, (wxx)this.d.a(), (abrj)this.a.a());
        }
        if (g == 3) {
            return new achl((Context)((arlt)this.a).a, (Executor)this.e.a(), this.d, this.b, this.f, (Optional)((arlt)this.c).a);
        }
        if (g != 4) {
            final atke a = this.a;
            final atke d = this.d;
            final atke f = this.f;
            final oby oby = (oby)this.c.a();
            final atke b = this.b;
            final tnu tnu = (tnu)this.e.a();
            return d(a, d, f, oby, b);
        }
        return new achq((Context)((arlt)this.c).a, this.a, this.d, this.e, this.f, (aezp)((arlt)this.b).a);
    }
}
