import android.os.Build$VERSION;
import android.text.TextUtils;
import android.media.session.MediaSessionManager$RemoteUserInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axf
{
    axg a;
    
    public axf(final MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        final String packageName = mediaSessionManager$RemoteUserInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (!TextUtils.isEmpty((CharSequence)packageName)) {
            this.a = new axg(mediaSessionManager$RemoteUserInfo.getPackageName(), mediaSessionManager$RemoteUserInfo.getPid(), mediaSessionManager$RemoteUserInfo.getUid());
            return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
    
    public axf(final String s, final int n, final int n2) {
        if (s == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            axg a;
            if (Build$VERSION.SDK_INT >= 28) {
                a = new axg(s, n, n2, null);
            }
            else {
                a = new axg(s, n, n2);
            }
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof axf && this.a.equals(((axf)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
