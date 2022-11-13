import android.widget.TextView;
import android.view.View$OnClickListener;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfq extends jfs
{
    public tvr ae;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        final View inflate = layoutInflater.inflate(2131625046, viewGroup, false);
        final Toolbar toolbar = (Toolbar)inflate.findViewById(2131432125);
        toolbar.t((View$OnClickListener)new jan(this, 14));
        toolbar.z((CharSequence)((br)this).nZ().getString(2132019163));
        final Bundle m = ((br)this).m;
        if (m != null) {
            final aiqj b = vdb.b(m.getByteArray("navigation_endpoint"));
            if (((ahbc)b).ry((ahaq)anis.a)) {
                final anir anir = (anir)((ahbc)b).rx((ahaq)anis.a);
                final TextView textView = (TextView)inflate.findViewById(2131430493);
                ajut ajut;
                if ((ajut = anir.c) == null) {
                    ajut = ajut.a;
                }
                tpe.t(textView, (CharSequence)acak.b(ajut));
                final TextView textView2 = (TextView)inflate.findViewById(2131428624);
                ajut ajut2;
                if ((ajut2 = anir.b) == null) {
                    ajut2 = ajut.a;
                }
                tpe.t(textView2, (CharSequence)acak.r(ajut2));
            }
        }
        return inflate;
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        ((bi)this).nc(2, this.ae.a);
    }
}
