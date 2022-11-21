import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aal implements acf
{
    final Object a;
    private final int b;
    
    public aal(final aaf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aal(final aam a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aal(final dcm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a(final acd acd) {
        final int b = this.b;
        final boolean b2 = false;
        boolean b3 = false;
        if (b == 0) {
            boolean b4 = b2;
            if (((aam)this.a).c == null) {
                b4 = true;
            }
            afc.f(b4, "The result can only set once!");
            ((aam)this.a).c = acd;
            final StringBuilder sb = new StringBuilder("ListFuture[");
            sb.append(this);
            sb.append("]");
            return sb.toString();
        }
        if (b != 1) {
            final dnn o = ((dcm)this.a).a((dns)new ddd(acd)).o();
            acd.a((Runnable)new cde(o, 20), (Executor)afwd.a);
            return o;
        }
        if (((aaf)this.a).b == null) {
            b3 = true;
        }
        afc.f(b3, "The result can only set once!");
        ((aaf)this.a).b = acd;
        final StringBuilder sb2 = new StringBuilder("FutureChain[");
        sb2.append(this.a);
        sb2.append("]");
        return sb2.toString();
    }
}
