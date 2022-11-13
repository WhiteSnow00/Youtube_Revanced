import java.util.Iterator;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavs implements Runnable
{
    public final aavt a;
    public final angt[] b;
    
    public aavs(final aavt a, final angt[] b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final aavt a = this.a;
        final angt[] b = this.b;
        final int length = b.length;
        final ArrayList list = new ArrayList(length);
        for (final angt angt : b) {
            final acid j = a.j;
            Object o = null;
            final ajut ajut = null;
            if (angt == null) {
                ttr.b("Cannot create view because the renderer was null");
            }
            else {
                final int b2 = angt.b;
                if ((b2 & 0x1) != 0x0) {
                    ajot ajot;
                    if ((ajot = angt.c) == null) {
                        ajot = ajot.a;
                    }
                    final View o2 = j.o(2131625764);
                    aotp aotp;
                    if ((aotp = ajot.d) == null) {
                        aotp = aotp.a;
                    }
                    ajut ajut2;
                    if ((ajut2 = ajot.f) == null) {
                        ajut2 = ajut.a;
                    }
                    ajut ajut3;
                    if ((ajot.b & 0x20) != 0x0) {
                        if ((ajut3 = ajot.h) == null) {
                            ajut3 = ajut.a;
                        }
                    }
                    else if ((ajut3 = ajot.g) == null) {
                        ajut3 = ajut.a;
                    }
                    aiqj aiqj;
                    if ((aiqj = ajot.j) == null) {
                        aiqj = aiqj.a;
                    }
                    j.p(o2, aotp, ajut2, ajut3, aiqj);
                    final TextView textView = (TextView)o2.findViewById(2131428769);
                    ajut ajut4 = ajut;
                    if ((ajot.b & 0x200) != 0x0 && (ajut4 = ajot.i) == null) {
                        ajut4 = ajut.a;
                    }
                    textView.setText((CharSequence)acak.b(ajut4));
                    o = o2;
                }
                else if ((b2 & 0x2) != 0x0) {
                    ajos ajos;
                    if ((ajos = angt.d) == null) {
                        ajos = ajos.a;
                    }
                    final View o3 = j.o(2131625763);
                    aotp aotp2;
                    if ((aotp2 = ajos.d) == null) {
                        aotp2 = aotp.a;
                    }
                    ajut ajut5;
                    if ((ajut5 = ajos.c) == null) {
                        ajut5 = ajut.a;
                    }
                    ajut ajut6;
                    if ((ajos.b & 0x40) != 0x0) {
                        if ((ajut6 = ajos.f) == null) {
                            ajut6 = ajut.a;
                        }
                    }
                    else if ((ajut6 = ajos.g) == null) {
                        ajut6 = ajut.a;
                    }
                    aiqj aiqj2;
                    if ((aiqj2 = ajos.e) == null) {
                        aiqj2 = aiqj.a;
                    }
                    j.p(o3, aotp2, ajut5, ajut6, aiqj2);
                    final TextView textView2 = (TextView)o3.findViewById(2131432302);
                    ajut ajut7;
                    if ((ajut7 = ajos.h) == null) {
                        ajut7 = ajut.a;
                    }
                    textView2.setText((CharSequence)acak.b(ajut7));
                    o = o3;
                }
                else {
                    ttr.b("Cannot create view because of unexpected renderer type.");
                }
            }
            if (o != null) {
                list.add(o);
            }
        }
        final aarm h = a.h;
        if (h != null) {
            if (h.k != null) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    h.k.addView((View)iterator.next());
                }
            }
            a.a();
        }
    }
}
