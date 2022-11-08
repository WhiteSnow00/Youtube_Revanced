import android.util.Log;
import android.content.Context;
import android.app.Activity;
import java.util.HashSet;
import java.util.Set;
import android.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class dmm extends Fragment
{
    public final dlv a;
    public final dmq b;
    public dcl c;
    private final Set d;
    private dmm e;
    
    public dmm() {
        final dlv a = new dlv();
        this.b = (dmq)new dmx(this, 1);
        this.d = new HashSet();
        this.a = a;
    }
    
    private final void a() {
        final dmm e = this.e;
        if (e != null) {
            e.d.remove(this);
            this.e = null;
        }
    }
    
    public final void onAttach(final Activity activity) {
        super.onAttach(activity);
        try {
            this.a();
            final dmm c = dbo.b((Context)activity).d.c(activity.getFragmentManager());
            this.e = c;
            if (!this.equals((Object)c)) {
                this.e.d.add(this);
            }
        }
        catch (final IllegalStateException ex) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", (Throwable)ex);
            }
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.a.b();
        this.a();
    }
    
    public final void onDetach() {
        super.onDetach();
        this.a();
    }
    
    public final void onStart() {
        super.onStart();
        this.a.c();
    }
    
    public final void onStop() {
        super.onStop();
        this.a.d();
    }
    
    public final String toString() {
        final String string = super.toString();
        Fragment parentFragment;
        if ((parentFragment = this.getParentFragment()) == null) {
            parentFragment = null;
        }
        final String value = String.valueOf(parentFragment);
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("{parent=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
