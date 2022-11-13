import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import java.util.Collection;
import java.util.List;
import j$.util.Optional;
import com.google.protobuf.MessageLite;
import j$.util.function.Function$_CC;
import android.content.Context;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hra implements Function
{
    public final Object a;
    private final int b;
    
    public hra(final aabz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final afhd a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final Context a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final blu a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final blu a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final hrf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final ifk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final ikx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final Class a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final jxu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final jyk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final oby a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final vfp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final xah a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hra(final zhs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Function andThen(final Function function) {
        switch (this.b) {
            default: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 19: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 18: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 17: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 16: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 15: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 14: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 13: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 12: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 11: {
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
        final int b = this.b;
        final ajut ajut = null;
        final ajut ajut2 = null;
        switch (b) {
            default: {
                return ((jyk)this.a).c().contains((Object)o);
            }
            case 19: {
                return ((afhd)this.a).f((String)o);
            }
            case 18: {
                final Object a = this.a;
                final MessageLite messageLite = (MessageLite)o;
                Optional optional;
                if (messageLite instanceof amgq) {
                    final jxu jxu = (jxu)a;
                    final arfe d = jxu.d;
                    final vcy a2 = jxu.a;
                    final amgq amgq = (amgq)messageLite;
                    final wyw pf = jxu.b.pF();
                    aiqj aiqj2;
                    if ((amgq.b & 0x4) != 0x0) {
                        aiqj aiqj;
                        if ((aiqj = amgq.e) == null) {
                            aiqj = aiqj.a;
                        }
                        aiqj2 = aiqj;
                    }
                    else {
                        aiqj2 = null;
                    }
                    ajut ajut3 = ajut2;
                    if ((amgq.b & 0x1) != 0x0 && (ajut3 = amgq.c) == null) {
                        ajut3 = ajut.a;
                    }
                    optional = Optional.of((Object)new jxt(d, a2, aiqj2, (CharSequence)acak.b(ajut3), amgq.f, pf, (byte[])null, (byte[])null));
                }
                else if (messageLite instanceof amgu) {
                    final jxu jxu2 = (jxu)a;
                    final arfe d2 = jxu2.d;
                    final vcy a3 = jxu2.a;
                    final amgu amgu = (amgu)messageLite;
                    aiqj aiqj3;
                    if ((aiqj3 = amgu.e) == null) {
                        aiqj3 = aiqj.a;
                    }
                    ajut ajut4 = ajut;
                    if ((amgu.b & 0x1) != 0x0 && (ajut4 = amgu.c) == null) {
                        ajut4 = ajut.a;
                    }
                    optional = Optional.of((Object)new jxt(d2, a3, aiqj3, (CharSequence)acak.b(ajut4), (ahab)null, (wyw)null, (byte[])null, (byte[])null));
                }
                else {
                    optional = Optional.empty();
                }
                return optional;
            }
            case 17: {
                return new jki((xah)this.a, (ahxp)o);
            }
            case 16: {
                return jgk.u((amwb)o, (oby)this.a);
            }
            case 15: {
                final Object a4 = this.a;
                final alkh alkh = (alkh)o;
                Optional optional2;
                if ((alkh.h & 0x2000000) != 0x0) {
                    ajmo ajmo;
                    if ((ajmo = alkh.al) == null) {
                        ajmo = ajmo.a;
                    }
                    optional2 = Optional.of((Object)ajmo);
                }
                else {
                    final List h = ((aekp)((blu)a4).b).H((List)afeq.r((Object)alkh));
                    if (!h.isEmpty()) {
                        optional2 = Optional.of(h.get(0));
                    }
                    else {
                        optional2 = Optional.empty();
                    }
                }
                return optional2;
            }
            case 14: {
                final Object a5 = this.a;
                Object ak = o;
                if (o instanceof ajmo) {
                    ak = ((aeea)((blu)a5).c).ak((ajmo)o);
                }
                return ak;
            }
            case 13: {
                return ((blu)this.a).v().l().h((String)o);
            }
            case 12: {
                return ((blu)this.a).w((String)o, null);
            }
            case 11: {
                final Object a6 = this.a;
                final ikb ikb = (ikb)o;
                final ikx ikx = (ikx)a6;
                ikx.d.ak(ikb.b, ikb.c, ikb.d);
                return ikx.b((Collection)ikb.a);
            }
            case 10: {
                final Object a7 = this.a;
                final String s = (String)o;
                return a7;
            }
            case 9: {
                return ifk.m((aaat)o, ((ifk)this.a).a);
            }
            case 8: {
                final Object a8 = this.a;
                final vfk vfk = (vfk)o;
                final afft a9 = ieu.a;
                return vfk.a((vfp)a8);
            }
            case 7: {
                final Object a10 = this.a;
                final String s2 = (String)o;
                final String i = glb.I((String)a10, s2);
                i.getClass();
                adkp.R(i.isEmpty() ^ true, (Object)"key cannot be empty");
                final ahaz builder = ((ahbh)alzq.a).createBuilder();
                builder.copyOnWrite();
                final alzq alzq = (alzq)builder.instance;
                alzq.c |= 0x1;
                alzq.d = i;
                final alzn alzn = new alzn(builder);
                final String j = glb.J(s2);
                final ahaz a11 = alzn.a;
                a11.copyOnWrite();
                final alzq alzq2 = (alzq)a11.instance;
                j.getClass();
                alzq2.c |= 0x4;
                alzq2.e = j;
                return alzn;
            }
            case 6: {
                return ((Class<hyd>)this.a).cast(o);
            }
            case 5: {
                return ((asht)((frk)o).c).K((asjs)hus.i).aH(new hsf((hwl)this.a, 9));
            }
            case 4: {
                final Object a12 = this.a;
                final ActionBarColor actionBarColor = (ActionBarColor)o;
                final int cu = hwl.cU;
                return actionBarColor.mt((Context)a12);
            }
            case 3: {
                final Object a13 = this.a;
                final String c = (String)o;
                final ahaz builder2 = ((ahbh)a13).toBuilder();
                builder2.copyOnWrite();
                final zhs zhs = (zhs)builder2.instance;
                c.getClass();
                zhs.b |= 0x1;
                zhs.c = c;
                return builder2.build();
            }
            case 2: {
                final Object a14 = this.a;
                final String k = (String)o;
                final ahaz builder3 = ((ahbh)a14).toBuilder();
                builder3.copyOnWrite();
                final zhs zhs2 = (zhs)builder3.instance;
                k.getClass();
                zhs2.b |= 0x80;
                zhs2.j = k;
                return builder3.build();
            }
            case 1: {
                return this.a.equals(o);
            }
            case 0: {
                final Object a15 = this.a;
                final View view = (View)o;
                final Rect rect = new Rect();
                view.getDrawingRect(rect);
                ((hrf)a15).offsetDescendantRectToMyCoords(view, rect);
                return rect;
            }
        }
    }
    
    @Override
    public final Function compose(final Function function) {
        switch (this.b) {
            default: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 19: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 18: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 17: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 16: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 15: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 14: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 13: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 12: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 11: {
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
