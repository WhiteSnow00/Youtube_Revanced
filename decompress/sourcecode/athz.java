import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class athz implements ashj, asic
{
    final ashj a;
    asic b;
    boolean c;
    
    public athz(final ashj a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        if (this.c) {
            aulo.r(t);
            return;
        }
        this.c = true;
        if (this.b == null) {
            final NullPointerException ex = new NullPointerException("Subscription not set!");
            try {
                ((c)this.a).b = (asic)asjh.a;
                try {
                    this.a.b((Throwable)new asik(new Throwable[] { t, ex }));
                    return;
                }
                finally {
                    final Throwable t2;
                    asey.d(t2);
                    aulo.r((Throwable)new asik(new Throwable[] { t, ex, t2 }));
                    return;
                }
            }
            finally {
                final Throwable t3;
                asey.d(t3);
                aulo.r((Throwable)new asik(new Throwable[] { t, ex, t3 }));
                return;
            }
        }
        Throwable t4;
        if ((t4 = t) == null) {
            t4 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.a.b(t4);
        }
        finally {
            asey.d(t);
            aulo.r((Throwable)new asik(new Throwable[] { t4, t }));
        }
    }
    
    public final void d(final asic b) {
        if (asjg.g(this.b, b)) {
            this.b = b;
            try {
                ((c)this.a).b = (asic)this;
            }
            finally {
                final Throwable t;
                asey.d(t);
                this.c = true;
                try {
                    b.dispose();
                    aulo.r(t);
                }
                finally {
                    final Throwable t2;
                    asey.d(t2);
                    aulo.r((Throwable)new asik(new Throwable[] { t, t2 }));
                }
            }
        }
    }
    
    public final void dispose() {
        this.b.dispose();
    }
    
    public final void tr(Object o) {
        if (this.c) {
            return;
        }
        if (this.b == null) {
            this.c = true;
            o = new NullPointerException("Subscription not set!");
            try {
                ((c)this.a).b = (asic)asjh.a;
                try {
                    this.a.b((Throwable)o);
                    return;
                }
                finally {
                    final Throwable t;
                    asey.d(t);
                    aulo.r((Throwable)new asik(new Throwable[] { (Throwable)o, t }));
                    return;
                }
            }
            finally {
                final Throwable t2;
                asey.d(t2);
                aulo.r((Throwable)new asik(new Throwable[] { (Throwable)o, t2 }));
                return;
            }
        }
        if (o == null) {
            final NullPointerException ex = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.b.dispose();
                this.b(ex);
                return;
            }
            finally {
                final Throwable t3;
                asey.d(t3);
                this.b((Throwable)new asik(new Throwable[] { ex, t3 }));
                return;
            }
        }
        try {
            this.a.tr(o);
        }
        finally {
            asey.d((Throwable)o);
            try {
                this.b.dispose();
                this.b((Throwable)o);
            }
            finally {
                final Throwable t4;
                asey.d(t4);
                this.b((Throwable)new asik(new Throwable[] { (Throwable)o, t4 }));
            }
        }
    }
    
    public final void tu() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.b == null) {
            final NullPointerException ex = new NullPointerException("Subscription not set!");
            try {
                ((c)this.a).b = (asic)asjh.a;
                try {
                    this.a.b((Throwable)ex);
                    return;
                }
                finally {
                    final Throwable t;
                    asey.d(t);
                    aulo.r((Throwable)new asik(new Throwable[] { ex, t }));
                    return;
                }
            }
            finally {
                final Throwable t2;
                asey.d(t2);
                aulo.r((Throwable)new asik(new Throwable[] { ex, t2 }));
                return;
            }
        }
        try {
            this.a.tu();
        }
        finally {
            final Throwable t3;
            asey.d(t3);
            aulo.r(t3);
        }
    }
    
    public final boolean tx() {
        return this.b.tx();
    }
}
