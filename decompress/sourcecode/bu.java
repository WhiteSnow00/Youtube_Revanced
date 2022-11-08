import android.view.LayoutInflater$Factory2;
import androidx.activity.result.IntentSenderRequest;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.content.IntentSender;
import android.app.SharedElementCallback;
import android.app.Activity;
import android.view.MenuItem;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class bu extends qt implements aes
{
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final aun mFragmentLifecycleRegistry;
    final bx mFragments;
    boolean mResumed;
    boolean mStopped;
    
    public bu() {
        this.mFragments = bx.a(new bt(this));
        this.mFragmentLifecycleRegistry = new aun((aum)this);
        this.mStopped = true;
        this.init();
    }
    
    public bu(final int n) {
        super(n);
        this.mFragments = bx.a(new bt(this));
        this.mFragmentLifecycleRegistry = new aun((aum)this);
        this.mStopped = true;
        this.init();
    }
    
    private void init() {
        this.getSavedStateRegistry().c("android:support:lifecycle", (cgg)new cb(this, 1));
        this.addOnConfigurationChangedListener((akn)new bs(this, 1));
        this.addOnNewIntentListener((akn)new bs(this, 0));
        this.addOnContextAvailableListener((rc)new qn(this, 1));
    }
    
    private static boolean markState(final cl cl, final aug aug) {
        final Iterator iterator = cl.j().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final br br = (br)iterator.next();
            if (br != null) {
                boolean b = n != 0;
                if (br.O() != null) {
                    b = ((n | (markState(br.og(), aug) ? 1 : 0)) != 0x0);
                }
                final cv y = br.Y;
                n = (b ? 1 : 0);
                if (y != null) {
                    n = (b ? 1 : 0);
                    if (((aun)y.getLifecycle()).b.a(aug.d)) {
                        br.Y.a.f(aug);
                        n = (true ? 1 : 0);
                    }
                }
                if (!br.X.b.a(aug.d)) {
                    continue;
                }
                br.X.f(aug);
                n = (true ? 1 : 0);
            }
        }
        return n != 0;
    }
    
    View dispatchFragmentsOnCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        return ((LayoutInflater$Factory2)((bz)this.mFragments.a).e.c).onCreateView(view, s, context, set);
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        if (!((dh)this).shouldDumpInternalState(array)) {
            return;
        }
        printWriter.print(s);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        final String concat = String.valueOf(s).concat("  ");
        printWriter.print(concat);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (this.getApplication() != null) {
            awb.a((aum)this).c(concat, printWriter);
        }
        this.mFragments.b().D(s, fileDescriptor, printWriter, array);
    }
    
    public cl getSupportFragmentManager() {
        return this.mFragments.b();
    }
    
    @Deprecated
    public awb getSupportLoaderManager() {
        return awb.a((aum)this);
    }
    
    public void markFragmentsCreated() {
        while (markState(this.getSupportFragmentManager(), aug.c)) {}
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        this.mFragments.c();
        super.onActivityResult(n, n2, intent);
    }
    
    @Deprecated
    public void onAttachFragment(final br br) {
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(auf.ON_CREATE);
        ((bz)this.mFragments.a).e.q();
    }
    
    public View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        final View dispatchFragmentsOnCreateView = this.dispatchFragmentsOnCreateView(view, s, context, set);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, s, context, set);
        }
        return dispatchFragmentsOnCreateView;
    }
    
    public View onCreateView(final String s, final Context context, final AttributeSet set) {
        final View dispatchFragmentsOnCreateView = this.dispatchFragmentsOnCreateView(null, s, context, set);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(s, context, set);
        }
        return dispatchFragmentsOnCreateView;
    }
    
    protected void onDestroy() {
        super.onDestroy();
        ((bz)this.mFragments.a).e.r();
        this.mFragmentLifecycleRegistry.e(auf.ON_DESTROY);
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return super.onMenuItemSelected(n, menuItem) || (n == 6 && ((bz)this.mFragments.a).e.S(menuItem));
    }
    
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        ((bz)this.mFragments.a).e.x();
        this.mFragmentLifecycleRegistry.e(auf.ON_PAUSE);
    }
    
    protected void onPostResume() {
        super.onPostResume();
        this.onResumeFragments();
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        this.mFragments.c();
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    protected void onResume() {
        this.mFragments.c();
        super.onResume();
        this.mResumed = true;
        this.mFragments.d();
    }
    
    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(auf.ON_RESUME);
        ((bz)this.mFragments.a).e.z();
    }
    
    protected void onStart() {
        this.mFragments.c();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            ((bz)this.mFragments.a).e.o();
        }
        this.mFragments.d();
        this.mFragmentLifecycleRegistry.e(auf.ON_START);
        ((bz)this.mFragments.a).e.A();
    }
    
    public void onStateNotSaved() {
        this.mFragments.c();
    }
    
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        this.markFragmentsCreated();
        ((bz)this.mFragments.a).e.C();
        this.mFragmentLifecycleRegistry.e(auf.ON_STOP);
    }
    
    public void setEnterSharedElementCallback(final agq agq) {
        Object o;
        if (agq != null) {
            o = new aet();
        }
        else {
            o = null;
        }
        aeo.c((Activity)this, (SharedElementCallback)o);
    }
    
    public void setExitSharedElementCallback(final agq agq) {
        Object o;
        if (agq != null) {
            o = new aet();
        }
        else {
            o = null;
        }
        aeo.d((Activity)this, (SharedElementCallback)o);
    }
    
    public void startActivityFromFragment(final br br, final Intent intent, final int n) {
        this.startActivityFromFragment(br, intent, n, null);
    }
    
    public void startActivityFromFragment(final br br, final Intent intent, final int n, final Bundle bundle) {
        if (n == -1) {
            aen.b((Activity)this, intent, -1, bundle);
            return;
        }
        br.ap(intent, n, bundle);
    }
    
    @Deprecated
    public void startIntentSenderFromFragment(final br br, final IntentSender intentSender, final int n, Intent d, final int n2, final int n3, final int n4, final Bundle bundle) {
        final Intent intent = d;
        if (n == -1) {
            aen.c((Activity)this, intentSender, -1, d, n2, n3, n4, bundle);
            return;
        }
        if (br.A == null) {
            final StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(br);
            sb.append(" not attached to Activity");
            throw new IllegalStateException(sb.toString());
        }
        if (cl.W(2)) {
            final StringBuilder sb2 = new StringBuilder("Fragment ");
            sb2.append(br);
            sb2.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb2.append(n);
            sb2.append(" IntentSender: ");
            sb2.append(intentSender);
            sb2.append(" fillInIntent: ");
            sb2.append(d);
            sb2.append(" options: ");
            sb2.append(bundle);
        }
        final cl g = br.G();
        if (g.q != null) {
            d = intent;
            if (bundle != null) {
                if ((d = intent) == null) {
                    d = new Intent();
                    d.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                if (cl.W(2)) {
                    final StringBuilder sb3 = new StringBuilder("ActivityOptions ");
                    sb3.append(bundle);
                    sb3.append(" were added to fillInIntent ");
                    sb3.append(d);
                    sb3.append(" for fragment ");
                    sb3.append(br);
                }
                d.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            final rk rk = new rk(intentSender);
            rk.d = d;
            rk.b(n3, n2);
            final IntentSenderRequest a = rk.a();
            g.s.addLast(new FragmentManager$LaunchedFragmentInfo(br.l, n));
            if (cl.W(2)) {
                new StringBuilder("Fragment ").append(br);
            }
            g.q.b((Object)a);
            return;
        }
        final bz l = g.l;
        if (n == -1) {
            aen.c(l.b, intentSender, -1, d, n2, n3, n4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }
    
    public void supportFinishAfterTransition() {
        aeo.a((Activity)this);
    }
    
    @Deprecated
    public void supportInvalidateOptionsMenu() {
        this.invalidateOptionsMenu();
    }
    
    public void supportPostponeEnterTransition() {
        aeo.b((Activity)this);
    }
    
    public void supportStartPostponedEnterTransition() {
        aeo.e((Activity)this);
    }
    
    @Deprecated
    public void validateRequestPermissionsRequestCode(final int n) {
    }
}
