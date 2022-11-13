import android.os.Parcelable;
import android.os.Bundle;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.apps.tiktok.account.AccountId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gun implements urs
{
    public final gum a;
    private final AccountId b;
    
    public gun(final gum a, final AccountId b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final br br, final String s) {
        final ct i = this.a.og().i();
        i.w(2131430535, br, s);
        i.d();
    }
    
    public final void nN(final DeviceLocalFile deviceLocalFile) {
        gup gup;
        if ((gup = (gup)this.a.og().f("fragment_tag_metadata_editor")) == null) {
            final AccountId b = this.b;
            gup = new gup();
            arlc.g((br)gup);
            aepz.e((br)gup, b);
            final Bundle bundle = new Bundle();
            bundle.putParcelable("selected_local_media", (Parcelable)deviceLocalFile);
            gup.ag(bundle);
            aepz.e((br)gup, b);
        }
        this.b((br)gup, "fragment_tag_metadata_editor");
    }
}
