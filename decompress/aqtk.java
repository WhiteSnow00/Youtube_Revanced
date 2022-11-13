// 
// Decompiled by Procyon v0.6.0
// 

final class aqtk
{
    aqte[] a;
    int b;
    int c;
    int d;
    
    public aqtk() {
        this.a = new aqte[10];
        this.b = 0;
        this.d = 2;
    }
    
    final int a(final int n, final int n2) {
        if (n == 0) {
            return n2;
        }
        if (n2 != 0) {
            int n3 = n;
            aqte[] a;
            int n4;
            int n5;
            do {
                a = this.a;
                n4 = n3 >> 1;
                final aqte aqte = a[n4];
                n5 = (n3 & 0x1);
                if (n5 == 0) {
                    n3 = aqte.b;
                }
                else {
                    n3 = aqte.c;
                }
            } while (n3 != 0);
            final aqte aqte2 = a[n4];
            if (n5 == 0) {
                aqte2.b = n2;
            }
            else {
                aqte2.c = n2;
            }
            return n;
        }
        return n;
    }
    
    final aqte b(final int n) {
        return this.a[n];
    }
    
    final aqte c(int b) {
        aqte aqte = this.a[b];
        while (true) {
            final int a = aqte.a;
            if (a != 7 && a != 3) {
                break;
            }
            aqte = this.a[b];
            b = aqte.b;
        }
        return aqte;
    }
    
    final void d(int i, final int n) {
        while (i != 0) {
            final aqte aqte = this.a[i >> 1];
            if ((i & 0x1) == 0x0) {
                i = aqte.b;
                aqte.b = n;
            }
            else {
                i = aqte.c;
                aqte.c = n;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.b; ++i) {
            final int length = sb.length();
            sb.append(i);
            if (i == this.c) {
                sb.append('*');
            }
            sb.append("        ".substring(sb.length() - length));
            sb.append(this.a[i]);
            sb.append('\n');
        }
        return sb.toString();
    }
}
