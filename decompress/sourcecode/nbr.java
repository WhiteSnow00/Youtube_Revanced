import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.Map;
import android.os.Bundle;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface nbr extends IInterface
{
    void beginAdUnitExposure(final String p0, final long p1);
    
    void clearConditionalUserProperty(final String p0, final String p1, final Bundle p2);
    
    void clearMeasurementEnabled(final long p0);
    
    void endAdUnitExposure(final String p0, final long p1);
    
    void generateEventId(final nbu p0);
    
    void getAppInstanceId(final nbu p0);
    
    void getCachedAppInstanceId(final nbu p0);
    
    void getConditionalUserProperties(final String p0, final String p1, final nbu p2);
    
    void getCurrentScreenClass(final nbu p0);
    
    void getCurrentScreenName(final nbu p0);
    
    void getGmpAppId(final nbu p0);
    
    void getMaxUserProperties(final String p0, final nbu p1);
    
    void getSessionId(final nbu p0);
    
    void getTestFlag(final nbu p0, final int p1);
    
    void getUserProperties(final String p0, final String p1, final boolean p2, final nbu p3);
    
    void initForTests(final Map p0);
    
    void initialize(final mvn p0, final InitializationParams p1, final long p2);
    
    void isDataCollectionEnabled(final nbu p0);
    
    void logEvent(final String p0, final String p1, final Bundle p2, final boolean p3, final boolean p4, final long p5);
    
    void logEventAndBundle(final String p0, final String p1, final Bundle p2, final nbu p3, final long p4);
    
    void logHealthData(final int p0, final String p1, final mvn p2, final mvn p3, final mvn p4);
    
    void onActivityCreated(final mvn p0, final Bundle p1, final long p2);
    
    void onActivityDestroyed(final mvn p0, final long p1);
    
    void onActivityPaused(final mvn p0, final long p1);
    
    void onActivityResumed(final mvn p0, final long p1);
    
    void onActivitySaveInstanceState(final mvn p0, final nbu p1, final long p2);
    
    void onActivityStarted(final mvn p0, final long p1);
    
    void onActivityStopped(final mvn p0, final long p1);
    
    void performAction(final Bundle p0, final nbu p1, final long p2);
    
    void registerOnMeasurementEventListener(final nbw p0);
    
    void resetAnalyticsData(final long p0);
    
    void setConditionalUserProperty(final Bundle p0, final long p1);
    
    void setConsent(final Bundle p0, final long p1);
    
    void setConsentThirdParty(final Bundle p0, final long p1);
    
    void setCurrentScreen(final mvn p0, final String p1, final String p2, final long p3);
    
    void setDataCollectionEnabled(final boolean p0);
    
    void setDefaultEventParameters(final Bundle p0);
    
    void setEventInterceptor(final nbw p0);
    
    void setInstanceIdProvider(final nby p0);
    
    void setMeasurementEnabled(final boolean p0, final long p1);
    
    void setMinimumSessionDuration(final long p0);
    
    void setSessionTimeoutDuration(final long p0);
    
    void setUserId(final String p0, final long p1);
    
    void setUserProperty(final String p0, final String p1, final mvn p2, final boolean p3, final long p4);
    
    void unregisterOnMeasurementEventListener(final nbw p0);
}
