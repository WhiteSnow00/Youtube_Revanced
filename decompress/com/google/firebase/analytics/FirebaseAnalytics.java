// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.analytics;

import android.app.Activity;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.os.Bundle;
import android.content.Context;

public final class FirebaseAnalytics
{
    private static volatile FirebaseAnalytics b;
    public final neg a;
    
    public FirebaseAnalytics(final neg a) {
        khl.aP(a);
        this.a = a;
    }
    
    public static FirebaseAnalytics getInstance(final Context context) {
        if (FirebaseAnalytics.b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (FirebaseAnalytics.b == null) {
                    FirebaseAnalytics.b = new FirebaseAnalytics(neg.d(context, (Bundle)null));
                }
            }
        }
        return FirebaseAnalytics.b;
    }
    
    public static nhl getScionFrontendApiImplementation(final Context context, final Bundle bundle) {
        final neg d = neg.d(context, bundle);
        if (d == null) {
            return null;
        }
        return (nhl)new agif(d);
    }
    
    public final void a(final boolean b) {
        final neg a = this.a;
        a.c((ndy)new ndi(a, Boolean.valueOf(b)));
    }
    
    public String getFirebaseInstanceId() {
        try {
            return (String)nnv.e(aglj.b().a(), 30000L, TimeUnit.MILLISECONDS);
        }
        catch (final InterruptedException ex) {
            throw new IllegalStateException(ex);
        }
        catch (final TimeoutException ex2) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        catch (final ExecutionException ex3) {
            throw new IllegalStateException(ex3.getCause());
        }
    }
    
    @Deprecated
    public void setCurrentScreen(final Activity activity, final String s, final String s2) {
        final neg a = this.a;
        a.c((ndy)new ndh(a, activity, s, s2));
    }
}
