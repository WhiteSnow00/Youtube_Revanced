import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqu implements acil
{
    public final Context a;
    public final lmr b;
    public final View c;
    public final TextView d;
    public final Switch e;
    public final aeby f;
    private final acio g;
    private final asho h;
    private final TextView i;
    private final asib j;
    
    public jqu(final Context a, final giz g, final lmr b, final asho h, final aeby f, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.g = (acio)g;
        this.b = b;
        this.h = h;
        this.f = f;
        final View inflate = LayoutInflater.from(a).inflate(2131625356, viewGroup, false);
        this.c = inflate;
        this.i = (TextView)inflate.findViewById(2131432092);
        this.d = (TextView)inflate.findViewById(2131431886);
        this.e = (Switch)inflate.findViewById(2131431917);
        this.j = new asib();
        g.c(inflate);
        g.d((View$OnClickListener)new jtw(this, 1));
    }
    
    public final View a() {
        return ((giz)this.g).a;
    }
    
    public final void b() {
        if (this.b.g()) {
            tmy.t(this.d, (CharSequence)lml.a(this.a.getResources(), this.b.a()));
            return;
        }
        tmy.t(this.d, (CharSequence)this.a.getResources().getString(2132020190));
    }
    
    public final void c(final acir acir) {
        this.e.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        this.c.setOnClickListener((View$OnClickListener)null);
        this.j.b();
    }
    
    public final void d(final Switch switch1, final boolean checked) {
        switch1.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        switch1.setChecked(checked);
        switch1.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new cfl(this, 10));
    }
}
