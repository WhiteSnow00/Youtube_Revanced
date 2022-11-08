import java.util.UUID;
import androidx.media3.common.Metadata;
import java.util.List;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.DrmInitData$SchemeData;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class bpj implements buc
{
    public ayf a;
    private final int b;
    private final int c;
    private final ayf d;
    private final bth e;
    private buc f;
    private long g;
    
    public bpj(final int b, final int c, final ayf d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new bth();
    }
    
    public final void b(ayf a) {
        final ayf d = this.d;
        if (d != null) {
            if (a != d) {
                final int b = ayy.b(a.n);
                final String c = d.c;
                String b2;
                if ((b2 = d.d) == null) {
                    b2 = a.d;
                }
                final String e = a.e;
                int n2 = 0;
                String c2 = null;
                Label_0108: {
                    int n;
                    if ((n = b) != 3) {
                        n2 = b;
                        c2 = e;
                        if (b != 1) {
                            break Label_0108;
                        }
                        n = 1;
                    }
                    final String e2 = d.e;
                    n2 = n;
                    c2 = e;
                    if (e2 != null) {
                        c2 = e2;
                        n2 = n;
                    }
                }
                int f;
                if ((f = a.h) == -1) {
                    f = d.h;
                }
                int g;
                if ((g = a.i) == -1) {
                    g = d.i;
                }
                final String k = a.k;
                String h;
                if ((h = k) == null) {
                    final String[] ar = baw.ar(d.k);
                    final int length = ar.length;
                    String string = null;
                    Label_0274: {
                        if (length != 0) {
                            final StringBuilder sb = new StringBuilder();
                            for (final String s : ar) {
                                if (n2 == ayy.b(ayy.d(s))) {
                                    if (sb.length() > 0) {
                                        sb.append(",");
                                    }
                                    sb.append(s);
                                }
                            }
                            if (sb.length() > 0) {
                                string = sb.toString();
                                break Label_0274;
                            }
                        }
                        string = null;
                    }
                    if (baw.ar(string).length != 1) {
                        h = k;
                    }
                    else {
                        h = string;
                    }
                }
                final Metadata l = a.l;
                Metadata j;
                if (l == null) {
                    j = d.l;
                }
                else {
                    j = l.d(d.l);
                }
                float r;
                final float n3 = r = a.u;
                if (n3 == -1.0f) {
                    r = n3;
                    if (n2 == 2) {
                        r = d.u;
                    }
                }
                final int f2 = a.f;
                final int f3 = d.f;
                final int g2 = a.g;
                final int g3 = d.g;
                final DrmInitData q = d.q;
                final DrmInitData q2 = a.q;
                final ArrayList<DrmInitData$SchemeData> list = new ArrayList<DrmInitData$SchemeData>();
                String b3;
                if (q != null) {
                    b3 = q.b;
                    for (final DrmInitData$SchemeData drmInitData$SchemeData : q.a) {
                        if (drmInitData$SchemeData.a()) {
                            list.add(drmInitData$SchemeData);
                        }
                    }
                }
                else {
                    b3 = null;
                }
                String b4 = b3;
                if (q2 != null) {
                    if ((b4 = b3) == null) {
                        b4 = q2.b;
                    }
                    final int size = list.size();
                    for (final DrmInitData$SchemeData drmInitData$SchemeData2 : q2.a) {
                        Label_0600: {
                            if (drmInitData$SchemeData2.a()) {
                                final UUID a4 = drmInitData$SchemeData2.a;
                                for (int n6 = 0; n6 < size; ++n6) {
                                    if (list.get(n6).a.equals(a4)) {
                                        break Label_0600;
                                    }
                                }
                                list.add(drmInitData$SchemeData2);
                            }
                        }
                    }
                }
                DrmInitData n7;
                if (list.isEmpty()) {
                    n7 = null;
                }
                else {
                    n7 = new DrmInitData(b4, (List)list);
                }
                final aye b5 = a.b();
                b5.a = c;
                b5.b = b2;
                b5.c = c2;
                b5.d = (f2 | f3);
                b5.e = (g2 | g3);
                b5.f = f;
                b5.g = g;
                b5.h = h;
                b5.i = j;
                b5.n = n7;
                b5.r = r;
                a = b5.a();
            }
        }
        this.a = a;
        final buc f4 = this.f;
        final int a5 = baw.a;
        f4.b(this.a);
    }
    
    public final void d(final bar bar, final int n, int a) {
        final buc f = this.f;
        a = baw.a;
        f.c(bar, n);
    }
    
    public final void e(final long n, final int n2, final int n3, final int n4, final bub bub) {
        final long g = this.g;
        if (g != -9223372036854775807L && n >= g) {
            this.f = (buc)this.e;
        }
        final buc f = this.f;
        final int a = baw.a;
        f.e(n, n2, n3, n4, bub);
    }
    
    public final int f(final aya aya, final int n, final boolean b) {
        final buc f = this.f;
        final int a = baw.a;
        return f.a(aya, n, b);
    }
    
    public final void g(final bpm bpm, final long g) {
        if (bpm == null) {
            this.f = (buc)this.e;
            return;
        }
        this.g = g;
        final buc a = bpm.a(this.b, this.c);
        this.f = a;
        final ayf a2 = this.a;
        if (a2 != null) {
            a.b(a2);
        }
    }
}
