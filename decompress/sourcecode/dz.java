import android.view.ViewConfiguration;
import android.view.KeyEvent;
import android.os.Build$VERSION;
import android.content.Intent;
import android.support.v4.media.RatingCompat;
import android.os.Bundle;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.os.Handler;
import java.lang.ref.WeakReference;
import android.media.session.MediaSession$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public class dz
{
    final Object a;
    final MediaSession$Callback b;
    WeakReference c;
    dx d;
    private boolean e;
    
    public dz() {
        this.a = new Object();
        this.b = new dy(this);
        this.c = new WeakReference(null);
    }
    
    final void a(final ea ea, final Handler handler) {
        if (!this.e) {
            return;
        }
        final boolean b = false;
        this.e = false;
        handler.removeMessages(1);
        final PlaybackStateCompat c = ea.c();
        long e;
        if (c == null) {
            e = 0L;
        }
        else {
            e = c.e;
        }
        int n = b ? 1 : 0;
        if (c != null) {
            n = (b ? 1 : 0);
            if (c.a == 3) {
                n = 1;
            }
        }
        if (n != 0) {
            if ((e & 0x202L) != 0x0L) {
                this.c();
            }
        }
        else if ((0x204L & e) != 0x0L) {
            this.d();
        }
    }
    
    public void b() {
    }
    
    public void c() {
    }
    
    public void d() {
    }
    
    public void e(final Uri uri, final Bundle bundle) {
    }
    
    public void f() {
    }
    
    public void g() {
    }
    
    public void h(final long n) {
    }
    
    public void i(final RatingCompat ratingCompat) {
    }
    
    public void j() {
    }
    
    public void k() {
    }
    
    public void l() {
    }
    
    public boolean m(final Intent intent) {
        if (Build$VERSION.SDK_INT >= 27) {
            return false;
        }
        Object a = this.a;
        synchronized (a) {
            final ea ea = (ea)this.c.get();
            final dx d = this.d;
            monitorexit(a);
            if (ea != null) {
                if (d != null) {
                    a = intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    if (a != null) {
                        if (((KeyEvent)a).getAction() == 0) {
                            final axd d2 = ea.d();
                            final int keyCode = ((KeyEvent)a).getKeyCode();
                            if (keyCode != 79 && keyCode != 85) {
                                this.a(ea, (Handler)d);
                                return false;
                            }
                            if (((KeyEvent)a).getRepeatCount() == 0) {
                                if (this.e) {
                                    ((Handler)d).removeMessages(1);
                                    this.e = false;
                                    final PlaybackStateCompat c = ea.c();
                                    long e;
                                    if (c == null) {
                                        e = 0L;
                                    }
                                    else {
                                        e = c.e;
                                    }
                                    if ((e & 0x20L) != 0x0L) {
                                        this.j();
                                    }
                                }
                                else {
                                    this.e = true;
                                    ((Handler)d).sendMessageDelayed(((Handler)d).obtainMessage(1, (Object)d2), (long)ViewConfiguration.getDoubleTapTimeout());
                                }
                            }
                            else {
                                this.a(ea, (Handler)d);
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
    
    public void n(final String s) {
    }
    
    public void o() {
    }
    
    public void p() {
    }
    
    public void q() {
    }
    
    public void r() {
    }
    
    public void s() {
    }
}
