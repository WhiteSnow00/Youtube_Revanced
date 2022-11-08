import android.util.Log;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmy extends br
{
    public final dlv a;
    public final dmq b;
    public dcl c;
    private final Set d;
    private dmy e;
    
    public dmy() {
        final dlv a = new dlv();
        this.b = (dmq)new dmx(this, 0);
        this.d = new HashSet();
        this.a = a;
    }
    
    private final void a() {
        final dmy e = this.e;
        if (e != null) {
            e.d.remove(this);
            this.e = null;
        }
    }
    
    public final void W() {
        super.W();
        this.a.b();
        this.a();
    }
    
    public final void lP(Context nt) {
        super.lP(nt);
        dmy dmy = this;
        while (true) {
            final br c = dmy.C;
            if (c == null) {
                break;
            }
            dmy = (dmy)c;
        }
        final cl z = dmy.z;
        if (z == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
            return;
        }
        try {
            nt = this.nT();
            this.a();
            final dmy d = dbo.b(nt).d.d(z);
            this.e = d;
            if (!this.equals((Object)d)) {
                this.e.d.add(this);
            }
        }
        catch (final IllegalStateException ex) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", (Throwable)ex);
            }
        }
    }
    
    public final void nn() {
        super.nn();
        this.a();
    }
    
    public final void no() {
        super.no();
        this.a.c();
    }
    
    public final void np() {
        super.np();
        this.a.d();
    }
    
    public final String toString() {
        final String string = super.toString();
        br c;
        if ((c = super.C) == null) {
            c = null;
        }
        final String value = String.valueOf(c);
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("{parent=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
