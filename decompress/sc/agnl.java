import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnl
{
    public static volatile agnl a;
    public final Object b;
    
    public agnl() {
        this.b = new HashSet();
    }
    
    public agnl(final ahaz b) {
        this.b = b;
    }
    
    public agnl(final ahbb b) {
        this.b = b;
    }
    
    public agnl(final byte[] array, final char[] array2, final byte[] array3) {
        this.b = ((ahbh)ajia.a).createBuilder();
    }
    
    public agnl(final char[] array, final byte[] array2, final byte[] array3) {
        this.b = ((ahbh)ajgx.a).createBuilder();
    }
    
    final Set a() {
        synchronized (this.b) {
            return Collections.unmodifiableSet((Set<?>)this.b);
        }
    }
    
    public final ahij b(final vfp vfp) {
        return new ahij((ahil)((ahaz)this.b).build(), vfp);
    }
    
    public final ahii c() {
        return new ahii((ahik)((ahaz)this.b).build());
    }
    
    public final aiqi d(final vfp vfp) {
        return new aiqi((aiqj)((ahaz)this.b).build(), vfp);
    }
    
    public final aipa e(final vfp vfp) {
        return new aipa((aiob)((ahaz)this.b).build(), vfp);
    }
    
    public final void f() {
        final aint aint = (aint)((ahaz)this.b).build();
    }
    
    public final void g() {
        final ainr ainr = (ainr)((ahaz)this.b).build();
    }
    
    public final void h() {
        final alnx alnx = (alnx)((ahaz)this.b).build();
    }
    
    public final akdg i() {
        return new akdg((akdi)((ahaz)this.b).build());
    }
    
    public final ajuq j(final vfp vfp) {
        return new ajuq((ajut)((ahaz)this.b).build(), vfp);
    }
    
    public final ajop k(final vfp vfp) {
        return new ajop((ajoq)((ahaz)this.b).build(), vfp);
    }
    
    public final ajog l(final vfp vfp) {
        return new ajog((ajoi)((ahaz)this.b).build(), vfp);
    }
    
    public final ajhw m(final vfp vfp) {
        return new ajhw((ajia)((ahaz)this.b).build(), vfp);
    }
    
    public final void n(final List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    ((ahaz)this.b).aJ((aotp)iterator.next());
                }
            }
        }
    }
    
    public final void o(final aotp... array) {
        for (int i = 0; i <= 0; ++i) {
            ((ahaz)this.b).aI(array[i]);
        }
    }
    
    public final void p(final apza apza) {
        final ahaz ahaz = (ahaz)this.b;
        ahaz.copyOnWrite();
        final ajia ajia = (ajia)ahaz.instance;
        final ajia a = ajia.a;
        ajia.e = apza.f;
        ajia.b |= 0x1;
    }
    
    public final ajgt q(final vfp vfp) {
        return new ajgt((ajgx)((ahaz)this.b).build(), vfp);
    }
    
    public final void r(final aotp... array) {
        for (int i = 0; i <= 0; ++i) {
            final aotp aotp = array[i];
            final ahaz ahaz = (ahaz)this.b;
            ahaz.copyOnWrite();
            final ajgx ajgx = (ajgx)ahaz.instance;
            final ajgx a = ajgx.a;
            aotp.getClass();
            final ahbx c = ajgx.c;
            if (!c.c()) {
                ajgx.c = ahbh.mutableCopy(c);
            }
            ajgx.c.add((Object)aotp);
        }
    }
    
    public final void s(final apza apza) {
        final ahaz ahaz = (ahaz)this.b;
        ahaz.copyOnWrite();
        final ajgx ajgx = (ajgx)ahaz.instance;
        final ajgx a = ajgx.a;
        ajgx.e = apza.f;
        ajgx.b |= 0x1;
    }
    
    public final ajft t() {
        return new ajft((ajfu)((ahaz)this.b).build());
    }
}
