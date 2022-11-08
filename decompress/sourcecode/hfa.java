import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class hfa extends BroadcastReceiver
{
    final /* synthetic */ hfc a;
    
    public hfa(final hfc a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final String action = intent.getAction();
        if (action != null) {
            int n = 0;
            Label_0117: {
                switch (action.hashCode()) {
                    case 1978614907: {
                        if (action.equals("onTranscodeCancelled")) {
                            n = 3;
                            break Label_0117;
                        }
                        break;
                    }
                    case 967268691: {
                        if (action.equals("onTranscodeFailed")) {
                            n = 2;
                            break Label_0117;
                        }
                        break;
                    }
                    case 99094901: {
                        if (action.equals("onTranscodeCompleted")) {
                            n = 1;
                            break Label_0117;
                        }
                        break;
                    }
                    case -94573999: {
                        if (action.equals("onProcessedDurationChanged")) {
                            n = 0;
                            break Label_0117;
                        }
                        break;
                    }
                }
                n = -1;
            }
            if (n != 0) {
                if (n == 1) {
                    this.a.d(true);
                    return;
                }
                if (n == 2) {
                    this.a.d(false);
                    return;
                }
                if (n == 3) {
                    this.a.a(false);
                    final urf b = this.a.b;
                    if (b != null) {
                        b.j();
                    }
                    final hfb g = this.a.g;
                    if (g != null) {
                        g.c();
                    }
                }
            }
            else {
                final hfc a = this.a;
                final long longExtra = intent.getLongExtra("durationMs", 0L);
                final aqyq h = a.h;
                if (h != null) {
                    a.o.execute(aesm.h((Runnable)new ccl(a, (int)(longExtra * 100L / (h.d - h.c)), 9)));
                }
            }
        }
    }
}
