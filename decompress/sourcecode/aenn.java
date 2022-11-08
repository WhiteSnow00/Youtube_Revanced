// 
// Decompiled by Procyon v0.6.0
// 

public final class aenn extends aun
{
    private aepy c;
    
    public aenn(final bu bu) {
        super((aum)bu);
    }
    
    public final void e(final auf auf) {
        aun.g("getObserverCount");
        if (((sb)super.a).e > 0) {
            final aepy c = this.c;
            final auf on_CREATE = auf.ON_CREATE;
            final int ordinal = auf.ordinal();
            if (ordinal != 0) {
                String s;
                aeri aeri;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    throw new UnsupportedOperationException("Unknown lifecycle: ".concat(String.valueOf(String.valueOf(auf))));
                                }
                                s = "Lifecycle.Destroyed";
                                aeri = aerh.a;
                            }
                            else {
                                s = "Lifecycle.Stopped";
                                aeri = aerh.a;
                            }
                        }
                        else {
                            s = "Lifecycle.Paused";
                            aeri = aerh.a;
                        }
                    }
                    else {
                        s = "Lifecycle.Resumed";
                        aeri = aerh.a;
                    }
                }
                else {
                    s = "Lifecycle.Started";
                    aeri = aerh.a;
                }
                c.o(s, aeri);
            }
            else if (c.d == null) {
                c.o("Lifecycle.Created", aerh.a);
                c.c = true;
            }
            try {
                super.e(auf);
                return;
            }
            finally {
                this.c.m(auf);
            }
        }
        super.e(auf);
    }
    
    public final void h(final aepy c) {
        agot.E(this.c == null, (Object)"Activity was already created");
        this.c = c;
    }
}
