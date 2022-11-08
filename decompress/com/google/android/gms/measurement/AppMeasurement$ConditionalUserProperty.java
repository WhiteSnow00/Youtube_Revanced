// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.os.Bundle;

public class AppMeasurement$ConditionalUserProperty
{
    public boolean mActive;
    public String mAppId;
    public long mCreationTimestamp;
    public String mExpiredEventName;
    public Bundle mExpiredEventParams;
    public String mName;
    public String mOrigin;
    public long mTimeToLive;
    public String mTimedOutEventName;
    public Bundle mTimedOutEventParams;
    public String mTriggerEventName;
    public long mTriggerTimeout;
    public String mTriggeredEventName;
    public Bundle mTriggeredEventParams;
    public long mTriggeredTimestamp;
    public Object mValue;
    
    public AppMeasurement$ConditionalUserProperty() {
    }
    
    public AppMeasurement$ConditionalUserProperty(final Bundle bundle) {
        kgk.aL((Object)bundle);
        this.mAppId = (String)nan.aq(bundle, "app_id", (Class)String.class, (Object)null);
        this.mOrigin = (String)nan.aq(bundle, "origin", (Class)String.class, (Object)null);
        this.mName = (String)nan.aq(bundle, "name", (Class)String.class, (Object)null);
        this.mValue = nan.aq(bundle, "value", (Class)Object.class, (Object)null);
        this.mTriggerEventName = (String)nan.aq(bundle, "trigger_event_name", (Class)String.class, (Object)null);
        final Long value = 0L;
        this.mTriggerTimeout = (long)nan.aq(bundle, "trigger_timeout", (Class)Long.class, (Object)value);
        this.mTimedOutEventName = (String)nan.aq(bundle, "timed_out_event_name", (Class)String.class, (Object)null);
        this.mTimedOutEventParams = (Bundle)nan.aq(bundle, "timed_out_event_params", (Class)Bundle.class, (Object)null);
        this.mTriggeredEventName = (String)nan.aq(bundle, "triggered_event_name", (Class)String.class, (Object)null);
        this.mTriggeredEventParams = (Bundle)nan.aq(bundle, "triggered_event_params", (Class)Bundle.class, (Object)null);
        this.mTimeToLive = (long)nan.aq(bundle, "time_to_live", (Class)Long.class, (Object)value);
        this.mExpiredEventName = (String)nan.aq(bundle, "expired_event_name", (Class)String.class, (Object)null);
        this.mExpiredEventParams = (Bundle)nan.aq(bundle, "expired_event_params", (Class)Bundle.class, (Object)null);
        this.mActive = (boolean)nan.aq(bundle, "active", (Class)Boolean.class, (Object)false);
        this.mCreationTimestamp = (long)nan.aq(bundle, "creation_timestamp", (Class)Long.class, (Object)value);
        this.mTriggeredTimestamp = (long)nan.aq(bundle, "triggered_timestamp", (Class)Long.class, (Object)value);
    }
}
