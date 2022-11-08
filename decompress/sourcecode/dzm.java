// 
// Decompiled by Procyon v0.6.0
// 

final class dzm
{
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    
    public dzm() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }
    
    public dzm(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    final dzm a(final dzm dzm) {
        return new dzm(this.a + dzm.a, this.b + dzm.b, this.c + dzm.c, this.d + dzm.d, this.e + dzm.e, this.f + dzm.f, this.g + dzm.g, dzm.h + this.h);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final dzm dzm = (dzm)o;
                if (this.a != dzm.a) {
                    return false;
                }
                if (this.b != dzm.b) {
                    return false;
                }
                if (this.c != dzm.c) {
                    return false;
                }
                if (this.d != dzm.d) {
                    return false;
                }
                if (this.e != dzm.e) {
                    return false;
                }
                if (this.f != dzm.f) {
                    return false;
                }
                if (this.g != dzm.g) {
                    return false;
                }
                if (this.h == dzm.h) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final int e = this.e;
        final int f = this.f;
        final int g = this.g;
        final int h = this.h;
        final StringBuilder sb = new StringBuilder("ChangeSetStats{mEffectiveChangesCount=");
        sb.append(a);
        sb.append(", mInsertSingleCount=");
        sb.append(b);
        sb.append(", mInsertRangeCount=");
        sb.append(c);
        sb.append(", mDeleteSingleCount=");
        sb.append(d);
        sb.append(", mDeleteRangeCount=");
        sb.append(e);
        sb.append(", mUpdateSingleCount=");
        sb.append(f);
        sb.append(", mUpdateRangeCount=");
        sb.append(g);
        sb.append(", mMoveCount=");
        sb.append(h);
        sb.append("}");
        return sb.toString();
    }
}
