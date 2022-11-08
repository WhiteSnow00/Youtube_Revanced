import java.io.Serializable;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class add implements adb
{
    public adb a;
    public boolean b;
    public boolean c;
    final adm d;
    int e;
    public int f;
    int g;
    ade h;
    public boolean i;
    final List j;
    final List k;
    int l;
    
    public add(final adm d) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.l = 1;
        this.g = 1;
        this.h = null;
        this.i = false;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.d = d;
    }
    
    public final void a(final adb adb) {
        this.j.add(adb);
        if (this.i) {
            adb.f();
        }
    }
    
    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }
    
    public void c(final int f) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = f;
        final Iterator iterator = this.j.iterator();
        while (iterator.hasNext()) {
            ((adb)iterator.next()).f();
        }
    }
    
    @Override
    public final void f() {
        final Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            if (!((add)iterator.next()).i) {
                return;
            }
        }
        this.c = true;
        final adb a = this.a;
        if (a != null) {
            a.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        final Iterator iterator2 = this.k.iterator();
        add add = null;
        int n = 0;
        while (iterator2.hasNext()) {
            final add add2 = (add)iterator2.next();
            if (!(add2 instanceof ade)) {
                ++n;
                add = add2;
            }
        }
        if (add != null && n == 1 && add.i) {
            final ade h = this.h;
            if (h != null) {
                if (!h.i) {
                    return;
                }
                this.e = this.g * h.f;
            }
            this.c(add.f + this.e);
        }
        final adb a2 = this.a;
        if (a2 != null) {
            a2.f();
        }
    }
    
    @Override
    public final String toString() {
        final String ai = this.d.d.ai;
        String s = null;
        switch (this.l) {
            default: {
                s = "null";
                break;
            }
            case 8: {
                s = "BASELINE";
                break;
            }
            case 7: {
                s = "BOTTOM";
                break;
            }
            case 6: {
                s = "TOP";
                break;
            }
            case 5: {
                s = "RIGHT";
                break;
            }
            case 4: {
                s = "LEFT";
                break;
            }
            case 3: {
                s = "VERTICAL_DIMENSION";
                break;
            }
            case 2: {
                s = "HORIZONTAL_DIMENSION";
                break;
            }
            case 1: {
                s = "UNKNOWN";
                break;
            }
        }
        Serializable value;
        if (this.i) {
            value = this.f;
        }
        else {
            value = "unresolved";
        }
        final String string = value.toString();
        final int size = this.k.size();
        final int size2 = this.j.size();
        final StringBuilder sb = new StringBuilder();
        sb.append(ai);
        sb.append(":");
        sb.append(s);
        sb.append("(");
        sb.append(string);
        sb.append(") <t=");
        sb.append(size);
        sb.append(":d=");
        sb.append(size2);
        sb.append(">");
        return sb.toString();
    }
}
