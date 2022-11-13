import android.support.v7.widget.LinearLayoutManager;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbq
{
    public final RecyclerView a;
    public final acle b;
    public final Rect c;
    public final int d;
    public final int e;
    public final arkg f;
    public alhi g;
    public final arwh h;
    
    public jbq(final jjv jjv, final gyw gyw, final jbo jbo, final aeea aeea, final atke atke, final arkg f, final arwh h, final RecyclerView a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.f = f;
        this.h = h;
        final acle b = new acle();
        this.b = b;
        this.c = new Rect();
        this.d = a.getPaddingLeft();
        this.e = a.getPaddingRight();
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ac(0);
        a.af((nw)linearLayoutManager);
        final acjv acjv = new acjv();
        ((acku)acjv).f((Class)ajvu.class, (acks)jjv);
        ((acku)acjv).f((Class)ajvq.class, (acks)gyw);
        ((acku)acjv).f((Class)ajmo.class, (acks)jbo);
        ((acku)acjv).f((Class)acbj.class, (acks)new ackw(atke, 0));
        final ackz z = aeea.Z((acku)acjv);
        z.h((acjn)b);
        ((nq)z).s(true);
        a.s = true;
        a.ac((nq)z);
        z.f((ackn)new faw(this, 9));
    }
}
