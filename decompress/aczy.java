import java.util.function.Consumer;
import j$.util.Optional;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.content.DialogInterface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczy implements adaa
{
    public static final int o = 0;
    public final Context a;
    public final vcy b;
    public final DialogInterface c;
    public aczz d;
    public View e;
    public ackz f;
    public ackn g;
    public acle h;
    public acle i;
    public View j;
    public RecyclerView k;
    public final etc l;
    public final jfv m;
    public final aeea n;
    
    public aczy(final Context a, final vcy b, final etc l, final jfv m, final aeea n, final DialogInterface c, final aczz d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.l = l;
        this.m = m;
        this.n = n;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final String s, final boolean b) {
        if (b) {
            this.d.e.add(s);
            return;
        }
        this.d.e.remove(s);
    }
    
    public final void b() {
        Optional.ofNullable((Object)this.e).ifPresent((Consumer)zky.e);
    }
    
    public final void c(final aone d, final boolean b) {
        if (b) {
            this.d.d = d;
            Optional.ofNullable((Object)this.f).ifPresent((Consumer)new aaxy(this, 16));
            Optional.ofNullable((Object)this.i).ifPresent((Consumer)zky.d);
        }
    }
    
    public final boolean d() {
        final aone d = this.d.d;
        return d != null && d.g;
    }
    
    public final boolean e(final String s) {
        return this.d.e.contains(s);
    }
    
    public final boolean f(final aone aone) {
        final aone d = this.d.d;
        return d != null && ((ahbh)d).equals((Object)aone);
    }
}
