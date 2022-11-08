import org.chromium.net.NetworkChangeNotifierAutoDetect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubr implements Runnable
{
    final /* synthetic */ long a = a;
    final /* synthetic */ int b = b;
    final /* synthetic */ boolean c = c;
    final /* synthetic */ Object d = d;
    private final /* synthetic */ int e;
    
    public aubr(final aubs d, final long a, final int b, final boolean c, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        if (this.e != 0) {
            ((wjt)this.d).a(this.b, this.c, this.a);
            return;
        }
        NetworkChangeNotifierAutoDetect.-$$Nest$fgetmObserver(((aubs)this.d).b).onNetworkConnect(this.a, this.b);
        if (this.c) {
            NetworkChangeNotifierAutoDetect.-$$Nest$fgetmObserver(((aubs)this.d).b).onConnectionTypeChanged(this.b);
            NetworkChangeNotifierAutoDetect.-$$Nest$fgetmObserver(((aubs)this.d).b).purgeActiveNetworkList(new long[] { this.a });
        }
    }
}
