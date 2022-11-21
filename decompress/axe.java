import android.service.media.MediaBrowserService;
import android.content.Context;
import android.os.Build$VERSION;
import android.os.IBinder;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.Collections;
import android.os.Bundle;
import java.util.List;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.ArrayList;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class axe extends Service
{
    final ArrayList a;
    public final abi b;
    public final axd c;
    public MediaSessionCompat$Token d;
    public awu e;
    
    public axe() {
        new awr(this, "android.media.session.MediaController", -1, -1, (bhy)null, (byte[])null);
        this.a = new ArrayList();
        this.b = new abi();
        this.c = new axd(this);
    }
    
    static final List a(final List list, final Bundle bundle) {
        if (list == null) {
            return null;
        }
        final int n = -1;
        int int1 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        final int int2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (int1 == -1) {
            if (int2 == -1) {
                return list;
            }
            int1 = n;
        }
        if (int1 >= 0 && int2 > 0) {
            final int n2 = int1 * int2;
            if (n2 < list.size()) {
                int size;
                if ((size = int2 + n2) > list.size()) {
                    size = list.size();
                }
                return list.subList(n2, size);
            }
        }
        return Collections.emptyList();
    }
    
    public static final void c(final axa axa) {
        axa.h = 2;
        axa.b((Object)null);
    }
    
    public abstract void b(final axa p0);
    
    public final void d(final axa axa) {
        axa.h = 1;
        this.b(axa);
    }
    
    public final void dump(final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
    }
    
    public abstract bac e(final String p0);
    
    public final IBinder onBind(final Intent intent) {
        return this.e.b.onBind(intent);
    }
    
    public void onCreate() {
        super.onCreate();
        if (Build$VERSION.SDK_INT >= 28) {
            this.e = (awu)new awz(this);
        }
        else {
            this.e = (awu)new awz(this);
        }
        final awz awz = (awz)this.e;
        (awz.b = (MediaBrowserService)new awy(awz, (Context)awz.e)).onCreate();
    }
}
