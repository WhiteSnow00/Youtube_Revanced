import android.app.Dialog;
import android.app.AlertDialog$Builder;
import java.util.Map;
import android.view.Window;
import android.app.AlertDialog;
import android.view.View;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.CreatePlaylistDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.List;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gni implements vcv
{
    public final tqd a;
    private final vdr b;
    private final Activity c;
    private final zmf d;
    private final zmt e;
    private final gug f;
    private final pvh g;
    
    public gni(final Activity c, final zmf d, final zmt e, final tqd a, final gug f, final vdr b, final pvh g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
        this.a = a;
        this.f = f;
        this.g = g;
    }
    
    public final void b(final List list, final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, final aezp aezp) {
        list.getClass();
        anuv a;
        if (createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.c == 9) {
            a = (anuv)createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.d;
        }
        else {
            a = anuv.a;
        }
        if (((ahbc)a).ry((ahaq)CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer)) {
            final Object a2 = this.g.a;
            final jfn jfn = new jfn();
            final Bundle bundle = new Bundle();
            bundle.putStringArrayList("SelectedVideoIds", new ArrayList(list));
            bundle.putByteArray("CreatePlaylistDialogEndpoint", ((agzk)createPlaylistEndpointOuterClass$CreatePlaylistEndpoint).toByteArray());
            jfn.ag(bundle);
            jfn.rJ(((bu)a2).getSupportFragmentManager(), "CreatePlaylistDialogFragment");
            return;
        }
        final gug f = this.f;
        final String f2 = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.f;
        final String g = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.g;
        f2.getClass();
        g.getClass();
        final View inflate = ((Activity)f.e).getLayoutInflater().inflate(2131624298, (ViewGroup)null, false);
        final TextInputLayout textInputLayout = (TextInputLayout)inflate.findViewById(2131430017);
        textInputLayout.u(false);
        final EditText editText = (EditText)inflate.findViewById(2131430009);
        final PrivacySpinner privacySpinner = (PrivacySpinner)inflate.findViewById(2131430614);
        privacySpinner.c(3);
        alxw alxw;
        if ((alxw = ((arwh)f.h).f().e) == null) {
            alxw = alxw.a;
        }
        int cu;
        if ((alxw.d & 0x100000) != 0x0) {
            if ((cu = aqsx.cu(alxw.T)) == 0) {
                cu = 1;
            }
        }
        else {
            cu = 2;
        }
        privacySpinner.e(cu);
        final gix gix = new gix(f, editText, privacySpinner, list, f2, g, aezp, null);
        final AlertDialog create = ((AlertDialog$Builder)((aeea)f.g).al((Context)f.e)).setTitle(2132017804).setView(inflate).setPositiveButton((CharSequence)((Activity)f.e).getString(2132017802), (DialogInterface$OnClickListener)gix).setNegativeButton((CharSequence)((Activity)f.e).getString(17039360), (DialogInterface$OnClickListener)gix).create();
        ((AlertDialog)(privacySpinner.c = (Dialog)create)).setOnShowListener((DialogInterface$OnShowListener)new jof(f, textInputLayout, editText, 1, (byte[])null));
        final Window window = create.getWindow();
        window.getClass();
        window.setSoftInputMode(4);
        create.show();
    }
    
    public final void c(final List list, final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, final Map map) {
        Object o;
        if (map != null && map.get("PLAYLIST_CREATION_LISTENER_KEY") instanceof jfe) {
            o = aezp.k((Object)map.get("PLAYLIST_CREATION_LISTENER_KEY"));
        }
        else {
            o = aeyo.a;
        }
        if (this.d.t()) {
            this.b(list, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, (aezp)o);
            return;
        }
        this.e.b(this.c, (byte[])null, (zmr)new gnh(this, list, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, (aezp)o));
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint)((ahbc)aiqj).rx((ahaq)CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint);
        if ((createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.b & 0x8) != 0x0) {
            this.b.a(this.d.c()).f(createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.h).E(asil.a()).s((asjm)new gng(this, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map, 0)).q((asjm)new gng(this, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map, 2)).p((asjg)new fcj(this, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map, 6)).ab();
            return;
        }
        this.c((List)createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.e, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map);
    }
}
