import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cnd
{
    public final int a;
    public final int b;
    private final UUID c;
    private final cml d;
    private final Set e;
    private final cml f;
    private final int g;
    
    public cnd(final UUID c, final int b, final cml d, final List list, final cml f, final int a, final int g) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = new HashSet(list);
        this.f = f;
        this.a = a;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final cnd cnd = (cnd)o;
            return this.a == cnd.a && this.g == cnd.g && this.c.equals(cnd.c) && this.b == cnd.b && this.d.equals(cnd.d) && this.e.equals(cnd.e) && this.f.equals(cnd.f);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.c.hashCode();
        final int b = this.b;
        chw.e(b);
        return (((((hashCode * 31 + b) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + this.f.hashCode()) * 31 + this.a) * 31 + this.g;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("WorkInfo{mId='");
        sb.append(this.c);
        sb.append("', mState=");
        sb.append((Object)chw.c(this.b));
        sb.append(", mOutputData=");
        sb.append(this.d);
        sb.append(", mTags=");
        sb.append(this.e);
        sb.append(", mProgress=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
