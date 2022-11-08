import java.util.List;
import android.text.Spanned;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import android.util.Pair;
import android.view.View$OnClickListener;
import java.util.HashSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import java.util.Set;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyo
{
    public final int[] a;
    public vax b;
    public final acyn c;
    public final acyn d;
    private final SharedPreferences e;
    private final Set f;
    private final Handler g;
    private final Rect h;
    private accz i;
    
    public acyo(final SharedPreferences e, final Handler g, final Context context) {
        e.getClass();
        this.e = e;
        g.getClass();
        this.g = g;
        this.f = new HashSet();
        this.h = new Rect();
        this.a = new int[2];
        this.c = new acyn(tmy.ct(context, 2130970940).orElse(2131102350), 2131233379);
        this.d = new acyn(tmy.ct(context, 2130970925).orElse(2131102393), 0);
    }
    
    private final View$OnClickListener c(final ajzf ajzf) {
        return (View$OnClickListener)new aafm(this, ajzf, 10);
    }
    
    private final void d(final ajzl ajzl, final Object o) {
        this.f.add(new Pair((Object)ajzl, o));
        final String f = f(ajzl);
        this.e.edit().putLong(f, this.e.getLong(f, 0L) + 1L).apply();
        if (this.b != null && ajzl.j.size() != 0) {
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ajzl);
            final Iterator<Object> iterator = ((List<Object>)ajzl.j).iterator();
            while (iterator.hasNext()) {
                this.b.c((aioe)iterator.next(), (Map)hashMap);
            }
        }
    }
    
    private final acyn e(final ajzg ajzg) {
        if (ajzg == null) {
            return null;
        }
        int d;
        if ((d = afld.D(ajzg.b)) == 0) {
            d = 1;
        }
        if (--d == 1) {
            return this.c;
        }
        if (d != 2) {
            return null;
        }
        return this.d;
    }
    
    private static final String f(final ajzl ajzl) {
        return "hint_id_prefix".concat(String.valueOf(ajzl.c));
    }
    
    public final boolean a(final View view) {
        return view.getGlobalVisibleRect(this.h);
    }
    
    public final void b(final ajzl ajzl, final View view, final Object o) {
        final accz i = this.i;
        final boolean b = false;
        final boolean b2 = i == null || !i.h();
        long d;
        if ((ajzl.b & 0x10) != 0x0) {
            ajzk ajzk;
            if ((ajzk = ajzl.g) == null) {
                ajzk = ajzk.a;
            }
            d = ajzk.d;
        }
        else {
            d = 0L;
        }
        if (b2 && !this.f.contains(new Pair((Object)ajzl, o)) && this.e.getLong(f(ajzl), 0L) < d) {
            ajzi ajzi;
            if ((ajzi = ajzl.d) == null) {
                ajzi = ajzi.a;
            }
            if (ajzi.b == 106514900) {
                ajzi ajzi2;
                if ((ajzi2 = ajzl.d) == null) {
                    ajzi2 = ajzi.a;
                }
                ajze a;
                if (ajzi2.b == 106514900) {
                    a = (ajze)ajzi2.c;
                }
                else {
                    a = ajze.a;
                }
                if (a.e) {
                    ajze a2;
                    if ((ajzl.b & 0x2) != 0x0) {
                        ajzi ajzi3;
                        if ((ajzi3 = ajzl.d) == null) {
                            ajzi3 = ajzi.a;
                        }
                        if (ajzi3.b == 106514900) {
                            a2 = (ajze)ajzi3.c;
                        }
                        else {
                            a2 = ajze.a;
                        }
                    }
                    else {
                        a2 = null;
                    }
                    accz j;
                    if (a2 == null) {
                        j = null;
                    }
                    else {
                        final acuk acuk = new acuk(view);
                        ajzm ajzm;
                        if ((ajzm = ajzl.h) == null) {
                            ajzm = ajzm.a;
                        }
                        int a4 = 0;
                        Label_0382: {
                            if (ajzm != null) {
                                int a3;
                                if ((a3 = afld.A(ajzm.c)) == 0) {
                                    a3 = 1;
                                }
                                if (--a3 != 1) {
                                    if (a3 == 3) {
                                        a4 = 3;
                                        break Label_0382;
                                    }
                                    if (a3 != 4) {
                                        a4 = 2;
                                        break Label_0382;
                                    }
                                    a4 = 4;
                                    break Label_0382;
                                }
                            }
                            a4 = 1;
                        }
                        acuk.a = a4;
                        acuk.a();
                        ajsq ajsq;
                        if ((a2.b & 0x2) != 0x0) {
                            if ((ajsq = a2.f) == null) {
                                ajsq = ajsq.a;
                            }
                        }
                        else {
                            ajsq = null;
                        }
                        acuk.b = (CharSequence)abyh.b(ajsq);
                        ajsq ajsq2;
                        if ((a2.b & 0x4) != 0x0) {
                            if ((ajsq2 = a2.g) == null) {
                                ajsq2 = ajsq.a;
                            }
                        }
                        else {
                            ajsq2 = null;
                        }
                        acuk.c = (CharSequence)abyh.b(ajsq2);
                        ajzd ajzd;
                        if ((ajzd = a2.l) == null) {
                            ajzd = ajzd.a;
                        }
                        if (ajzd.b == 47244396) {
                            ajzd ajzd2;
                            if ((ajzd2 = a2.l) == null) {
                                ajzd2 = ajzd.a;
                            }
                            ajzf a5;
                            if (ajzd2.b == 47244396) {
                                a5 = (ajzf)ajzd2.c;
                            }
                            else {
                                a5 = ajzf.a;
                            }
                            ajsq ajsq3;
                            if ((a5.b & 0x8) != 0x0) {
                                if ((ajsq3 = a5.f) == null) {
                                    ajsq3 = ajsq.a;
                                }
                            }
                            else {
                                ajsq3 = null;
                            }
                            final Spanned b3 = abyh.b(ajsq3);
                            ajzg ajzg;
                            if ((ajzg = a5.c) == null) {
                                ajzg = ajzg.a;
                            }
                            final acyn e = this.e(ajzg);
                            final View$OnClickListener c = this.c(a5);
                            acuk.d = (CharSequence)b3;
                            acuk.j = e;
                            acuk.e = c;
                        }
                        final ajzd k = a2.k;
                        ajzd a6;
                        if (k == null) {
                            a6 = ajzd.a;
                        }
                        else {
                            a6 = k;
                        }
                        if (a6.b == 47244396) {
                            ajzd a7;
                            if ((a7 = k) == null) {
                                a7 = ajzd.a;
                            }
                            ajzf a8;
                            if (a7.b == 47244396) {
                                a8 = (ajzf)a7.c;
                            }
                            else {
                                a8 = ajzf.a;
                            }
                            ajsq ajsq4;
                            if ((a8.b & 0x8) != 0x0) {
                                if ((ajsq4 = a8.f) == null) {
                                    ajsq4 = ajsq.a;
                                }
                            }
                            else {
                                ajsq4 = null;
                            }
                            final Spanned b4 = abyh.b(ajsq4);
                            ajzg ajzg2;
                            if ((ajzg2 = a8.c) == null) {
                                ajzg2 = ajzg.a;
                            }
                            final acyn e2 = this.e(ajzg2);
                            final View$OnClickListener c2 = this.c(a8);
                            acuk.f = (CharSequence)b4;
                            acuk.k = e2;
                            acuk.g = c2;
                        }
                        final accz b5 = acuk.b();
                        final float l = a2.j;
                        j = b5;
                        if (l > 0.0f) {
                            final acuc acuc = (acuc)b5.a;
                            acuc.g = l;
                            j = b5;
                            if (acuc.isShown()) {
                                acuc.requestLayout();
                                j = b5;
                            }
                        }
                    }
                    ajzj ajzj;
                    if ((ajzj = ajzl.e) == null) {
                        ajzj = ajzj.a;
                    }
                    final int n = 0x4 & ajzl.b;
                    boolean b7 = false;
                    Label_0986: {
                        if (n != 0) {
                            final int b6 = afld.B(ajzj.b);
                            if (b6 != 0) {
                                if (b6 == 3) {
                                    b7 = false;
                                    break Label_0986;
                                }
                            }
                        }
                        b7 = true;
                    }
                    int n2 = b ? 1 : 0;
                    Label_1029: {
                        if (n != 0) {
                            final int b8 = afld.B(ajzj.b);
                            if (b8 != 0) {
                                n2 = (b ? 1 : 0);
                                if (b8 == 2) {
                                    break Label_1029;
                                }
                            }
                            n2 = 1;
                        }
                    }
                    if (b7) {
                        j.j();
                        j.e((View$OnClickListener)new acsj(j, 7, (byte[])null));
                    }
                    if (n2 != 0) {
                        this.g.postDelayed((Runnable)new abxb(j, 20, (byte[])null), ajzl.f);
                    }
                    if (j != null) {
                        if (this.a(view)) {
                            j.f();
                            view.getLocationOnScreen(this.a);
                            view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new ezz(this, j, view, 4, null));
                        }
                        this.i = j;
                        this.d(ajzl, o);
                    }
                    return;
                }
            }
            this.d(ajzl, o);
        }
    }
}
