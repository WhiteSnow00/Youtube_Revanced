import android.view.KeyEvent;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmb extends dz
{
    final /* synthetic */ mmd e;
    
    public mmb(final mmd e) {
        this.e = e;
    }
    
    private final void t(long max) {
        final mlu j = this.e.j;
        if (j == null) {
            return;
        }
        max = Math.max(0L, j.c() + max);
        this.u(Math.min(j.d(), max));
    }
    
    private final void u(final long n) {
        final mlu j = this.e.j;
        if (j == null) {
            return;
        }
        j.z(mlc.o(n));
    }
    
    public final void c() {
        final mnb a = mmd.a;
        final mlu j = this.e.j;
        if (j != null) {
            j.m();
        }
    }
    
    public final void d() {
        final mnb a = mmd.a;
        final mlu j = this.e.j;
        if (j != null) {
            j.m();
        }
    }
    
    public final void h(final long n) {
        final mnb a = mmd.a;
        this.u(n);
    }
    
    public final void j() {
        final mnb a = mmd.a;
        final mlu j = this.e.j;
        if (j != null) {
            j.x();
        }
    }
    
    public final void k() {
        final mnb a = mmd.a;
        final mlu j = this.e.j;
        if (j != null) {
            j.y();
        }
    }
    
    public final boolean m(final Intent intent) {
        final mnb a = mmd.a;
        final KeyEvent keyEvent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && (keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126)) {
            final mlu j = this.e.j;
            if (j != null) {
                j.m();
            }
        }
        return true;
    }
    
    public final void n(final String s) {
        final mnb a = mmd.a;
        int n = 0;
        Label_0113: {
            switch (s.hashCode()) {
                case 1362116196: {
                    if (s.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                        n = 0;
                        break Label_0113;
                    }
                    break;
                }
                case -124479363: {
                    if (s.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                        n = 3;
                        break Label_0113;
                    }
                    break;
                }
                case -668151673: {
                    if (s.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                        n = 2;
                        break Label_0113;
                    }
                    break;
                }
                case -1699820260: {
                    if (s.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                        n = 1;
                        break Label_0113;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0) {
            this.t(this.e.f.d);
            return;
        }
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    final Intent intent = new Intent(s);
                    intent.setComponent(this.e.g);
                    this.e.b.sendBroadcast(intent);
                    return;
                }
                final mjq e = this.e.e;
                if (e != null) {
                    e.d(false);
                }
            }
            else {
                final mjq e2 = this.e.e;
                if (e2 != null) {
                    e2.d(true);
                }
            }
            return;
        }
        this.t(-this.e.f.d);
    }
}
