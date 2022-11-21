// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import android.content.Intent;
import android.app.Activity;
import androidx.window.core.ActivityComponentInfo;
import android.content.ComponentName;

public final class MatcherUtils
{
    public static final MatcherUtils INSTANCE;
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";
    
    static {
        INSTANCE = new MatcherUtils();
    }
    
    private MatcherUtils() {
    }
    
    private final boolean wildcardMatch(final String s, String substring) {
        if (!auop.r((CharSequence)substring, (CharSequence)"*")) {
            return false;
        }
        if (atqz.c(substring, "*")) {
            return true;
        }
        if (auop.t((CharSequence)substring, "*", 0, false, 6) == auop.y((CharSequence)substring, "*")) {
            substring.getClass();
            if (substring.endsWith("*")) {
                substring = substring.substring(0, substring.length() - 1);
                substring.getClass();
                return auop.w(s, substring);
            }
        }
        throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
    }
    
    public final boolean areComponentsMatching$window_release(final ComponentName componentName, final ComponentName componentName2) {
        componentName2.getClass();
        ActivityComponentInfo activityComponentInfo;
        if (componentName != null) {
            activityComponentInfo = new ActivityComponentInfo(componentName);
        }
        else {
            activityComponentInfo = null;
        }
        return this.areComponentsMatching$window_release(activityComponentInfo, new ActivityComponentInfo(componentName2));
    }
    
    public final boolean areComponentsMatching$window_release(final ActivityComponentInfo activityComponentInfo, final ActivityComponentInfo activityComponentInfo2) {
        activityComponentInfo2.getClass();
        if (activityComponentInfo == null) {
            return atqz.c(activityComponentInfo2.getPackageName(), "*") && atqz.c(activityComponentInfo2.getClassName(), "*");
        }
        if (!auop.r((CharSequence)activityComponentInfo.toString(), (CharSequence)"*")) {
            final boolean b = atqz.c(activityComponentInfo.getPackageName(), activityComponentInfo2.getPackageName()) || this.wildcardMatch(activityComponentInfo.getPackageName(), activityComponentInfo2.getPackageName());
            final boolean b2 = atqz.c(activityComponentInfo.getClassName(), activityComponentInfo2.getClassName()) || this.wildcardMatch(activityComponentInfo.getClassName(), activityComponentInfo2.getClassName());
            return b && b2;
        }
        throw new IllegalArgumentException("Wildcard can only be part of the rule.");
    }
    
    public final boolean isActivityOrIntentMatching$window_release(final Activity activity, final ActivityComponentInfo activityComponentInfo) {
        activity.getClass();
        activityComponentInfo.getClass();
        final ComponentName componentName = activity.getComponentName();
        componentName.getClass();
        if (this.areComponentsMatching$window_release(new ActivityComponentInfo(componentName), activityComponentInfo)) {
            return true;
        }
        final Intent intent = activity.getIntent();
        return intent != null && MatcherUtils.INSTANCE.isIntentMatching$window_release(intent, activityComponentInfo);
    }
    
    public final boolean isIntentMatching$window_release(final Intent intent, final ActivityComponentInfo activityComponentInfo) {
        intent.getClass();
        activityComponentInfo.getClass();
        if (intent.getComponent() != null) {
            final ComponentName component = intent.getComponent();
            ActivityComponentInfo activityComponentInfo2;
            if (component != null) {
                activityComponentInfo2 = new ActivityComponentInfo(component);
            }
            else {
                activityComponentInfo2 = null;
            }
            return this.areComponentsMatching$window_release(activityComponentInfo2, activityComponentInfo);
        }
        final String package1 = intent.getPackage();
        return package1 != null && ((atqz.c(package1, activityComponentInfo.getPackageName()) || this.wildcardMatch(package1, activityComponentInfo.getPackageName())) && atqz.c(activityComponentInfo.getClassName(), "*"));
    }
}
