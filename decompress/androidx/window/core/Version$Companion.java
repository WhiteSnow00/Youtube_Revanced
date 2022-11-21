// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Version$Companion
{
    private Version$Companion() {
    }
    
    public Version$Companion(final atqv atqv) {
        this();
    }
    
    public final Version getCURRENT() {
        return Version.access$getCURRENT$cp();
    }
    
    public final Version getUNKNOWN() {
        return Version.access$getUNKNOWN$cp();
    }
    
    public final Version getVERSION_0_1() {
        return Version.access$getVERSION_0_1$cp();
    }
    
    public final Version getVERSION_1_0() {
        return Version.access$getVERSION_1_0$cp();
    }
    
    public final Version parse(String group) {
        if (group != null) {
            if (!auop.m((CharSequence)group)) {
                final Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(group);
                if (!matcher.matches()) {
                    return null;
                }
                final String group2 = matcher.group(1);
                if (group2 != null) {
                    final int int1 = Integer.parseInt(group2);
                    final String group3 = matcher.group(2);
                    if (group3 != null) {
                        final int int2 = Integer.parseInt(group3);
                        final String group4 = matcher.group(3);
                        if (group4 != null) {
                            final int int3 = Integer.parseInt(group4);
                            if (matcher.group(4) != null) {
                                group = matcher.group(4);
                            }
                            else {
                                group = "";
                            }
                            group.getClass();
                            return new Version(int1, int2, int3, group, null);
                        }
                    }
                }
            }
        }
        return null;
    }
}
