import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adch extends acph implements adci
{
    public final aclr a;
    private final List b;
    
    public adch(final apcf apcf, final Context context, final veh veh) {
        final ArrayList b = new ArrayList();
        this.b = b;
        final aclr a = new aclr();
        this.a = a;
        apcl apcl;
        if ((apcl = apcf.c) == null) {
            apcl = apcl.a;
        }
        apck a2;
        if (apcl.b == 92759253) {
            apcl apcl2;
            if ((apcl2 = apcf.c) == null) {
                apcl2 = apcl.a;
            }
            if (apcl2.b == 92759253) {
                a2 = (apck)apcl2.c;
            }
            else {
                a2 = apck.a;
            }
        }
        else {
            a2 = null;
        }
        if (a2 != null) {
            final adcj adcj = new adcj(a2, context, veh);
            b.add(adcj);
            a.m(adcj.c);
        }
    }
    
    @Override
    public final acla a() {
        return (acla)this.a;
    }
    
    @Override
    public final void d(final List list) {
        final ArrayList list2 = new ArrayList();
        list2.addAll(list);
        list2.addAll(this.b);
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((adci)iterator.next()).d(list2);
        }
    }
    
    @Override
    public final void e(final acmh acmh) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((adci)iterator.next()).e(acmh);
        }
    }
}
