import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfb implements acip
{
    private final atjj a;
    private final atjj b;
    private final atjj c;
    
    public kfb() {
    }
    
    public kfb(final atjj a, final atjj b, final atjj c) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public final kfd b(final ViewGroup viewGroup) {
        final Context context = (Context)this.a.a();
        context.getClass();
        final alm alm = (alm)this.b.a();
        final aeby aeby = (aeby)this.c.a();
        aeby.getClass();
        viewGroup.getClass();
        return new kfd(context, alm, aeby, viewGroup, null, null, null, null, null);
    }
}
