import java.util.Map;
import java.util.concurrent.Executor;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmt implements nni
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public agmt(final agnv a, final Pair b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public agmt(final aheu b, final String a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public agmt(final Context b, final Intent a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public agmt(final mqe a, final Bundle b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final nnt nnt) {
        final int c = this.c;
        if (c != 0) {
            if (c == 1) {
                final Object a = this.a;
                final Object b = this.b;
                nnt d;
                if (!nnt.j()) {
                    d = nnt;
                }
                else {
                    d = nnt;
                    if (mqe.d((Bundle)nnt.f())) {
                        d = ((mqe)a).a((Bundle)b).d(mqe.a, (nns)mqh.b);
                    }
                }
                return d;
            }
            if (c != 2) {
                final Object b2 = this.b;
                final Object a2 = this.a;
                synchronized (b2) {
                    ((Map<Object, Object>)((aheu)b2).a).remove(a2);
                    return nnt;
                }
            }
            final Object b3 = this.b;
            final Object a3 = this.a;
            if ((int)nnt.f() != 402) {
                return nnt;
            }
            return agnz.a((Context)b3, (Intent)a3).a((Executor)rs.j, (nni)myw.g);
        }
        else {
            final Object a4 = this.a;
            final Object b4 = this.b;
            synchronized (a4) {
                ((Map<Object, Object>)((agnv)a4).b).remove(b4);
                return nnt;
            }
        }
    }
}
