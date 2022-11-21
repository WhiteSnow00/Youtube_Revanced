import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevm implements Application$ActivityLifecycleCallbacks
{
    final Application$ActivityLifecycleCallbacks a;
    final aevn b;
    
    public aevm(final aevn b, final Application$ActivityLifecycleCallbacks a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        if (aewp.r()) {
            this.a.onActivityCreated(activity, bundle);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityCreated"));
        try {
            this.a.onActivityCreated(activity, bundle);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityDestroyed(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityDestroyed"));
        try {
            this.a.onActivityDestroyed(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public final void onActivityPaused(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityPaused(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPaused"));
        try {
            this.a.onActivityPaused(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPostCreated(final Activity activity, final Bundle bundle) {
        if (aewp.r()) {
            this.a.onActivityPostCreated(activity, bundle);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPostCreated"));
        try {
            this.a.onActivityPostCreated(activity, bundle);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPostDestroyed(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityPostDestroyed(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPostDestroyed"));
        try {
            this.a.onActivityPostDestroyed(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPostPaused(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityPostPaused(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPostPaused"));
        try {
            this.a.onActivityPostPaused(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPostResumed(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityPostResumed(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPostResumed"));
        try {
            this.a.onActivityPostResumed(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPostSaveInstanceState(final Activity activity, final Bundle bundle) {
        if (aewp.r()) {
            this.a.onActivityPostSaveInstanceState(activity, bundle);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPostSaveInstanceState"));
        try {
            this.a.onActivityPostSaveInstanceState(activity, bundle);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPostStarted(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityPostStarted(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStarted"));
        try {
            this.a.onActivityPostStarted(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPostStopped(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityPostStopped(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStopped"));
        try {
            this.a.onActivityPostStopped(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPreCreated(final Activity activity, final Bundle bundle) {
        if (aewp.r()) {
            this.a.onActivityPreCreated(activity, bundle);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPreCreated"));
        try {
            this.a.onActivityPreCreated(activity, bundle);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPreDestroyed(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityPreDestroyed(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPreDestroyed"));
        try {
            this.a.onActivityPreDestroyed(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPrePaused(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityPrePaused(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPrePaused"));
        try {
            this.a.onActivityPrePaused(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPreResumed(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityPreResumed(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPreResumed"));
        try {
            this.a.onActivityPreResumed(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPreSaveInstanceState(final Activity activity, final Bundle bundle) {
        if (aewp.r()) {
            this.a.onActivityPreSaveInstanceState(activity, bundle);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPreSaveInstanceState"));
        try {
            this.a.onActivityPreSaveInstanceState(activity, bundle);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPreStarted(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityPreStarted(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStarted"));
        try {
            this.a.onActivityPreStarted(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public void onActivityPreStopped(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityPreStopped(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStopped"));
        try {
            this.a.onActivityPreStopped(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public final void onActivityResumed(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityResumed(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityResumed"));
        try {
            this.a.onActivityResumed(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        if (aewp.r()) {
            this.a.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivitySaveInstanceState"));
        try {
            this.a.onActivitySaveInstanceState(activity, bundle);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public final void onActivityStarted(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityStarted(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityStarted"));
        try {
            this.a.onActivityStarted(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
    
    public final void onActivityStopped(final Activity activity) {
        if (aewp.r()) {
            this.a.onActivityStopped(activity);
            return;
        }
        final aeuq a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityStopped"));
        try {
            this.a.onActivityStopped(activity);
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                afot.n((Throwable)activity, t);
            }
        }
    }
}
