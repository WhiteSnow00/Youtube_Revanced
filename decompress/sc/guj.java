import android.app.Activity;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class guj implements aejp
{
    final guk a;
    
    public guj(final guk a) {
        this.a = a;
    }
    
    @Override
    public final void b() {
    }
    
    @Override
    public final void c() {
        afse.j((aejp)this);
    }
    
    @Override
    public final void d(final aeea aeea) {
        final guk a = this.a;
        final AccountId h = aeea.h();
        final cl supportFragmentManager = a.a.getSupportFragmentManager();
        if (!(supportFragmentManager.e(2131430536) instanceof gum)) {
            final byte[] byteArrayExtra = a.a.getIntent().getByteArrayExtra("navigation_endpoint");
            aiqj aiqj;
            if (byteArrayExtra != null) {
                aiqj = vdb.b(byteArrayExtra);
            }
            else {
                aiqj = aiqj.a;
            }
            final gum gum = new gum();
            arlc.g((br)gum);
            aepz.e((br)gum, h);
            aepu.b((br)gum, (MessageLite)aiqj);
            aepz.e((br)gum, h);
            final ct i = supportFragmentManager.i();
            i.A(2131430536, (br)gum);
            i.d();
        }
        a.c.h(31, 2, 2);
    }
    
    @Override
    public final void sX(final Throwable t) {
        final guk a = this.a;
        a.d.j("PostsCreationActivityPeer", t, 31, (Activity)a.a);
    }
}
