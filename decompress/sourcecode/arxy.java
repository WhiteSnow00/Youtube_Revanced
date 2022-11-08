// 
// Decompiled by Procyon v0.6.0
// 

public final class arxy
{
    public final artj a;
    public artq b;
    public artr c;
    final /* synthetic */ aseo d;
    
    public arxy(final aseo d, final artj a, final byte[] array) {
        this.d = d;
        this.a = a;
        final artr a2 = ((arts)d.b).a((String)d.a);
        this.c = a2;
        if (a2 != null) {
            this.b = a2.a(a);
            return;
        }
        final Object a3 = d.a;
        final StringBuilder sb = new StringBuilder("Could not find policy '");
        sb.append((String)a3);
        sb.append("'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        throw new IllegalStateException(sb.toString());
    }
}
