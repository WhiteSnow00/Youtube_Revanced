import java.util.Iterator;
import android.view.ViewGroup;
import java.util.List;
import android.widget.CheckBox;
import java.util.ArrayList;
import android.widget.TextView$OnEditorActionListener;
import android.widget.EditText;
import android.view.View$OnFocusChangeListener;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.e;
import android.text.TextWatcher;
import android.view.View$OnTouchListener;
import com.google.android.apps.youtube.app.common.ui.bottomui.KeyPressAwareEditText;
import com.google.android.material.textfield.TextInputLayout;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsHorizontalSurvey;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gca implements gaw
{
    public final vax a;
    final HatsContainer b;
    final YouTubeTextView c;
    public final HatsSurvey d;
    final HatsHorizontalSurvey e;
    public final Map f;
    public final ashj g;
    public final aeby h;
    qpt i;
    private final acng j;
    
    public gca(final acng j, final vax a, final ashj g, final aeby h, final HatsContainer b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = new HashMap();
        this.j = j;
        this.a = a;
        this.h = h;
        this.b = b;
        final gbe a2 = b.a();
        if (a2.a == null) {
            a2.a = (YouTubeTextView)a2.a(2131624511);
        }
        this.c = a2.a;
        this.e = b.a().b();
        final gbe a3 = b.a();
        if (a3.b == null) {
            a3.b = (HatsSurvey)a3.a(2131624512);
        }
        this.d = a3.b;
        this.g = g;
    }
    
    private static final boolean e(final gbu gbu) {
        if (gbu.b == 1) {
            final aong d = gbu.d;
            d.getClass();
            aoni aoni;
            if ((aoni = d.c) == null) {
                aoni = aoni.a;
            }
            final int ap = aqql.aP(aoni.b);
            if (ap != 0) {
                if (ap == 3) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final void b(final gbu gbu) {
        final hez m = gbu.m;
        if (m != null) {
            m.c(gbu.i);
        }
        this.c(0);
        this.g.tr((Object)gbz.b(false));
    }
    
    public final void c(final int n) {
        this.f.clear();
        final qpt i = this.i;
        if (i != null) {
            i.N(n);
            this.i = null;
        }
    }
    
    public final void d(final View view, final gbu gbu) {
        this.b(gbu);
        if (view != null) {
            tmy.p(view);
        }
    }
}
