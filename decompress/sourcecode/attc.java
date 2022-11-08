// 
// Decompiled by Procyon v0.6.0
// 

public final class attc extends atuz implements atta
{
    public final Throwable a;
    
    public attc() {
    }
    
    public attc(final Throwable a) {
        this.a = a;
    }
    
    public final Throwable a() {
        Throwable a;
        if ((a = this.a) == null) {
            a = new atss();
        }
        return a;
    }
    
    @Override
    public final void b(final Object o) {
    }
    
    @Override
    public final atvj d(final Object o) {
        return atpf.a;
    }
    
    @Override
    public final String toString() {
        final String b = atqc.b(this);
        final Throwable a = this.a;
        final StringBuilder sb = new StringBuilder("Closed@");
        sb.append(b);
        sb.append("[");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
}
