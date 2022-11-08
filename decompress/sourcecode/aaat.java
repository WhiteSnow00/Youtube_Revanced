import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.text.TextUtils;
import java.util.Collections;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public class aaat
{
    protected final aack a;
    public final String b;
    public final Object c;
    public Pair d;
    
    public aaat(final aack a, final String b) {
        this.c = new Object();
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    protected Pair a() {
        final List<Object> emptyList = Collections.emptyList();
        final boolean equals = "PPSV".equals(this.b);
        final zyx zyx = null;
        zyx a = null;
        Object o;
        zyx zyx2;
        if (equals && !TextUtils.isEmpty((CharSequence)null)) {
            zzl e;
            if (!TextUtils.isEmpty((CharSequence)null)) {
                e = this.a.l().e(null);
            }
            else {
                e = null;
            }
            o = emptyList;
            zyx2 = zyx;
            if (e != null) {
                o = Collections.singletonList(e);
                zyx2 = zyx;
            }
        }
        else {
            o = emptyList;
            zyx2 = zyx;
            if (!TextUtils.isEmpty((CharSequence)this.b)) {
                final zyz e2 = this.a.i().e(this.b);
                if (e2 != null) {
                    a = e2.a;
                }
                o = emptyList;
                zyx2 = a;
                if (a != null) {
                    o = this.a.i().n(this.b);
                    zyx2 = a;
                }
            }
        }
        return this.b(zyx2, (List)o);
    }
    
    protected final Pair b(final zyx zyx, final List list) {
        synchronized (this.c) {
            return this.d = new Pair((Object)zyx, (Object)list);
        }
    }
    
    public final List c() {
        synchronized (this.c) {
            Pair pair;
            if ((pair = this.d) == null) {
                pair = this.a();
            }
            return (List)pair.second;
        }
    }
    
    public final List d() {
        final Object c = this.c;
        monitorenter(c);
        try {
            final ArrayList<zzg> list = new ArrayList<zzg>();
            final Iterator iterator = this.c().iterator();
            while (iterator.hasNext()) {
                list.add(((zzl)iterator.next()).a);
            }
            monitorexit(c);
            return list;
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    public boolean f() {
        throw null;
    }
}
