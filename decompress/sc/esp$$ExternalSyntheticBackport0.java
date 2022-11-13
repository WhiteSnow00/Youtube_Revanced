import com.android.tools.r8.annotations.SynthesizedClassV2;

// 
// Decompiled by Procyon v0.6.0
// 

@SynthesizedClassV2(kind = 26, versionHash = "97bd423e00d96fccdd636c516c1b1917e8f0df1164d64563ac4d13a412ddd39f")
public final class esp$$ExternalSyntheticBackport0
{
    public static AssertionError m(final String s, final Throwable t) {
        try {
            return AssertionError.class.getDeclaredConstructor(String.class, Throwable.class).newInstance(s, t);
        }
        catch (final Exception ex) {
            return new AssertionError((Object)s);
        }
    }
}
