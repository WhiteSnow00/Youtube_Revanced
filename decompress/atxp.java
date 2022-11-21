import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atxp implements atxe
{
    public final atpa a;
    
    public atxp(final atpa a) {
        this.a = a;
        final boolean a2 = attt.a;
    }
    
    public final Object a(final atxf atxf, final atov atov) {
        final atxn atxn = new atxn(atxf, this, (atov)null);
        final atza atza = new atza(atov.getContext(), atov);
        final Object a = atzj.a(atza, (Object)atza, (atqh)atxn);
        if (a == atpc.a) {
            return a;
        }
        return atnn.a;
    }
    
    protected abstract Object b(final atwp p0, final atov p1);
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList(4);
        final atpa a = this.a;
        if (a != atpb.a) {
            new StringBuilder("context=").append(a);
            list.add("context=EmptyCoroutineContext");
        }
        list.add("capacity=-2");
        final String a2 = attu.a(this);
        final String n = atzd.n((Iterable)list, (CharSequence)", ", (CharSequence)null, (CharSequence)null, (atqd)null, 62);
        final StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append("[");
        sb.append(n);
        sb.append("]");
        return sb.toString();
    }
}
