import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fu
{
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public im h;
    ii i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    Bundle p;
    
    public fu(final int a) {
        this.a = a;
        this.n = false;
    }
    
    final void a(final im h) {
        final im h2 = this.h;
        if (h == h2) {
            return;
        }
        if (h2 != null) {
            h2.m((iz)this.i);
        }
        if ((this.h = h) != null) {
            final ii i = this.i;
            if (i != null) {
                h.g((iz)i);
            }
        }
    }
}
