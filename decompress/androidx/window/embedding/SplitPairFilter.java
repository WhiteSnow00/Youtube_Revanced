// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import android.content.Intent;
import android.app.Activity;
import androidx.window.core.ActivityComponentInfo;
import android.content.ComponentName;

public final class SplitPairFilter
{
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;
    
    public SplitPairFilter(final ComponentName primaryActivityName, final ComponentName secondaryActivityName, String packageName) {
        primaryActivityName.getClass();
        secondaryActivityName.getClass();
        this.primaryActivityName = primaryActivityName;
        this.secondaryActivityName = secondaryActivityName;
        this.secondaryActivityIntentAction = packageName;
        packageName = primaryActivityName.getPackageName();
        packageName.getClass();
        final String className = primaryActivityName.getClassName();
        className.getClass();
        final String packageName2 = secondaryActivityName.getPackageName();
        packageName2.getClass();
        final String className2 = secondaryActivityName.getClassName();
        className2.getClass();
        if (packageName.length() == 0 || packageName2.length() == 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() == 0 || className2.length() == 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (aubt.j((CharSequence)packageName, (CharSequence)"*") && aubt.l((CharSequence)packageName, "*", 0, false, 6) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (aubt.j((CharSequence)className, (CharSequence)"*") && aubt.l((CharSequence)className, "*", 0, false, 6) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
        if (aubt.j((CharSequence)packageName2, (CharSequence)"*") && aubt.l((CharSequence)packageName2, "*", 0, false, 6) != packageName2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (aubt.j((CharSequence)className2, (CharSequence)"*") && aubt.l((CharSequence)className2, "*", 0, false, 6) != className2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }
    
    private final ActivityComponentInfo getSecondaryActivityInfo() {
        return new ActivityComponentInfo(this.secondaryActivityName);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SplitPairFilter)) {
            return false;
        }
        final ComponentName primaryActivityName = this.primaryActivityName;
        final SplitPairFilter splitPairFilter = (SplitPairFilter)o;
        return atnh.c((Object)primaryActivityName, (Object)splitPairFilter.primaryActivityName) && atnh.c((Object)this.secondaryActivityName, (Object)splitPairFilter.secondaryActivityName) && atnh.c((Object)this.secondaryActivityIntentAction, (Object)splitPairFilter.secondaryActivityIntentAction);
    }
    
    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }
    
    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }
    
    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.primaryActivityName.hashCode();
        final int hashCode2 = this.secondaryActivityName.hashCode();
        final String secondaryActivityIntentAction = this.secondaryActivityIntentAction;
        int hashCode3;
        if (secondaryActivityIntentAction != null) {
            hashCode3 = secondaryActivityIntentAction.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode * 31 + hashCode2) * 31 + hashCode3;
    }
    
    public final boolean matchesActivityIntentPair(final Activity activity, final Intent intent) {
        activity.getClass();
        intent.getClass();
        final boolean componentsMatching$window_release = MatcherUtils.INSTANCE.areComponentsMatching$window_release(activity.getComponentName(), this.primaryActivityName);
        boolean b = false;
        if (componentsMatching$window_release) {
            if (MatcherUtils.INSTANCE.isIntentMatching$window_release(intent, this.getSecondaryActivityInfo())) {
                final String secondaryActivityIntentAction = this.secondaryActivityIntentAction;
                if (secondaryActivityIntentAction != null && !atnh.c((Object)secondaryActivityIntentAction, (Object)intent.getAction())) {
                    return false;
                }
                b = true;
            }
        }
        return b;
    }
    
    public final boolean matchesActivityPair(final Activity activity, final Activity activity2) {
        activity.getClass();
        activity2.getClass();
        final boolean componentsMatching$window_release = MatcherUtils.INSTANCE.areComponentsMatching$window_release(activity.getComponentName(), this.primaryActivityName);
        final boolean b = true;
        boolean b2 = componentsMatching$window_release && MatcherUtils.INSTANCE.areComponentsMatching$window_release(activity2.getComponentName(), this.secondaryActivityName);
        if (activity2.getIntent() != null) {
            if (b2) {
                final Intent intent = activity2.getIntent();
                intent.getClass();
                if (this.matchesActivityIntentPair(activity, intent)) {
                    b2 = b;
                    return b2;
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SplitPairFilter{primaryActivityName=");
        sb.append(this.primaryActivityName);
        sb.append(", secondaryActivityName=");
        sb.append(this.secondaryActivityName);
        sb.append(", secondaryActivityAction=");
        sb.append(this.secondaryActivityIntentAction);
        sb.append('}');
        return sb.toString();
    }
}
