// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.content.Intent;
import android.app.Fragment;
import java.lang.ref.WeakReference;
import android.app.Activity;

public class LifecycleCallback
{
    public final mrn e;
    
    protected LifecycleCallback(final mrn e) {
        this.e = e;
    }
    
    private static mrn getChimeraLifecycleFragmentImpl(final mrm mrm) {
        throw new IllegalStateException("Method not available in SDK.");
    }
    
    public static mrn m(final Activity activity) {
        final Object a = new mrm(activity).a;
        Object o = null;
        if (a instanceof bu) {
            final bu bu = (bu)a;
            final WeakReference weakReference = msc.a.get(bu);
            if (weakReference != null) {
                if ((o = weakReference.get()) != null) {
                    return (mrn)o;
                }
            }
            try {
                final msc msc = (msc)bu.getSupportFragmentManager().f("SupportLifecycleFragmentImpl");
                Label_0106: {
                    if (msc != null) {
                        o = msc;
                        if (!((br)msc).s) {
                            break Label_0106;
                        }
                    }
                    o = new msc();
                    final ct i = bu.getSupportFragmentManager().i();
                    i.s((br)o, "SupportLifecycleFragmentImpl");
                    i.k();
                }
                msc.a.put(bu, new WeakReference(o));
                return (mrn)o;
            }
            catch (final ClassCastException ex) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", ex);
            }
        }
        final WeakReference weakReference2 = mro.a.get(a);
        if (weakReference2 != null) {
            o = weakReference2.get();
            if (o != null) {
                return (mrn)o;
            }
        }
        try {
            final mro mro = (mro)((Activity)a).getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            Label_0227: {
                if (mro != null) {
                    o = mro;
                    if (!mro.isRemoving()) {
                        break Label_0227;
                    }
                }
                o = new mro();
                ((Activity)a).getFragmentManager().beginTransaction().add((Fragment)o, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            mro.a.put(a, new WeakReference(o));
            return (mrn)o;
        }
        catch (final ClassCastException ex2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", ex2);
        }
    }
    
    public void d(final int n, final int n2, final Intent intent) {
    }
    
    public void e(final Bundle bundle) {
    }
    
    public void h(final Bundle bundle) {
    }
    
    public void i() {
    }
    
    public void j() {
    }
    
    public void k() {
    }
    
    public final Activity l() {
        final Activity a = this.e.a();
        kgk.aL((Object)a);
        return a;
    }
    
    public void n() {
    }
}
