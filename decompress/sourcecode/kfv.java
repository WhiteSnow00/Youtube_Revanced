import java.util.Iterator;
import android.text.TextUtils;
import android.view.View;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfv implements acil
{
    final acjb a;
    public acij b;
    private final ViewGroup c;
    private final TextView d;
    private final achw e;
    private final Resources f;
    private int g;
    private final arud h;
    private final hdv i;
    
    public kfv(final Context context, final aeby aeby, final acts acts, final fuw fuw, final alm alm, final arud h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = context.getResources();
        this.h = h;
        final ViewGroup c = (ViewGroup)LayoutInflater.from(context).inflate(2131624895, (ViewGroup)null, false);
        this.c = c;
        this.d = (TextView)c.findViewById(2131432109);
        this.i = new hdv(c, fuw.d(null, 2131624898, 2131624899), acts);
        final RecyclerView recyclerView = (RecyclerView)c.findViewById(2131427923);
        recyclerView.af((nw)new LinearLayoutManager(0));
        final aciy aciy = new aciy();
        ((acir)aciy).f((Class)aibb.class, (acip)new kss(alm, (acqr)new jec(this, 2), 1, (byte[])null, (byte[])null, (byte[])null));
        final aciw t = aeby.T((acir)aciy);
        t.h((achk)(this.a = new acjb()));
        t.f((acik)(this.e = new achw()));
        recyclerView.ac((nq)t);
    }
    
    public final View a() {
        return (View)this.c;
    }
    
    public final void c(final acir acir) {
    }
}
