// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.inject.baseclasses;

public final class TracedFragmentLifecycle implements aua
{
    private final auo a;
    private final atib b;
    
    public TracedFragmentLifecycle(final atib b, final auo a, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public final void lW(aun aun) {
        final Object c = this.b.c;
        if (c != null) {
            aun = (aun)((aeup)c).a();
        }
        else {
            aun = (aun)aeux.f();
        }
        try {
            this.a.e(aug.ON_RESUME);
            ((aett)aun).close();
        }
        finally {
            try {
                ((aett)aun).close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                agqs.ar(t, t2);
            }
        }
    }
    
    public final void mM(aun aun) {
        final Object c = this.b.c;
        if (c != null) {
            aun = (aun)((aeup)c).a();
        }
        else {
            aun = (aun)aeux.f();
        }
        try {
            this.a.e(aug.ON_DESTROY);
            ((aett)aun).close();
        }
        finally {
            try {
                ((aett)aun).close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                agqs.ar(t, t2);
            }
        }
    }
    
    public final void mq(final aun aun) {
        aeux.f();
        try {
            this.a.e(aug.ON_CREATE);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                agqs.ar(t, t2);
            }
        }
    }
    
    public final void my(final aun aun) {
        aeux.f();
        try {
            this.a.e(aug.ON_PAUSE);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                agqs.ar(t, t2);
            }
        }
    }
    
    public final void oS(final aun aun) {
        aeux.f();
        try {
            this.a.e(aug.ON_START);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                agqs.ar((Throwable)aun, t);
            }
        }
    }
    
    public final void oX(final aun aun) {
        aeux.f();
        try {
            this.a.e(aug.ON_STOP);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                agqs.ar((Throwable)aun, t);
            }
        }
    }
}
