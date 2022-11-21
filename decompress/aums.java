import java.io.DataInput;

// 
// Decompiled by Procyon v0.6.0
// 

final class aums
{
    final aumq a;
    final String b;
    final int c;
    
    public aums(final aumq a, final String b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    static aums c(final DataInput dataInput) {
        return new aums(new aumq((char)dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int)auop.f(dataInput)), dataInput.readUTF(), (int)auop.f(dataInput));
    }
    
    public final long a(long n, int n2, final int n3) {
        final aumq a = this.a;
        final char a2 = a.a;
        if (a2 == 'w') {
            n2 += n3;
        }
        else if (a2 != 's') {
            n2 = 0;
        }
        final long n4 = n2;
        final long n5 = n + n4;
        final aukg o = aukg.o;
        n = ((aujo)o).m.h(n5, a.b);
        n = ((aujo)o).i.h(n, 0);
        final long a3 = a.a((auih)o, ((aujo)o).i.e(n, Math.min(a.f, 86399999)));
        if (a.d == 0) {
            n = a3;
            if (a3 <= n5) {
                n = a.a((auih)o, ((aujo)o).n.e(a3, 1));
            }
        }
        else {
            final long n6 = n = a.c((auih)o, a3);
            if (n6 <= n5) {
                n = ((aujo)o).n.e(n6, 1);
                n = a.c((auih)o, a.a((auih)o, ((aujo)o).m.h(n, a.b)));
            }
        }
        return n - n4;
    }
    
    public final long b(long n, int n2, final int n3) {
        final aumq a = this.a;
        final char a2 = a.a;
        if (a2 == 'w') {
            n2 += n3;
        }
        else if (a2 != 's') {
            n2 = 0;
        }
        final long n4 = n2;
        final long n5 = n + n4;
        final aukg o = aukg.o;
        n = ((aujo)o).m.h(n5, a.b);
        n = ((aujo)o).i.h(n, 0);
        final long b = a.b((auih)o, ((aujo)o).i.e(n, a.f));
        if (a.d == 0) {
            n = b;
            if (b >= n5) {
                n = a.b((auih)o, ((aujo)o).n.e(b, -1));
            }
        }
        else {
            final long n6 = n = a.c((auih)o, b);
            if (n6 >= n5) {
                n = ((aujo)o).n.e(n6, -1);
                n = a.c((auih)o, a.b((auih)o, ((aujo)o).m.h(n, a.b)));
            }
        }
        return n - n4;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof aums) {
            final aums aums = (aums)o;
            if (this.c == aums.c && this.b.equals(aums.b) && this.a.equals(aums.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" named ");
        sb.append(b);
        sb.append(" at ");
        sb.append(c);
        return sb.toString();
    }
}
