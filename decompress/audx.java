import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audx implements Runnable
{
    final int a;
    final Object b;
    private final int c;
    
    public audx(final aulx b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public audx(final VersionSafeCallbacks$UrlRequestStatusListener b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        if (c == 0) {
            ((VersionSafeCallbacks$UrlRequestStatusListener)this.b).onStatus(this.a);
            return;
        }
        int n = 1;
        if (c != 1) {
            ((aulx)this.b).g = this.a;
            return;
        }
        final Object b = this.b;
        while (true) {
            switch (this.a) {
                default: {
                    throw new IllegalArgumentException("No request status found.");
                }
                case 1: {
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
                case 2: {
                    n = 2;
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
