// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d;
import android.os.IInterface;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import android.os.Parcel;
import android.os.IBinder;

public class IEmbedFragmentService$Stub$Proxy extends enz implements IEmbedFragmentService
{
    public IEmbedFragmentService$Stub$Proxy(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
    }
    
    public final int a() {
        final Parcel qx = this.qX(3, this.qW());
        final int int1 = qx.readInt();
        qx.recycle();
        return int1;
    }
    
    public final c b() {
        final Parcel qx = this.qX(11, this.qW());
        final IBinder strongBinder = qx.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.IEmbedsErrorLoggingService");
            if (queryLocalInterface instanceof c) {
                o = queryLocalInterface;
            }
            else {
                o = new a(strongBinder);
            }
        }
        qx.recycle();
        return (c)o;
    }
    
    public final d d() {
        final Parcel qx = this.qX(12, this.qW());
        final IBinder strongBinder = qx.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.IEmbedInteractionLoggingService");
            if (queryLocalInterface instanceof d) {
                o = queryLocalInterface;
            }
            else {
                o = new b(strongBinder);
            }
        }
        qx.recycle();
        return (d)o;
    }
    
    public final void e(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(28572);
        this.qY(4, qw);
    }
    
    public final void f() {
        this.qY(10, this.qW());
    }
    
    public final void g() {
        this.qY(9, this.qW());
    }
    
    public final void h() {
        this.qY(6, this.qW());
    }
    
    public final void i(final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)subscriptionNotificationMenuItem);
        this.qY(7, qw);
    }
    
    public final void j() {
        this.qY(5, this.qW());
    }
    
    public final void k() {
        this.qY(8, this.qW());
    }
    
    public final void l() {
        this.qY(2, this.qW());
    }
    
    public final void u(final SimplePlaybackDescriptor simplePlaybackDescriptor) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)simplePlaybackDescriptor);
        this.qY(1, qw);
    }
}
