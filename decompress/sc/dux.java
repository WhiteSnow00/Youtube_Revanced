import com.facebook.litho.ComponentHost;
import android.content.Context;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

final class dux extends dst
{
    public SparseArray a;
    public boolean b;
    
    public dux() {
        super("HostComponent");
        this.b = false;
    }
    
    static dux b() {
        return new dux();
    }
    
    protected final int K() {
        return 45;
    }
    
    protected final dvx N() {
        if (dyp.m) {
            return (dvx)new duc();
        }
        return super.N();
    }
    
    protected final Object R(final Context context) {
        return new ComponentHost(new dsx(context));
    }
    
    public final void S(final dsx dsx, final Object o) {
        try {
            ((dtd)this).X(dsx, o);
        }
        finally {}
    }
    
    public final void V(final dsx dsx, final Object o) {
        try {
            ((dtd)this).aa(dsx, o);
        }
        finally {}
    }
    
    protected final void X(final dsx dsx, final Object o) {
        ((ComponentHost)o).f();
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        final ComponentHost componentHost = (ComponentHost)o;
        componentHost.setAlpha(1.0f);
        componentHost.i = this.b;
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        final ComponentHost componentHost = (ComponentHost)o;
        if (componentHost.isPressed()) {
            componentHost.setPressed(false);
        }
        componentHost.i = false;
    }
    
    public final int an() {
        return 3;
    }
    
    protected final boolean ay(final dst dst, final dst dst2) {
        return true;
    }
    
    public final boolean f(final dst dst) {
        return this == dst;
    }
    
    public final SparseArray g() {
        return this.a;
    }
    
    public final boolean u() {
        final SparseArray a = this.a;
        return a != null && a.size() > 0;
    }
}
