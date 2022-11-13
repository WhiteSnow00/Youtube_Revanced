import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class asus implements asho, asir
{
    asir a;
    final Object b;
    final Object c;
    private final int d;
    
    public asus(final asho b, final asjh c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asus(final asho b, final asjm c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asus(final asho b, final asjr c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asus(final asho b, final asjs c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asus(final asif b, final Object c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        final int d = this.d;
        if (d == 0) {
            this.a = (asir)asjv.a;
            asiz asiz = null;
            try {
                ((asjh)this.c).a(null, t);
            }
            finally {
                final Throwable t2;
                asgz.c(t2);
                asiz = new asiz(new Throwable[] { t, t2 });
            }
            ((asho)this.b).b(asiz);
            return;
        }
        if (d == 1) {
            ((asho)this.b).b(t);
            return;
        }
        if (d != 2) {
            if (d != 3) {
                if (d != 4) {
                    if (d != 5) {
                        this.a = (asir)asjv.a;
                        ((asif)this.b).b(t);
                        return;
                    }
                    try {
                        final Object a = ((asjr)this.c).a((Object)t);
                        askk.b(a, "The valueSupplier returned a null value");
                        ((asho)this.b).ts(a);
                        return;
                    }
                    finally {
                        final Throwable t3;
                        asgz.c(t3);
                        ((asho)this.b).b(new asiz(new Throwable[] { t, t3 }));
                        return;
                    }
                }
                try {
                    if (((asjs)this.c).a((Object)t)) {
                        ((asho)this.b).tx();
                        return;
                    }
                    ((asho)this.b).b(t);
                    return;
                }
                finally {
                    final Throwable t4;
                    asgz.c(t4);
                    ((asho)this.b).b(new asiz(new Throwable[] { t, t4 }));
                    return;
                }
            }
            ((asho)this.b).b(t);
            return;
        }
        ((asho)this.b).b(t);
    }
    
    @Override
    public final void d(final asir a) {
        final int d = this.d;
        if (d == 0) {
            if (asjv.g(this.a, a)) {
                this.a = a;
                ((asho)this.b).d(this);
            }
            return;
        }
        if (d == 1) {
            if (asjv.g(this.a, a)) {
                this.a = a;
                ((asho)this.b).d(this);
            }
            return;
        }
        if (d == 2) {
            if (asjv.g(this.a, a)) {
                this.a = a;
                ((asho)this.b).d(this);
            }
            return;
        }
        if (d == 3) {
            if (asjv.g(this.a, a)) {
                this.a = a;
                ((asho)this.b).d(this);
            }
            return;
        }
        if (d == 4) {
            if (asjv.g(this.a, a)) {
                this.a = a;
                ((asho)this.b).d(this);
            }
            return;
        }
        if (d != 5) {
            if (asjv.g(this.a, a)) {
                this.a = a;
                ((asif)this.b).d(this);
            }
            return;
        }
        if (asjv.g(this.a, a)) {
            this.a = a;
            ((asho)this.b).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        final int d = this.d;
        if (d == 0) {
            this.a.dispose();
            this.a = (asir)asjv.a;
            return;
        }
        if (d == 1) {
            this.a.dispose();
            return;
        }
        if (d == 2) {
            final asir a = this.a;
            this.a = (asir)asjv.a;
            a.dispose();
            return;
        }
        if (d == 3) {
            final asir a2 = this.a;
            this.a = (asir)asjv.a;
            a2.dispose();
            return;
        }
        if (d == 4) {
            this.a.dispose();
            return;
        }
        if (d != 5) {
            this.a.dispose();
            this.a = (asir)asjv.a;
            return;
        }
        this.a.dispose();
    }
    
    @Override
    public final boolean tA() {
        final int d = this.d;
        if (d == 0) {
            return this.a.tA();
        }
        if (d == 1) {
            return this.a.tA();
        }
        if (d == 2) {
            return this.a.tA();
        }
        if (d == 3) {
            return this.a.tA();
        }
        if (d == 4) {
            return this.a.tA();
        }
        if (d != 5) {
            return this.a.tA();
        }
        return this.a.tA();
    }
    
    @Override
    public final void ts(Object a) {
        final int d = this.d;
        if (d != 0) {
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        if (d == 4) {
                            ((asho)this.b).ts(a);
                            return;
                        }
                        if (d != 5) {
                            this.a = (asir)asjv.a;
                            ((asif)this.b).ts(a);
                            return;
                        }
                        ((asho)this.b).ts(a);
                        return;
                    }
                    else {
                        try {
                            a = ((asjr)this.c).a(a);
                            askk.b(a, "The mapper returned a null item");
                            ((asho)this.b).ts(a);
                            return;
                        }
                        finally {
                            final Throwable t;
                            asgz.c(t);
                            ((asho)this.b).b(t);
                            return;
                        }
                    }
                }
                try {
                    if (((asjs)this.c).a(a)) {
                        ((asho)this.b).ts(a);
                        return;
                    }
                    ((asho)this.b).tx();
                    return;
                }
                finally {
                    final Throwable t2;
                    asgz.c(t2);
                    ((asho)this.b).b(t2);
                    return;
                }
            }
            ((asho)this.b).ts(a);
            try {
                ((asjm)this.c).a(a);
                return;
            }
            finally {
                final Throwable t3;
                asgz.c(t3);
                atqx.j(t3);
                return;
            }
        }
        this.a = (asir)asjv.a;
        try {
            ((asjh)this.c).a(a, null);
            ((asho)this.b).ts(a);
        }
        finally {
            final Throwable t4;
            asgz.c(t4);
            ((asho)this.b).b(t4);
        }
    }
    
    @Override
    public final void tx() {
        final int d = this.d;
        if (d != 0) {
            if (d == 1) {
                ((asho)this.b).tx();
                return;
            }
            if (d == 2) {
                ((asho)this.b).tx();
                return;
            }
            if (d == 3) {
                ((asho)this.b).tx();
                return;
            }
            if (d == 4) {
                ((asho)this.b).tx();
                return;
            }
            if (d == 5) {
                ((asho)this.b).tx();
                return;
            }
            this.a = (asir)asjv.a;
            final Object c = this.c;
            if (c != null) {
                ((asif)this.b).ts(c);
                return;
            }
            ((asif)this.b).b(new NoSuchElementException("The MaybeSource is empty"));
        }
        else {
            this.a = (asir)asjv.a;
            try {
                ((asjh)this.c).a(null, null);
                ((asho)this.b).tx();
            }
            finally {
                final Throwable t;
                asgz.c(t);
                ((asho)this.b).b(t);
            }
        }
    }
}
