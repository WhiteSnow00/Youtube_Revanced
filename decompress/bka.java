import java.util.UUID;
import android.util.Pair;
import java.io.IOException;
import android.net.Uri;
import java.util.HashMap;
import android.text.TextUtils;
import java.util.Map;
import java.util.Collections;
import android.os.Message;
import android.os.SystemClock;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class bka extends Handler
{
    final bke a;
    private boolean b;
    
    public bka(final bke a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    final void a(final int n, final Object o, final boolean b) {
        this.obtainMessage(n, (Object)new bkb(bno.a(), b, SystemClock.elapsedRealtime(), o)).sendToTarget();
    }
    
    public final void b() {
        synchronized (this) {
            this.removeCallbacksAndMessages((Object)null);
            this.b = true;
        }
    }
    
    public final void handleMessage(final Message message) {
        final bkb bkb = (bkb)message.obj;
        Label_0645: {
            try {
                final int what = message.what;
                CharSequence charSequence = null;
                if (what == 0) {
                    final blj d = this.a.d;
                    final eab eab = (eab)bkb.d;
                    final Object a = eab.a;
                    final String n = bax.N((byte[])eab.b);
                    final StringBuilder sb = new StringBuilder();
                    sb.append((String)a);
                    sb.append("&signedRequest=");
                    sb.append(n);
                    final Object o = blh.a(((blh)d).a, sb.toString(), (byte[])null, (Map)Collections.emptyMap());
                    break Label_0645;
                }
                if (what == 1) {
                    final bke a2 = this.a;
                    final blj d2 = a2.d;
                    final UUID e = a2.e;
                    final eab eab2 = (eab)bkb.d;
                    final Object a3 = eab2.a;
                    if (!TextUtils.isEmpty((CharSequence)a3)) {
                        charSequence = (CharSequence)a3;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        final HashMap hashMap = new HashMap();
                        String s;
                        if (axz.e.equals(e)) {
                            s = "text/xml";
                        }
                        else if (axz.c.equals(e)) {
                            s = "application/json";
                        }
                        else {
                            s = "application/octet-stream";
                        }
                        hashMap.put("Content-Type", s);
                        if (axz.e.equals(e)) {
                            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
                        }
                        Object o = ((blh)d2).b;
                        synchronized (o) {
                            hashMap.putAll(((blh)d2).b);
                            monitorexit(o);
                            o = ((blh)d2).a;
                            o = blh.a((bbk)o, (String)charSequence, (byte[])eab2.b, (Map)hashMap);
                            break Label_0645;
                        }
                    }
                    final bbo bbo = new bbo();
                    bbo.a = Uri.EMPTY;
                    throw new blk(bbo.a(), 0L, new IllegalStateException("No license URL"));
                }
                throw new RuntimeException();
            }
            catch (final Exception o) {
                bap.d("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", (Throwable)o);
                break Label_0645;
            }
            catch (final blk blk) {
                final bkb bkb2 = (bkb)message.obj;
                Label_0641: {
                    if (!bkb2.b) {
                        break Label_0641;
                    }
                    if (++bkb2.e > this.a.c.a(3)) {
                        break Label_0641;
                    }
                    final long a4 = bkb2.a;
                    final bbp a5 = blk.a;
                    SystemClock.elapsedRealtime();
                    SystemClock.elapsedRealtime();
                    final long c = bkb2.c;
                    final bno bno = new bno(a4, a5, blk.b);
                    IOException ex;
                    if (blk.getCause() instanceof IOException) {
                        ex = (IOException)blk.getCause();
                    }
                    else {
                        ex = new bkd(blk.getCause());
                    }
                    final long c2 = this.a.c.c(new ttl(bno, ex, bkb2.e));
                    if (c2 == -9223372036854775807L) {
                        break Label_0641;
                    }
                    synchronized (this) {
                        if (!this.b) {
                            this.sendMessageDelayed(Message.obtain(message), c2);
                            return;
                        }
                        monitorexit(this);
                        final Object o = blk;
                        final long a6 = bkb.a;
                        synchronized (this) {
                            if (!this.b) {
                                this.a.f.obtainMessage(message.what, (Object)Pair.create(bkb.d, o)).sendToTarget();
                            }
                        }
                    }
                }
            }
        }
    }
}
