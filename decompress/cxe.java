// 
// Decompiled by Procyon v0.6.0
// 

public final class cxe implements cxb
{
    public final boolean a;
    public final int b;
    
    public cxe(final int b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        if (!cui.i) {
            czk.a("Animation contains merge paths but they are disabled.");
            return null;
        }
        return (cuv)new cve(this);
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        String s;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b != 4) {
                        if (b != 5) {
                            s = "null";
                        }
                        else {
                            s = "EXCLUDE_INTERSECTIONS";
                        }
                    }
                    else {
                        s = "INTERSECT";
                    }
                }
                else {
                    s = "SUBTRACT";
                }
            }
            else {
                s = "ADD";
            }
        }
        else {
            s = "MERGE";
        }
        final StringBuilder sb = new StringBuilder("MergePaths{mode=");
        sb.append(s);
        sb.append("}");
        return sb.toString();
    }
}
