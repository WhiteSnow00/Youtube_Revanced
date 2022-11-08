// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.tracing.contrib.androidx;

public final class TracedDefaultLifecycleObserver implements atz
{
    private final atz a;
    
    public TracedDefaultLifecycleObserver(final atz a) {
        agot.E(a instanceof TracedDefaultLifecycleObserver ^ true, (Object)"Yo dawg.");
        this.a = a;
    }
    
    public static atz g(final atz atz) {
        return (atz)new TracedDefaultLifecycleObserver(atz);
    }
    
    public final void lW(final aum aum) {
        aesw.f();
        try {
            this.a.lW(aum);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                aety.d((Throwable)aum, t);
            }
        }
    }
    
    public final void mM(final aum aum) {
        aesw.f();
        try {
            this.a.mM(aum);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aety.d(t, t2);
            }
        }
    }
    
    public final void mq(final aum aum) {
        aesw.f();
        try {
            this.a.mq(aum);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                aety.d((Throwable)aum, t);
            }
        }
    }
    
    public final void my(final aum aum) {
        aesw.f();
        try {
            this.a.my(aum);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aety.d(t, t2);
            }
        }
    }
    
    public final void oS(final aum aum) {
        aesw.f();
        try {
            this.a.oS(aum);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aety.d(t, t2);
            }
        }
    }
    
    public final void oW(final aum aum) {
        aesw.f();
        try {
            this.a.oW(aum);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aety.d(t, t2);
            }
        }
    }
}
