// 
// Decompiled by Procyon v0.6.0
// 

public class atrz extends atsf implements atrw
{
    private final boolean a;
    
    public atrz() {
        this.C((atrw)null);
        final atqd a = this.A();
        Object o;
        if (a instanceof atqe) {
            o = a;
        }
        else {
            o = null;
        }
        boolean a2;
        final boolean b = a2 = false;
        Label_0114: {
            if (o != null) {
                atsf atsf;
                if ((atsf = ((atsa)o).e()) == null) {
                    a2 = b;
                }
                else {
                    while (!atsf.tD()) {
                        final atqd a3 = atsf.A();
                        Object o2;
                        if (a3 instanceof atqe) {
                            o2 = a3;
                        }
                        else {
                            o2 = null;
                        }
                        a2 = b;
                        if (o2 == null) {
                            break Label_0114;
                        }
                        if ((atsf = ((atsa)o2).e()) == null) {
                            a2 = b;
                            break Label_0114;
                        }
                    }
                    a2 = true;
                }
            }
        }
        this.a = a2;
    }
    
    public final boolean tD() {
        return this.a;
    }
    
    public final boolean tE() {
        return true;
    }
}
