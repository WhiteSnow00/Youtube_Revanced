// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

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
    public static final int h = 0;
    private static final AtomicInteger i;
    public final Context a;
    public final Handler b;
    final String c;
    public final SparseArray d;
    public boolean e;
    public ardn f;
    public aetv g;
    private final int j;
    private final ardm k;
    
    static {
        i = new AtomicInteger(-1);
    }
    
    public ControllerServiceBridge(final Context context, final ControllerServiceBridge$Callbacks controllerServiceBridge$Callbacks, int j) {
        final ControllerListenerOptions controllerListenerOptions = new ControllerListenerOptions(j);
        final SparseArray d = new SparseArray();
        this.d = d;
        this.a = context.getApplicationContext();
        j = 0;
        final aetv g = new aetv(controllerServiceBridge$Callbacks, controllerListenerOptions, 0);
        this.g = g;
        d.put(g.a, (Object)g);
        this.b = new Handler(Looper.getMainLooper());
        this.k = new ardm(this, 2);
        while (true) {
            try {
                j = VrCoreUtils.getVrCoreClientApiVersion(context);
                this.j = j;
                j = ControllerServiceBridge.i.incrementAndGet();
                final StringBuilder sb = new StringBuilder("VrCtl.ServiceBridge");
                sb.append(j);
                this.c = sb.toString();
            }
            catch (final ardc ardc) {
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
    
    private final boolean e(final int n, final aetv aetv) {
        try {
            final ardn f = this.f;
            final String c = this.c;
            final ardm ardm = new ardm(aetv, 0, (byte[])null, (byte[])null);
            final Parcel qw = ((enz)f).qW();
            qw.writeInt(n);
            qw.writeString(c);
            eob.j(qw, (IInterface)ardm);
            final Parcel qx = ((enz)f).qX(5, qw);
            final boolean k = eob.k(qx);
            qx.recycle();
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
            final ardn f = this.f;
            if (f != null) {
                try {
                    final String c = this.c;
                    final Parcel qw = ((enz)f).qW();
                    qw.writeString(c);
                    final Parcel qx = ((enz)f).qX(6, qw);
                    eob.k(qx);
                    qx.recycle();
                }
                catch (final RemoteException ex) {
                    Log.w("VrCtl.ServiceBridge", "RemoteException while unregistering listeners.", (Throwable)ex);
                }
            }
            if (this.j >= 21) {
                try {
                    final ardn f2 = this.f;
                    if (f2 != null) {
                        final ardm k = this.k;
                        final Parcel qw2 = ((enz)f2).qW();
                        eob.j(qw2, (IInterface)k);
                        final Parcel qx2 = ((enz)f2).qX(9, qw2);
                        final boolean i = eob.k(qx2);
                        qx2.recycle();
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
        final aetv g = this.g;
        if (!this.e(g.a, g)) {
            Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
            ((ControllerServiceBridge$Callbacks)this.g.b).onServiceFailed();
            this.a();
            return;
        }
        final SparseArray d = this.d;
        final aetv g2 = this.g;
        d.put(g2.a, (Object)g2);
    }
    
    public final void c(final int n, final ControllerRequest controllerRequest) {
        d();
        final ardn f = this.f;
        if (f != null) {
            try {
                final Parcel qw = ((enz)f).qW();
                qw.writeInt(n);
                eob.h(qw, (Parcelable)controllerRequest);
                ((enz)f).qY(11, qw);
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
        final ahaz builder = ((ahbh)ardq.a).createBuilder();
        final ahaz builder2 = ((ahbh)ardo.a).createBuilder();
        builder2.copyOnWrite();
        final ardo ardo = (ardo)builder2.instance;
        ardo.b |= 0x1;
        ardo.c = c;
        builder2.copyOnWrite();
        final ardo ardo2 = (ardo)builder2.instance;
        ardo2.b |= 0x2;
        ardo2.d = d;
        final ardo d2 = (ardo)builder2.build();
        builder.copyOnWrite();
        final ardq ardq = (ardq)builder.instance;
        d2.getClass();
        ardq.d = d2;
        ardq.b |= 0x2;
        final ardq ardq2 = (ardq)builder.build();
        final ControllerRequest controllerRequest = new ControllerRequest();
        controllerRequest.c((MessageLite)ardq2);
        this.b.post((Runnable)new wsx(this, n, controllerRequest, 12));
    }
    
    public boolean createAndConnectController(final int n, final ControllerServiceBridge$Callbacks controllerServiceBridge$Callbacks, int n2) {
        final ControllerListenerOptions controllerListenerOptions = new ControllerListenerOptions(n2);
        d();
        final ardn f = this.f;
        boolean b = false;
        if (f != null) {
            final aetv g = new aetv(controllerServiceBridge$Callbacks, controllerListenerOptions, n);
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
                if (queryLocalInterface instanceof ardn) {
                    f = queryLocalInterface;
                }
                else {
                    f = new ardn(binder);
                }
            }
            this.f = (ardn)f;
            try {
                final Parcel qw = ((enz)f).qW();
                qw.writeInt(25);
                final Parcel qx = ((enz)f).qX(1, qw);
                final int int1 = qx.readInt();
                qx.recycle();
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
                        final ardn f2 = this.f;
                        final ardm k = this.k;
                        final Parcel qw2 = ((enz)f2).qW();
                        eob.j(qw2, (IInterface)k);
                        final Parcel qx2 = ((enz)f2).qX(8, qw2);
                        final boolean i = eob.k(qx2);
                        qx2.recycle();
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
        this.b.post((Runnable)new arcu(this, 3));
    }
    
    public void requestUnbind() {
        this.b.post((Runnable)new arcu(this, 2));
    }
    
    public void vibrateController(final int n, final int c, final int d, final int e) {
        final ahaz builder = ((ahbh)ardq.a).createBuilder();
        final ahaz builder2 = ((ahbh)ardp.a).createBuilder();
        builder2.copyOnWrite();
        final ardp ardp = (ardp)builder2.instance;
        ardp.b |= 0x1;
        ardp.c = c;
        builder2.copyOnWrite();
        final ardp ardp2 = (ardp)builder2.instance;
        ardp2.b |= 0x2;
        ardp2.d = d;
        builder2.copyOnWrite();
        final ardp ardp3 = (ardp)builder2.instance;
        ardp3.b |= 0x4;
        ardp3.e = e;
        final ardp c2 = (ardp)builder2.build();
        builder.copyOnWrite();
        final ardq ardq = (ardq)builder.instance;
        c2.getClass();
        ardq.c = c2;
        ardq.b |= 0x1;
        final ardq ardq2 = (ardq)builder.build();
        final ControllerRequest controllerRequest = new ControllerRequest();
        controllerRequest.c((MessageLite)ardq2);
        this.b.post((Runnable)new wsx(this, n, controllerRequest, 11));
    }
}
