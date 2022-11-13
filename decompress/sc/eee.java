import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eee implements hd
{
    public final int a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final cya g;
    public final cya h;
    
    public eee(final List b, final List c, final cya h, final cya g, final byte[] array, final byte[] array2) {
        this.b = b;
        int size;
        if (b != null) {
            size = b.size();
        }
        else {
            size = 0;
        }
        this.a = size;
        this.c = c;
        this.h = h;
        this.g = g;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        for (int i = 0; i < this.a; ++i) {
            this.e.add(new tqv((eei)null, false));
            this.f.add(new dub(this.b.get(i), null));
        }
    }
    
    public final void a(final int n, final int n2) {
        final ArrayList list = new ArrayList(n2);
        final ArrayList list2 = new ArrayList(n2);
        for (int i = 0; i < n2; ++i) {
            final int n3 = n + i;
            final tqv tqv = new tqv((eei)null, true);
            this.e.add(n3, tqv);
            list.add(tqv);
            final dub dub = new dub(null, null);
            this.f.add(n3, dub);
            list2.add(dub);
        }
        this.d.add(new eed(0, n, -1, (List)list, (List)list2));
    }
    
    public final void b(final int n, final int n2) {
        final ArrayList list = new ArrayList(1);
        this.e.add(n2, this.e.remove(n));
        final dub dub = this.f.remove(n);
        list.add(dub);
        this.f.add(n2, dub);
        this.d.add(new eed(3, n, n2, (List)null, (List)list));
    }
    
    public final void c(final int n, final int n2) {
        final ArrayList list = new ArrayList(n2);
        for (int i = 0; i < n2; ++i) {
            this.e.remove(n);
            list.add(this.f.remove(n));
        }
        this.d.add(new eed(2, n, n2, (List)null, (List)list));
    }
    
    public final void d(final int n, final int n2) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList(n2);
        for (int i = 0; i < n2; ++i) {
            final int n3 = n + i;
            final tqv tqv = this.e.get(n3);
            tqv.a = true;
            list.add(tqv);
            list2.add(this.f.get(n3));
        }
        this.d.add(new eed(1, n, -1, (List)list, (List)list2));
    }
}
