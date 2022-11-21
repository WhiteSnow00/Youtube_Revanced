import org.chromium.net.NetworkChangeNotifierAutoDetect;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class augh implements Runnable
{
    final int a;
    final Object b;
    private final int c;
    
    public augh(final aufg b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public augh(final auot b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public augh(final VersionSafeCallbacks$UrlRequestStatusListener b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        int n = 2;
        if (c != 0) {
            if (c == 1) {
                NetworkChangeNotifierAutoDetect.-$$Nest$fgetmObserver(((aufg)this.b).b).onConnectionTypeChanged(this.a);
                return;
            }
            if (c != 2) {
                ((auot)this.b).g = this.a;
                return;
            }
            ((VersionSafeCallbacks$UrlRequestStatusListener)this.b).onStatus(this.a);
        }
        else {
            final Object b = this.b;
            while (true) {
                switch (this.a) {
                    default: {
                        throw new IllegalArgumentException("No request status found.");
                    }
                    case 2: {
                        ((VersionSafeCallbacks$UrlRequestStatusListener)b).onStatus(n);
                        return;
                    }
                    case 15: {
                        n = 14;
                        continue;
                    }
                    case 14: {
                        n = 13;
                        continue;
                    }
                    case 13: {
                        n = 12;
                        continue;
                    }
                    case 12: {
                        n = 11;
                        continue;
                    }
                    case 11: {
                        n = 10;
                        continue;
                    }
                    case 10: {
                        n = 9;
                        continue;
                    }
                    case 9: {
                        n = 8;
                        continue;
                    }
                    case 8: {
                        n = 7;
                        continue;
                    }
                    case 7: {
                        n = 6;
                        continue;
                    }
                    case 6: {
                        n = 5;
                        continue;
                    }
                    case 4: {
                        n = 4;
                        continue;
                    }
                    case 3: {
                        n = 3;
                        continue;
                    }
                    case 1: {
                        n = 1;
                        continue;
                    }
                    case 0: {
                        n = 0;
                        continue;
                    }
                }
                break;
            }
        }
    }
}
