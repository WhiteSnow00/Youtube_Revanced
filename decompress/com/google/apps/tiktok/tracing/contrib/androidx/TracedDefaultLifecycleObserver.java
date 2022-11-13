// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.tracing.contrib.androidx;

public final class TracedDefaultLifecycleObserver implements aua
{
    private final aua a;
    
    public TracedDefaultLifecycleObserver(final aua a) {
        adkp.R(a instanceof TracedDefaultLifecycleObserver ^ true, "Yo dawg.");
        this.a = a;
    }
    
    public static aua g(final aua aua) {
        return (aua)new TracedDefaultLifecycleObserver(aua);
    }
    
    public final void lW(final aun aun) {
        aeux.f();
        try {
            this.a.lW(aun);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aeuz.a(t, t2);
            }
        }
    }
    
    public final void mM(final aun aun) {
        aeux.f();
        try {
            this.a.mM(aun);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                aeuz.a((Throwable)aun, t);
            }
        }
    }
    
    public final void mq(final aun aun) {
        aeux.f();
        try {
            this.a.mq(aun);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                aeuz.a((Throwable)aun, t);
            }
        }
    }
    
    public final void my(final aun aun) {
        aeux.f();
        try {
            this.a.my(aun);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aeuz.a(t, t2);
            }
        }
    }
    
    public final void oS(final aun aun) {
        aeux.f();
        try {
            this.a.oS(aun);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aeuz.a(t, t2);
            }
        }
    }
    
    public final void oX(final aun aun) {
        aeux.f();
        try {
            this.a.oX(aun);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                aeuz.a((Throwable)aun, t);
            }
        }
    }
}
