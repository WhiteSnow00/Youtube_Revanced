import org.chromium.net.NetworkChangeNotifierAutoDetect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auff implements Runnable
{
    final long a;
    final int b;
    final boolean c;
    final Object d;
    private final int e;
    
    public auff(final aufg d, final long a, final int b, final boolean c, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public auff(final wmz d, final int b, final boolean c, final long a, final int e) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (this.e != 0) {
            ((wmz)this.d).a(this.b, this.c, this.a);
            return;
        }
        NetworkChangeNotifierAutoDetect.-$$Nest$fgetmObserver(((aufg)this.d).b).onNetworkConnect(this.a, this.b);
        if (this.c) {
            NetworkChangeNotifierAutoDetect.-$$Nest$fgetmObserver(((aufg)this.d).b).onConnectionTypeChanged(this.b);
            NetworkChangeNotifierAutoDetect.-$$Nest$fgetmObserver(((aufg)this.d).b).purgeActiveNetworkList(new long[] { this.a });
        }
    }
}
