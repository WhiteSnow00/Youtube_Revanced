import java.lang.ref.Reference;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mn implements Runnable
{
    public static final ThreadLocal a;
    static final Comparator b;
    public final ArrayList c;
    long d;
    public long e;
    private final ArrayList f;
    
    static {
        a = new ThreadLocal();
        b = new mm(0);
    }
    
    public mn() {
        this.c = new ArrayList();
        this.f = new ArrayList();
    }
    
    private static final on b(final RecyclerView recyclerView, final int n, final long n2) {
        for (int b = recyclerView.h.b(), i = 0; i < b; ++i) {
            final on k = RecyclerView.k(recyclerView.h.e(i));
            if (k.c == n && !k.t()) {
                return null;
            }
        }
        final oc f = recyclerView.f;
        try {
            recyclerView.Q();
            final on p3 = f.p(n, n2);
            if (p3 != null) {
                if (p3.s() && !p3.t()) {
                    f.k(p3.a);
                }
                else {
                    f.c(p3, false);
                }
            }
            recyclerView.S(false);
            return p3;
        }
        finally {
            recyclerView.S(false);
            while (true) {}
        }
    }
    
    public final void a(final RecyclerView recyclerView, final int c, final int b) {
        if (recyclerView.r && this.d == 0L) {
            this.d = RecyclerView.aw();
            recyclerView.post((Runnable)this);
        }
        final athu w = recyclerView.W;
        w.c = c;
        w.b = b;
    }
    
    @Override
    public final void run() {
        try {
            if (this.c.isEmpty()) {
                this.d = 0L;
                return;
            }
            final int size = this.c.size();
            long n = 0L;
            long max;
            for (int i = 0; i < size; ++i, n = max) {
                final RecyclerView recyclerView = this.c.get(i);
                max = n;
                if (recyclerView.getWindowVisibility() == 0) {
                    max = Math.max(recyclerView.getDrawingTime(), n);
                }
            }
            if (n == 0L) {
                this.d = 0L;
                return;
            }
            final long n2 = TimeUnit.MILLISECONDS.toNanos(n) + this.e;
            final int size2 = this.c.size();
            int j = 0;
            int n3 = 0;
            while (j < size2) {
                final RecyclerView recyclerView2 = this.c.get(j);
                int n4 = n3;
                if (recyclerView2.getWindowVisibility() == 0) {
                    recyclerView2.W.v(recyclerView2, false);
                    n4 = n3 + recyclerView2.W.a;
                }
                ++j;
                n3 = n4;
            }
            this.f.ensureCapacity(n3);
            int n5 = 0;
            int n6 = 0;
        Label_0260_Outer:
            while (true) {
                Label_0426: {
                    if (n5 >= size2) {
                        break Label_0426;
                    }
                    Object e = this.c.get(n5);
                    int n7 = n6;
                    Label_0416: {
                        if (((RecyclerView)e).getWindowVisibility() != 0) {
                            break Label_0416;
                        }
                        Object o = ((RecyclerView)e).W;
                        final int b = Math.abs(((athu)o).c) + Math.abs(((athu)o).b);
                        j = 0;
                        int a;
                        agxf agxf;
                        Object d;
                        int a2;
                        boolean d2;
                        long n8;
                        agxf agxf2;
                        RecyclerView recyclerView3;
                        ok l;
                        Label_0749_Outer:Block_16_Outer:
                        while (true) {
                            a = ((athu)o).a;
                            n7 = n6;
                            if (j >= a + a) {
                                break Label_0416;
                            }
                            if (n6 >= this.f.size()) {
                                agxf = new agxf();
                                this.f.add(agxf);
                            }
                            else {
                                agxf = this.f.get(n6);
                            }
                            d = ((athu)o).d;
                            a2 = ((int[])d)[j + 1];
                            if (a2 <= b) {
                                d2 = true;
                            }
                            else {
                                d2 = false;
                            }
                            try {
                                agxf.d = d2;
                                agxf.b = b;
                                agxf.a = a2;
                                agxf.e = e;
                                agxf.c = ((int[])d)[j];
                                ++n6;
                                j += 2;
                                continue Label_0749_Outer;
                            Block_14_Outer:
                                while (true) {
                                    while (true) {
                                    Label_0713_Outer:
                                        while (true) {
                                            this.d = 0L;
                                            return;
                                            n8 = n2;
                                            n5 = agxf2.c;
                                            o = b((RecyclerView)e, n5, n8);
                                            iftrue(Label_0713:)(o == null);
                                            Block_15: {
                                                while (true) {
                                                Label_0713:
                                                    while (true) {
                                                        while (true) {
                                                            while (true) {
                                                                Block_17: {
                                                                    break Block_17;
                                                                    try {
                                                                        l = recyclerView3.L;
                                                                        e = recyclerView3.m;
                                                                        l.d = 1;
                                                                        l.e = ((nq)e).a();
                                                                        l.g = false;
                                                                        l.h = false;
                                                                        l.i = false;
                                                                        n5 = 0;
                                                                        while (true) {
                                                                            j = ((athu)o).a;
                                                                            if (n5 >= j + j) {
                                                                                break;
                                                                            }
                                                                            b(recyclerView3, ((int[])((athu)o).d)[n5], n2);
                                                                            n5 += 2;
                                                                        }
                                                                    }
                                                                    finally {}
                                                                    break Label_0713;
                                                                    ++n5;
                                                                    n6 = n7;
                                                                    continue Label_0260_Outer;
                                                                }
                                                                e = ((on)o).b;
                                                                iftrue(Label_0713:)(e == null || !((on)o).s() || ((on)o).t());
                                                                break Label_0713;
                                                                agxf2.d = false;
                                                                agxf2.b = 0;
                                                                agxf2.a = 0;
                                                                agxf2.e = null;
                                                                agxf2.c = 0;
                                                                ++n6;
                                                                break Label_0713_Outer;
                                                                Collections.sort((List<Object>)this.f, mn.b);
                                                                n6 = 0;
                                                                break Label_0713_Outer;
                                                                recyclerView3.W();
                                                                Label_0594: {
                                                                    o = recyclerView3.W;
                                                                }
                                                                ((athu)o).v(recyclerView3, true);
                                                                n5 = ((athu)o).a;
                                                                iftrue(Label_0713:)(n5 == 0);
                                                                continue Label_0713_Outer;
                                                            }
                                                            Label_0570: {
                                                                iftrue(Label_0594:)(!recyclerView3.y || recyclerView3.h.b() == 0);
                                                            }
                                                            continue Block_14_Outer;
                                                        }
                                                        agxf2 = this.f.get(n6);
                                                        e = agxf2.e;
                                                        iftrue(Label_0480:)(e != null);
                                                        break Block_15;
                                                        continue Label_0713;
                                                    }
                                                    recyclerView3 = ((Reference<RecyclerView>)e).get();
                                                    iftrue(Label_0570:)(recyclerView3 != null);
                                                    continue;
                                                }
                                            }
                                            continue Block_16_Outer;
                                        }
                                        iftrue(Label_0749:)(n6 >= this.f.size());
                                        continue;
                                    }
                                    Label_0480: {
                                        iftrue(Label_0495:)(agxf2.d);
                                    }
                                    continue Block_14_Outer;
                                }
                                Label_0495: {
                                    n8 = Long.MAX_VALUE;
                                }
                            }
                            finally {}
                            break;
                        }
                    }
                }
            }
        }
        finally {}
        this.d = 0L;
        throw;
    }
}
