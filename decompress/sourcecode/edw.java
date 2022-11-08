import android.content.Context;
import com.facebook.litho.ComponentTree;
import java.lang.reflect.Field;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edw
{
    public float a;
    public ecr b;
    public dsw c;
    public boolean d;
    public boolean e;
    public int f;
    public List g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public edo p;
    public boolean q;
    public aerl r;
    public acvj s;
    
    public edw() {
        this.a = 4.0f;
        final Field a = eea.a;
        this.h = true;
        this.i = false;
        final boolean a2 = dyo.a;
        this.j = dyo.l;
        this.k = -1;
        this.l = dyo.j;
        this.m = dyo.k;
        this.n = true;
        this.o = false;
        this.q = false;
    }
    
    public final eea a(final dsw dsw) {
        this.c = dsw.c(dsw);
        final boolean h = this.h;
        final boolean b = false;
        boolean h3 = false;
        Label_0045: {
            if (h) {
                final ComponentTree h2 = dsw.h;
                if (h2 == null || h2.i) {
                    h3 = true;
                    break Label_0045;
                }
            }
            h3 = false;
        }
        this.h = h3;
        boolean n = b;
        Label_0082: {
            if (this.n) {
                final ComponentTree h4 = dsw.h;
                if (h4 != null) {
                    n = b;
                    if (!h4.j) {
                        break Label_0082;
                    }
                }
                n = true;
            }
        }
        this.n = n;
        final ComponentTree h5 = dsw.h;
        if (this.b == null) {
            final Context b2 = dsw.b;
            this.b = (ecr)new ecu(1);
        }
        return new eea(this);
    }
}
