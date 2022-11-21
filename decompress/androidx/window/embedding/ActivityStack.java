// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import android.app.Activity;
import java.util.List;

public final class ActivityStack
{
    private final List activities;
    private final boolean isEmpty;
    
    public ActivityStack(final List activities, final boolean isEmpty) {
        activities.getClass();
        this.activities = activities;
        this.isEmpty = isEmpty;
    }
    
    public ActivityStack(final List list, final boolean b, int n, final atqv atqv) {
        if ((n & 0x2) != 0x0) {
            n = 0;
        }
        else {
            n = 1;
        }
        this(list, (boolean)(((b ? 1 : 0) & n) != 0x0));
    }
    
    public final boolean contains(final Activity activity) {
        activity.getClass();
        return this.activities.contains(activity);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final Class<? extends ActivityStack> class1 = this.getClass();
        Class<?> class2;
        if (o != null) {
            class2 = o.getClass();
        }
        else {
            class2 = null;
        }
        if (!atqz.c(class1, class2)) {
            return false;
        }
        o.getClass();
        final ActivityStack activityStack = (ActivityStack)o;
        return atqz.c(this.activities, activityStack.activities) && this.isEmpty == activityStack.isEmpty;
    }
    
    public final List getActivities$window_release() {
        return this.activities;
    }
    
    @Override
    public int hashCode() {
        return this.activities.hashCode() * 31 + ActivityStack$$ExternalSyntheticBackport0.m(this.isEmpty);
    }
    
    public final boolean isEmpty() {
        return this.isEmpty;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ActivityStack{activities=");
        sb.append(this.activities);
        sb.append(", isEmpty=");
        sb.append(this.isEmpty);
        sb.append('}');
        return sb.toString();
    }
}
