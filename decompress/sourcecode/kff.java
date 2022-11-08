import java.util.Iterator;
import android.view.View$OnClickListener;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kff extends acja
{
    final acjb a;
    public aioe b;
    private final ViewGroup c;
    private final View d;
    private final RecyclerView e;
    private final aciw f;
    private kfe g;
    
    public kff(final acno acno, final vax vax, final aeby aeby, final ViewGroup c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        final RecyclerView e = (RecyclerView)c.findViewById(2131428755);
        (this.e = e).af((nw)new LinearLayoutManager(0));
        final aciw t = aeby.T((acir)acno.a());
        e.ac((nq)(this.f = t));
        t.h((achk)(this.a = new acjb()));
        (this.d = c.findViewById(2131427590)).setOnClickListener((View$OnClickListener)new kdw(this, vax, 3));
    }
    
    public final View a() {
        return (View)this.c;
    }
    
    public final void c(final acir acir) {
        this.b = null;
        ((tdv)this.a).clear();
    }
    
    protected final boolean pS() {
        return true;
    }
}
