import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class moh
{
    public final int a;
    public final int b;
    public final Bundle c;
    public final nmo d;
    
    public moh(final int a, final int b, final Bundle c) {
        this.d = new nmo();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public abstract void a(final Bundle p0);
    
    public abstract boolean b();
    
    public final void c(final moi moi) {
        this.d.b((Exception)moi);
    }
    
    final void d(final Object o) {
        this.d.c(o);
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("Request { what=");
        sb.append(b);
        sb.append(" id=");
        sb.append(a);
        sb.append(" oneWay=");
        sb.append(this.b());
        sb.append("}");
        return sb.toString();
    }
}
