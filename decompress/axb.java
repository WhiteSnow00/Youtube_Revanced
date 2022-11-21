import java.util.Iterator;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.os.IBinder;
import android.app.AlertDialog$Builder;
import android.text.TextUtils;
import android.os.Parcelable;
import android.os.IBinder$DeathRecipient;
import android.os.RemoteException;
import android.util.Log;
import android.os.Bundle;
import android.content.DialogInterface$OnClickListener;
import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axb implements Runnable
{
    final int a;
    final int b;
    final Object c;
    final Object d;
    final Object e;
    private final int f;
    
    public axb(final gkt c, final int b, final int a, final View e, final RecyclerView d, final int f) {
        this.f = f;
        this.c = c;
        this.b = b;
        this.a = a;
        this.e = e;
        this.d = d;
    }
    
    public axb(final hcl e, final xab c, final int b, final int a, final Activity d, final int f) {
        this.f = f;
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public axb(final oqz d, final bhy e, final int a, final String c, final int b, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public axb(final oqz d, final bhy e, final String c, final int b, final int a, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int f = this.f;
        final IBinder$DeathRecipient binder$DeathRecipient = null;
        final IBinder$DeathRecipient binder$DeathRecipient2 = null;
        if (f != 0) {
            if (f != 1) {
                if (f != 2) {
                    final Object e = this.e;
                    final Object c = this.c;
                    final int b = this.b;
                    final int a = this.a;
                    final Object d = this.d;
                    if (c != null) {
                        ((xab)c).l((xbe)new wzy(xbf.c(31639)));
                        ((xab)c).l((xbe)new wzy(xbf.c(31570)));
                    }
                    final hcl hcl = (hcl)e;
                    final AlertDialog$Builder setMessage = hcl.aD.V(hcl.aq).setTitle(b).setMessage(a);
                    final Activity activity = (Activity)d;
                    setMessage.setPositiveButton((CharSequence)activity.getString(2132019780), (DialogInterface$OnClickListener)new fbo((xab)c, activity, 6)).setNegativeButton((CharSequence)activity.getString(2132019781), (DialogInterface$OnClickListener)new cek((xab)c, 5)).show();
                    return;
                }
                final Object c2 = this.c;
                final int b2 = this.b;
                final int a2 = this.a;
                final Object e2 = this.e;
                final Object d2 = this.d;
                final gkt gkt = (gkt)c2;
                final gkv d3 = gkt.d;
                if (d3.o != null) {
                    d3.o = null;
                    final float n = (float)b2;
                    final float a3 = d3.a(a2, (View)e2, d3.g);
                    final int n2 = gkt.d.n;
                    final int n3 = (int)(n * a3);
                    ((RecyclerView)d2).scrollBy(0, n3 - n2);
                    gkt.d.n = n3;
                }
                return;
            }
            else {
                final IBinder a4 = ((bhy)this.e).a();
                ((abp)((axe)((oqz)this.d).a).b).remove((Object)a4);
                final awr awr = new awr((axe)((oqz)this.d).a, (String)this.c, this.b, this.a, (bhy)this.e, (byte[])null);
                awr.f = ((axe)((oqz)this.d).a).e((String)this.c);
                if (awr.f == null) {
                    this.getClass().getName();
                    try {
                        ((bhy)this.e).b(2, (Bundle)null);
                        return;
                    }
                    catch (final RemoteException ex) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat((String)this.c));
                        return;
                    }
                }
                try {
                    ((abp)((axe)((oqz)this.d).a).b).put((Object)a4, (Object)awr);
                    a4.linkToDeath((IBinder$DeathRecipient)awr, 0);
                    final MediaSessionCompat$Token d4 = ((axe)((oqz)this.d).a).d;
                    if (d4 != null) {
                        final Object e3 = this.e;
                        final bac f2 = awr.f;
                        final Object a5 = f2.a;
                        Object b3;
                        if ((b3 = f2.b) == null) {
                            b3 = new Bundle();
                        }
                        ((Bundle)b3).putInt("extra_service_version", 2);
                        final Bundle bundle = new Bundle();
                        bundle.putString("data_media_item_id", (String)a5);
                        bundle.putParcelable("data_media_session_token", (Parcelable)d4);
                        bundle.putBundle("data_root_hints", (Bundle)b3);
                        ((bhy)e3).b(1, bundle);
                    }
                    return;
                }
                catch (final RemoteException ex2) {
                    Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat((String)this.c));
                    ((abp)((axe)((oqz)this.d).a).b).remove((Object)a4);
                    return;
                }
            }
        }
        final IBinder a6 = ((bhy)this.e).a();
        ((abp)((axe)((oqz)this.d).a).b).remove((Object)a6);
        final Iterator iterator = ((axe)((oqz)this.d).a).a.iterator();
        while (true) {
            awr awr2;
            do {
                final Object o = binder$DeathRecipient;
                if (iterator.hasNext()) {
                    awr2 = (awr)iterator.next();
                }
                else {
                    Object o2;
                    if ((o2 = o) == null) {
                        o2 = new awr((axe)((oqz)this.d).a, (String)this.c, this.b, this.a, (bhy)this.e, (byte[])null);
                    }
                    ((abp)((axe)((oqz)this.d).a).b).put((Object)a6, o2);
                    try {
                        a6.linkToDeath((IBinder$DeathRecipient)o2, 0);
                        return;
                    }
                    catch (final RemoteException ex3) {
                        Log.w("MBServiceCompat", "IBinder is already dead.");
                        return;
                    }
                }
            } while (awr2.c != this.a);
            Label_0881: {
                if (!TextUtils.isEmpty((CharSequence)this.c)) {
                    final Object o = binder$DeathRecipient2;
                    if (this.b > 0) {
                        break Label_0881;
                    }
                }
                final Object o = new awr((axe)((oqz)this.d).a, awr2.a, awr2.b, awr2.c, (bhy)this.e, (byte[])null);
            }
            iterator.remove();
            continue;
        }
    }
}
