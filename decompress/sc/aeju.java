// 
// Decompiled by Procyon v0.6.0
// 

public final class aeju
{
    public Object a;
    public Object b;
    private boolean c;
    private byte d;
    
    public final aejv a() {
        final Object a = this.a;
        if (a != null) {
            this.b = ((afel)a).g();
        }
        else if (this.b == null) {
            this.b = afeq.q();
        }
        if (this.d == 1) {
            return new aejv(this.c, (afeq)this.b);
        }
        throw new IllegalStateException("Missing required properties: canSwitchAccounts");
    }
    
    public final void b(final Class clazz) {
        if (this.a == null) {
            this.a = afeq.d();
        }
        ((afel)this.a).h(clazz);
    }
    
    public final void c(final boolean c) {
        this.c = c;
        this.d = 1;
    }
    
    public final ssm d() {
        if (this.d == 1) {
            final Object b = this.b;
            if (b != null) {
                final Object a = this.a;
                if (a != null) {
                    return new ssm((String)b, (String)a, this.c);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" optionText");
        }
        if (this.a == null) {
            sb.append(" explanationText");
        }
        if (this.d == 0) {
            sb.append(" isCorrect");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void e(final String a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null explanationText");
    }
    
    public final void f(final boolean c) {
        this.c = c;
        this.d = 1;
    }
    
    public final void g(final String b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null optionText");
    }
    
    public final qwv h() {
        if (this.d == 1) {
            final Object b = this.b;
            if (b != null) {
                final Object a = this.a;
                if (a != null) {
                    return new qwv((qwu)b, this.c, (afeq)a);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" content");
        }
        if (this.d == 0) {
            sb.append(" hasMore");
        }
        if (this.a == null) {
            sb.append(" eventLogs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void i(final boolean c) {
        this.c = c;
        this.d = 1;
    }
    
    public final hzz j() {
        if (this.d == 1) {
            final Object b = this.b;
            if (b != null) {
                return new hzz((fkr)b, this.c, (alsa)this.a);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" playerViewMode");
        }
        if (this.d == 0) {
            sb.append(" isEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void k(final boolean c) {
        this.c = c;
        this.d = 1;
    }
    
    public final void l(final fkr b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null playerViewMode");
    }
}
