// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import android.os.Bundle;
import android.content.Context;

@Deprecated
public class AppMeasurement
{
    private static volatile AppMeasurement a;
    private final nbo b;
    
    public AppMeasurement(final nfo nfo) {
        this.b = (nbo)new nbm(nfo);
    }
    
    public AppMeasurement(final ngg ngg) {
        this.b = (nbo)new nbn(ngg);
    }
    
    @Deprecated
    public static AppMeasurement getInstance(final Context context) {
        if (AppMeasurement.a == null) {
            synchronized (AppMeasurement.class) {
                if (AppMeasurement.a == null) {
                    ngg ngg;
                    try {
                        ngg = (ngg)Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    }
                    catch (final ClassNotFoundException | Exception ex) {
                        ngg = null;
                    }
                    if (ngg != null) {
                        AppMeasurement.a = new AppMeasurement(ngg);
                    }
                    else {
                        AppMeasurement.a = new AppMeasurement(nfo.j(context, new InitializationParams(0L, 0L, true, (String)null, (String)null, (String)null, (Bundle)null, (String)null), (Long)null));
                    }
                }
            }
        }
        return AppMeasurement.a;
    }
    
    public void beginAdUnitExposure(final String s) {
        this.b.i(s);
    }
    
    public void clearConditionalUserProperty(final String s, final String s2, final Bundle bundle) {
        this.b.j(s, s2, bundle);
    }
    
    public void endAdUnitExposure(final String s) {
        this.b.k(s);
    }
    
    public long generateEventId() {
        return this.b.b();
    }
    
    public String getAppInstanceId() {
        return this.b.c();
    }
    
    public List getConditionalUserProperties(final String s, final String s2) {
        final List g = this.b.g(s, s2);
        int size;
        if (g == null) {
            size = 0;
        }
        else {
            size = g.size();
        }
        final ArrayList list = new ArrayList<AppMeasurement$ConditionalUserProperty>(size);
        final Iterator iterator = g.iterator();
        while (iterator.hasNext()) {
            list.add(new AppMeasurement$ConditionalUserProperty((Bundle)iterator.next()));
        }
        return list;
    }
    
    public String getCurrentScreenClass() {
        return this.b.d();
    }
    
    public String getCurrentScreenName() {
        return this.b.e();
    }
    
    public String getGmpAppId() {
        return this.b.f();
    }
    
    public int getMaxUserProperties(final String s) {
        return this.b.a(s);
    }
    
    protected Map getUserProperties(final String s, final String s2, final boolean b) {
        return this.b.h(s, s2, b);
    }
    
    public void logEventInternal(final String s, final String s2, final Bundle bundle) {
        this.b.l(s, s2, bundle);
    }
    
    public void setConditionalUserProperty(final AppMeasurement$ConditionalUserProperty appMeasurement$ConditionalUserProperty) {
        kgk.aL((Object)appMeasurement$ConditionalUserProperty);
        final nbo b = this.b;
        final Bundle bundle = new Bundle();
        final String mAppId = appMeasurement$ConditionalUserProperty.mAppId;
        if (mAppId != null) {
            bundle.putString("app_id", mAppId);
        }
        final String mOrigin = appMeasurement$ConditionalUserProperty.mOrigin;
        if (mOrigin != null) {
            bundle.putString("origin", mOrigin);
        }
        final String mName = appMeasurement$ConditionalUserProperty.mName;
        if (mName != null) {
            bundle.putString("name", mName);
        }
        final Object mValue = appMeasurement$ConditionalUserProperty.mValue;
        if (mValue != null) {
            nan.ar(bundle, mValue);
        }
        final String mTriggerEventName = appMeasurement$ConditionalUserProperty.mTriggerEventName;
        if (mTriggerEventName != null) {
            bundle.putString("trigger_event_name", mTriggerEventName);
        }
        bundle.putLong("trigger_timeout", appMeasurement$ConditionalUserProperty.mTriggerTimeout);
        final String mTimedOutEventName = appMeasurement$ConditionalUserProperty.mTimedOutEventName;
        if (mTimedOutEventName != null) {
            bundle.putString("timed_out_event_name", mTimedOutEventName);
        }
        final Bundle mTimedOutEventParams = appMeasurement$ConditionalUserProperty.mTimedOutEventParams;
        if (mTimedOutEventParams != null) {
            bundle.putBundle("timed_out_event_params", mTimedOutEventParams);
        }
        final String mTriggeredEventName = appMeasurement$ConditionalUserProperty.mTriggeredEventName;
        if (mTriggeredEventName != null) {
            bundle.putString("triggered_event_name", mTriggeredEventName);
        }
        final Bundle mTriggeredEventParams = appMeasurement$ConditionalUserProperty.mTriggeredEventParams;
        if (mTriggeredEventParams != null) {
            bundle.putBundle("triggered_event_params", mTriggeredEventParams);
        }
        bundle.putLong("time_to_live", appMeasurement$ConditionalUserProperty.mTimeToLive);
        final String mExpiredEventName = appMeasurement$ConditionalUserProperty.mExpiredEventName;
        if (mExpiredEventName != null) {
            bundle.putString("expired_event_name", mExpiredEventName);
        }
        final Bundle mExpiredEventParams = appMeasurement$ConditionalUserProperty.mExpiredEventParams;
        if (mExpiredEventParams != null) {
            bundle.putBundle("expired_event_params", mExpiredEventParams);
        }
        bundle.putLong("creation_timestamp", appMeasurement$ConditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", appMeasurement$ConditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", appMeasurement$ConditionalUserProperty.mTriggeredTimestamp);
        b.m(bundle);
    }
}
