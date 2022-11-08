// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import j$.util.Objects;
import java.util.regex.Matcher;
import android.util.Log;
import java.util.regex.Pattern;

public final class Version
{
    public static final Version CURRENT;
    public static final Version MIN;
    public final int majorVersion;
    public final int minorVersion;
    public final int patchVersion;
    
    static {
        CURRENT = parse("1.218.0");
        MIN = parse("1.81.0");
    }
    
    public Version(final int majorVersion, final int minorVersion, final int patchVersion) {
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.patchVersion = patchVersion;
    }
    
    public static Version parse(final String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        final Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)").matcher(s);
        if (!matcher.matches()) {
            Log.w("Version", "Failed to parse version from: ".concat(s));
            return null;
        }
        return new Version(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Version)) {
            return false;
        }
        final Version version = (Version)o;
        return this.majorVersion == version.majorVersion && this.minorVersion == version.minorVersion && this.patchVersion == version.patchVersion;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(new Object[] { this.majorVersion, this.minorVersion, this.patchVersion });
    }
    
    public boolean isAtLeast(final Version version) {
        final int majorVersion = this.majorVersion;
        final int majorVersion2 = version.majorVersion;
        if (majorVersion > majorVersion2) {
            return true;
        }
        if (majorVersion < majorVersion2) {
            return false;
        }
        final int minorVersion = this.minorVersion;
        final int minorVersion2 = version.minorVersion;
        if (minorVersion > minorVersion2) {
            return true;
        }
        if (minorVersion < minorVersion2) {
            return false;
        }
        final int patchVersion = this.patchVersion;
        final int patchVersion2 = version.patchVersion;
        return patchVersion > patchVersion2 || patchVersion >= patchVersion2;
    }
    
    @Override
    public String toString() {
        return String.format("%d.%d.%d", this.majorVersion, this.minorVersion, this.patchVersion);
    }
}
