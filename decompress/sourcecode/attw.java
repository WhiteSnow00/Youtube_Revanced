import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class attw implements attm
{
    public final atli a;
    
    public attw(final atli a) {
        this.a = a;
        final boolean a2 = atqb.a;
    }
    
    @Override
    public final Object a(final attn attn, final atld atld) {
        final attu attu = new attu(attn, this, (atld)null);
        final atvh atvh = new atvh(atld.getContext(), atld);
        final Object b = atwa.b(atvh, atvh, (atmp)attu);
        if (b == atlk.a) {
            return b;
        }
        return atjv.a;
    }
    
    protected abstract Object b(final atsx p0, final atld p1);
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList(4);
        final atli a = this.a;
        if (a != atlj.a) {
            new StringBuilder("context=").append(a);
            list.add("context=EmptyCoroutineContext");
        }
        list.add("capacity=-2");
        final String a2 = atqc.a(this);
        final String n = aqzg.N((Iterable)list, (CharSequence)", ", (CharSequence)null, (CharSequence)null, (atml)null, 62);
        final StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append("[");
        sb.append(n);
        sb.append("]");
        return sb.toString();
    }
}
