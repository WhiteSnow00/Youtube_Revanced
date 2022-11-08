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

public final class gnc implements vau
{
    public final tny a;
    private final vbq b;
    private final Activity c;
    private final zki d;
    private final zkw e;
    private final gtx f;
    private final qpt g;
    
    public gnc(final Activity c, final zki d, final zkw e, final tny a, final gtx f, final vbq b, final qpt g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
        this.a = a;
        this.f = f;
        this.g = g;
    }
    
    public final void b(final List list, final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, final aexq aexq) {
        list.getClass();
        anss a;
        if (createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.c == 9) {
            a = (anss)createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.d;
        }
        else {
            a = anss.a;
        }
        if (((agzd)a).rs((agyr)CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer)) {
            final Object a2 = this.g.a;
            final jem jem = new jem();
            final Bundle bundle = new Bundle();
            bundle.putStringArrayList("SelectedVideoIds", new ArrayList(list));
            bundle.putByteArray("CreatePlaylistDialogEndpoint", ((agxl)createPlaylistEndpointOuterClass$CreatePlaylistEndpoint).toByteArray());
            jem.ag(bundle);
            jem.rD(((bu)a2).getSupportFragmentManager(), "CreatePlaylistDialogFragment");
            return;
        }
        final gtx f = this.f;
        final String f2 = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.f;
        final String g = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.g;
        f2.getClass();
        g.getClass();
        final View inflate = ((Activity)f.e).getLayoutInflater().inflate(2131624299, (ViewGroup)null, false);
        final TextInputLayout textInputLayout = (TextInputLayout)inflate.findViewById(2131430017);
        textInputLayout.u(false);
        final EditText editText = (EditText)inflate.findViewById(2131430009);
        final PrivacySpinner privacySpinner = (PrivacySpinner)inflate.findViewById(2131430611);
        privacySpinner.c(3);
        alvs alvs;
        if ((alvs = ((arud)f.h).f().e) == null) {
            alvs = alvs.a;
        }
        int ct;
        if ((alvs.d & 0x100000) != 0x0) {
            if ((ct = aqql.ct(alvs.T)) == 0) {
                ct = 1;
            }
        }
        else {
            ct = 2;
        }
        privacySpinner.e(ct);
        final gip gip = new gip(f, editText, privacySpinner, list, f2, g, aexq, null);
        final AlertDialog create = ((AlertDialog$Builder)((aeby)f.g).af((Context)f.e)).setTitle(2132017804).setView(inflate).setPositiveButton((CharSequence)((Activity)f.e).getString(2132017802), (DialogInterface$OnClickListener)gip).setNegativeButton((CharSequence)((Activity)f.e).getString(17039360), (DialogInterface$OnClickListener)gip).create();
        ((AlertDialog)(privacySpinner.c = (Dialog)create)).setOnShowListener((DialogInterface$OnShowListener)new jnd(f, textInputLayout, editText, 1, null));
        final Window window = create.getWindow();
        window.getClass();
        window.setSoftInputMode(4);
        create.show();
    }
    
    public final void c(final List list, final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, final Map map) {
        aexq aexq;
        if (map != null && map.get("PLAYLIST_CREATION_LISTENER_KEY") instanceof jed) {
            aexq = aexq.k((Object)map.get("PLAYLIST_CREATION_LISTENER_KEY"));
        }
        else {
            aexq = aewp.a;
        }
        if (this.d.t()) {
            this.b(list, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, aexq);
            return;
        }
        this.e.b(this.c, (byte[])null, (zku)new gnb(this, list, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, aexq));
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint)((agzd)aioe).rr((agyr)CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint);
        if ((createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.b & 0x8) != 0x0) {
            this.b.a(this.d.c()).f(createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.h).E(ashw.a()).s((asix)new gna(this, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map, 0)).q((asix)new gna(this, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map, 2)).p((asir)new fcf(this, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map, 6)).ab();
            return;
        }
        this.c((List)createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.e, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map);
    }
}
