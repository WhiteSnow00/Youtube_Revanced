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

public class IEmbedFragmentService$Stub$Proxy extends eoc implements IEmbedFragmentService
{
    public IEmbedFragmentService$Stub$Proxy(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
    }
    
    public final int a() {
        final Parcel qw = this.qW(3, this.qV());
        final int int1 = qw.readInt();
        qw.recycle();
        return int1;
    }
    
    public final c b() {
        final Parcel qw = this.qW(11, this.qV());
        final IBinder strongBinder = qw.readStrongBinder();
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
        qw.recycle();
        return (c)o;
    }
    
    public final d d() {
        final Parcel qw = this.qW(12, this.qV());
        final IBinder strongBinder = qw.readStrongBinder();
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
        qw.recycle();
        return (d)o;
    }
    
    public final void e(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(28572);
        this.qX(4, qv);
    }
    
    public final void f() {
        this.qX(10, this.qV());
    }
    
    public final void g() {
        this.qX(9, this.qV());
    }
    
    public final void h() {
        this.qX(6, this.qV());
    }
    
    public final void i(final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)subscriptionNotificationMenuItem);
        this.qX(7, qv);
    }
    
    public final void j() {
        this.qX(5, this.qV());
    }
    
    public final void k() {
        this.qX(8, this.qV());
    }
    
    public final void l() {
        this.qX(2, this.qV());
    }
    
    public final void u(final SimplePlaybackDescriptor simplePlaybackDescriptor) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)simplePlaybackDescriptor);
        this.qX(1, qv);
    }
}
