import java.io.Serializable;
import java.util.concurrent.ScheduledFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class afxx implements Runnable
{
    afxz a;
    
    public afxx(final afxz a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final afxz a = this.a;
        if (a == null) {
            return;
        }
        final ListenableFuture a2 = a.a;
        if (a2 == null) {
            return;
        }
        this.a = null;
        if (!a2.isDone()) {
            try {
                final ScheduledFuture b = a.b;
                a.b = null;
                Serializable string;
                final String s = (String)(string = "Timed out");
                Label_0150: {
                    if (b != null) {
                        String s2 = s;
                        Label_0246: {
                            try {
                                final long abs = Math.abs(b.getDelay(TimeUnit.MILLISECONDS));
                                string = s;
                                if (abs > 10L) {
                                    s2 = s;
                                    string = new(java.lang.StringBuilder.class)();
                                    s2 = s;
                                    new StringBuilder("Timed out (timeout delayed by ");
                                    s2 = s;
                                    ((StringBuilder)string).append(abs);
                                    s2 = s;
                                    ((StringBuilder)string).append(" ms after scheduled time)");
                                    s2 = s;
                                    string = ((StringBuilder)string).toString();
                                }
                            }
                            finally {
                                break Label_0246;
                            }
                            break Label_0150;
                        }
                        ((afvd)a).setException(new afxy(s2));
                    }
                }
                final String string2 = a2.toString();
                final StringBuilder sb = new StringBuilder();
                sb.append((String)string);
                sb.append(": ");
                sb.append(string2);
                ((afvd)a).setException(new afxy(sb.toString()));
                return;
            }
            finally {
                a2.cancel(true);
            }
        }
        ((afvd)a).setFuture(a2);
    }
}
