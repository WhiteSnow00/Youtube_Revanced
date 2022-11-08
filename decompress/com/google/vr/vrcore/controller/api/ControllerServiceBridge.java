// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import com.google.vr.vrcore.base.api.ParcelableProtoLite;
import android.os.IBinder;
import android.content.ComponentName;
import com.google.protobuf.MessageLite;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.os.IInterface;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import android.os.Looper;
import android.util.SparseArray;
import android.os.Handler;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import android.content.ServiceConnection;

public class ControllerServiceBridge implements ServiceConnection
{
    private static final AtomicInteger i;
    public final Context a;
    public final Handler b;
    final String c;
    public final SparseArray d;
    public boolean e;
    public araz f;
    public aeru g;
    private final int j;
    private final aray k;
    
    static {
        i = new AtomicInteger(-1);
    }
    
    public ControllerServiceBridge(final Context context, final ControllerServiceBridge$Callbacks controllerServiceBridge$Callbacks, int j) {
        final ControllerListenerOptions controllerListenerOptions = new ControllerListenerOptions(j);
        final SparseArray d = new SparseArray();
        this.d = d;
        this.a = context.getApplicationContext();
        j = 0;
        final aeru g = new aeru(controllerServiceBridge$Callbacks, controllerListenerOptions, 0);
        this.g = g;
        d.put(g.a, (Object)g);
        this.b = new Handler(Looper.getMainLooper());
        this.k = new aray(this, 2);
        while (true) {
            try {
                j = VrCoreUtils.getVrCoreClientApiVersion(context);
                this.j = j;
                j = ControllerServiceBridge.i.incrementAndGet();
                final StringBuilder sb = new StringBuilder("VrCtl.ServiceBridge");
                sb.append(j);
                this.c = sb.toString();
            }
            catch (final aran aran) {
                continue;
            }
            break;
        }
    }
    
