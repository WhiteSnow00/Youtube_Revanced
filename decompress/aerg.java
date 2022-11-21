// 
// Decompiled by Procyon v0.6.0
// 

public final class aerg extends auq
{
    private aets c;
    
    public aerg(final bu bu) {
        super((aup)bu);
    }
    
    public final void e(final aui aui) {
        auq.g("getObserverCount");
        if (((sc)super.a).e > 0) {
            final aets c = this.c;
            final aui on_CREATE = aui.ON_CREATE;
            final int ordinal = aui.ordinal();
            if (ordinal != 0) {
                String s;
                aevb aevb;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    throw new UnsupportedOperationException("Unknown lifecycle: ".concat(String.valueOf(String.valueOf(aui))));
                                }
                                s = "Lifecycle.Destroyed";
                                aevb = aeva.a;
                            }
                            else {
                                s = "Lifecycle.Stopped";
                                aevb = aeva.a;
                            }
                        }
                        else {
                            s = "Lifecycle.Paused";
                            aevb = aeva.a;
                        }
                    }
                    else {
                        s = "Lifecycle.Resumed";
                        aevb = aeva.a;
                    }
                }
                else {
                    s = "Lifecycle.Started";
                    aevb = aeva.a;
                }
                c.p(s, aevb);
            }
            else if (c.e == null) {
                c.p("Lifecycle.Created", aeva.a);
                c.d = true;
            }
            try {
                super.e(aui);
                return;
            }
            finally {
                this.c.m(aui);
            }
        }
        super.e(aui);
    }
    
    public final void h(final aets c) {
        adme.U(this.c == null, "Activity was already created");
        this.c = c;
    }
}
