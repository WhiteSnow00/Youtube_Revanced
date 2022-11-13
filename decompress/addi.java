import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addi implements acko
{
    public aiqj a;
    private final acpk b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    
    public addi(final Context context, final addh addh, final acpk b, final vcy vcy) {
        this.b = b;
        final View inflate = View.inflate(context, 2131625379, (ViewGroup)null);
        this.c = inflate;
        this.d = (ImageView)inflate.findViewById(2131429270);
        this.e = (TextView)inflate.findViewById(2131431953);
        inflate.setOnClickListener((View$OnClickListener)new wcu(this, vcy, addh, 9));
        this.f = context.getResources().getDimensionPixelSize(2131169529);
        this.g = context.getResources().getDimensionPixelSize(2131169524);
        this.h = context.getResources().getDimensionPixelSize(2131169528);
        this.i = context.getResources().getDimensionPixelSize(2131169527);
        this.j = context.getResources().getDimensionPixelSize(2131169525);
        this.k = context.getResources().getDimensionPixelSize(2131169526);
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acku acku) {
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final aicz aicz = (aicz)o;
        final boolean j = ackm.j("isFirstItem", false);
        final boolean i = ackm.j("isLastItem", false);
        if (j) {
            this.c.setPadding(this.h, this.j, this.i, this.f);
        }
        else if (i) {
            this.c.setPadding(this.h, this.g, this.i, this.k);
        }
        else {
            this.c.setPadding(this.h, this.g, this.i, this.f);
        }
        final acpk b = this.b;
        akdh akdh;
        if ((aicz.b & 0x20) != 0x0) {
            akdi akdi;
            if ((akdi = aicz.g) == null) {
                akdi = akdi.a;
            }
            if ((akdh = akdh.b(akdi.c)) == null) {
                akdh = akdh.a;
            }
        }
        else {
            akdh = akdh.a;
        }
        final int a = b.a(akdh);
        if (a != 0) {
            this.d.setImageResource(a);
        }
        final TextView e = this.e;
        ajut ajut;
        if ((aicz.b & 0x200) != 0x0) {
            if ((ajut = aicz.i) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        e.setText((CharSequence)acak.b(ajut));
        aiqj a2;
        if ((a2 = aicz.p) == null) {
            a2 = aiqj.a;
        }
        this.a = a2;
    }
}
