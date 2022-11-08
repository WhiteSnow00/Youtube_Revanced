import android.content.res.ColorStateList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import android.view.ViewStub;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import java.util.Map;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ldn
{
    public final actt a;
    public final PlaybackLoopShuffleMonitor b;
    public final wwv c;
    public final ldl d;
    public final Map e;
    public final List f;
    public final TextView g;
    public final View h;
    public angx i;
    public Integer j;
    public int k;
    private final lel l;
    private final gko m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final ImageView q;
    private final ImageView r;
    private final int s;
    private final int t;
    private final int u;
    private asic v;
    
    public ldn(final PlaybackLoopShuffleMonitor b, final actt a, final gko m, final wwv c, final lel l, final View view) {
        this.b = b;
        this.a = a;
        this.l = l;
        this.m = m;
        this.c = c;
        final ldl d = new ldl(this);
        this.d = d;
        this.e = new HashMap();
        this.f = new ArrayList();
        final View inflate = ((ViewStub)view.findViewById(2131430477)).inflate();
        this.h = inflate;
        this.n = (TextView)inflate.findViewById(2131430062);
        this.o = (TextView)inflate.findViewById(2131430482);
        this.g = (TextView)inflate.findViewById(2131430517);
        this.p = (TextView)inflate.findViewById(2131430061);
        this.q = (ImageView)inflate.findViewById(2131429270);
        this.r = (ImageView)inflate.findViewById(2131428183);
        this.s = tmy.cn(inflate.getContext(), 2130970924);
        this.t = tmy.cn(inflate.getContext(), 2130970926);
        this.u = tmy.cn(inflate.getContext(), 2130970844);
        b.j((fns)d);
    }
    
    public final void a() {
        this.e.clear();
        final Iterator iterator = this.f.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final anhb anhb = (anhb)iterator.next();
            final Map e = this.e;
            final ldm a = ldm.a(anhb.p, anhb.t);
            final Integer value = n;
            e.put(a, value);
            this.e.put(ldm.a(anhb.p, null), value);
            if (anhb.m) {
                this.j = value;
            }
            ++n;
        }
        this.e();
    }
    
    final void b(angx i) {
        if (aeda.v(this.i, i)) {
            return;
        }
        this.k = 0;
        this.i = i;
        this.f.clear();
        this.j = null;
        i = this.i;
        if (i != null) {
            for (final angw angw : i.i) {
                if ((angw.b & 0x1) != 0x0) {
                    anhb anhb;
                    if ((anhb = angw.c) == null) {
                        anhb = anhb.a;
                    }
                    if (anhb.m) {
                        this.j = this.f.size();
                    }
                    this.f.add(anhb);
                }
            }
            this.a();
        }
        this.d();
        i = this.i;
        Object o = null;
        Label_0208: {
            if (i != null) {
                final int c = i.c;
                if ((c & 0x2) != 0x0) {
                    ajsq ajsq;
                    if ((ajsq = i.h) == null) {
                        ajsq = ajsq.a;
                    }
                    o = abyh.b(ajsq);
                    break Label_0208;
                }
                if ((c & 0x1) != 0x0) {
                    o = i.g;
                    break Label_0208;
                }
            }
            o = null;
        }
        tmy.t(this.o, (CharSequence)o);
        this.e();
        final angx j = this.i;
        if (j != null) {
            final ImageView q = this.q;
            int imageResource;
            if (!j.q) {
                imageResource = 2131233779;
            }
            else {
                imageResource = 2131233945;
            }
            q.setImageResource(imageResource);
        }
        final asic v = this.v;
        if (v != null) {
            athh.f((AtomicReference)v);
            this.v = null;
        }
        if (this.i != null) {
            this.v = ((asgt)this.l.c).p().n(1L, TimeUnit.SECONDS).j(aajj.r(1)).al((asix)new ldk(this, 0));
        }
        this.c();
    }
    
    public final void c() {
        final int s = this.s;
        final int t = this.t;
        final int u = this.u;
        final Integer j = this.j;
        int n = s;
        int n2 = t;
        int backgroundColor = u;
        if (j != null) {
            n = s;
            n2 = t;
            backgroundColor = u;
            if (j >= 0) {
                n = s;
                n2 = t;
                backgroundColor = u;
                if (j < this.f.size()) {
                    final anhb anhb = this.f.get(j);
                    final gkm a = gkm.a;
                    final int ordinal = this.m.a().ordinal();
                    final allu allu = null;
                    allu allu2;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            allu2 = allu;
                        }
                        else {
                            aorm aorm;
                            if ((aorm = anhb.g) == null) {
                                aorm = aorm.a;
                            }
                            if ((aorm.b & 0x800) != 0x0) {
                                aorm aorm2;
                                if ((aorm2 = anhb.g) == null) {
                                    aorm2 = aorm.a;
                                }
                                if ((allu2 = aorm2.i) == null) {
                                    allu2 = allu.a;
                                }
                            }
                            else {
                                allu2 = allu;
                                if ((anhb.b & 0x20000000) != 0x0 && (allu2 = anhb.B) == null) {
                                    allu2 = allu.a;
                                }
                            }
                        }
                    }
                    else {
                        aorm aorm3;
                        if ((aorm3 = anhb.g) == null) {
                            aorm3 = aorm.a;
                        }
                        if ((aorm3.b & 0x400) != 0x0) {
                            aorm aorm4;
                            if ((aorm4 = anhb.g) == null) {
                                aorm4 = aorm.a;
                            }
                            if ((allu2 = aorm4.h) == null) {
                                allu2 = allu.a;
                            }
                        }
                        else {
                            allu2 = allu;
                            if ((anhb.b & 0x10000000) != 0x0 && (allu2 = anhb.A) == null) {
                                allu2 = allu.a;
                            }
                        }
                    }
                    n = s;
                    n2 = t;
                    backgroundColor = u;
                    if (allu2 != null) {
                        n = ((allu2.e & 0xFFFFFF) | 0xFF000000);
                        final int f = allu2.f;
                        backgroundColor = ((0xFFFFFF & allu2.d) | 0xF2000000);
                        n2 = (0xFF000000 | (f & 0xFFFFFF));
                    }
                }
            }
        }
        this.q.setImageTintList(ColorStateList.valueOf(n));
        this.p.setTextColor(n);
        this.n.setTextColor(n);
        this.o.setTextColor(n2);
        this.g.setTextColor(n2);
        this.r.setImageTintList(ColorStateList.valueOf(n));
        this.h.setBackgroundColor(backgroundColor);
    }
    
    public final void d() {
        final Integer j = this.j;
        final CharSequence charSequence = null;
        Integer n = null;
        Label_0076: {
            if (j != null) {
                n = j;
                if (this.b.b == 2) {
                    break Label_0076;
                }
                if (j < this.f.size() - 1) {
                    n = j + 1;
                    break Label_0076;
                }
                if (this.b.b == 1) {
                    n = 0;
                    break Label_0076;
                }
            }
            n = null;
        }
        Object b = charSequence;
        if (n != null) {
            b = charSequence;
            if (n >= 0) {
                b = charSequence;
                if (n < this.f.size()) {
                    ajsq ajsq;
                    if ((ajsq = this.f.get(n).d) == null) {
                        ajsq = ajsq.a;
                    }
                    b = abyh.b(ajsq);
                }
            }
        }
        tmy.t(this.n, (CharSequence)b);
        final TextView p = this.p;
        int text;
        if (n == null) {
            text = 2132019160;
        }
        else {
            text = 2132019161;
        }
        p.setText(text);
    }
    
    public final void e() {
        final Integer j = this.j;
        final angx i = this.i;
        CharSequence string;
        final CharSequence charSequence = string = null;
        if (i != null) {
            string = charSequence;
            if (!i.q) {
                string = charSequence;
                if (j != null) {
                    string = this.g.getResources().getString(2132019164, new Object[] { j + 1, i.n + this.k });
                }
            }
        }
        tmy.t(this.g, string);
    }
}
