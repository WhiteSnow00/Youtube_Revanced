import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfc extends acqa implements tgg
{
    public final HashSet a;
    public final HashMap b;
    
    public jfc(final acps acps, final tgd tgd, final tqd tqd, final vmj vmj, final wyw wyw, final acrm acrm) {
        super(vmj, acps, tgd, tqd, wyw, acrm, new acle());
        this.a = new HashSet();
        this.b = new HashMap();
        ((acjn)((acoy)this).i).ni((ackn)new kgf(this, 1));
        this.P((acrf)new jfb(this));
    }
    
    public final Class[] ms(final Class clazz, final Object o, int i) {
        if (clazz == jfc.class) {
            boolean b = false;
            Class[] array2;
            if (i != -1) {
                if (i == 0) {
                    final anjk a = ((jfk)o).a();
                    anuv anuv;
                    if ((anuv = a.b) == null) {
                        anuv = anuv.a;
                    }
                    final ankm ankm = (ankm)((ahbc)anuv).rx((ahaq)ankp.a);
                    final int size = ankm.d.size();
                    i = 0;
                    while (true) {
                        while (i < ((tfz)((acoy)this).i).size()) {
                            if (((ahbh)a).equals(((tfz)((acoy)this).i).get(i))) {
                                b = true;
                                final Class[] array = null;
                                if (!b) {
                                    array2 = array;
                                    return array2;
                                }
                                if (this.a.add(a)) {
                                    ((tfz)((acoy)this).i).i(i + 1, size);
                                }
                                else {
                                    this.a.remove(a);
                                    final afel afel = new afel();
                                    final Iterator<Object> iterator = ((List<Object>)ankm.d).iterator();
                                    while (iterator.hasNext()) {
                                        ankt ankt;
                                        if ((ankt = iterator.next().c) == null) {
                                            ankt = ankt.a;
                                        }
                                        afel.h((Object)ankt);
                                    }
                                    ((acoy)this).H((Collection)afel.g(), i + 1);
                                }
                                array2 = array;
                                if (!this.b.containsKey(a)) {
                                    return array2;
                                }
                                final jfa jfa = this.b.get(a);
                                if (jfa == null) {
                                    array2 = array;
                                    return array2;
                                }
                                this.a.contains(a);
                                jfa.a();
                                return null;
                            }
                            else {
                                ++i;
                            }
                        }
                        i = 0;
                        continue;
                    }
                }
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            else {
                array2 = new Class[] { jfk.class };
            }
            return array2;
        }
        return super.ms(clazz, o, i);
    }
}
