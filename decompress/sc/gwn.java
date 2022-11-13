import java.util.List;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.net.Uri;
import j$.time.Duration;
import java.util.function.ToIntFunction;
import java.util.Collection;
import j$.util.Collection$_EL;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwn implements Runnable
{
    public final afeq a;
    public final heq b;
    
    public gwn(final heq b, final afeq a, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final heq b = this.b;
        final afeq a = this.a;
        final int[] array = Collection$_EL.stream((Collection)a).mapToInt((ToIntFunction)gwo.a).toArray();
        final hau bu = ((gww)b.a).bu;
        if (bu != null) {
            final int length = array.length;
            bu.n = length;
            if (!bu.l && !bu.i.isEmpty()) {
                final bej a2 = bu.a;
                if (a2 != null) {
                    final int size = bu.i.size();
                    long d;
                    final long n = d = 0L;
                    if (size >= length) {
                        d = n;
                        if (length > 0) {
                            final hav i = bu.i();
                            final Uri b2 = i.b;
                            d = n;
                            if (b2 != null) {
                                d = n;
                                if (b2.equals((Object)bu.h)) {
                                    d = i.d;
                                }
                            }
                        }
                    }
                    a2.e(d);
                }
                bu.l = false;
            }
            else {
                bu.l = false;
            }
        }
        final gwy bs = ((gww)b.a).bs;
        if (bs != null) {
            bs.d();
        }
        final gww gww = (gww)b.a;
        final gxj am = gww.am;
        if (am != null) {
            final hau bu2 = gww.bu;
            int n2;
            if (bu2 == null) {
                n2 = 0;
            }
            else {
                n2 = (int)bu2.h();
            }
            am.n(n2);
        }
        final int size2 = ((List)a).size();
        int j = 0;
        int e = 0;
        while (j < size2) {
            final arbk arbk = (arbk)((List)a).get(j);
            int n3 = e;
            Label_0408: {
                if (arbk != null) {
                    if ((arbk.b & 0x800) != 0x0) {
                        arbm arbm;
                        if ((arbm = arbk.n) == null) {
                            arbm = arbm.a;
                        }
                        arbl arbl;
                        if ((arbl = arbl.b(arbm.h)) == null) {
                            arbl = arbl.a;
                        }
                        n3 = e;
                        if (arbl == arbl.b) {
                            break Label_0408;
                        }
                    }
                    arbj arbj;
                    if ((arbj = arbk.f) == null) {
                        arbj = arbj.a;
                    }
                    n3 = e + arbj.d;
                }
            }
            ++j;
            e = n3;
        }
        final ucb s = ((gww)b.a).s;
        s.d = ucb.f(array);
        s.e = e;
        final hci l = ((gww)b.a).l;
        l.h = ucb.f(array);
        if (l.e && l.d) {
            l.e();
        }
        final gww gww2 = (gww)b.a;
        Label_0718: {
            if (gww2.bj) {
                int n4;
                if (ucb.b((ucd)gww2.I) < 0) {
                    n4 = gww2.d;
                }
                else {
                    n4 = ucb.b((ucd)gww2.I);
                }
                if ((int)ucb.d((ucd)gww2.I) <= n4 + 500) {
                    break Label_0718;
                }
            }
            else {
                final ucb s2 = gww2.s;
                if (s2.d <= gww2.e || s2.c == gww2.f) {
                    break Label_0718;
                }
            }
            final gww gww3 = (gww)b.a;
            final YouTubeTextView z = gww3.Z;
            if (z != null) {
                gxu.c(z, gww3.F.getResources().getString(2132019786, new Object[] { Duration.ofMillis((long)((gww)b.a).f).getSeconds() }));
            }
            final gww gww4 = (gww)b.a;
            gww4.s(gww4.f);
            final gww gww5 = (gww)b.a;
            final uby k = gww5.I;
            if (k != null && gww5.bj) {
                k.Q(gww5.f);
            }
        }
        ((gww)b.a).I();
        final gww gww6 = (gww)b.a;
        if (gww6.aX) {
            gww6.h.runOnUiThread((Runnable)new gsb(b, 14, (byte[])null));
        }
        final gww gww7 = (gww)b.a;
        if (gww7.bb) {
            final CreationButtonView al = gww7.al;
            if (al != null) {
                if (array != null && array.length > 0) {
                    al.setVisibility(0);
                    return;
                }
                al.setVisibility(8);
            }
        }
    }
}
