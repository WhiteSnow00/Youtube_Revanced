// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

import android.content.ComponentName;

public final class ActivityComponentInfo
{
    private final String className;
    private final String packageName;
    
    public ActivityComponentInfo(final ComponentName componentName) {
        componentName.getClass();
        final String packageName = componentName.getPackageName();
        packageName.getClass();
        final String className = componentName.getClassName();
        className.getClass();
        this(packageName, className);
    }
    
    public ActivityComponentInfo(final String packageName, final String className) {
        packageName.getClass();
        className.getClass();
        this.packageName = packageName;
        this.className = className;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final Class<? extends ActivityComponentInfo> class1 = this.getClass();
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
        final ActivityComponentInfo activityComponentInfo = (ActivityComponentInfo)o;
        return atqz.c(this.packageName, activityComponentInfo.packageName) && atqz.c(this.className, activityComponentInfo.className);
    }
    
    public final String getClassName() {
        return this.className;
    }
    
    public final String getPackageName() {
        return this.packageName;
    }
    
    @Override
    public int hashCode() {
        return this.packageName.hashCode() * 31 + this.className.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClassInfo { packageName: ");
        sb.append(this.packageName);
        sb.append(", className: ");
        sb.append(this.className);
        sb.append(" }");
        return sb.toString();
    }
}
