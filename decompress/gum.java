import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.apps.tiktok.account.AccountId;
import java.util.Locale;
import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gum extends guo implements aeou, arlm, aepp, aetq
{
    private gun a;
    private Context c;
    private final auo d;
    private boolean e;
    
    @Deprecated
    public gum() {
        this.d = new auo((aun)this);
        qdt.h();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.b.p();
        try {
            ((aepl)this).aS(layoutInflater, viewGroup, bundle);
            this.a();
            final View inflate = layoutInflater.inflate(2131625066, viewGroup, false);
            aeux.k();
            return inflate;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                gyc.e((Throwable)layoutInflater, t);
            }
        }
    }
    
    public final void V(final Activity activity) {
        this.b.p();
        try {
            super.V(activity);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                gyc.e((Throwable)activity, t);
            }
        }
    }
    
    public final gun a() {
        final gun a = this.a;
        if (a == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.e) {
            return a;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final aeup aM() {
        return (aeup)this.b.c;
    }
    
    public final /* bridge */ Object aN() {
        return this.a();
    }
    
    public final Locale aO() {
        return agpi.Z((br)this);
    }
    
    public final void ab(final View view, final Bundle bundle) {
        this.b.p();
        try {
            view.getClass();
            final gun a = this.a();
            urt s;
            if ((s = (urt)((br)a.a).og().f("fragment_tag_gallery")) == null) {
                s = urt.s(false, false);
            }
            ((gun)(s.af = (urs)a)).b((br)s, "fragment_tag_gallery");
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                gyc.e((Throwable)view, t);
            }
        }
    }
    
    protected final /* bridge */ aepz d() {
        return (aepz)aept.b((br)this);
    }
    
    public final aui getLifecycle() {
        return this.d;
    }
    
    public final void lP(final Context context) {
        this.b.p();
        try {
            if (!this.e) {
                super.lP(context);
                if (this.a == null) {
                    try {
                        final Object ar = this.aR();
                        final br br = (br)((arlt)((esr)ar).b).a;
                        if (!(br instanceof gum)) {
                            final String string = gun.class.toString();
                            final String value = String.valueOf(br.getClass());
                            final StringBuilder sb = new StringBuilder("Attempt to inject a Fragment wrapper of type ");
                            sb.append(string);
                            sb.append(", but the wrapper available is of type: ");
                            sb.append(value);
                            sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                            throw new IllegalStateException(sb.toString());
                        }
                        final gum gum = (gum)br;
                        gum.getClass();
                        final AccountId accountId = (AccountId)((esr)ar).aL.c.a();
                        final Bundle a = ((esr)ar).a();
                        final ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite)((esr)ar).a.a.aq.a();
                        adkp.I(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        ((aiqj)adyf.aw(a, "TIKTOK_FRAGMENT_ARGUMENT", (MessageLite)aiqj.a, extensionRegistryLite)).getClass();
                        this.a = new gun(gum, accountId);
                        ((br)this).X.b((aum)new TracedFragmentLifecycle(this.b, this.d, null));
                    }
                    catch (final ClassCastException ex) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", ex);
                    }
                }
                aeux.k();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gyc.e(t, t2);
            }
        }
    }
    
    public final Context nT() {
        if (super.nT() != null) {
            if (this.c == null) {
                this.c = (Context)new aepq((br)this, super.nT());
            }
            return this.c;
        }
        return null;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        this.b.p();
        try {
            final LayoutInflater aa = ((br)this).aA();
            final LayoutInflater cloneInContext = aa.cloneInContext((Context)aepz.d(aa, (br)this));
            final LayoutInflater cloneInContext2 = cloneInContext.cloneInContext((Context)new aepq((br)this, cloneInContext));
            aeux.k();
            return cloneInContext2;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gyc.e(t, t2);
            }
        }
    }
    
    public final void nn() {
        final aett g = this.b.g();
        try {
            ((aepl)this).r();
            this.e = true;
            g.close();
        }
        finally {
            try {
                g.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gyc.e(t, t2);
            }
        }
    }
    
    public final void sh(final aeup aeup, final boolean b) {
        this.b.j(aeup, b);
    }
}
