import android.view.View$MeasureSpec;

// 
// Decompiled by Procyon v0.6.0
// 

final class edk implements dtj
{
    final ebt a;
    final eeb b;
    
    public edk(final eeb b, final ebt a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(int max, int b) {
        final ebt a = this.a;
        if (a.a() == b) {
            return;
        }
        a.m(b);
        final eeb b2 = this.b;
        if (b2.z == null) {
            b = -1;
        }
        else if (b2.e.i() == 0) {
            b = b2.z.b;
        }
        else {
            b = b2.z.a;
        }
        if (b != -1 && this.a.a() <= b) {
            return;
        }
        final eeb b3 = this.b;
        monitorenter(b3);
        try {
            final eeb b4 = this.b;
            if (b4.z != null) {
                if (!b4.m) {
                    final int size = b4.b.size();
                    int i = 0;
                    b = 0;
                    while (i < size) {
                        final int a2 = b4.b.get(i).a();
                        int n;
                        if (a2 > (n = b)) {
                            n = a2;
                        }
                        ++i;
                        b = n;
                    }
                    if (b != b4.z.b) {
                        max = Math.max(b4.e.a(View$MeasureSpec.getSize(b4.t), View$MeasureSpec.getSize(b4.u), max, b), 1);
                        b4.z.b = b;
                        b4.y = max;
                    }
                }
            }
            this.b.M();
            monitorexit(b3);
        }
        finally {
            monitorexit(b3);
            while (true) {}
        }
    }
}
