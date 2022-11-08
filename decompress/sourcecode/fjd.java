import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjd implements abnq, ven
{
    public String a;
    public String b;
    
    private fjd() {
    }
    
    public static fjd a(final abns abns) {
        final fjd fjd = new fjd();
        fjd.lX(abns);
        return fjd;
    }
    
    public final void b(final String s, final Bundle bundle) {
        if (s != null && s.equals("yt_android_watch")) {
            bundle.putString("CPN", this.a);
            bundle.putString("video_id", this.b);
        }
    }
    
    public final void c(final Bundle bundle) {
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().b).am((asix)new fcs(this, 5), (asix)ezm.l), ((asgt)abns.q().j).am((asix)new fcs(this, 6), (asix)ezm.l) };
    }
}
