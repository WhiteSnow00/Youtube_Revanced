import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import android.view.View;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cjc
{
    public final Map a;
    public View b;
    final ArrayList c;
    
    @Deprecated
    public cjc() {
        this.a = new HashMap();
        this.c = new ArrayList();
    }
    
    public cjc(final View b) {
        this.a = new HashMap();
        this.c = new ArrayList();
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof cjc) {
            final View b = this.b;
            final cjc cjc = (cjc)o;
            if (b == cjc.b && this.a.equals(cjc.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TransitionValues@");
        sb.append(Integer.toHexString(this.hashCode()));
        sb.append(":\n");
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("    view = ");
        sb2.append(this.b);
        sb2.append("\n");
        String s = sb2.toString().concat("    values:");
        for (final String s2 : this.a.keySet()) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(s);
            sb3.append("    ");
            sb3.append(s2);
            sb3.append(": ");
            sb3.append(this.a.get(s2));
            sb3.append("\n");
            s = sb3.toString();
        }
        return s;
    }
}
