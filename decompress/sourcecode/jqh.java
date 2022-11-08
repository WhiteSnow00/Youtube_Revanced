import android.text.Spanned;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.TextView;
import android.view.View;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import android.widget.Switch;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqh implements acil
{
    public final Context a;
    public final vax b;
    public final irp c;
    public final Switch d;
    public final WillAutonavInformer e;
    public anxs f;
    public wwv g;
    public abyv h;
    public final aeby i;
    private final acio j;
    private final View k;
    private final TextView l;
    private final TextView m;
    private final CompoundButton$OnCheckedChangeListener n;
    private final ackz o;
    private aamv p;
    
    public jqh(final Context a, final vax b, final giz j, final irp c, final ackz o, final WillAutonavInformer e, final aeby i, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.j = (acio)j;
        this.c = c;
        this.o = o;
        this.e = e;
        this.i = i;
        final View inflate = LayoutInflater.from(a).inflate(2131625354, viewGroup, false);
        this.k = inflate;
        this.l = (TextView)inflate.findViewById(2131432092);
        this.m = (TextView)inflate.findViewById(2131431886);
        this.d = (Switch)inflate.findViewById(2131431917);
        this.n = (CompoundButton$OnCheckedChangeListener)new jqg(this, b, 0);
        j.c(inflate);
    }
    
    public final View a() {
        return ((giz)this.j).a;
    }
    
    public final void c(final acir acir) {
        final abyv h = this.h;
        if (h != null) {
            h.c();
        }
        this.d.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        final aamv p = this.p;
        if (p != null) {
            this.c.h(p);
        }
        this.p = null;
        this.g = null;
        this.f = null;
    }
}
