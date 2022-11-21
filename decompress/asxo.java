import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxo implements askk, asln
{
    asln a;
    final Object b;
    final Object c;
    private final int d;
    
    public asxo(final askk b, final asmd c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asxo(final askk b, final asmi c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asxo(final askk b, final asmn c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asxo(final askk b, final asmo c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public asxo(final aslb b, final Object c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        final int d = this.d;
        if (d == 0) {
            this.a = asmr.a;
            aslv aslv = null;
            try {
                ((asmd)this.c).a(null, t);
            }
            finally {
                final Throwable t2;
                asjv.a(t2);
                aslv = new aslv(new Throwable[] { t, t2 });
            }
            ((askk)this.b).b(aslv);
            return;
        }
        if (d == 1) {
            ((askk)this.b).b(t);
            return;
        }
        if (d != 2) {
            if (d != 3) {
                if (d != 4) {
                    if (d != 5) {
                        this.a = asmr.a;
                        ((aslb)this.b).b(t);
                        return;
                    }
                    try {
                        final Object a = ((asmn)this.c).a(t);
                        asng.b(a, "The valueSupplier returned a null value");
                        ((askk)this.b).tr(a);
                        return;
                    }
                    finally {
                        final Throwable t3;
                        asjv.a(t3);
                        ((askk)this.b).b(new aslv(new Throwable[] { t, t3 }));
                        return;
                    }
                }
                try {
                    if (((asmo)this.c).a(t)) {
                        ((askk)this.b).tw();
                        return;
                    }
                    ((askk)this.b).b(t);
                    return;
                }
                finally {
                    final Throwable t4;
                    asjv.a(t4);
                    ((askk)this.b).b(new aslv(new Throwable[] { t, t4 }));
                    return;
                }
            }
            ((askk)this.b).b(t);
            return;
        }
        ((askk)this.b).b(t);
    }
    
    @Override
    public final void d(final asln a) {
        final int d = this.d;
        if (d == 0) {
            if (asmr.g(this.a, a)) {
                this.a = a;
                ((askk)this.b).d(this);
            }
            return;
        }
        if (d == 1) {
            if (asmr.g(this.a, a)) {
                this.a = a;
                ((askk)this.b).d(this);
            }
            return;
        }
        if (d == 2) {
            if (asmr.g(this.a, a)) {
                this.a = a;
                ((askk)this.b).d(this);
            }
            return;
        }
        if (d == 3) {
            if (asmr.g(this.a, a)) {
                this.a = a;
                ((askk)this.b).d(this);
            }
            return;
        }
        if (d == 4) {
            if (asmr.g(this.a, a)) {
                this.a = a;
                ((askk)this.b).d(this);
            }
            return;
        }
        if (d != 5) {
            if (asmr.g(this.a, a)) {
                this.a = a;
                ((aslb)this.b).d(this);
            }
            return;
        }
        if (asmr.g(this.a, a)) {
            this.a = a;
            ((askk)this.b).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        final int d = this.d;
        if (d == 0) {
            this.a.dispose();
            this.a = asmr.a;
            return;
        }
        if (d == 1) {
            this.a.dispose();
            return;
        }
        if (d == 2) {
            final asln a = this.a;
            this.a = asmr.a;
            a.dispose();
            return;
        }
        if (d == 3) {
            final asln a2 = this.a;
            this.a = asmr.a;
            a2.dispose();
            return;
        }
        if (d == 4) {
            this.a.dispose();
            return;
        }
        if (d != 5) {
            this.a.dispose();
            this.a = asmr.a;
            return;
        }
        this.a.dispose();
    }
    
    @Override
    public final void tr(Object a) {
        final int d = this.d;
        if (d != 0) {
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        if (d == 4) {
                            ((askk)this.b).tr(a);
                            return;
                        }
                        if (d != 5) {
                            this.a = asmr.a;
                            ((aslb)this.b).tr(a);
                            return;
                        }
                        ((askk)this.b).tr(a);
                        return;
                    }
                    else {
                        try {
                            a = ((asmn)this.c).a(a);
                            asng.b(a, "The mapper returned a null item");
                            ((askk)this.b).tr(a);
                            return;
                        }
                        finally {
                            final Throwable t;
                            asjv.a(t);
                            ((askk)this.b).b(t);
                            return;
                        }
                    }
                }
                try {
                    if (((asmo)this.c).a(a)) {
                        ((askk)this.b).tr(a);
                        return;
                    }
                    ((askk)this.b).tw();
                    return;
                }
                finally {
                    final Throwable t2;
                    asjv.a(t2);
                    ((askk)this.b).b(t2);
                    return;
                }
            }
            ((askk)this.b).tr(a);
            try {
                ((asmi)this.c).a(a);
                return;
            }
            finally {
                final Throwable t3;
                asjv.a(t3);
                aqvq.w(t3);
                return;
            }
        }
        this.a = asmr.a;
        try {
            ((asmd)this.c).a(a, null);
            ((askk)this.b).tr(a);
        }
        finally {
            final Throwable t4;
            asjv.a(t4);
            ((askk)this.b).b(t4);
        }
    }
    
    @Override
    public final void tw() {
        final int d = this.d;
        if (d != 0) {
            if (d == 1) {
                ((askk)this.b).tw();
                return;
            }
            if (d == 2) {
                ((askk)this.b).tw();
                return;
            }
            if (d == 3) {
                ((askk)this.b).tw();
                return;
            }
            if (d == 4) {
                ((askk)this.b).tw();
                return;
            }
            if (d == 5) {
                ((askk)this.b).tw();
                return;
            }
            this.a = asmr.a;
            final Object c = this.c;
            if (c != null) {
                ((aslb)this.b).tr(c);
                return;
            }
            ((aslb)this.b).b(new NoSuchElementException("The MaybeSource is empty"));
        }
        else {
            this.a = asmr.a;
            try {
                ((asmd)this.c).a(null, null);
                ((askk)this.b).tw();
            }
            finally {
                final Throwable t;
                asjv.a(t);
                ((askk)this.b).b(t);
            }
        }
    }
    
    @Override
    public final boolean tz() {
        final int d = this.d;
        if (d == 0) {
            return this.a.tz();
        }
        if (d == 1) {
            return this.a.tz();
        }
        if (d == 2) {
            return this.a.tz();
        }
        if (d == 3) {
            return this.a.tz();
        }
        if (d == 4) {
            return this.a.tz();
        }
        if (d != 5) {
            return this.a.tz();
        }
        return this.a.tz();
    }
}
