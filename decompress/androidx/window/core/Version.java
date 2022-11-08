// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

import java.math.BigInteger;

public final class Version implements Comparable
{
    private static final Version CURRENT;
    public static final Version$Companion Companion;
    private static final Version UNKNOWN;
    private static final Version VERSION_0_1;
    private static final Version VERSION_1_0;
    private static final String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";
    private final atjm bigInteger$delegate;
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;
    
    static {
        Companion = new Version$Companion(null);
        UNKNOWN = new Version(0, 0, 0, "");
        VERSION_0_1 = new Version(0, 1, 0, "");
        CURRENT = (VERSION_1_0 = new Version(1, 0, 0, ""));
    }
    
    private Version(final int major, final int minor, final int patch, final String description) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
        this.description = description;
        this.bigInteger$delegate = atqc.f((atma)new Version$bigInteger$2(this));
    }
    
    private final BigInteger getBigInteger() {
        final Object a = this.bigInteger$delegate.a();
        a.getClass();
        return (BigInteger)a;
    }
    
    public static final Version parse(final String s) {
        return Version.Companion.parse(s);
    }
    
    public int compareTo(final Version version) {
        version.getClass();
        return this.getBigInteger().compareTo(version.getBigInteger());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Version)) {
            return false;
        }
        final int major = this.major;
        final Version version = (Version)o;
        return major == version.major && this.minor == version.minor && this.patch == version.patch;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final int getMajor() {
        return this.major;
    }
    
    public final int getMinor() {
        return this.minor;
    }
    
    public final int getPatch() {
        return this.patch;
    }
    
    @Override
    public int hashCode() {
        return ((this.major + 527) * 31 + this.minor) * 31 + this.patch;
    }
    
    @Override
    public String toString() {
        String string;
        if (!aubt.e((CharSequence)this.description)) {
            final StringBuilder sb = new StringBuilder("-");
            sb.append(this.description);
            string = sb.toString();
        }
        else {
            string = "";
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        sb2.append(this.patch);
        sb2.append(string);
        return sb2.toString();
    }
}
