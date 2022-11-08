import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class asud implements asgz, asic
{
    asic a;
    final Object b;
    final Object c;
    private final /* synthetic */ int d;
    
    public asud(final asgz b, final asis c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asud(final asgz b, final asix c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asud(final asgz b, final asjc c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asud(final asgz b, final asjd c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asud(final ashq b, final Object c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final Throwable t) {
        final int d = this.d;
        if (d == 0) {
            this.a = (asic)asjg.a;
            asik asik = null;
            try {
                ((asis)this.c).a((Object)null, (Object)t);
            }
            finally {
                final Throwable t2;
                asey.d(t2);
                asik = new asik(new Throwable[] { t, t2 });
            }
            ((asgz)this.b).b((Throwable)asik);
            return;
        }
        if (d == 1) {
            ((asgz)this.b).b(t);
            return;
        }
        if (d != 2) {
            if (d != 3) {
                if (d != 4) {
                    if (d != 5) {
                        this.a = (asic)asjg.a;
                        ((ashq)this.b).b(t);
                        return;
                    }
                    try {
                        final Object a = ((asjc)this.c).a((Object)t);
                        asjv.b(a, "The valueSupplier returned a null value");
                        ((asgz)this.b).tp(a);
                        return;
                    }
                    finally {
                        final Throwable t3;
                        asey.d(t3);
                        ((asgz)this.b).b((Throwable)new asik(new Throwable[] { t, t3 }));
                        return;
                    }
                }
                try {
                    if (((asjd)this.c).a((Object)t)) {
                        ((asgz)this.b).tu();
                        return;
                    }
                    ((asgz)this.b).b(t);
                    return;
                }
                finally {
                    final Throwable t4;
                    asey.d(t4);
                    ((asgz)this.b).b((Throwable)new asik(new Throwable[] { t, t4 }));
                    return;
                }
            }
            ((asgz)this.b).b(t);
            return;
        }
        ((asgz)this.b).b(t);
    }
    
    public final void d(final asic a) {
        final int d = this.d;
        if (d == 0) {
            if (asjg.g(this.a, a)) {
                this.a = a;
                ((asgz)this.b).d((asic)this);
            }
            return;
        }
        if (d == 1) {
            if (asjg.g(this.a, a)) {
                this.a = a;
                ((asgz)this.b).d((asic)this);
            }
            return;
        }
        if (d == 2) {
            if (asjg.g(this.a, a)) {
                this.a = a;
                ((asgz)this.b).d((asic)this);
            }
            return;
        }
        if (d == 3) {
            if (asjg.g(this.a, a)) {
                this.a = a;
                ((asgz)this.b).d((asic)this);
            }
            return;
        }
        if (d == 4) {
            if (asjg.g(this.a, a)) {
                this.a = a;
                ((asgz)this.b).d((asic)this);
            }
            return;
        }
        if (d != 5) {
            if (asjg.g(this.a, a)) {
                this.a = a;
                ((ashq)this.b).d((asic)this);
            }
            return;
        }
        if (asjg.g(this.a, a)) {
            this.a = a;
            ((asgz)this.b).d((asic)this);
        }
    }
    
    public final void dispose() {
        final int d = this.d;
        if (d == 0) {
            this.a.dispose();
            this.a = (asic)asjg.a;
            return;
        }
        if (d == 1) {
            this.a.dispose();
            return;
        }
        if (d == 2) {
            final asic a = this.a;
            this.a = (asic)asjg.a;
            a.dispose();
            return;
        }
        if (d == 3) {
            final asic a2 = this.a;
            this.a = (asic)asjg.a;
            a2.dispose();
            return;
        }
        if (d == 4) {
            this.a.dispose();
            return;
        }
        if (d != 5) {
            this.a.dispose();
            this.a = (asic)asjg.a;
            return;
        }
        this.a.dispose();
    }
    
    public final void tp(Object a) {
        final int d = this.d;
        if (d != 0) {
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        if (d == 4) {
                            ((asgz)this.b).tp(a);
                            return;
                        }
                        if (d != 5) {
                            this.a = (asic)asjg.a;
                            ((ashq)this.b).tp(a);
                            return;
                        }
                        ((asgz)this.b).tp(a);
                        return;
                    }
                    else {
                        try {
                            a = ((asjc)this.c).a(a);
                            asjv.b(a, "The mapper returned a null item");
                            ((asgz)this.b).tp(a);
                            return;
                        }
                        finally {
                            final Throwable t;
                            asey.d(t);
                            ((asgz)this.b).b(t);
                            return;
                        }
                    }
                }
                try {
                    if (((asjd)this.c).a(a)) {
                        ((asgz)this.b).tp(a);
                        return;
                    }
                    ((asgz)this.b).tu();
                    return;
                }
                finally {
                    final Throwable t2;
                    asey.d(t2);
                    ((asgz)this.b).b(t2);
                    return;
                }
            }
            ((asgz)this.b).tp(a);
            try {
                ((asix)this.c).a(a);
                return;
            }
            finally {
                final Throwable t3;
                asey.d(t3);
                aulo.r(t3);
                return;
            }
        }
        this.a = (asic)asjg.a;
        try {
            ((asis)this.c).a(a, (Object)null);
            ((asgz)this.b).tp(a);
        }
        finally {
            final Throwable t4;
            asey.d(t4);
            ((asgz)this.b).b(t4);
        }
    }
    
    public final void tu() {
        final int d = this.d;
        if (d != 0) {
            if (d == 1) {
                ((asgz)this.b).tu();
                return;
            }
            if (d == 2) {
                ((asgz)this.b).tu();
                return;
            }
            if (d == 3) {
                ((asgz)this.b).tu();
                return;
            }
            if (d == 4) {
                ((asgz)this.b).tu();
                return;
            }
            if (d == 5) {
                ((asgz)this.b).tu();
                return;
            }
            this.a = (asic)asjg.a;
            final Object c = this.c;
            if (c != null) {
                ((ashq)this.b).tp(c);
                return;
            }
            ((ashq)this.b).b((Throwable)new NoSuchElementException("The MaybeSource is empty"));
        }
        else {
            this.a = (asic)asjg.a;
            try {
                ((asis)this.c).a((Object)null, (Object)null);
                ((asgz)this.b).tu();
            }
            finally {
                final Throwable t;
                asey.d(t);
                ((asgz)this.b).b(t);
            }
        }
    }
    
    public final boolean tx() {
        final int d = this.d;
        if (d == 0) {
            return this.a.tx();
        }
        if (d == 1) {
            return this.a.tx();
        }
        if (d == 2) {
            return this.a.tx();
        }
        if (d == 3) {
            return this.a.tx();
        }
        if (d == 4) {
            return this.a.tx();
        }
        if (d != 5) {
            return this.a.tx();
        }
        return this.a.tx();
    }
}
