// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.inject.baseclasses;

public final class TracedFragmentLifecycle implements atz
{
    private final aun a;
    private final athj b;
    
    public TracedFragmentLifecycle(final athj b, final aun a, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public final void lW(aum aum) {
        final Object c = this.b.c;
        if (c != null) {
            aum = (aum)((aeso)c).a();
        }
        else {
            aum = (aum)aesw.f();
        }
        try {
            this.a.e(auf.ON_RESUME);
            ((aers)aum).close();
        }
        finally {
            try {
                ((aers)aum).close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aesy.b(t, t2);
            }
        }
    }
    
    public final void mM(aum aum) {
        final Object c = this.b.c;
        if (c != null) {
            aum = (aum)((aeso)c).a();
        }
        else {
            aum = (aum)aesw.f();
        }
        try {
            this.a.e(auf.ON_DESTROY);
            ((aers)aum).close();
        }
        finally {
            try {
                ((aers)aum).close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aesy.b(t, t2);
            }
        }
    }
    
    public final void mq(final aum aum) {
        aesw.f();
        try {
            this.a.e(auf.ON_CREATE);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aesy.b(t, t2);
            }
        }
    }
    
    public final void my(final aum aum) {
        aesw.f();
        try {
            this.a.e(auf.ON_PAUSE);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aesy.b(t, t2);
            }
        }
    }
    
    public final void oS(final aum aum) {
        aesw.f();
        try {
            this.a.e(auf.ON_START);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                aesy.b((Throwable)aum, t);
            }
        }
    }
    
    public final void oW(final aum aum) {
        aesw.f();
        try {
            this.a.e(auf.ON_STOP);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aesy.b(t, t2);
            }
        }
    }
}
