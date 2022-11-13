import com.google.research.xeno.effect.Control;
import com.google.android.libraries.youtube.creation.common.util.PresetTracker;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.creation.effects.ShortsPresetTracker;
import com.google.android.apps.youtube.app.extensions.reel.util.ReelPresetTracker;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbi implements upi
{
    public final Object a;
    private final int b;
    
    public hbi(final ReelPresetTracker a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbi(final ShortsPresetTracker a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbi(final hao a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbi(final hbk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbi(final hhs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbi(final tye a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbi(final uas a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbi(final ubd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbi(final uon a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbi(final upr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbi(final ure a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Object o) {
        switch (this.b) {
            default: {
                ((ure)this.a).n(((FilterMapTable$FilterDescriptor)o).a);
                return;
            }
            case 11: {
                final Object a = this.a;
                final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor)o;
                final upr upr = (upr)a;
                upr.v.set(true);
                if (FilterMapTable$FilterDescriptor.g(filterMapTable$FilterDescriptor.a)) {
                    upr.v();
                }
                else {
                    upr.o(apli.b).d(true);
                    upr.o(apli.c).d(false);
                }
                upr.v.set(false);
                return;
            }
            case 10: {
                final Object a2 = this.a;
                final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 = (FilterMapTable$FilterDescriptor)o;
                final upr upr2 = (upr)a2;
                if (upr2.v.get()) {
                    return;
                }
                upr2.o(apli.b).c("NORMAL");
                upr2.v();
                return;
            }
            case 9: {
                final Object a3 = this.a;
                final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor3 = (FilterMapTable$FilterDescriptor)o;
                final uon uon = (uon)a3;
                uon.i.e(filterMapTable$FilterDescriptor3, uon.c.i().d);
                return;
            }
            case 8: {
                ((PresetTracker)this.a).j((FilterMapTable$FilterDescriptor)o);
                return;
            }
            case 7: {
                final Object a4 = this.a;
                final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor4 = (FilterMapTable$FilterDescriptor)o;
                final ubd ubd = (ubd)a4;
                ubd.b.execute(aeun.h((Runnable)new tei(ubd, filterMapTable$FilterDescriptor4, 10)));
                return;
            }
            case 6: {
                final Object a5 = this.a;
                final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor5 = (FilterMapTable$FilterDescriptor)o;
                ((uas)a5).e.y();
                return;
            }
            case 5: {
                final Object a6 = this.a;
                final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor6 = (FilterMapTable$FilterDescriptor)o;
                if (filterMapTable$FilterDescriptor6 != null) {
                    final uca e = ((tye)a6).e();
                    final String a7 = filterMapTable$FilterDescriptor6.a;
                    if (!a7.equals(e.d)) {
                        e.d = a7;
                        e.a();
                    }
                }
                return;
            }
            case 4: {
                ((PresetTracker)this.a).j((FilterMapTable$FilterDescriptor)o);
                return;
            }
            case 3: {
                final Object a8 = this.a;
                final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor7 = (FilterMapTable$FilterDescriptor)o;
                ((hhs)a8).c();
                return;
            }
            case 2: {
                final Object a9 = this.a;
                final FilterMapTable$FilterDescriptor k = (FilterMapTable$FilterDescriptor)o;
                final hbk hbk = (hbk)a9;
                hbk.k = k;
                final FilterMapTable$FilterDescriptor i = hbk.k;
                if (i != null) {
                    final Control b = i.b("preset_intensity");
                    final String a10 = hbk.k.a;
                    if (b != null) {
                        final String m = hbk.m;
                        if (m != null && m.equals(a10)) {
                            b.b.b(hbk.n);
                            hbk.m = null;
                        }
                    }
                }
                hbk.c();
                return;
            }
            case 1: {
                final Object a11 = this.a;
                final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor8 = (FilterMapTable$FilterDescriptor)o;
                final hao hao = (hao)a11;
                hao.f(new gwk(hao, filterMapTable$FilterDescriptor8, 7));
                return;
            }
            case 0: {
                final Object a12 = this.a;
                final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor9 = (FilterMapTable$FilterDescriptor)o;
                final hbk hbk2 = (hbk)a12;
                hbk2.b.execute(aeun.h((Runnable)new gxo(hbk2, 10)));
            }
        }
    }
}
