// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import android.content.Intent;
import android.app.Activity;
import android.content.ComponentName;
import androidx.window.core.ActivityComponentInfo;

public final class ActivityFilter
{
    private final ActivityComponentInfo activityComponentInfo;
    private final String intentAction;
    
    public ActivityFilter(final ComponentName componentName, final String s) {
        componentName.getClass();
        this(new ActivityComponentInfo(componentName), s);
    }
    
    public ActivityFilter(final ActivityComponentInfo activityComponentInfo, String packageName) {
        activityComponentInfo.getClass();
        this.activityComponentInfo = activityComponentInfo;
        this.intentAction = packageName;
        packageName = activityComponentInfo.getPackageName();
        final String className = activityComponentInfo.getClassName();
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (auop.r((CharSequence)packageName, (CharSequence)"*") && auop.t((CharSequence)packageName, "*", 0, false, 6) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (auop.r((CharSequence)className, (CharSequence)"*") && auop.t((CharSequence)className, "*", 0, false, 6) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityFilter)) {
            return false;
        }
        final ActivityComponentInfo activityComponentInfo = this.activityComponentInfo;
        final ActivityFilter activityFilter = (ActivityFilter)o;
        return atqz.c(activityComponentInfo, activityFilter.activityComponentInfo) && atqz.c(this.intentAction, activityFilter.intentAction);
    }
    
    public final ActivityComponentInfo getActivityComponentInfo$window_release() {
        return this.activityComponentInfo;
    }
    
    public final ComponentName getComponentName() {
        return new ComponentName(this.activityComponentInfo.getPackageName(), this.activityComponentInfo.getClassName());
    }
    
    public final String getIntentAction() {
        return this.intentAction;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.activityComponentInfo.hashCode();
        final String intentAction = this.intentAction;
        int hashCode2;
        if (intentAction != null) {
            hashCode2 = intentAction.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
    
    public final boolean matchesActivity(final Activity activity) {
        activity.getClass();
        final boolean activityOrIntentMatching$window_release = MatcherUtils.INSTANCE.isActivityOrIntentMatching$window_release(activity, this.activityComponentInfo);
        boolean b = false;
        if (activityOrIntentMatching$window_release) {
            final String intentAction = this.intentAction;
            if (intentAction != null) {
                final Intent intent = activity.getIntent();
                String action;
                if (intent != null) {
                    action = intent.getAction();
                }
                else {
                    action = null;
                }
                if (atqz.c(intentAction, action)) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean matchesIntent(final Intent intent) {
        intent.getClass();
        final boolean intentMatching$window_release = MatcherUtils.INSTANCE.isIntentMatching$window_release(intent, this.activityComponentInfo);
        boolean b = false;
        if (intentMatching$window_release) {
            final String intentAction = this.intentAction;
            if (intentAction != null && !atqz.c(intentAction, intent.getAction())) {
                return false;
            }
            b = true;
        }
        return b;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ActivityFilter(componentName=");
        sb.append(this.activityComponentInfo);
        sb.append(", intentAction=");
        sb.append(this.intentAction);
        sb.append(')');
        return sb.toString();
    }
}
