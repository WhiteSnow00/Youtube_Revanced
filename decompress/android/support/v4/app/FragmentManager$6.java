// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.app;

import android.os.Bundle;

public class FragmentManager$6 implements aun
{
    final String a;
    final cp b;
    final auk c;
    final cl d;
    
    public FragmentManager$6(final cl d, final String a, final cp b, final auk c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final aup aup, final aui aui) {
        if (aui == aui.ON_START) {
            final Bundle bundle = this.d.g.get(this.a);
            if (bundle != null) {
                this.b.a(this.a, bundle);
                this.d.g.remove(this.a);
            }
        }
        if (aui == aui.ON_DESTROY) {
            this.c.c((auo)this);
            this.d.h.remove(this.a);
        }
    }
}
