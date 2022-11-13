import android.widget.TextView;
import android.content.res.ColorStateList;
import java.util.concurrent.ExecutorService;
import j$.util.function.Function$_CC;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.graphics.drawable.Drawable;
import android.content.Context;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjs implements Function
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public gjs(final aaox a, final aany b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gjs(final abku a, final abjt b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gjs(final Context b, final Drawable a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gjs(final PaneDescriptor b, final PaneDescriptor a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gjs(final gju a, final View b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gjs(final kcy b, final CharSequence a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gjs(final man b, final abpu a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gjs(final yjd b, final zce a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gjs(final ynb b, final zck a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gjs(final ynp b, final yps a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gjs(final ypw b, final zck a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Function andThen(final Function function) {
        switch (this.c) {
            default: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 10: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 9: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 8: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 7: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 6: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 5: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 4: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 3: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 2: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 1: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 0: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
        }
    }
    
    @Override
    public final Object apply(final Object o) {
        switch (this.c) {
            default: {
                return aeun.b((afaq)new wyz((abku)this.a, (ablo)o, (abjt)this.b, 8));
            }
            case 10: {
                return aeun.b((afaq)new wyz((abku)this.a, (ablo)o, (abjt)this.b, 9));
            }
            case 9: {
                final Object b = this.b;
                final Object a = this.a;
                final man man = (man)o;
                return new aaox((man)b, (abpu)a, null, null);
            }
            case 8: {
                return new aaow((man)o, ((aany)this.b).a(), ((aaox)this.a).a.r(), null, null);
            }
            case 7: {
                final Object b2 = this.b;
                final Object a2 = this.a;
                final man man2 = (man)o;
                return new yvp((ypw)b2, (zck)a2, 1);
            }
            case 6: {
                final Object b3 = this.b;
                final Object a3 = this.a;
                final man man3 = (man)o;
                return new yvp((ynb)b3, (zck)a3, 0);
            }
            case 5: {
                final Object b4 = this.b;
                final Object a4 = this.a;
                final yqd yqd = (yqd)o;
                final ypt ypt = new ypt(yqd);
                ((yqc)ypt).q(Integer.valueOf((yqd.d() | 0x80) & 0xFFFFFFFD));
                ypt.b = (yps)a4;
                final ynp ynp = (ynp)b4;
                ((yqc)ypt).s(Float.valueOf(ynp.d(yqd)));
                ypt.a = ypu.d(ynp.c, ynp.h.c(yqd.l()), (yps)a4);
                ((yqc)ypt).r(Float.valueOf(ynp.c(yqd)));
                ((yqc)ypt).c = ynp.i(yqd.g(), ynp.e.bd());
                return ypt;
            }
            case 4: {
                final Object b5 = this.b;
                final Object a5 = this.a;
                final man man4 = (man)o;
                final yjd yjd = (yjd)b5;
                return new yhx(man4, (bbk)new zcc(yjd.a, (zce)a5), yjd.d, (ExecutorService)yjd.b, yjd.c, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 3: {
                return new tqb((Context)this.b).c((Drawable)this.a, (ColorStateList)o);
            }
            case 2: {
                return new kdd(((kcy)this.b).f, (TextView)o, (CharSequence)this.a);
            }
            case 1: {
                return ((ggz)o).k((PaneDescriptor)this.b, (PaneDescriptor)this.a);
            }
            case 0: {
                final Object a6 = this.a;
                final Object b6 = this.b;
                final View view = (View)o;
                final gju gju = (gju)a6;
                final int a7 = gju.a(view);
                gjt gjt;
                if (a7 < 0) {
                    final qfz a8 = gjt.a();
                    a8.e(view);
                    a8.d(a7);
                    a8.g(0.0f);
                    a8.f(0);
                    gjt = a8.c();
                }
                else {
                    tre.c(gju.d, view, (View)b6);
                    int n;
                    if (gju.a == 0) {
                        n = gju.d.a.left;
                    }
                    else {
                        n = gju.d.a.top;
                    }
                    float n2;
                    int n3;
                    if (gju.a == 0) {
                        n2 = (float)gju.d.b();
                        n3 = gju.d.a.width();
                    }
                    else {
                        n2 = (float)gju.d.a();
                        n3 = gju.d.a.height();
                    }
                    final float n4 = n2 / n3;
                    final qfz a9 = gjt.a();
                    a9.e(view);
                    a9.d(a7);
                    a9.g(n4);
                    a9.f(n);
                    gjt = a9.c();
                }
                return gjt;
            }
        }
    }
    
    @Override
    public final Function compose(final Function function) {
        switch (this.c) {
            default: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 10: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 9: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 8: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 7: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 6: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 5: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 4: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 3: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 2: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 1: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 0: {
                return Function$_CC.$default$compose((Function)this, function);
            }
        }
    }
}
