// 
// Decompiled by Procyon v0.6.0
// 

final class atey implements asif
{
    final asif a;
    final asie b;
    private final int c;
    
    public atey(final atex b, final asif a, final int c) {
        this.c = c;
        this.b = (asie)b;
        this.a = a;
    }
    
    public atey(final atez b, final asif a, final int c) {
        this.c = c;
        this.b = (asie)b;
        this.a = a;
    }
    
    public atey(final atfp b, final asif a, final int c) {
        this.c = c;
        this.b = (asie)b;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final int c = this.c;
        if (c == 0) {
            this.a.b(t);
            return;
        }
        if (c == 1) {
            asiz asiz = null;
            try {
                ((atex)this.b).b.a(t);
            }
            finally {
                final Throwable t2;
                asgz.c(t2);
                asiz = new asiz(new Throwable[] { t, t2 });
            }
            this.a.b(asiz);
            return;
        }
        final atfp atfp = (atfp)this.b;
        final asjr b = atfp.b;
        final Object c2;
        Label_0084: {
            if (b != null) {
                try {
                    b.a((Object)t);
                    break Label_0084;
                }
                finally {
                    asgz.c((Throwable)c2);
                    this.a.b(new asiz(new Throwable[] { t, (Throwable)c2 }));
                    return;
                }
            }
            c2 = atfp.c;
        }
        if (c2 == null) {
            final NullPointerException ex = new NullPointerException("Value supplied was null");
            ex.initCause(t);
            this.a.b(ex);
            return;
        }
        this.a.ts(c2);
    }
    
    @Override
    public final void d(final asir asir) {
        final int c = this.c;
        if (c == 0) {
            this.a.d(asir);
            return;
        }
        if (c != 1) {
            this.a.d(asir);
            return;
        }
        this.a.d(asir);
    }
    
    @Override
    public final void ts(final Object o) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                this.a.ts(o);
                return;
            }
            this.a.ts(o);
        }
        else {
            try {
                ((atez)this.b).b.a(o);
                this.a.ts(o);
            }
            finally {
                final Throwable t;
                asgz.c(t);
                this.a.b(t);
            }
        }
    }
}
