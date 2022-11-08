import android.support.v7.widget.LinearLayoutManager;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jar
{
    public final RecyclerView a;
    public final acjb b;
    public final Rect c;
    public final int d;
    public final int e;
    public final arhr f;
    public alff g;
    public final arud h;
    
    public jar(final jit jit, final gyg gyg, final jap jap, final aeby aeby, final atjj atjj, final arhr f, final arud h, final RecyclerView a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.f = f;
        this.h = h;
        final acjb b = new acjb();
        this.b = b;
        this.c = new Rect();
        this.d = a.getPaddingLeft();
        this.e = a.getPaddingRight();
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ac(0);
        a.af((nw)linearLayoutManager);
        final achs achs = new achs();
        ((acir)achs).f((Class)ajtr.class, (acip)jit);
        ((acir)achs).f((Class)ajtn.class, (acip)gyg);
        ((acir)achs).f((Class)ajkj.class, (acip)jap);
        ((acir)achs).f((Class)abzh.class, (acip)new acit(atjj, 0));
        final aciw t = aeby.T((acir)achs);
        t.h((achk)b);
        ((nq)t).s(true);
        a.s = true;
        a.ac((nq)t);
        t.f((acik)new fas(this, 9));
    }
}
