import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ag
{
    public final ArrayList a;
    
    public ag() {
        this.a = new ArrayList();
    }
    
    public final void a(final ah ah) {
        this.a.clear();
        for (int i = 1; i < ah.e; ++i) {
            final ai ai = ((ai[])ah.g.c)[i];
            for (int j = 0; j < 6; ++j) {
                ai.e[j] = 0.0f;
            }
            ai.e[ai.c] = 1.0f;
            if (ai.h == 4) {
                this.a.add(ai);
            }
        }
        for (int size = this.a.size(), k = 0; k < size; ++k) {
            final ai ai2 = this.a.get(k);
            final int b = ai2.b;
            if (b != -1) {
                final ae d = ah.c[b].d;
                for (int a = d.a, l = 0; l < a; ++l) {
                    final ai d2 = d.d(l);
                    if (d2 != null) {
                        final float b2 = d.b(l);
                        for (int n = 0; n < 6; ++n) {
                            final float[] e = d2.e;
                            e[n] += ai2.e[n] * b2;
                        }
                        if (!this.a.contains(d2)) {
                            this.a.add(d2);
                        }
                    }
                }
                for (int n2 = 0; n2 < 6; ++n2) {
                    ai2.e[n2] = 0.0f;
                }
            }
        }
    }
    
    @Override
    public final String toString() {
        final int size = this.a.size();
        String concat = "Goal: ";
        for (int i = 0; i < size; ++i) {
            final ai ai = this.a.get(i);
            new StringBuilder().append(ai);
            String concat2 = "null[";
            int n = 0;
            while (true) {
                final float[] e = ai.e;
                if (n >= 6) {
                    break;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(concat2);
                sb.append(ai.e[n]);
                final String string = sb.toString();
                final float[] e2 = ai.e;
                String s;
                if (n < 5) {
                    s = ", ";
                }
                else {
                    s = "] ";
                }
                concat2 = string.concat(s);
                ++n;
            }
            concat = concat.concat(concat2);
        }
        return concat;
    }
}
