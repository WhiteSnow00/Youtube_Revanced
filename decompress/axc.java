import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.util.Log;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.os.Bundle;
import android.content.Context;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axc implements Runnable
{
    final Object a;
    final Object b;
    final Object c;
    final Object d;
    final Object e;
    private final int f;
    
    public axc(final csz d, final ctn e, final UUID a, final cmn c, final Context b, final int f) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public axc(final exb b, final arna d, final arna e, final askz a, final vbo c, final int f) {
        this.f = f;
        this.b = b;
        this.d = d;
        this.e = e;
        this.a = a;
        this.c = c;
    }
    
    public axc(final oqz d, final bhy e, final String a, final Bundle b, final ResultReceiver c, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public axc(final oqz d, final bhy e, final String a, final IBinder c, final Bundle b, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final int f = this.f;
        if (f != 0) {
            if (f != 1) {
                if (f != 2) {
                    ((exb)this.b).a((arna)this.d, (arna)this.e, (askz)this.a, (vbo)this.c);
                    return;
                }
                try {
                    Label_0353: {
                        if (!((ctn)this.e).isCancelled()) {
                            final String string = ((UUID)this.a).toString();
                            final crk a = ((csz)this.d).b.a(string);
                            if (a != null && !chw.d(a.t)) {
                                final cqg a2 = ((csz)this.d).a;
                                final Object c = this.c;
                                Object o = ((cnw)a2).i;
                                synchronized (o) {
                                    cmv.a();
                                    final com com = ((cnw)a2).f.remove(string);
                                    if (com != null) {
                                        if (((cnw)a2).b == null) {
                                            (((cnw)a2).b = csw.a(((cnw)a2).c, "ProcessorForegroundLck")).acquire();
                                        }
                                        ((cnw)a2).e.put(string, com);
                                        ahb.a(((cnw)a2).c, cqi.c(((cnw)a2).c, com.a(), (cmn)c));
                                    }
                                    monitorexit(o);
                                    o = this.b;
                                    o = cqi.b((Context)o, cim.b(a), (cmn)this.c);
                                    ((Context)this.b).startService((Intent)o);
                                    break Label_0353;
                                }
                            }
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                    }
                    ((ctn)this.e).g((Object)null);
                    return;
                }
                finally {
                    final Throwable t;
                    ((ctn)this.e).d(t);
                    return;
                }
            }
            final awr awr = (awr)((abp)((axe)((oqz)this.d).a).b).get((Object)((bhy)this.e).a());
            if (awr == null) {
                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=".concat(String.valueOf(this.a)));
                return;
            }
            final Object a3 = ((oqz)this.d).a;
            final Object a4 = this.a;
            final Object c2 = this.c;
            final Object b = this.b;
            List list;
            if ((list = awr.d.get(a4)) == null) {
                list = new ArrayList();
            }
            for (final akr akr : list) {
                if (c2 == akr.a) {
                    final Bundle bundle = (Bundle)akr.b;
                    if (b != bundle) {
                        if (b == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) != -1 || bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1) {
                                continue;
                            }
                        }
                        else if (bundle == null) {
                            final Bundle bundle2 = (Bundle)b;
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) != -1 || bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1) {
                                continue;
                            }
                        }
                        else {
                            final Bundle bundle3 = (Bundle)b;
                            if (bundle3.getInt("android.media.browse.extra.PAGE", -1) != bundle.getInt("android.media.browse.extra.PAGE", -1) || bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) != bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                                continue;
                            }
                        }
                    }
                    return;
                }
            }
            list.add(new akr(c2, b));
            awr.d.put(a4, list);
            final Bundle bundle4 = (Bundle)b;
            final String s = (String)a4;
            final axe axe = (axe)a3;
            final awo awo = new awo(axe, a4, awr, s, bundle4);
            if (b == null) {
                axe.b((axa)awo);
            }
            else {
                axe.d((axa)awo);
            }
            if (((axa)awo).c()) {
                return;
            }
            final StringBuilder sb = new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package=");
            sb.append(awr.a);
            sb.append(" id=");
            sb.append(s);
            throw new IllegalStateException(sb.toString());
        }
        else {
            if (((abp)((axe)((oqz)this.d).a).b).get((Object)((bhy)this.e).a()) == null) {
                final StringBuilder sb2 = new StringBuilder("sendCustomAction for callback that isn't registered action=");
                sb2.append((String)this.a);
                sb2.append(", extras=");
                sb2.append(this.b);
                Log.w("MBServiceCompat", sb2.toString());
                return;
            }
            final Object a5 = this.a;
            final Object b2 = this.b;
            final Object c3 = this.c;
            final axa axa = new axa(a5);
            if (axa.f || axa.g) {
                final StringBuilder sb3 = new StringBuilder("sendError() called when either sendResult() or sendError() had already been called for: ");
                final Object e = axa.e;
                sb3.append(e);
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: ".concat(String.valueOf(e)));
            }
            axa.g = true;
            ((ResultReceiver)c3).b(-1, null);
            if (axa.c()) {
                return;
            }
            final StringBuilder sb4 = new StringBuilder("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
            sb4.append((String)a5);
            sb4.append(" extras=");
            sb4.append(b2);
            throw new IllegalStateException(sb4.toString());
        }
    }
}
