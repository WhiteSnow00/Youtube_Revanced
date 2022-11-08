// 
// Decompiled by Procyon v0.6.0
// 

public class atre extends atrk implements atrb
{
    private final boolean a;
    
    public atre() {
        this.C((atrb)null);
        final atpi a = this.A();
        Object o;
        if (a instanceof atpj) {
            o = a;
        }
        else {
            o = null;
        }
        boolean a2;
        final boolean b = a2 = false;
        Label_0114: {
            if (o != null) {
                atrk atrk;
                if ((atrk = ((atrf)o).e()) == null) {
                    a2 = b;
                }
                else {
                    while (!atrk.tA()) {
                        final atpi a3 = atrk.A();
                        Object o2;
                        if (a3 instanceof atpj) {
                            o2 = a3;
                        }
                        else {
                            o2 = null;
                        }
                        a2 = b;
                        if (o2 == null) {
                            break Label_0114;
                        }
                        if ((atrk = ((atrf)o2).e()) == null) {
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
    
    public final boolean tA() {
        return this.a;
    }
    
    public final boolean tB() {
        return true;
    }
}
