import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjj implements abps, vgn
{
    public String a;
    public String b;
    
    private fjj() {
    }
    
    public static fjj a(final abpu abpu) {
        final fjj fjj = new fjj();
        fjj.lX(abpu);
        return fjj;
    }
    
    public final void b(final String s, final Bundle bundle) {
        if (s != null && s.equals("yt_android_watch")) {
            bundle.putString("CPN", this.a);
            bundle.putString("video_id", this.b);
        }
    }
    
    public final void c(final Bundle bundle) {
    }
    
    @Override
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().b).an((asjm)new fcx(this, 5), (asjm)ezq.l), ((ashi)abpu.p().j).an((asjm)new fcx(this, 6), (asjm)ezq.l) };
    }
}