    public static final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("This should be running on the main thread.");
    }
    
    private final boolean e(final int n, final aeru aeru) {
        try {
            final araz f = this.f;
            final String c = this.c;
            final aray aray = new aray(aeru, 0, (byte[])null, (byte[])null);
            final Parcel qq = ((eny)f).qQ();
            qq.writeInt(n);
            qq.writeString(c);
            eoa.j(qq, (IInterface)aray);
            final Parcel qr = ((eny)f).qR(5, qq);
            final boolean k = eoa.k(qr);
            qr.recycle();
            if (k) {
                return true;
            }
        }
        catch (final RemoteException ex) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while registering listener.", (Throwable)ex);
        }
        return false;
    }
    
    public final void a() {
        d();
        if (this.e) {
            d();
            final araz f = this.f;
            if (f != null) {
                try {
                    final String c = this.c;
                    final Parcel qq = ((eny)f).qQ();
                    qq.writeString(c);
                    final Parcel qr = ((eny)f).qR(6, qq);
                    eoa.k(qr);
                    qr.recycle();
                }
                catch (final RemoteException ex) {
                    Log.w("VrCtl.ServiceBridge", "RemoteException while unregistering listeners.", (Throwable)ex);
                }
            }
            if (this.j >= 21) {
                try {
                    final araz f2 = this.f;
                    if (f2 != null) {
                        final aray k = this.k;
                        final Parcel qq2 = ((eny)f2).qQ();
                        eoa.j(qq2, (IInterface)k);
                        final Parcel qr2 = ((eny)f2).qR(9, qq2);
                        final boolean i = eoa.k(qr2);
                        qr2.recycle();
                        if (!i) {
                            Log.w("VrCtl.ServiceBridge", "Failed to unregister remote service listener.");
                        }
                    }
                }
                catch (final RemoteException ex2) {
                    Log.w("VrCtl.ServiceBridge", "Exception while unregistering remote service listener: ".concat(ex2.toString()));
                }
            }
            this.a.unbindService((ServiceConnection)this);
            this.f = null;
            this.e = false;
            return;
        }
        Log.w("VrCtl.ServiceBridge", "Service is already unbound.");
    }
    
    public final void b() {
        ((ControllerServiceBridge$Callbacks)this.g.b).onServiceConnected(1);
        final aeru g = this.g;
        if (!this.e(g.a, g)) {
            Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
            ((ControllerServiceBridge$Callbacks)this.g.b).onServiceFailed();
            this.a();
            return;
        }
        final SparseArray d = this.d;
        final aeru g2 = this.g;
        d.put(g2.a, (Object)g2);
    }
    
    public final void c(final int n, final ControllerRequest controllerRequest) {
        d();
        final araz f = this.f;
        if (f != null) {
            try {
                final Parcel qq = ((eny)f).qQ();
                qq.writeInt(n);
                eoa.h(qq, (Parcelable)controllerRequest);
                ((eny)f).qS(11, qq);
                return;
            }
            catch (final RemoteException ex) {
                Log.w("VrCtl.ServiceBridge", "RemoteException while vibrating the controller.", (Throwable)ex);
                return;
            }
        }
        Log.w("VrCtl.ServiceBridge", "Vibration cancelled: service not connected");
    }
    
    public void controllerHapticsEffect(final int n, final int c, final int d) {
        final agza builder = ((agzi)arbc.a).createBuilder();
        final agza builder2 = ((agzi)arba.a).createBuilder();
        builder2.copyOnWrite();
        final arba arba = (arba)builder2.instance;
        arba.b |= 0x1;
        arba.c = c;
        builder2.copyOnWrite();
        final arba arba2 = (arba)builder2.instance;
        arba2.b |= 0x2;
        arba2.d = d;
        final arba d2 = (arba)builder2.build();
        builder.copyOnWrite();
        final arbc arbc = (arbc)builder.instance;
        d2.getClass();
        arbc.d = d2;
        arbc.b |= 0x2;
        final arbc arbc2 = (arbc)builder.build();
        final ControllerRequest controllerRequest = new ControllerRequest();
        ((ParcelableProtoLite)controllerRequest).c((MessageLite)arbc2);
        this.b.post((Runnable)new wqx(this, n, controllerRequest, 12));
    }
    
    public boolean createAndConnectController(final int n, final ControllerServiceBridge$Callbacks controllerServiceBridge$Callbacks, int n2) {
        final ControllerListenerOptions controllerListenerOptions = new ControllerListenerOptions(n2);
        d();
        final araz f = this.f;
        boolean b = false;
        if (f != null) {
            final aeru g = new aeru(controllerServiceBridge$Callbacks, controllerListenerOptions, n);
            if (this.e(g.a, g)) {
                if (g.a == 0) {
                    this.g = g;
                }
                this.d.put(n, (Object)g);
                b = true;
            }
            else {
                if ((n2 = n) == 0) {
                    Log.e("VrCtl.ServiceBridge", "Failed to connect controller 0.");
                    n2 = 0;
                }
                this.d.remove(n2);
            }
        }
        return b;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        d();
        if (this.e) {
            Object f;
            if (binder == null) {
                f = null;
            }
            else {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
                if (queryLocalInterface instanceof araz) {
                    f = queryLocalInterface;
                }
                else {
                    f = new araz(binder);
                }
            }
            this.f = (araz)f;
            try {
                final Parcel qq = ((eny)f).qQ();
                qq.writeInt(25);
                final Parcel qr = ((eny)f).qR(1, qq);
                final int int1 = qr.readInt();
                qr.recycle();
                if (int1 != 0) {
                    String string;
                    if (int1 != 0) {
                        if (int1 != 1) {
                            if (int1 != 2) {
                                if (int1 != 3) {
                                    final StringBuilder sb = new StringBuilder("[UNKNOWN CONTROLLER INIT RESULT: ");
                                    sb.append(int1);
                                    sb.append("]");
                                    string = sb.toString();
                                }
                                else {
                                    string = "FAILED_CLIENT_OBSOLETE";
                                }
                            }
                            else {
                                string = "FAILED_NOT_AUTHORIZED";
                            }
                        }
                        else {
                            string = "FAILED_UNSUPPORTED";
                        }
                    }
                    else {
                        string = "SUCCESS";
                    }
                    Log.e("VrCtl.ServiceBridge", "initialize() returned error: ".concat(string));
                    ((ControllerServiceBridge$Callbacks)this.g.b).onServiceInitFailed(int1);
                    this.a();
                    return;
                }
                if (this.j >= 21) {
                    try {
                        final araz f2 = this.f;
                        final aray k = this.k;
                        final Parcel qq2 = ((eny)f2).qQ();
                        eoa.j(qq2, (IInterface)k);
                        final Parcel qr2 = ((eny)f2).qR(8, qq2);
                        final boolean i = eoa.k(qr2);
                        qr2.recycle();
                        if (!i) {
                            Log.e("VrCtl.ServiceBridge", "Failed to register remote service listener.");
                            ((ControllerServiceBridge$Callbacks)this.g.b).onServiceInitFailed(0);
                            this.a();
                            return;
                        }
                    }
                    catch (final RemoteException ex) {
                        Log.w("VrCtl.ServiceBridge", "Exception while registering remote service listener: ".concat(ex.toString()));
                    }
                }
                this.b();
            }
            catch (final RemoteException ex2) {
                Log.e("VrCtl.ServiceBridge", "Failed to call initialize() on controller service (RemoteException).", (Throwable)ex2);
                ((ControllerServiceBridge$Callbacks)this.g.b).onServiceFailed();
                this.a();
            }
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        d();
        this.f = null;
        ((ControllerServiceBridge$Callbacks)this.g.b).onServiceDisconnected();
    }
    
    public void requestBind() {
        this.b.post((Runnable)new arax(this, 2));
    }
    
    public void requestUnbind() {
        this.b.post((Runnable)new arax(this, 0));
    }
    
    public void vibrateController(final int n, final int c, final int d, final int e) {
        final agza builder = ((agzi)arbc.a).createBuilder();
        final agza builder2 = ((agzi)arbb.a).createBuilder();
        builder2.copyOnWrite();
        final arbb arbb = (arbb)builder2.instance;
        arbb.b |= 0x1;
        arbb.c = c;
        builder2.copyOnWrite();
        final arbb arbb2 = (arbb)builder2.instance;
        arbb2.b |= 0x2;
        arbb2.d = d;
        builder2.copyOnWrite();
        final arbb arbb3 = (arbb)builder2.instance;
        arbb3.b |= 0x4;
        arbb3.e = e;
        final arbb c2 = (arbb)builder2.build();
        builder.copyOnWrite();
        final arbc arbc = (arbc)builder.instance;
        c2.getClass();
        arbc.c = c2;
        arbc.b |= 0x1;
        final arbc arbc2 = (arbc)builder.build();
        final ControllerRequest controllerRequest = new ControllerRequest();
        ((ParcelableProtoLite)controllerRequest).c((MessageLite)arbc2);
        this.b.post((Runnable)new wqx(this, n, controllerRequest, 11));
    }
}
