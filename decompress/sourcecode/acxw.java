import java.util.function.Consumer;
import j$.util.Optional;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.content.DialogInterface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxw implements acxy
{
    public final Context a;
    public final vax b;
    public final DialogInterface c;
    public acxx d;
    public View e;
    public aciw f;
    public acik g;
    public acjb h;
    public acjb i;
    public View j;
    public RecyclerView k;
    public final esz l;
    public final jet m;
    public final aeby n;
    
    public acxw(final Context a, final vax b, final esz l, final jet m, final aeby n, final DialogInterface c, final acxx d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.l = l;
        this.m = m;
        this.n = n;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final String s, final boolean b) {
        if (b) {
            this.d.e.add(s);
            return;
        }
        this.d.e.remove(s);
    }
    
    public final void b() {
        Optional.ofNullable((Object)this.e).ifPresent((Consumer)zjb.e);
    }
    
    @Override
    public final void c(final aolb d, final boolean b) {
        if (b) {
            this.d.d = d;
            Optional.ofNullable((Object)this.f).ifPresent((Consumer)new abtb(this, 9));
            Optional.ofNullable((Object)this.i).ifPresent((Consumer)zjb.d);
        }
    }
    
    @Override
    public final boolean d() {
        final aolb d = this.d.d;
        return d != null && d.g;
    }
    
    @Override
    public final boolean e(final String s) {
        return this.d.e.contains(s);
    }
    
    @Override
    public final boolean f(final aolb aolb) {
        final aolb d = this.d.d;
        return d != null && ((agzi)d).equals(aolb);
    }
}
