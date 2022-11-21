import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import android.net.Uri;
import android.content.IntentSender;
import java.util.List;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccf
{
    final Bundle a;
    List b;
    List c;
    
    public ccf(final Bundle a) {
        this.a = a;
    }
    
    public static ccf l(final Bundle bundle) {
        if (bundle != null) {
            return new ccf(bundle);
        }
        return null;
    }
    
    public final int a() {
        return this.a.getInt("connectionState", 0);
    }
    
    public final int b() {
        return this.a.getInt("deviceType");
    }
    
    public final int c() {
        return this.a.getInt("playbackStream", -1);
    }
    
    public final int d() {
        return this.a.getInt("playbackType", 1);
    }
    
    public final int e() {
        return this.a.getInt("presentationDisplayId", -1);
    }
    
    public final int f() {
        return this.a.getInt("volume");
    }
    
    public final int g() {
        return this.a.getInt("volumeHandling", 0);
    }
    
    public final int h() {
        return this.a.getInt("volumeMax");
    }
    
    public final IntentSender i() {
        return (IntentSender)this.a.getParcelable("settingsIntent");
    }
    
    public final Uri j() {
        final String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }
    
    public final Bundle k() {
        return this.a.getBundle("extras");
    }
    
    public final String m() {
        return this.a.getString("status");
    }
    
    public final String n() {
        return this.a.getString("id");
    }
    
    public final String o() {
        return this.a.getString("name");
    }
    
    public final List p() {
        this.r();
        return this.c;
    }
    
    public final List q() {
        if (this.b == null && (this.b = this.a.getStringArrayList("groupMemberIds")) == null) {
            this.b = Collections.emptyList();
        }
        return this.b;
    }
    
    final void r() {
        if (this.c == null && (this.c = this.a.getParcelableArrayList("controlFilters")) == null) {
            this.c = Collections.emptyList();
        }
    }
    
    public final boolean s() {
        return this.a.getBoolean("canDisconnect", false);
    }
    
    public final boolean t() {
        return this.a.getBoolean("enabled", true);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(this.n());
        sb.append(", groupMemberIds=");
        sb.append(this.q());
        sb.append(", name=");
        sb.append(this.o());
        sb.append(", description=");
        sb.append(this.m());
        sb.append(", iconUri=");
        sb.append(this.j());
        sb.append(", isEnabled=");
        sb.append(this.t());
        sb.append(", connectionState=");
        sb.append(this.a());
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(this.p().toArray()));
        sb.append(", playbackType=");
        sb.append(this.d());
        sb.append(", playbackStream=");
        sb.append(this.c());
        sb.append(", deviceType=");
        sb.append(this.b());
        sb.append(", volume=");
        sb.append(this.f());
        sb.append(", volumeMax=");
        sb.append(this.h());
        sb.append(", volumeHandling=");
        sb.append(this.g());
        sb.append(", presentationDisplayId=");
        sb.append(this.e());
        sb.append(", extras=");
        sb.append(this.k());
        sb.append(", isValid=");
        sb.append(this.u());
        sb.append(", minClientVersion=");
        sb.append(this.a.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(this.a.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb.append(" }");
        return sb.toString();
    }
    
    public final boolean u() {
        this.r();
        return !TextUtils.isEmpty((CharSequence)this.n()) && !TextUtils.isEmpty((CharSequence)this.o()) && !this.c.contains(null);
    }
}
