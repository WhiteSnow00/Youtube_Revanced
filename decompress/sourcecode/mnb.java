import java.lang.ref.WeakReference;
import android.content.DialogInterface$OnCancelListener;
import android.os.Looper;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Locale;
import android.text.TextUtils;
import java.io.File;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import android.os.Messenger;
import android.os.IBinder;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnb
{
    public final Object a;
    public final Object b;
    
    public mnb(final Activity b) {
        this.b = b;
        this.a = new ljc(b, 7);
    }
    
    public mnb(final Context context) {
        this.a = muw.c(context);
        this.b = new aeke(context.getMainLooper(), (byte[])null);
    }
    
    public mnb(final Context context, final byte[] array) {
        this.b = context.getString(2132017489);
        this.a = context.getString(2132017490);
    }
    
    public mnb(final IBinder binder) {
        final String interfaceDescriptor = binder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.b = new Messenger(binder);
            this.a = null;
            return;
        }
        if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.a = new CloudMessagingMessengerCompat(binder);
            this.b = null;
            return;
        }
        Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
        throw new RemoteException();
    }
    
    public mnb(final File a, final String s) {
        this.a = a;
        this.b = new File(a, s);
    }
    
    public mnb(final Class b, final Object a) {
        this.b = b;
        this.a = a;
    }
    
    public mnb(final String s) {
        this(s, null);
    }
    
    protected mnb(String format, final byte[] array) {
        kgk.aW(format, (Object)"The log tag cannot be null or empty.");
        this.a = format;
        format = null;
        if (!TextUtils.isEmpty((CharSequence)null)) {
            format = String.format("[%s] ", null);
        }
        this.b = format;
    }
    
    public static mnb i(final String s) {
        return new mnb(String.class, s);
    }
    
    public final String a(String concat, final Object... array) {
        String format = concat;
        if (array.length != 0) {
            format = String.format(Locale.ROOT, concat, array);
        }
        concat = format;
        if (!TextUtils.isEmpty((CharSequence)this.b)) {
            concat = String.valueOf(this.b).concat(String.valueOf(format));
        }
        return concat;
    }
    
    public final void b(String a, final Object... array) {
        final Object a2 = this.a;
        a = this.a(a, array);
        Log.e((String)a2, a);
    }
    
    public final void c(final Throwable t, String a, final Object... array) {
        final Object a2 = this.a;
        a = this.a(a, array);
        Log.e((String)a2, a, t);
    }
    
    public final void d(String a, final Object... array) {
        final Object a2 = this.a;
        a = this.a(a, array);
        Log.w((String)a2, a);
    }
    
    public final void e(final Throwable t, String a, final Object... array) {
        final Object a2 = this.a;
        a = this.a(a, array);
        Log.w((String)a2, a, t);
    }
    
    public final int f() {
        return mpd.b((Context)this.b, 11925000);
    }
    
    public final void g(int n, final GoogleHelp googleHelp) {
        final Intent setData = new Intent("android.intent.action.VIEW").setData(googleHelp.q);
        if (n != 7) {
            if (!((Activity)this.b).getPackageManager().queryIntentActivities(setData, 0).isEmpty()) {
                new aeke(Looper.getMainLooper(), (byte[])null).post((Runnable)new moe(this, setData, 8, null, null));
                return;
            }
        }
        else {
            n = 7;
        }
        final Object b = this.b;
        if (mpd.f((Context)b, n)) {
            n = 18;
        }
        moq.a.f((Activity)b, n, 0, (DialogInterface$OnCancelListener)null);
    }
    
    public final void h(final Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        final int f = this.f();
        if (f == 0) {
            final Object a = ((aeyr)this.a).a();
            final mzf mzf = (mzf)a;
            kgk.aL((Object)mzf.b);
            final mpv c = ((mpr)a).C;
            final myx myx = new myx(c, intent, new WeakReference((T)mzf.b));
            c.a((mqq)myx);
            kgk.aZ((mpy)myx);
            return;
        }
        this.g(f, (GoogleHelp)intent.getParcelableExtra("EXTRA_GOOGLE_HELP"));
    }
}
