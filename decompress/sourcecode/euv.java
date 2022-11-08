// 
// Decompiled by Procyon v0.6.0
// 

public final class euv
{
    public final euu a;
    
    public euv() {
        this.a = new euu();
    }
    
    private final void i() {
        final euu a = this.a;
        if (a.f == 2) {
            a.f = 3;
        }
    }
    
    public final abid a() {
        return this.a.d;
    }
    
    public final boolean b() {
        return this.a.b;
    }
    
    public final boolean c() {
        return this.a.e;
    }
    
    public final boolean d(final boolean a) {
        final euu a2 = this.a;
        if (a2.a == a) {
            return false;
        }
        a2.a = a;
        a2.a();
        return true;
    }
    
    public final boolean e(final boolean e) {
        final euu a = this.a;
        if (e == a.e) {
            return false;
        }
        a.e = e;
        return true;
    }
    
    public final boolean f(final abid d) {
        if (this.a.d == d) {
            return false;
        }
        this.i();
        final euu a = this.a;
        a.d = d;
        a.f = 3;
        a.a();
        return true;
    }
    
    public final int g() {
        return this.a.f;
    }
    
    public final void h(final boolean c) {
        if (this.a.c == c) {
            return;
        }
        this.i();
        final euu a = this.a;
        a.c = c;
        a.a();
    }
    
    @Override
    public final String toString() {
        final euu a = this.a;
        final boolean a2 = a.a;
        final boolean b = this.b();
        final boolean c = a.c;
        final StringBuilder sb = new StringBuilder("isAdVideoPlaying: ");
        sb.append(a2);
        sb.append(", isAdCompanionAvailable: ");
        sb.append(b);
        sb.append(", isEngagementPanelOpen: ");
        sb.append(c);
        sb.append(", isStateManuallySet: false");
        return sb.toString();
    }
}
