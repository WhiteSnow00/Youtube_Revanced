import android.util.Pair;
import android.content.Intent;
import android.provider.Settings$Global;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhb
{
    public static final bhb a;
    public static final afcw b;
    private static final bhb c;
    private final int[] d;
    private final int e;
    
    static {
        a = new bhb(new int[] { 2 }, 8);
        c = new bhb(new int[] { 2, 5, 6 }, 8);
        final afct afct = new afct();
        final Integer value = 6;
        afct.g((Object)5, (Object)value);
        afct.g((Object)17, (Object)value);
        afct.g((Object)7, (Object)value);
        afct.g((Object)18, (Object)value);
        final Integer value2 = 8;
        afct.g((Object)value, (Object)value2);
        afct.g((Object)value2, (Object)value2);
        afct.g((Object)14, (Object)value2);
        b = afct.c();
    }
    
    public bhb(int[] copy, final int e) {
        if (copy != null) {
            copy = Arrays.copyOf(copy, copy.length);
            Arrays.sort(this.d = copy);
        }
        else {
            this.d = new int[0];
        }
        this.e = e;
    }
    
    public static bhb b(final Context context) {
        final Intent b = baw.B(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        bhb bhb;
        if (("Amazon".equals(baw.c) || "Xiaomi".equals(baw.c)) && Settings$Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            bhb = bhb.c;
        }
        else if (baw.a >= 29 && (baw.ah(context) || baw.ac(context))) {
            bhb = new bhb(bha.b(), 8);
        }
        else if (b != null && b.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            bhb = new bhb(b.getIntArrayExtra("android.media.extra.ENCODINGS"), b.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        else {
            bhb = bhb.a;
        }
        return bhb;
    }
    
    public final Pair a(final ayf ayf) {
        final String n = ayf.n;
        dk.d((Object)n);
        final int a = ayy.a(n, ayf.k);
        final afcw b = bhb.b;
        if (!b.containsKey((Object)a)) {
            return null;
        }
        final int n2 = 8;
        int n4 = 0;
        Label_0093: {
            int n3;
            if ((n3 = a) == 18) {
                if (!this.c(18)) {
                    n4 = 6;
                    break Label_0093;
                }
                n3 = 18;
            }
            if ((n4 = n3) == 8) {
                n4 = n3;
                if (!this.c(8)) {
                    n4 = 7;
                }
            }
        }
        if (!this.c(n4)) {
            return null;
        }
        int n5 = ayf.A;
        if (n5 != -1 && n4 != 18) {
            if (n5 > this.e) {
                return null;
            }
        }
        else {
            int b2;
            if ((b2 = ayf.B) == -1) {
                b2 = 48000;
            }
            if (baw.a >= 29) {
                n5 = bha.a(n4, b2);
            }
            else {
                final Integer n6 = (Integer)b.getOrDefault((Object)n4, (Object)0);
                dk.d((Object)n6);
                n5 = n6;
            }
        }
        if (baw.a <= 28) {
            if (n5 == 7) {
                n5 = n2;
            }
            else if (n5 == 3 || n5 == 4 || n5 == 5) {
                n5 = 6;
            }
        }
        int n7 = n5;
        if (baw.a <= 26) {
            n7 = n5;
            if ("fugu".equals(baw.b) && (n7 = n5) == 1) {
                n7 = 2;
            }
        }
        final int g = baw.g(n7);
        if (g == 0) {
            return null;
        }
        return Pair.create((Object)n4, (Object)g);
    }
    
    public final boolean c(final int n) {
        return Arrays.binarySearch(this.d, n) >= 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bhb)) {
            return false;
        }
        final bhb bhb = (bhb)o;
        return Arrays.equals(this.d, bhb.d) && this.e == bhb.e;
    }
    
    @Override
    public final int hashCode() {
        return this.e + Arrays.hashCode(this.d) * 31;
    }
    
    @Override
    public final String toString() {
        final int e = this.e;
        final String string = Arrays.toString(this.d);
        final StringBuilder sb = new StringBuilder("AudioCapabilities[maxChannelCount=");
        sb.append(e);
        sb.append(", supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
